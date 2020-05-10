package typingsSlinky.antd.expandIconMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultExpandIconProps[RecordType] extends js.Object {
  var expandable: Boolean = js.native
  var expanded: Boolean = js.native
  var prefixCls: String = js.native
  var record: RecordType = js.native
  def onExpand(record: RecordType, e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
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
  @scala.inline
  implicit class DefaultExpandIconPropsOps[Self[recordtype] <: DefaultExpandIconProps[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withExpandable(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnExpand(value: (RecordType, SyntheticMouseEvent[HTMLElement]) => Unit): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecord(value: RecordType): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

