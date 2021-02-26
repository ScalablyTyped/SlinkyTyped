package typingsSlinky.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceDeploymentController extends StObject {
  
  /**
    * Type of deployment controller. Valid values: `CODE_DEPLOY`, `ECS`, `EXTERNAL`. Default: `ECS`.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ServiceDeploymentController {
  
  @scala.inline
  def apply(): ServiceDeploymentController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceDeploymentController]
  }
  
  @scala.inline
  implicit class ServiceDeploymentControllerMutableBuilder[Self <: ServiceDeploymentController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
