package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFieldLevelEncryptionProfileRequest extends StObject {
  
  /**
    * Request the ID of the profile you want to delete from CloudFront.
    */
  var Id: String = js.native
  
  /**
    * The value of the ETag header that you received when retrieving the profile to delete. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
}
object DeleteFieldLevelEncryptionProfileRequest {
  
  @scala.inline
  def apply(Id: String): DeleteFieldLevelEncryptionProfileRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFieldLevelEncryptionProfileRequest]
  }
  
  @scala.inline
  implicit class DeleteFieldLevelEncryptionProfileRequestMutableBuilder[Self <: DeleteFieldLevelEncryptionProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
