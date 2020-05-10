package typingsSlinky.materialNotchedOutline.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialNotchedOutline.materialNotchedOutlineStrings.`mdc-notched-outline--notched`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var OUTLINE_NOTCHED: `mdc-notched-outline--notched` = js.native
}

object cssClasses {
  @scala.inline
  def apply(OUTLINE_NOTCHED: `mdc-notched-outline--notched`): cssClasses = {
    val __obj = js.Dynamic.literal(OUTLINE_NOTCHED = OUTLINE_NOTCHED.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOUTLINE_NOTCHED(value: `mdc-notched-outline--notched`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OUTLINE_NOTCHED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

