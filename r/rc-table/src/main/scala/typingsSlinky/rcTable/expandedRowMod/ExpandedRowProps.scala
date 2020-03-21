package typingsSlinky.rcTable.expandedRowMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.rcTable.interfaceMod.CustomizeComponent
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandedRowProps[RecordType] extends js.Object {
  var cellComponent: CustomizeComponent[HTMLAttributes[HTMLElement]]
  var children: TagMod[Any]
  var className: String
  var colSpan: Double
  var component: CustomizeComponent[HTMLAttributes[HTMLElement]]
  var componentWidth: Double
  var expanded: Boolean
  var fixColumn: Boolean
  var fixHeader: Boolean
  var prefixCls: String
}

object ExpandedRowProps {
  @scala.inline
  def apply[RecordType](
    cellComponent: CustomizeComponent[HTMLAttributes[HTMLElement]],
    children: TagMod[Any],
    className: String,
    colSpan: Double,
    component: CustomizeComponent[HTMLAttributes[HTMLElement]],
    componentWidth: Double,
    expanded: Boolean,
    fixColumn: Boolean,
    fixHeader: Boolean,
    prefixCls: String
  ): ExpandedRowProps[RecordType] = {
    val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], colSpan = colSpan.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExpandedRowProps[RecordType]]
  }
}

