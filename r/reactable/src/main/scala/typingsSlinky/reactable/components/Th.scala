package typingsSlinky.reactable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactable.mod.ThProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Th {
  
  @scala.inline
  def apply(column: String): Builder = {
    val __props = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ThProperties]))
  }
  
  @JSImport("reactable", "Th")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactable.mod.Th] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ThProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
