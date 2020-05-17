package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.accessibilityFeatures.AccessibilityFeaturesSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofaccessibilityFeatur extends js.Object {
  /**
    * get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 42.
    */
  val animationPolicy: AccessibilityFeaturesSetting = js.native
  /**
    * Auto mouse click after mouse stops moving. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val autoclick: AccessibilityFeaturesSetting = js.native
  /**
    * Caret highlighting. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  val caretHighlight: AccessibilityFeaturesSetting = js.native
  /**
    * Cursor highlighting. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  val cursorHighlight: AccessibilityFeaturesSetting = js.native
  /**
    * Focus highlighting. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  val focusHighlight: AccessibilityFeaturesSetting = js.native
  /**
    * High contrast rendering mode. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val highContrast: AccessibilityFeaturesSetting = js.native
  /**
    * Enlarged cursor. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val largeCursor: AccessibilityFeaturesSetting = js.native
  /**
    * Full screen magnification. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val screenMagnifier: AccessibilityFeaturesSetting = js.native
  /**
    * Select-to-speak. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  val selectToSpeak: AccessibilityFeaturesSetting = js.native
  /**
    * Spoken feedback (text-to-speech). The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val spokenFeedback: AccessibilityFeaturesSetting = js.native
  /**
    * Sticky modifier keys (like shift or alt). The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val stickyKeys: AccessibilityFeaturesSetting = js.native
  /**
    * Switch access. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  val switchAccess: AccessibilityFeaturesSetting = js.native
  /**
    * Virtual on-screen keyboard. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val virtualKeyboard: AccessibilityFeaturesSetting = js.native
}

object TypeofaccessibilityFeatur {
  @scala.inline
  def apply(
    animationPolicy: AccessibilityFeaturesSetting,
    autoclick: AccessibilityFeaturesSetting,
    caretHighlight: AccessibilityFeaturesSetting,
    cursorHighlight: AccessibilityFeaturesSetting,
    focusHighlight: AccessibilityFeaturesSetting,
    highContrast: AccessibilityFeaturesSetting,
    largeCursor: AccessibilityFeaturesSetting,
    screenMagnifier: AccessibilityFeaturesSetting,
    selectToSpeak: AccessibilityFeaturesSetting,
    spokenFeedback: AccessibilityFeaturesSetting,
    stickyKeys: AccessibilityFeaturesSetting,
    switchAccess: AccessibilityFeaturesSetting,
    virtualKeyboard: AccessibilityFeaturesSetting
  ): TypeofaccessibilityFeatur = {
    val __obj = js.Dynamic.literal(animationPolicy = animationPolicy.asInstanceOf[js.Any], autoclick = autoclick.asInstanceOf[js.Any], caretHighlight = caretHighlight.asInstanceOf[js.Any], cursorHighlight = cursorHighlight.asInstanceOf[js.Any], focusHighlight = focusHighlight.asInstanceOf[js.Any], highContrast = highContrast.asInstanceOf[js.Any], largeCursor = largeCursor.asInstanceOf[js.Any], screenMagnifier = screenMagnifier.asInstanceOf[js.Any], selectToSpeak = selectToSpeak.asInstanceOf[js.Any], spokenFeedback = spokenFeedback.asInstanceOf[js.Any], stickyKeys = stickyKeys.asInstanceOf[js.Any], switchAccess = switchAccess.asInstanceOf[js.Any], virtualKeyboard = virtualKeyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofaccessibilityFeatur]
  }
  @scala.inline
  implicit class TypeofaccessibilityFeaturOps[Self <: TypeofaccessibilityFeatur] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationPolicy(value: AccessibilityFeaturesSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoclick(value: AccessibilityFeaturesSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaretHighlight(value: AccessibilityFeaturesSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorHighlight(value: AccessibilityFeaturesSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusHighlight(value: AccessibilityFeaturesSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighContrast(value: AccessibilityFeaturesSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highContrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLargeCursor(value: AccessibilityFeaturesSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenMagnifier(value: AccessibilityFeaturesSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenMagnifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectToSpeak(value: AccessibilityFeaturesSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectToSpeak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpokenFeedback(value: AccessibilityFeaturesSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spokenFeedback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStickyKeys(value: AccessibilityFeaturesSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwitchAccess(value: AccessibilityFeaturesSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualKeyboard(value: AccessibilityFeaturesSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

