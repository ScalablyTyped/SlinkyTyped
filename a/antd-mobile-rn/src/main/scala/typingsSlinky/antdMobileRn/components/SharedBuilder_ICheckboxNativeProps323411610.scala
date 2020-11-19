package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.checkboxPropsTypeMod.OnChangeParams
import typingsSlinky.antdMobileRn.checkboxStyleIndexNativeMod.ICheckboxStyle
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ICheckboxNativeProps323411610[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: /* params */ OnChangeParams => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def style(value: StyleProp[ImageStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def styleNull: this.type = set("style", null)
  
  @scala.inline
  def styles(value: ICheckboxStyle): this.type = set("styles", value.asInstanceOf[js.Any])
}
