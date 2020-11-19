package typingsSlinky.antDesignPro.components

import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_LoginItemProps638664218 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def buttonTextReactElement(value: ReactElement): this.type = set("buttonText", value.asInstanceOf[js.Any])
  
  @scala.inline
  def buttonText(value: ReactElement): this.type = set("buttonText", value.asInstanceOf[js.Any])
  
  @scala.inline
  def countDown(value: Double): this.type = set("countDown", value.asInstanceOf[js.Any])
  
  @scala.inline
  def customprops(value: js.Any): this.type = set("customprops", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getCaptchaButtonText(value: String): this.type = set("getCaptchaButtonText", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getCaptchaSecondText(value: String): this.type = set("getCaptchaSecondText", value.asInstanceOf[js.Any])
  
  @scala.inline
  def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: /* e */ js.Any => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onGetCaptcha(value: /* event */ js.UndefOr[MouseEvent] => Unit): this.type = set("onGetCaptcha", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPressEnter(value: /* e */ js.Any => Unit): this.type = set("onPressEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rulesVarargs(value: js.Any*): this.type = set("rules", js.Array(value :_*))
  
  @scala.inline
  def rules(value: js.Array[_]): this.type = set("rules", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}
