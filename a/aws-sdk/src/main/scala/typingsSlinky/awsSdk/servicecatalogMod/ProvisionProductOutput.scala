package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionProductOutput extends StObject {
  
  /**
    * Information about the result of provisioning the product.
    */
  var RecordDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.RecordDetail] = js.native
}
object ProvisionProductOutput {
  
  @scala.inline
  def apply(): ProvisionProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionProductOutput]
  }
  
  @scala.inline
  implicit class ProvisionProductOutputMutableBuilder[Self <: ProvisionProductOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordDetail(value: RecordDetail): Self = StObject.set(x, "RecordDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordDetailUndefined: Self = StObject.set(x, "RecordDetail", js.undefined)
  }
}
