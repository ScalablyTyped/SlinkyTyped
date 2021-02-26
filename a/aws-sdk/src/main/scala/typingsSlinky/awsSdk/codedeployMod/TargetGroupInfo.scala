package typingsSlinky.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetGroupInfo extends StObject {
  
  /**
    * For blue/green deployments, the name of the target group that instances in the original environment are deregistered from, and instances in the replacement environment are registered with. For in-place deployments, the name of the target group that instances are deregistered from, so they are not serving traffic during a deployment, and then re-registered with after the deployment is complete. 
    */
  var name: js.UndefOr[TargetGroupName] = js.native
}
object TargetGroupInfo {
  
  @scala.inline
  def apply(): TargetGroupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupInfo]
  }
  
  @scala.inline
  implicit class TargetGroupInfoMutableBuilder[Self <: TargetGroupInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: TargetGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
