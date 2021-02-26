package typingsSlinky.linguiMacro.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.linguiMacro.transMod.TransPropsWithoutI18n
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Trans {
  
  @JSImport("@lingui/macro", "Trans")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.linguiMacro.mod.Trans] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def components(value: js.Array[ReactElement]): this.type = set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentsVarargs(value: ReactElement*): this.type = set("components", js.Array(value :_*))
    
    @scala.inline
    def defaults(value: String): this.type = set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formats(value: js.Object): this.type = set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def render(value: ReactElement): this.type = set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderReactElement(value: ReactElement): this.type = set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def values(value: js.Object): this.type = set("values", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Trans.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TransPropsWithoutI18n): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
