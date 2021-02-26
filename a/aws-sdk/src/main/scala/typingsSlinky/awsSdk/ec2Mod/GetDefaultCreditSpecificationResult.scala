package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDefaultCreditSpecificationResult extends StObject {
  
  /**
    * The default credit option for CPU usage of the instance family.
    */
  var InstanceFamilyCreditSpecification: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceFamilyCreditSpecification] = js.native
}
object GetDefaultCreditSpecificationResult {
  
  @scala.inline
  def apply(): GetDefaultCreditSpecificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDefaultCreditSpecificationResult]
  }
  
  @scala.inline
  implicit class GetDefaultCreditSpecificationResultMutableBuilder[Self <: GetDefaultCreditSpecificationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceFamilyCreditSpecification(value: InstanceFamilyCreditSpecification): Self = StObject.set(x, "InstanceFamilyCreditSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFamilyCreditSpecificationUndefined: Self = StObject.set(x, "InstanceFamilyCreditSpecification", js.undefined)
  }
}
