package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingGroupMetadata extends StObject {
  
  /**
    * The date the billing group was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
}
object BillingGroupMetadata {
  
  @scala.inline
  def apply(): BillingGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingGroupMetadata]
  }
  
  @scala.inline
  implicit class BillingGroupMetadataMutableBuilder[Self <: BillingGroupMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
  }
}
