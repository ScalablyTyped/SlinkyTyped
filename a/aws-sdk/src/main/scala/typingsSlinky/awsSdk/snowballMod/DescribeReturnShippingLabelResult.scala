package typingsSlinky.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReturnShippingLabelResult extends StObject {
  
  /**
    * The expiration date of the current return shipping label.
    */
  var ExpirationDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The status information of the task on a Snow device that is being returned to AWS.
    */
  var Status: js.UndefOr[ShippingLabelStatus] = js.native
}
object DescribeReturnShippingLabelResult {
  
  @scala.inline
  def apply(): DescribeReturnShippingLabelResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReturnShippingLabelResult]
  }
  
  @scala.inline
  implicit class DescribeReturnShippingLabelResultMutableBuilder[Self <: DescribeReturnShippingLabelResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationDate(value: js.Date): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
    
    @scala.inline
    def setStatus(value: ShippingLabelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
