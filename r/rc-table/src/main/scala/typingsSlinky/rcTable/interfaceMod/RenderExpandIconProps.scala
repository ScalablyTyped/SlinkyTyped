package typingsSlinky.rcTable.interfaceMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderExpandIconProps[RecordType] extends js.Object {
  var expandable: Boolean = js.native
  var expanded: Boolean = js.native
  var onExpand: TriggerEventHandler[RecordType] = js.native
  var prefixCls: String = js.native
  var record: RecordType = js.native
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
  @scala.inline
  implicit class RenderExpandIconPropsOps[Self[recordtype] <: RenderExpandIconProps[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
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
    def withOnExpand(value: (RecordType, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit): Self[RecordType] = {
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

