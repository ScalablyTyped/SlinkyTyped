package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.checkbox_
import typingsSlinky.chromeApps.chromeAppsStrings.normal_
import typingsSlinky.chromeApps.chromeAppsStrings.radio_
import typingsSlinky.chromeApps.chromeAppsStrings.separator_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CHECKBOX extends js.Object {
  var CHECKBOX: checkbox_ = js.native
  var NORMAL: normal_ = js.native
  var RADIO: radio_ = js.native
  var SEPARATOR: separator_ = js.native
}

object CHECKBOX {
  @scala.inline
  def apply(CHECKBOX: checkbox_, NORMAL: normal_, RADIO: radio_, SEPARATOR: separator_): CHECKBOX = {
    val __obj = js.Dynamic.literal(CHECKBOX = CHECKBOX.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], RADIO = RADIO.asInstanceOf[js.Any], SEPARATOR = SEPARATOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHECKBOX]
  }
  @scala.inline
  implicit class CHECKBOXOps[Self <: CHECKBOX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCHECKBOX(value: checkbox_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHECKBOX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNORMAL(value: normal_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRADIO(value: radio_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RADIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSEPARATOR(value: separator_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SEPARATOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

