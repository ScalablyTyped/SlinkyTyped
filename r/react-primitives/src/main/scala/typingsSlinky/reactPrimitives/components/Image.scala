package typingsSlinky.reactPrimitives.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityStates
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.ImageErrorEventData
import typingsSlinky.reactNative.mod.ImageLoadEventData
import typingsSlinky.reactNative.mod.ImageProgressEventDataIOS
import typingsSlinky.reactNative.mod.ImageProps
import typingsSlinky.reactNative.mod.ImageResizeMode
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsSlinky.reactNative.reactNativeStrings.assertive
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.button
import typingsSlinky.reactNative.reactNativeStrings.no
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.polite
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_checked
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsSlinky.reactNative.reactNativeStrings.resize
import typingsSlinky.reactNative.reactNativeStrings.scale
import typingsSlinky.reactNative.reactNativeStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Image {
  @JSImport("react-primitives", "Image")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactPrimitives.mod.Image] {
    @scala.inline
    def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): this.type = set("accessibilityComponentType", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityStates(value: js.Array[AccessibilityStates]): this.type = set("accessibilityStates", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    @scala.inline
    def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    @scala.inline
    def blurRadius(value: Double): this.type = set("blurRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def borderBottomLeftRadius(value: Double): this.type = set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def borderBottomRightRadius(value: Double): this.type = set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def borderTopLeftRadius(value: Double): this.type = set("borderTopLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def borderTopRightRadius(value: Double): this.type = set("borderTopRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def capInsets(value: Insets): this.type = set("capInsets", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSource(value: ImageURISource | Double): this.type = set("defaultSource", value.asInstanceOf[js.Any])
    @scala.inline
    def fadeDuration(value: Double): this.type = set("fadeDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingIndicatorSource(value: ImageURISource): this.type = set("loadingIndicatorSource", value.asInstanceOf[js.Any])
    @scala.inline
    def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
    @scala.inline
    def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
    @scala.inline
    def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
    @scala.inline
    def onError(value: SyntheticEvent[NodeHandle, ImageErrorEventData] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def onLayout(value: /* event */ LayoutChangeEvent => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    @scala.inline
    def onLoad(value: SyntheticEvent[NodeHandle, ImageLoadEventData] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadEnd(value: () => Unit): this.type = set("onLoadEnd", js.Any.fromFunction0(value))
    @scala.inline
    def onLoadStart(value: () => Unit): this.type = set("onLoadStart", js.Any.fromFunction0(value))
    @scala.inline
    def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
    @scala.inline
    def onPartialLoad(value: () => Unit): this.type = set("onPartialLoad", js.Any.fromFunction0(value))
    @scala.inline
    def onProgress(value: SyntheticEvent[NodeHandle, ImageProgressEventDataIOS] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def progressiveRenderingEnabled(value: Boolean): this.type = set("progressiveRenderingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def resizeMethod(value: auto | resize | scale): this.type = set("resizeMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def resizeMode(value: ImageResizeMode): this.type = set("resizeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ImageStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(source: ImageSourcePropType): Builder = {
    val __props = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ImageProps]))
  }
}

