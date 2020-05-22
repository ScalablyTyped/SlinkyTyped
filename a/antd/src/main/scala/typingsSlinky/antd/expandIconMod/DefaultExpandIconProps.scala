package typingsSlinky.antd.expandIconMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultExpandIconProps[RecordType] extends js.Object {
  var expandable: Boolean
  var expanded: Boolean
  var prefixCls: String
  var record: RecordType
  def onExpand(record: RecordType, e: SyntheticMouseEvent[HTMLElement]): Unit
}

object DefaultExpandIconProps {
  @scala.inline
  def apply[RecordType](
    expandable: Boolean,
    expanded: Boolean,
    onExpand: (RecordType, SyntheticMouseEvent[HTMLElement]) => Unit,
    prefixCls: String,
    record: RecordType
  ): DefaultExpandIconProps[RecordType] = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], onExpand = js.Any.fromFunction2(onExpand), prefixCls = prefixCls.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultExpandIconProps[RecordType]]
  }
}

