package typingsSlinky.chromeApps.chrome.accessibilityFeatures

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilityFeaturesCallbackArg extends js.Object {
  /** Whether the effective value is specific to the incognito session. This property will only be present if the incognito property in the details parameter of get() was true.  */
  var incognitoSpecific: js.UndefOr[Boolean] = js.native
  /**
    * One of
    * • not_controllable: cannot be controlled by any extension
    * • controlled_by_other_extensions: controlled by extensions with higher precedence
    * • controllable_by_this_extension: can be controlled by this app
    * • controlled_by_this_extension: controlled by this app
    */
  var levelOfControl: LevelOfControl = js.native
  /** The value of the setting. */
  var value: js.Any = js.native
}

object AccessibilityFeaturesCallbackArg {
  @scala.inline
  def apply(levelOfControl: LevelOfControl, value: js.Any): AccessibilityFeaturesCallbackArg = {
    val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityFeaturesCallbackArg]
  }
  @scala.inline
  implicit class AccessibilityFeaturesCallbackArgOps[Self <: AccessibilityFeaturesCallbackArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevelOfControl(value: LevelOfControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelOfControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncognitoSpecific(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognitoSpecific")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncognitoSpecific: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognitoSpecific")(js.undefined)
        ret
    }
  }
  
}

