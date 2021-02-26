package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.indexDotnativeMod.AccordionStyle
import typingsSlinky.antdMobileRn.indexNativeMod.AccordionNativeProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accordion {
  
  @JSImport("antd-mobile-rn", "Accordion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.Accordion] {
    
    @scala.inline
    def activeKey(value: String | js.Array[String]): this.type = set("activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeKeyVarargs(value: String*): this.type = set("activeKey", js.Array(value :_*))
    
    @scala.inline
    def defaultActiveKey(value: String | js.Array[String]): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultActiveKeyVarargs(value: String*): this.type = set("defaultActiveKey", js.Array(value :_*))
    
    @scala.inline
    def onChange(value: /* x */ js.Any => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: AccordionStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Accordion.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AccordionNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
