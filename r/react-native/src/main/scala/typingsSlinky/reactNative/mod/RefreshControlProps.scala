package typingsSlinky.reactNative.mod

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
- typingsSlinky.reactNative.mod.RefreshControlPropsAndroid because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityStates, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, collapsable, hasTVPreferredFocus, hitSlop, importantForAccessibility, isTVSelectable, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID, tvParallaxMagnification, tvParallaxProperties, tvParallaxShiftDistanceX, tvParallaxShiftDistanceY, tvParallaxTiltAngle. Inlined colors, enabled, progressBackgroundColor, size, progressViewOffset */ @js.native
trait RefreshControlProps extends RefreshControlPropsIOS {
  /**
    * The colors (at least one) that will be used to draw the refresh indicator.
    */
  var colors: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether the pull to refresh functionality is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Called when the view starts refreshing.
    */
  var onRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The background color of the refresh indicator.
    */
  var progressBackgroundColor: js.UndefOr[String] = js.native
  /**
    * Progress view top offset
    * @platform android
    */
  var progressViewOffset: js.UndefOr[Double] = js.native
  /**
    * Whether the view should be indicating an active refresh.
    */
  var refreshing: Boolean = js.native
  /**
    * Size of the refresh indicator, see RefreshControl.SIZE.
    */
  var size: js.UndefOr[Double] = js.native
}

object RefreshControlProps {
  @scala.inline
  def apply(refreshing: Boolean): RefreshControlProps = {
    val __obj = js.Dynamic.literal(refreshing = refreshing.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshControlProps]
  }
  @scala.inline
  implicit class RefreshControlPropsOps[Self <: RefreshControlProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRefreshing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
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
    def withOnRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressViewOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressViewOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressViewOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressViewOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

