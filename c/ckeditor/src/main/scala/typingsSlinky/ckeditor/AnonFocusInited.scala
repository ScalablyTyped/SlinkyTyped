package typingsSlinky.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFocusInited extends js.Object {
  var focusInited: js.UndefOr[Boolean] = js.native
  var initOnlyNew: js.UndefOr[Boolean] = js.native
}

object AnonFocusInited {
  @scala.inline
  def apply(): AnonFocusInited = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFocusInited]
  }
  @scala.inline
  implicit class AnonFocusInitedOps[Self <: AnonFocusInited] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusInited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusInited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusInited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusInited")(js.undefined)
        ret
    }
    @scala.inline
    def withInitOnlyNew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initOnlyNew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitOnlyNew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initOnlyNew")(js.undefined)
        ret
    }
  }
  
}

