package typingsSlinky.picomatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Debug extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var flags: js.UndefOr[String] = js.native
  var nocase: js.UndefOr[Boolean] = js.native
}

object Debug {
  @scala.inline
  def apply(): Debug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debug]
  }
  @scala.inline
  implicit class DebugOps[Self <: Debug] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withNocase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNocase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocase")(js.undefined)
        ret
    }
  }
  
}

