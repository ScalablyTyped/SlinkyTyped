package typingsSlinky.materialNotchedOutline.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialNotchedOutline.materialNotchedOutlineStrings.`Dotmdc-notched-outline__idle`
import typingsSlinky.materialNotchedOutline.materialNotchedOutlineStrings.`Dotmdc-notched-outline__path`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var IDLE_OUTLINE_SELECTOR: `Dotmdc-notched-outline__idle` = js.native
  var PATH_SELECTOR: `Dotmdc-notched-outline__path` = js.native
}

object strings {
  @scala.inline
  def apply(
    IDLE_OUTLINE_SELECTOR: `Dotmdc-notched-outline__idle`,
    PATH_SELECTOR: `Dotmdc-notched-outline__path`
  ): strings = {
    val __obj = js.Dynamic.literal(IDLE_OUTLINE_SELECTOR = IDLE_OUTLINE_SELECTOR.asInstanceOf[js.Any], PATH_SELECTOR = PATH_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIDLE_OUTLINE_SELECTOR(value: `Dotmdc-notched-outline__idle`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDLE_OUTLINE_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPATH_SELECTOR(value: `Dotmdc-notched-outline__path`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PATH_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

