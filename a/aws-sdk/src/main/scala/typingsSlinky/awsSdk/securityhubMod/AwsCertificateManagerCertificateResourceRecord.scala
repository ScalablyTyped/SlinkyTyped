package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCertificateManagerCertificateResourceRecord extends StObject {
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of resource.
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The value of the resource.
    */
  var Value: js.UndefOr[NonEmptyString] = js.native
}
object AwsCertificateManagerCertificateResourceRecord {
  
  @scala.inline
  def apply(): AwsCertificateManagerCertificateResourceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateResourceRecord]
  }
  
  @scala.inline
  implicit class AwsCertificateManagerCertificateResourceRecordMutableBuilder[Self <: AwsCertificateManagerCertificateResourceRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
