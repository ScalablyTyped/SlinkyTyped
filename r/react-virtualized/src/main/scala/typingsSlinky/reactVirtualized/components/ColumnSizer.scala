package typingsSlinky.reactVirtualized.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactVirtualized.esColumnSizerMod.ColumnSizerProps
import typingsSlinky.reactVirtualized.esColumnSizerMod.SizedColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColumnSizer {
  
  @JSImport("react-virtualized", "ColumnSizer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.ColumnSizer] {
    
    @scala.inline
    def columnCount(value: Double): this.type = set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnMaxWidth(value: Double): this.type = set("columnMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnMinWidth(value: Double): this.type = set("columnMinWidth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColumnSizerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: SizedColumnProps => ReactElement, width: Double): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColumnSizerProps]))
  }
}
