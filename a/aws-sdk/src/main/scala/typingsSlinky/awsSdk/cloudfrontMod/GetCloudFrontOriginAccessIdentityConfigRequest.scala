package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCloudFrontOriginAccessIdentityConfigRequest extends StObject {
  
  /**
    * The identity's ID. 
    */
  var Id: String = js.native
}
object GetCloudFrontOriginAccessIdentityConfigRequest {
  
  @scala.inline
  def apply(Id: String): GetCloudFrontOriginAccessIdentityConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityConfigRequest]
  }
  
  @scala.inline
  implicit class GetCloudFrontOriginAccessIdentityConfigRequestMutableBuilder[Self <: GetCloudFrontOriginAccessIdentityConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
