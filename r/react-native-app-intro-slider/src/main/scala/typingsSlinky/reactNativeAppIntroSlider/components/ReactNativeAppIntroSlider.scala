package typingsSlinky.reactNativeAppIntroSlider.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeAppIntroSlider.mod.AppIntroProps
import typingsSlinky.reactNativeAppIntroSlider.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeAppIntroSlider {
  @JSImport("react-native-app-intro-slider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def activeDotStyle(value: ViewStyle): this.type = set("activeDotStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def bottomButton(value: Boolean): this.type = set("bottomButton", value.asInstanceOf[js.Any])
    @scala.inline
    def buttonStyle(value: ViewStyle): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def buttonTextStyle(value: TextProps): this.type = set("buttonTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def doneLabel(value: String): this.type = set("doneLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def dotStyle(value: ViewStyle): this.type = set("dotStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def hidePagination(value: Boolean): this.type = set("hidePagination", value.asInstanceOf[js.Any])
    @scala.inline
    def nextLabel(value: String): this.type = set("nextLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def onDone(value: () => Unit): this.type = set("onDone", js.Any.fromFunction0(value))
    @scala.inline
    def onSkip(value: () => Unit): this.type = set("onSkip", js.Any.fromFunction0(value))
    @scala.inline
    def onSlideChange(value: (/* index */ Double, /* lastIndex */ Double) => Unit): this.type = set("onSlideChange", js.Any.fromFunction2(value))
    @scala.inline
    def paginationStyle(value: ViewStyle): this.type = set("paginationStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def prevLabel(value: String): this.type = set("prevLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def renderDoneButton(value: () => Unit): this.type = set("renderDoneButton", js.Any.fromFunction0(value))
    @scala.inline
    def renderItem(value: /* item */ js.Any => ReactElement): this.type = set("renderItem", js.Any.fromFunction1(value))
    @scala.inline
    def renderNextButton(value: () => Unit): this.type = set("renderNextButton", js.Any.fromFunction0(value))
    @scala.inline
    def renderPrevButton(value: () => Unit): this.type = set("renderPrevButton", js.Any.fromFunction0(value))
    @scala.inline
    def renderSkipButton(value: () => Unit): this.type = set("renderSkipButton", js.Any.fromFunction0(value))
    @scala.inline
    def showDoneButton(value: Boolean): this.type = set("showDoneButton", value.asInstanceOf[js.Any])
    @scala.inline
    def showNextButton(value: Boolean): this.type = set("showNextButton", value.asInstanceOf[js.Any])
    @scala.inline
    def showPrevButton(value: Boolean): this.type = set("showPrevButton", value.asInstanceOf[js.Any])
    @scala.inline
    def showSkipButton(value: Boolean): this.type = set("showSkipButton", value.asInstanceOf[js.Any])
    @scala.inline
    def skipLabel(value: String): this.type = set("skipLabel", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AppIntroProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(slides: js.Array[_]): Builder = {
    val __props = js.Dynamic.literal(slides = slides.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AppIntroProps]))
  }
}

