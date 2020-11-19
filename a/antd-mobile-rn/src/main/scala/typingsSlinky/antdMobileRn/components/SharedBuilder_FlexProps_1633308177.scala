package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`column-reverse`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`row-reverse`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`wrap-reverse`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.around
import typingsSlinky.antdMobileRn.antdMobileRnStrings.baseline
import typingsSlinky.antdMobileRn.antdMobileRnStrings.between
import typingsSlinky.antdMobileRn.antdMobileRnStrings.center
import typingsSlinky.antdMobileRn.antdMobileRnStrings.column
import typingsSlinky.antdMobileRn.antdMobileRnStrings.end
import typingsSlinky.antdMobileRn.antdMobileRnStrings.nowrap
import typingsSlinky.antdMobileRn.antdMobileRnStrings.row
import typingsSlinky.antdMobileRn.antdMobileRnStrings.start
import typingsSlinky.antdMobileRn.antdMobileRnStrings.stretch
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_FlexProps_1633308177[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def align(value: start | center | end | baseline | stretch): this.type = set("align", value.asInstanceOf[js.Any])
  
  @scala.inline
  def direction(value: row | `row-reverse` | column | `column-reverse`): this.type = set("direction", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def justify(value: start | end | center | between | around): this.type = set("justify", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onLongPress(value: () => Unit): this.type = set("onLongPress", js.Any.fromFunction0(value))
  
  @scala.inline
  def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
  
  @scala.inline
  def onPressIn(value: () => Unit): this.type = set("onPressIn", js.Any.fromFunction0(value))
  
  @scala.inline
  def onPressOut(value: () => Unit): this.type = set("onPressOut", js.Any.fromFunction0(value))
  
  @scala.inline
  def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def styleNull: this.type = set("style", null)
  
  @scala.inline
  def wrap(value: nowrap | typingsSlinky.antdMobileRn.antdMobileRnStrings.wrap | `wrap-reverse`): this.type = set("wrap", value.asInstanceOf[js.Any])
}
