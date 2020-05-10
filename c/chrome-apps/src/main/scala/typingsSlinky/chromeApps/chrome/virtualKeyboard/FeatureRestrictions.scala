package typingsSlinky.chromeApps.chrome.virtualKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines whether advanced virtual keyboard features should be enabled or not.
  * They are enabled by default.
  *
  * On **Chrome 58** all properties are expected to have the same value.
  *
  * From **Chrome 63** the properties can be distinct and are optional.
  * If omitted, the current value is preserved.
  */
@js.native
trait FeatureRestrictions extends js.Object {
  /** Whether virtual keyboards can provide auto-complete. */
  var autoCompleteEnabled: js.UndefOr[Boolean] = js.native
  /** Whether virtual keyboards can provide auto-correct. */
  var autoCorrectEnabled: js.UndefOr[Boolean] = js.native
  /** Whether virtual keyboards can provide input via handwriting recognition. */
  var handwritingEnabled: js.UndefOr[Boolean] = js.native
  /** Whether virtual keyboards can provide spell-check. */
  var spellCheckEnabled: js.UndefOr[Boolean] = js.native
  /** Whether virtual keyboards can provide voice input. */
  var voiceInputEnabled: js.UndefOr[Boolean] = js.native
}

object FeatureRestrictions {
  @scala.inline
  def apply(): FeatureRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureRestrictions]
  }
  @scala.inline
  implicit class FeatureRestrictionsOps[Self <: FeatureRestrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCompleteEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCompleteEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCompleteEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCompleteEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCorrectEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrectEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCorrectEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrectEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHandwritingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handwritingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandwritingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handwritingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellCheckEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCheckEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellCheckEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCheckEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceInputEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceInputEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceInputEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceInputEnabled")(js.undefined)
        ret
    }
  }
  
}

