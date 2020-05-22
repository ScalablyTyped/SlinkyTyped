package typingsSlinky.rcTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTable.expandedRowMod.ExpandedRowProps
import typingsSlinky.rcTable.interfaceMod.CustomizeComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ExpandedRow {
  @JSImport("rc-table/lib/Body/ExpandedRow", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[RecordType] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def withProps[RecordType](p: ExpandedRowProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[RecordType](
    cellComponent: CustomizeComponent,
    className: String,
    colSpan: Double,
    component: CustomizeComponent,
    componentWidth: Double,
    expanded: Boolean,
    fixColumn: Boolean,
    fixHeader: Boolean,
    horizonScroll: Boolean,
    prefixCls: String
  ): Builder[RecordType] = {
    val __props = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], colSpan = colSpan.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], horizonScroll = horizonScroll.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[ExpandedRowProps[RecordType]]))
  }
}

