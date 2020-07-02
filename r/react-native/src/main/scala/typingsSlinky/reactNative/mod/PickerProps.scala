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
- typingsSlinky.reactNative.mod.PickerPropsAndroid because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, collapsable, focusable, hasTVPreferredFocus, hitSlop, importantForAccessibility, isTVSelectable, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID, tvParallaxMagnification, tvParallaxProperties, tvParallaxShiftDistanceX, tvParallaxShiftDistanceY, tvParallaxTiltAngle. Inlined enabled, mode, prompt */ trait PickerProps extends PickerPropsIOS {
  /**
    * If set to false, the picker will be disabled, i.e. the user will not be able to make a
    * selection.
    * @platform android
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * On Android, specifies how to display the selection items when the user taps on the picker:
    *
    *   - 'dialog': Show a modal dialog. This is the default.
    *   - 'dropdown': Shows a dropdown anchored to the picker view
    *
    * @platform android
    */
  var mode: js.UndefOr[dialog | dropdown] = js.undefined
  /**
    * Callback for when an item is selected. This is called with the
    * following parameters:
    * - itemValue: the value prop of the item that was selected
    * - itemPosition: the index of the selected item in this picker
    */
  var onValueChange: js.UndefOr[js.Function2[/* itemValue */ js.Any, /* itemPosition */ Double, Unit]] = js.undefined
  /**
    * Prompt string for this picker, used on Android in dialog mode as the title of the dialog.
    * @platform android
    */
  var prompt: js.UndefOr[String] = js.undefined
  /**
    * Value matching value of one of the items.
    * Can be a string or an integer.
    */
  var selectedValue: js.UndefOr[js.Any] = js.undefined
  @JSName("style")
  var style_PickerProps: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Used to locate this view in end-to-end tests.
    */
  var testId: js.UndefOr[String] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMode(value: dialog | dropdown): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnValueChange(value: (/* itemValue */ js.Any, /* itemPosition */ Double) => Unit): Self = this.set("onValueChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    @scala.inline
    def setSelectedValue(value: js.Any): Self = this.set("selectedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedValue: Self = this.set("selectedValue", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[TextStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setTestId(value: String): Self = this.set("testId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestId: Self = this.set("testId", js.undefined)
  }
  
}

