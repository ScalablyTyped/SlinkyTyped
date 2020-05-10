package typingsSlinky.materialChips.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialChips.materialChipsStrings.`mdc-chip-set--choice`
import typingsSlinky.materialChips.materialChipsStrings.`mdc-chip-set--filter`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var CHOICE: `mdc-chip-set--choice` = js.native
  var FILTER: `mdc-chip-set--filter` = js.native
}

object cssClasses {
  @scala.inline
  def apply(CHOICE: `mdc-chip-set--choice`, FILTER: `mdc-chip-set--filter`): cssClasses = {
    val __obj = js.Dynamic.literal(CHOICE = CHOICE.asInstanceOf[js.Any], FILTER = FILTER.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCHOICE(value: `mdc-chip-set--choice`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHOICE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFILTER(value: `mdc-chip-set--filter`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FILTER")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

