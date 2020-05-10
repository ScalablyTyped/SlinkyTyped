package typingsSlinky.materialLineRipple.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialLineRipple.materialLineRippleStrings.`mdc-line-ripple--active`
import typingsSlinky.materialLineRipple.materialLineRippleStrings.`mdc-line-ripple--deactivating`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var LINE_RIPPLE_ACTIVE: `mdc-line-ripple--active` = js.native
  var LINE_RIPPLE_DEACTIVATING: `mdc-line-ripple--deactivating` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    LINE_RIPPLE_ACTIVE: `mdc-line-ripple--active`,
    LINE_RIPPLE_DEACTIVATING: `mdc-line-ripple--deactivating`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(LINE_RIPPLE_ACTIVE = LINE_RIPPLE_ACTIVE.asInstanceOf[js.Any], LINE_RIPPLE_DEACTIVATING = LINE_RIPPLE_DEACTIVATING.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLINE_RIPPLE_ACTIVE(value: `mdc-line-ripple--active`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LINE_RIPPLE_ACTIVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLINE_RIPPLE_DEACTIVATING(value: `mdc-line-ripple--deactivating`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LINE_RIPPLE_DEACTIVATING")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

