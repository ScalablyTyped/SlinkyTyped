package typingsSlinky.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComponentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component that you want to retrieve. Regex requires "/\d+$" suffix.
    */
  var componentBuildVersionArn: ComponentVersionArnOrBuildVersionArn = js.native
}
object GetComponentRequest {
  
  @scala.inline
  def apply(componentBuildVersionArn: ComponentVersionArnOrBuildVersionArn): GetComponentRequest = {
    val __obj = js.Dynamic.literal(componentBuildVersionArn = componentBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentRequest]
  }
  
  @scala.inline
  implicit class GetComponentRequestMutableBuilder[Self <: GetComponentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentBuildVersionArn(value: ComponentVersionArnOrBuildVersionArn): Self = StObject.set(x, "componentBuildVersionArn", value.asInstanceOf[js.Any])
  }
}
