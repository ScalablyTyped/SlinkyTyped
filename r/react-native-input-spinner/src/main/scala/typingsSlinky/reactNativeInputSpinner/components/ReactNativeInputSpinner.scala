package typingsSlinky.reactNativeInputSpinner.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeInputSpinner.mod.ReactNativeInputSpinnerProps
import typingsSlinky.reactNativeInputSpinner.mod.default
import typingsSlinky.reactNativeInputSpinner.reactNativeInputSpinnerStrings.float
import typingsSlinky.reactNativeInputSpinner.reactNativeInputSpinnerStrings.int
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeInputSpinner {
  
  @JSImport("react-native-input-spinner", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def append(value: ReactElement): this.type = set("append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arrows(value: Boolean): this.type = set("arrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def background(value: String): this.type = set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonFontFamily(value: String): this.type = set("buttonFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonFontSize(value: Double): this.type = set("buttonFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonLeftDisabled(value: Boolean): this.type = set("buttonLeftDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonLeftImage(value: ReactElement): this.type = set("buttonLeftImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonLeftText(value: String): this.type = set("buttonLeftText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonPressLeftImage(value: ReactElement): this.type = set("buttonPressLeftImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonPressRightImage(value: ReactElement): this.type = set("buttonPressRightImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonPressStyle(value: StyleProp[ViewStyle]): this.type = set("buttonPressStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonPressStyleNull: this.type = set("buttonPressStyle", null)
    
    @scala.inline
    def buttonPressTextColor(value: String): this.type = set("buttonPressTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonRightDisabled(value: Boolean): this.type = set("buttonRightDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonRightImage(value: ReactElement): this.type = set("buttonRightImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonRightText(value: String): this.type = set("buttonRightText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonStyle(value: StyleProp[ViewStyle]): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonStyleNull: this.type = set("buttonStyle", null)
    
    @scala.inline
    def buttonTextColor(value: String): this.type = set("buttonTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorLeft(value: String): this.type = set("colorLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorMax(value: String): this.type = set("colorMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorMin(value: String): this.type = set("colorMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorPress(value: String): this.type = set("colorPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorRight(value: String): this.type = set("colorRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editable(value: Boolean): this.type = set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSize(value: Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialValue(value: Double): this.type = set("initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputStyle(value: StyleProp[ViewStyle]): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputStyleNull: this.type = set("inputStyle", null)
    
    @scala.inline
    def max(value: String | Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: String | Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* val */ js.UndefOr[js.Any] => _): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDecrease(value: /* val */ js.Any => _): this.type = set("onDecrease", js.Any.fromFunction1(value))
    
    @scala.inline
    def onIncrease(value: /* val */ js.Any => _): this.type = set("onIncrease", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMax(value: /* val */ js.Any => _): this.type = set("onMax", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMin(value: /* val */ js.Any => _): this.type = set("onMin", js.Any.fromFunction1(value))
    
    @scala.inline
    def precision(value: Double): this.type = set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prepend(value: ReactElement): this.type = set("prepend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rounded(value: Boolean): this.type = set("rounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showBorder(value: Boolean): this.type = set("showBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def step(value: String | Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: int | float): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactNativeInputSpinnerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactNativeInputSpinner.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
