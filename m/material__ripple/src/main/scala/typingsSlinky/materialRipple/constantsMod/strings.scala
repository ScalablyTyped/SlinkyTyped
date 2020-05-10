package typingsSlinky.materialRipple.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialRipple.materialRippleStrings.`--mdc-ripple-fg-scale`
import typingsSlinky.materialRipple.materialRippleStrings.`--mdc-ripple-fg-size`
import typingsSlinky.materialRipple.materialRippleStrings.`--mdc-ripple-fg-translate-end`
import typingsSlinky.materialRipple.materialRippleStrings.`--mdc-ripple-fg-translate-start`
import typingsSlinky.materialRipple.materialRippleStrings.`--mdc-ripple-left`
import typingsSlinky.materialRipple.materialRippleStrings.`--mdc-ripple-top`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var VAR_FG_SCALE: `--mdc-ripple-fg-scale` = js.native
  var VAR_FG_SIZE: `--mdc-ripple-fg-size` = js.native
  var VAR_FG_TRANSLATE_END: `--mdc-ripple-fg-translate-end` = js.native
  var VAR_FG_TRANSLATE_START: `--mdc-ripple-fg-translate-start` = js.native
  var VAR_LEFT: `--mdc-ripple-left` = js.native
  var VAR_TOP: `--mdc-ripple-top` = js.native
}

object strings {
  @scala.inline
  def apply(
    VAR_FG_SCALE: `--mdc-ripple-fg-scale`,
    VAR_FG_SIZE: `--mdc-ripple-fg-size`,
    VAR_FG_TRANSLATE_END: `--mdc-ripple-fg-translate-end`,
    VAR_FG_TRANSLATE_START: `--mdc-ripple-fg-translate-start`,
    VAR_LEFT: `--mdc-ripple-left`,
    VAR_TOP: `--mdc-ripple-top`
  ): strings = {
    val __obj = js.Dynamic.literal(VAR_FG_SCALE = VAR_FG_SCALE.asInstanceOf[js.Any], VAR_FG_SIZE = VAR_FG_SIZE.asInstanceOf[js.Any], VAR_FG_TRANSLATE_END = VAR_FG_TRANSLATE_END.asInstanceOf[js.Any], VAR_FG_TRANSLATE_START = VAR_FG_TRANSLATE_START.asInstanceOf[js.Any], VAR_LEFT = VAR_LEFT.asInstanceOf[js.Any], VAR_TOP = VAR_TOP.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVAR_FG_SCALE(value: `--mdc-ripple-fg-scale`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VAR_FG_SCALE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVAR_FG_SIZE(value: `--mdc-ripple-fg-size`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VAR_FG_SIZE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVAR_FG_TRANSLATE_END(value: `--mdc-ripple-fg-translate-end`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VAR_FG_TRANSLATE_END")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVAR_FG_TRANSLATE_START(value: `--mdc-ripple-fg-translate-start`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VAR_FG_TRANSLATE_START")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVAR_LEFT(value: `--mdc-ripple-left`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VAR_LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVAR_TOP(value: `--mdc-ripple-top`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VAR_TOP")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

