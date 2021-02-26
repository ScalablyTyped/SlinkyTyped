package typingsSlinky.antdMobileRn.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.modalPropsTypeMod.Action
import typingsSlinky.antdMobileRn.modalStyleIndexNativeMod.IModalStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_IModalNativeProps2000388185[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def animateAppear(value: Boolean): this.type = set("animateAppear", value.asInstanceOf[js.Any])
  
  @scala.inline
  def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
  
  @scala.inline
  def animationType(value: js.Any): this.type = set("animationType", value.asInstanceOf[js.Any])
  
  @scala.inline
  def bodyStyle(value: StyleProp[ViewStyle]): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def bodyStyleNull: this.type = set("bodyStyle", null)
  
  @scala.inline
  def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def footer(value: js.Array[Action[TextStyle]]): this.type = set("footer", value.asInstanceOf[js.Any])
  
  @scala.inline
  def footerVarargs(value: Action[TextStyle]*): this.type = set("footer", js.Array(value :_*))
  
  @scala.inline
  def locale(value: js.Object): this.type = set("locale", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onAnimationEnd(value: /* visible */ Boolean => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
  
  @scala.inline
  def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
  
  @scala.inline
  def operation(value: Boolean): this.type = set("operation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def popup(value: Boolean): this.type = set("popup", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def styleNull: this.type = set("style", null)
  
  @scala.inline
  def styles(value: IModalStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  
  @scala.inline
  def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  
  @scala.inline
  def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  
  @scala.inline
  def transparent(value: Boolean): this.type = set("transparent", value.asInstanceOf[js.Any])
}
