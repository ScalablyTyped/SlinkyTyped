package typingsSlinky.reactNativeOnboardingSwiper.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.FlatListProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeOnboardingSwiper.mod.DoneButtonProps
import typingsSlinky.reactNativeOnboardingSwiper.mod.DotProps
import typingsSlinky.reactNativeOnboardingSwiper.mod.NextButtonProps
import typingsSlinky.reactNativeOnboardingSwiper.mod.Page
import typingsSlinky.reactNativeOnboardingSwiper.mod.Props
import typingsSlinky.reactNativeOnboardingSwiper.mod.SkipButtonProps
import typingsSlinky.reactNativeOnboardingSwiper.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeOnboardingSwiper {
  
  @scala.inline
  def apply(pages: js.Array[Page]): Builder = {
    val __props = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-native-onboarding-swiper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def DoneButtonComponent(value: ReactComponentClass[DoneButtonProps]): this.type = set("DoneButtonComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def DotComponent(value: ReactComponentClass[DotProps]): this.type = set("DotComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def NextButtonComponent(value: ReactComponentClass[NextButtonProps]): this.type = set("NextButtonComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def SkipButtonComponent(value: ReactComponentClass[SkipButtonProps]): this.type = set("SkipButtonComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bottomBarColor(value: String): this.type = set("bottomBarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bottomBarHeight(value: Double): this.type = set("bottomBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bottomBarHighlight(value: Boolean): this.type = set("bottomBarHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerStyles(value: StyleProp[ViewStyle]): this.type = set("containerStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerStylesNull: this.type = set("containerStyles", null)
    
    @scala.inline
    def controlStatusBar(value: Boolean): this.type = set("controlStatusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flatlistProps(value: FlatListProps[Page]): this.type = set("flatlistProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageContainerStyles(value: StyleProp[ViewStyle]): this.type = set("imageContainerStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageContainerStylesNull: this.type = set("imageContainerStyles", null)
    
    @scala.inline
    def nextLabel(value: String | ReactElement): this.type = set("nextLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextLabelReactElement(value: ReactElement): this.type = set("nextLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDone(value: () => _): this.type = set("onDone", js.Any.fromFunction0(value))
    
    @scala.inline
    def onSkip(value: () => _): this.type = set("onSkip", js.Any.fromFunction0(value))
    
    @scala.inline
    def pageIndexCallback(value: /* pageIndex */ Double => _): this.type = set("pageIndexCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def showDone(value: Boolean): this.type = set("showDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showNext(value: Boolean): this.type = set("showNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showPagination(value: Boolean): this.type = set("showPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSkip(value: Boolean): this.type = set("showSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skipLabel(value: String | ReactElement): this.type = set("skipLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skipLabelReactElement(value: ReactElement): this.type = set("skipLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skipToPage(value: Double): this.type = set("skipToPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subTitleStyles(value: StyleProp[TextStyle]): this.type = set("subTitleStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subTitleStylesNull: this.type = set("subTitleStyles", null)
    
    @scala.inline
    def titleStyles(value: StyleProp[TextStyle]): this.type = set("titleStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleStylesNull: this.type = set("titleStyles", null)
    
    @scala.inline
    def transitionAnimationDuration(value: Double): this.type = set("transitionAnimationDuration", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
