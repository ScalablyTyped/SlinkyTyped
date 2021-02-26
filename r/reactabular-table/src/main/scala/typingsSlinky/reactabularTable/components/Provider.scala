package typingsSlinky.reactabularTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactabularTable.anon.PartialCSSStyleDeclaratio
import typingsSlinky.reactabularTable.mod.Column
import typingsSlinky.reactabularTable.mod.ProviderProps
import typingsSlinky.reactabularTable.mod.Renderers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @scala.inline
  def apply(columns: js.Array[Column]): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ProviderProps]))
  }
  
  @JSImport("reactabular-table", "Provider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactabularTable.mod.Provider] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderers(value: Renderers): this.type = set("renderers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: PartialCSSStyleDeclaratio): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
