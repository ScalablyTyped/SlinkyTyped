package typingsSlinky.rcTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcTable.measureCellMod.MeasureCellProps
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MeasureCell {
  
  @JSImport("rc-table/lib/Body/MeasureCell", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: MeasureCellProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(columnKey: Key, onColumnResize: (Key, Double) => Unit): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], onColumnResize = js.Any.fromFunction2(onColumnResize))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[MeasureCellProps]))
  }
}
