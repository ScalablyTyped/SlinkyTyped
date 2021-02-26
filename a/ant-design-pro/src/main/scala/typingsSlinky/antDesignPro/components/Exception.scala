package typingsSlinky.antDesignPro.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.anon.Href
import typingsSlinky.antDesignPro.antDesignProStrings.`403`
import typingsSlinky.antDesignPro.antDesignProStrings.`404`
import typingsSlinky.antDesignPro.antDesignProStrings.`500`
import typingsSlinky.antDesignPro.exceptionMod.ExceptionProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Exception {
  
  @JSImport("ant-design-pro", "Exception")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.mod.Exception] {
    
    @scala.inline
    def actions(value: ReactElement): this.type = set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionsReactElement(value: ReactElement): this.type = set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backText(value: ReactElement): this.type = set("backText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backTextReactElement(value: ReactElement): this.type = set("backText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def desc(value: ReactElement): this.type = set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def descReactElement(value: ReactElement): this.type = set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def img(value: String): this.type = set("img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linkElement(value: String | ReactComponentClass[Href]): this.type = set("linkElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linkElementComponentClass(value: ReactComponentClass[Href]): this.type = set("linkElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linkElementFunctionComponent(value: ReactComponentClass[Href]): this.type = set("linkElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def redirect(value: String): this.type = set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: `403` | `404` | `500`): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Exception.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ExceptionProps[Href]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
