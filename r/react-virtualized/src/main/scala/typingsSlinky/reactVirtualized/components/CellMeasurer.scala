package typingsSlinky.reactVirtualized.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerCacheInterface
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerChildProps
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerProps
import typingsSlinky.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CellMeasurer {
  
  @JSImport("react-virtualized", "CellMeasurer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.CellMeasurer] {
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: /* props */ CellMeasurerChildProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def children(value: (js.Function1[/* props */ CellMeasurerChildProps, ReactElement]) | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnIndex(value: Double): this.type = set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowIndex(value: Double): this.type = set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CellMeasurerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(cache: CellMeasurerCacheInterface, parent: MeasuredCellParent): Builder = {
    val __props = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CellMeasurerProps]))
  }
}
