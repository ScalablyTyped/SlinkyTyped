package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fatal extends js.Object {
  var fatal: js.UndefOr[Boolean] = js.native
  var ignoreBOM: js.UndefOr[Boolean] = js.native
}

object Fatal {
  @scala.inline
  def apply(): Fatal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fatal]
  }
  @scala.inline
  implicit class FatalOps[Self <: Fatal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFatal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFatal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatal")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreBOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreBOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBOM")(js.undefined)
        ret
    }
  }
  
}

