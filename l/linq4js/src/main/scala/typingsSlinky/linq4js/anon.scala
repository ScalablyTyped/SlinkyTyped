package typingsSlinky.linq4js

import typingsSlinky.linq4js.Linq4JS.OrderEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait GroupValue extends StObject {
    
    var GroupValue: js.Any = js.native
    
    var Order: Array[OrderEntry] = js.native
  }
  object GroupValue {
    
    @scala.inline
    def apply(GroupValue: js.Any, Order: Array[OrderEntry]): GroupValue = {
      val __obj = js.Dynamic.literal(GroupValue = GroupValue.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupValue]
    }
    
    @scala.inline
    implicit class GroupValueMutableBuilder[Self <: GroupValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupValue(value: js.Any): Self = StObject.set(x, "GroupValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: Array[OrderEntry]): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    }
  }
}
