package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofaccessibilityFeatur extends js.Object {
  var animationPolicy: ChromeSetting = js.native
  var autoclick: ChromeSetting = js.native
  var caretHighlight: ChromeSetting = js.native
  var cursorHighlight: ChromeSetting = js.native
  var focusHighlight: ChromeSetting = js.native
  var highContrast: ChromeSetting = js.native
  var largeCursor: ChromeSetting = js.native
  var screenMagnifier: ChromeSetting = js.native
  var selectToSpeak: ChromeSetting = js.native
  var spokenFeedback: ChromeSetting = js.native
  var stickyKeys: ChromeSetting = js.native
  var switchAccess: ChromeSetting = js.native
  var virtualKeyboard: ChromeSetting = js.native
}

object TypeofaccessibilityFeatur {
  @scala.inline
  def apply(
    animationPolicy: ChromeSetting,
    autoclick: ChromeSetting,
    caretHighlight: ChromeSetting,
    cursorHighlight: ChromeSetting,
    focusHighlight: ChromeSetting,
    highContrast: ChromeSetting,
    largeCursor: ChromeSetting,
    screenMagnifier: ChromeSetting,
    selectToSpeak: ChromeSetting,
    spokenFeedback: ChromeSetting,
    stickyKeys: ChromeSetting,
    switchAccess: ChromeSetting,
    virtualKeyboard: ChromeSetting
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
    def withAnimationPolicy(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoclick(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaretHighlight(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorHighlight(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusHighlight(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighContrast(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highContrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLargeCursor(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenMagnifier(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenMagnifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectToSpeak(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectToSpeak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpokenFeedback(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spokenFeedback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStickyKeys(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwitchAccess(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualKeyboard(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

