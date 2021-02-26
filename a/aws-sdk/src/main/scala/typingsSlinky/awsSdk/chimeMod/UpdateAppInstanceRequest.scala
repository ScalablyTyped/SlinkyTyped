package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAppInstanceRequest extends StObject {
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: ChimeArn = js.native
  
  /**
    * The metadata that you want to change.
    */
  var Metadata: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Metadata] = js.native
  
  /**
    * The name that you want to change.
    */
  var Name: NonEmptyResourceName = js.native
}
object UpdateAppInstanceRequest {
  
  @scala.inline
  def apply(AppInstanceArn: ChimeArn, Name: NonEmptyResourceName): UpdateAppInstanceRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppInstanceRequest]
  }
  
  @scala.inline
  implicit class UpdateAppInstanceRequestMutableBuilder[Self <: UpdateAppInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
