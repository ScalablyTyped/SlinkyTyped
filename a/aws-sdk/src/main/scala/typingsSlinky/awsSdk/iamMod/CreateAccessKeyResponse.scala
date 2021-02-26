package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccessKeyResponse extends StObject {
  
  /**
    * A structure with details about the access key.
    */
  var AccessKey: typingsSlinky.awsSdk.iamMod.AccessKey = js.native
}
object CreateAccessKeyResponse {
  
  @scala.inline
  def apply(AccessKey: AccessKey): CreateAccessKeyResponse = {
    val __obj = js.Dynamic.literal(AccessKey = AccessKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessKeyResponse]
  }
  
  @scala.inline
  implicit class CreateAccessKeyResponseMutableBuilder[Self <: CreateAccessKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKey(value: AccessKey): Self = StObject.set(x, "AccessKey", value.asInstanceOf[js.Any])
  }
}
