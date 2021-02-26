package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePlatformVersionRequest extends StObject {
  
  /**
    * The ARN of the version of the custom platform.
    */
  var PlatformArn: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
}
object DeletePlatformVersionRequest {
  
  @scala.inline
  def apply(): DeletePlatformVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePlatformVersionRequest]
  }
  
  @scala.inline
  implicit class DeletePlatformVersionRequestMutableBuilder[Self <: DeletePlatformVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatformArn(value: PlatformArn): Self = StObject.set(x, "PlatformArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformArnUndefined: Self = StObject.set(x, "PlatformArn", js.undefined)
  }
}
