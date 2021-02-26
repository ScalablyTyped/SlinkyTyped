package typingsSlinky.antd

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.tableInterfaceMod.TableLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandIconMod {
  
  @JSImport("antd/lib/table/ExpandIcon", JSImport.Default)
  @js.native
  def default(locale: TableLocale): js.Function1[
    /* hasPrefixClsOnExpandRecordExpandedExpandable */ DefaultExpandIconProps[_], 
    ReactElement
  ] = js.native
  
  @js.native
  trait DefaultExpandIconProps[RecordType] extends StObject {
    
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
    implicit class DefaultExpandIconPropsMutableBuilder[Self <: DefaultExpandIconProps[_], RecordType] (val x: Self with DefaultExpandIconProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExpand(value: (RecordType, SyntheticMouseEvent[HTMLElement]) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    }
  }
}
