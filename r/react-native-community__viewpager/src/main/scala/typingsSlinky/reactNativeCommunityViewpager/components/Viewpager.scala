package typingsSlinky.reactNativeCommunityViewpager.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCommunityViewpager.mod.PageScrollStateChangedEvent
import typingsSlinky.reactNativeCommunityViewpager.mod.ViewPagerOnPageScrollEventData
import typingsSlinky.reactNativeCommunityViewpager.mod.ViewPagerOnPageSelectedEventData
import typingsSlinky.reactNativeCommunityViewpager.mod.ViewPagerProps
import typingsSlinky.reactNativeCommunityViewpager.mod.default
import typingsSlinky.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.`on-drag`
import typingsSlinky.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.always
import typingsSlinky.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.auto
import typingsSlinky.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.curl
import typingsSlinky.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.horizontal
import typingsSlinky.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.never
import typingsSlinky.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.none
import typingsSlinky.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.scroll
import typingsSlinky.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Viewpager {
  
  @JSImport("@react-native-community/viewpager", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def initialPage(value: Double): this.type = set("initialPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboardDismissMode(value: none | `on-drag`): this.type = set("keyboardDismissMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPageScroll(value: SyntheticEvent[NodeHandle, ViewPagerOnPageScrollEventData] => Unit): this.type = set("onPageScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPageScrollStateChanged(value: SyntheticEvent[NodeHandle, PageScrollStateChangedEvent] => Unit): this.type = set("onPageScrollStateChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPageSelected(value: SyntheticEvent[NodeHandle, ViewPagerOnPageSelectedEventData] => Unit): this.type = set("onPageSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overScrollMode(value: auto | always | never): this.type = set("overScrollMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageMargin(value: Double): this.type = set("pageMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showPageIndicator(value: Boolean): this.type = set("showPageIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def transitionStyle(value: scroll | curl): this.type = set("transitionStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Viewpager.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ViewPagerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
