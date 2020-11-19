package typingsSlinky.antd.expandIconMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultExpandIconProps[RecordType] extends js.Object {
  
  var expandable: Boolean = js.native
  
  var expanded: Boolean = js.native
  
  def onExpand(record: RecordType, e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  
  var prefixCls: String = js.native
  
  var record: RecordType = js.native
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
  implicit class DefaultExpandIconPropsOps[Self <: DefaultExpandIconProps[_], RecordType] (val x: Self with DefaultExpandIconProps[RecordType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExpandable(value: Boolean): Self = this.set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExpand(value: (RecordType, SyntheticMouseEvent[HTMLElement]) => Unit): Self = this.set("onExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecord(value: RecordType): Self = this.set("record", value.asInstanceOf[js.Any])
  }
}
