package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyInstanceCreditSpecificationResult extends StObject {
  
  /**
    * Information about the instances whose credit option for CPU usage was successfully modified.
    */
  var SuccessfulInstanceCreditSpecifications: js.UndefOr[SuccessfulInstanceCreditSpecificationSet] = js.native
  
  /**
    * Information about the instances whose credit option for CPU usage was not modified.
    */
  var UnsuccessfulInstanceCreditSpecifications: js.UndefOr[UnsuccessfulInstanceCreditSpecificationSet] = js.native
}
object ModifyInstanceCreditSpecificationResult {
  
  @scala.inline
  def apply(): ModifyInstanceCreditSpecificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceCreditSpecificationResult]
  }
  
  @scala.inline
  implicit class ModifyInstanceCreditSpecificationResultMutableBuilder[Self <: ModifyInstanceCreditSpecificationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccessfulInstanceCreditSpecifications(value: SuccessfulInstanceCreditSpecificationSet): Self = StObject.set(x, "SuccessfulInstanceCreditSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulInstanceCreditSpecificationsUndefined: Self = StObject.set(x, "SuccessfulInstanceCreditSpecifications", js.undefined)
    
    @scala.inline
    def setSuccessfulInstanceCreditSpecificationsVarargs(value: SuccessfulInstanceCreditSpecificationItem*): Self = StObject.set(x, "SuccessfulInstanceCreditSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setUnsuccessfulInstanceCreditSpecifications(value: UnsuccessfulInstanceCreditSpecificationSet): Self = StObject.set(x, "UnsuccessfulInstanceCreditSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsuccessfulInstanceCreditSpecificationsUndefined: Self = StObject.set(x, "UnsuccessfulInstanceCreditSpecifications", js.undefined)
    
    @scala.inline
    def setUnsuccessfulInstanceCreditSpecificationsVarargs(value: UnsuccessfulInstanceCreditSpecificationItem*): Self = StObject.set(x, "UnsuccessfulInstanceCreditSpecifications", js.Array(value :_*))
  }
}
