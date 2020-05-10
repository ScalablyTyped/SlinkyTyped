package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.dialog
import typingsSlinky.reactNative.reactNativeStrings.dropdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactNative.mod.AccessibilityPropsIOS because Already inherited
- typingsSlinky.reactNative.mod.AccessibilityPropsAndroid because Already inherited
- typingsSlinky.reactNative.mod.TVViewPropsIOS because Already inherited
- typingsSlinky.reactNative.mod.AccessibilityProps because Already inherited
- typingsSlinky.reactNative.mod.Touchable because Already inherited
- typingsSlinky.reactNative.mod.GestureResponderHandlers because Already inherited
- typingsSlinky.reactNative.mod.ViewPropsIOS because Already inherited
- typingsSlinky.reactNative.mod.ViewPropsAndroid because Already inherited
- typingsSlinky.reactNative.mod.ViewProps because Already inherited
- typingsSlinky.reactNative.mod.PickerPropsAndroid because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityStates, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, collapsable, hasTVPreferredFocus, hitSlop, importantForAccessibility, isTVSelectable, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID, tvParallaxMagnification, tvParallaxProperties, tvParallaxShiftDistanceX, tvParallaxShiftDistanceY, tvParallaxTiltAngle. Inlined enabled, mode, prompt */ @js.native
trait PickerProps extends PickerPropsIOS {
  /**
    * If set to false, the picker will be disabled, i.e. the user will not be able to make a
    * selection.
    * @platform android
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * On Android, specifies how to display the selection items when the user taps on the picker:
    *
    *   - 'dialog': Show a modal dialog. This is the default.
    *   - 'dropdown': Shows a dropdown anchored to the picker view
    *
    * @platform android
    */
  var mode: js.UndefOr[dialog | dropdown] = js.native
  /**
    * Callback for when an item is selected. This is called with the
    * following parameters:
    * - itemValue: the value prop of the item that was selected
    * - itemPosition: the index of the selected item in this picker
    */
  var onValueChange: js.UndefOr[js.Function2[/* itemValue */ js.Any, /* itemPosition */ Double, Unit]] = js.native
  /**
    * Prompt string for this picker, used on Android in dialog mode as the title of the dialog.
    * @platform android
    */
  var prompt: js.UndefOr[String] = js.native
  /**
    * Value matching value of one of the items.
    * Can be a string or an integer.
    */
  var selectedValue: js.UndefOr[js.Any] = js.native
  @JSName("style")
  var style_PickerProps: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Used to locate this view in end-to-end tests.
    */
  var testId: js.UndefOr[String] = js.native
}

object PickerProps {
  @scala.inline
  def apply(): PickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerProps]
  }
  @scala.inline
  implicit class PickerPropsOps[Self <: PickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: dialog | dropdown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChange(value: (/* itemValue */ js.Any, /* itemPosition */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnValueChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withTestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testId")(js.undefined)
        ret
    }
  }
  
}

