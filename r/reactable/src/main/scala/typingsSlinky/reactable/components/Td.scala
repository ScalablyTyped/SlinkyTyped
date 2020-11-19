package typingsSlinky.reactable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactable.mod.TdProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Td {
  
  @JSImport("reactable", "Td")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactable.mod.Td] {
    
    @scala.inline
    def data(value: js.Any): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TdProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(column: String): Builder = {
    val __props = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TdProperties]))
  }
}
