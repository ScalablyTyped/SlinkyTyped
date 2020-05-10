package typingsSlinky.materialChips.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialChips.materialChipsStrings.`Dotmdc-chip`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var CHIP_SELECTOR: `Dotmdc-chip` = js.native
}

object strings {
  @scala.inline
  def apply(CHIP_SELECTOR: `Dotmdc-chip`): strings = {
    val __obj = js.Dynamic.literal(CHIP_SELECTOR = CHIP_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCHIP_SELECTOR(value: `Dotmdc-chip`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHIP_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

