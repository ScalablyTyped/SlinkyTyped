package typingsSlinky.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupByCustomField extends StObject {
  
  var groupByCustomField: js.UndefOr[String] = js.native
  
  var settlementDate: String = js.native
}
object GroupByCustomField {
  
  @scala.inline
  def apply(settlementDate: String): GroupByCustomField = {
    val __obj = js.Dynamic.literal(settlementDate = settlementDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupByCustomField]
  }
  
  @scala.inline
  implicit class GroupByCustomFieldMutableBuilder[Self <: GroupByCustomField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupByCustomField(value: String): Self = StObject.set(x, "groupByCustomField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByCustomFieldUndefined: Self = StObject.set(x, "groupByCustomField", js.undefined)
    
    @scala.inline
    def setSettlementDate(value: String): Self = StObject.set(x, "settlementDate", value.asInstanceOf[js.Any])
  }
}
