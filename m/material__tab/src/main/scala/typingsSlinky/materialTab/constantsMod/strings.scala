package typingsSlinky.materialTab.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialTab.materialTabStrings.`aria-selected`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var ARIA_SELECTED: `aria-selected` = js.native
}

object strings {
  @scala.inline
  def apply(ARIA_SELECTED: `aria-selected`): strings = {
    val __obj = js.Dynamic.literal(ARIA_SELECTED = ARIA_SELECTED.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARIA_SELECTED(value: `aria-selected`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARIA_SELECTED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

