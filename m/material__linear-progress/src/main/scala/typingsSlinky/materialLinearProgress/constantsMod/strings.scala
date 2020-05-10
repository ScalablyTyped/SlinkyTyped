package typingsSlinky.materialLinearProgress.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialLinearProgress.materialLinearProgressStrings.`Dotmdc-linear-progress__buffer`
import typingsSlinky.materialLinearProgress.materialLinearProgressStrings.`Dotmdc-linear-progress__primary-bar`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var BUFFER_SELECTOR: `Dotmdc-linear-progress__buffer` = js.native
  var PRIMARY_BAR_SELECTOR: `Dotmdc-linear-progress__primary-bar` = js.native
}

object strings {
  @scala.inline
  def apply(
    BUFFER_SELECTOR: `Dotmdc-linear-progress__buffer`,
    PRIMARY_BAR_SELECTOR: `Dotmdc-linear-progress__primary-bar`
  ): strings = {
    val __obj = js.Dynamic.literal(BUFFER_SELECTOR = BUFFER_SELECTOR.asInstanceOf[js.Any], PRIMARY_BAR_SELECTOR = PRIMARY_BAR_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBUFFER_SELECTOR(value: `Dotmdc-linear-progress__buffer`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPRIMARY_BAR_SELECTOR(value: `Dotmdc-linear-progress__primary-bar`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_BAR_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

