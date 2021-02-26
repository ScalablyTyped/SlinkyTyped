package typingsSlinky.reactGoogleRecaptcha.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactGoogleRecaptcha.mod.Badge
import typingsSlinky.reactGoogleRecaptcha.mod.Size
import typingsSlinky.reactGoogleRecaptcha.mod.Theme
import typingsSlinky.reactGoogleRecaptcha.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ReCAPTCHAProps_334768010[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def badge(value: Badge): this.type = set("badge", value.asInstanceOf[js.Any])
  
  @scala.inline
  def grecaptcha(value: js.Object): this.type = set("grecaptcha", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hl(value: String): this.type = set("hl", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: /* token */ String | Null => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onErrored(value: () => Unit): this.type = set("onErrored", js.Any.fromFunction0(value))
  
  @scala.inline
  def onExpired(value: () => Unit): this.type = set("onExpired", js.Any.fromFunction0(value))
  
  @scala.inline
  def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
  
  @scala.inline
  def stoken(value: String): this.type = set("stoken", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabindex(value: Double): this.type = set("tabindex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `type`(value: Type): this.type = set("type", value.asInstanceOf[js.Any])
}
