package typingsSlinky.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentGroupEc2TagSet extends StObject {
  
  /**
    * Tag filters associated with the deployment group. See the AWS docs for details.
    */
  var ec2TagFilters: js.UndefOr[js.Array[DeploymentGroupEc2TagSetEc2TagFilter]] = js.native
}
object DeploymentGroupEc2TagSet {
  
  @scala.inline
  def apply(): DeploymentGroupEc2TagSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupEc2TagSet]
  }
  
  @scala.inline
  implicit class DeploymentGroupEc2TagSetMutableBuilder[Self <: DeploymentGroupEc2TagSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEc2TagFilters(value: js.Array[DeploymentGroupEc2TagSetEc2TagFilter]): Self = StObject.set(x, "ec2TagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2TagFiltersUndefined: Self = StObject.set(x, "ec2TagFilters", js.undefined)
    
    @scala.inline
    def setEc2TagFiltersVarargs(value: DeploymentGroupEc2TagSetEc2TagFilter*): Self = StObject.set(x, "ec2TagFilters", js.Array(value :_*))
  }
}
