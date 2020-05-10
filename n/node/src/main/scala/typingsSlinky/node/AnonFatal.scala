package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFatal extends js.Object {
  var fatal: js.UndefOr[Boolean] = js.native
  var ignoreBOM: js.UndefOr[Boolean] = js.native
}

object AnonFatal {
  @scala.inline
  def apply(): AnonFatal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFatal]
  }
  @scala.inline
  implicit class AnonFatalOps[Self <: AnonFatal] (val x: Self) extends AnyVal {
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

