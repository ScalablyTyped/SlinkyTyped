package typingsSlinky.reactNavigationStack.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.Animated.WithAnimatedValue
import typingsSlinky.reactNative.mod.ColorValue
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextLayoutEventData
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNavigationStack.headerTitleMod.Props
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.`no-hide-descendants`
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.all
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.assertive
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.auto
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.balanced
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.button
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.clip
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.email
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.head
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.highQuality
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.link
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.middle
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.no
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.none
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.phoneNumber
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.polite
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.radiobutton_checked
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.radiobutton_unchecked
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.simple
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.tail
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeaderTitle {
  
  @JSImport("react-navigation-stack", "HeaderTitle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value :_*))
    
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
    def accessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityTraitsVarargs(value: AccessibilityTrait*): this.type = set("accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def adjustsFontSizeToFit(value: Boolean): this.type = set("adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: String): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataDetectorType(value: phoneNumber | link | email | none | all): this.type = set("dataDetectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataDetectorTypeNull: this.type = set("dataDetectorType", null)
    
    @scala.inline
    def ellipsizeMode(value: head | middle | tail | clip): this.type = set("ellipsizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineBreakMode(value: head | middle | tail | clip): this.type = set("lineBreakMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxFontSizeMultiplier(value: Double): this.type = set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxFontSizeMultiplierNull: this.type = set("maxFontSizeMultiplier", null)
    
    @scala.inline
    def minimumFontScale(value: Double): this.type = set("minimumFontScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def numberOfLines(value: Double): this.type = set("numberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTextLayout(value: SyntheticEvent[NodeHandle, TextLayoutEventData] => Unit): this.type = set("onTextLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionColor(value: ColorValue): this.type = set("selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: WithAnimatedValue[StyleProp[TextStyle]]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def suppressHighlighting(value: Boolean): this.type = set("suppressHighlighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textBreakStrategy(value: simple | highQuality | balanced): this.type = set("textBreakStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HeaderTitle.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
