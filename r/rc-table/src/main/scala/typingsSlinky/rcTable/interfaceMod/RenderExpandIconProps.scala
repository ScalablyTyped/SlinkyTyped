package typingsSlinky.rcTable.interfaceMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderExpandIconProps[RecordType] extends js.Object {
  var expandable: Boolean
  var expanded: Boolean
  var onExpand: TriggerEventHandler[RecordType]
  var prefixCls: String
  var record: RecordType
}

object RenderExpandIconProps {
  @scala.inline
  def apply[RecordType](
    expandable: Boolean,
    expanded: Boolean,
    onExpand: (RecordType, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit,
    prefixCls: String,
    record: RecordType
  ): RenderExpandIconProps[RecordType] = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], onExpand = js.Any.fromFunction2(onExpand), prefixCls = prefixCls.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderExpandIconProps[RecordType]]
  }
}

