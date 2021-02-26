package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScheduledInstancesResult extends StObject {
  
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the Scheduled Instances.
    */
  var ScheduledInstanceSet: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ScheduledInstanceSet] = js.native
}
object DescribeScheduledInstancesResult {
  
  @scala.inline
  def apply(): DescribeScheduledInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledInstancesResult]
  }
  
  @scala.inline
  implicit class DescribeScheduledInstancesResultMutableBuilder[Self <: DescribeScheduledInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScheduledInstanceSet(value: ScheduledInstanceSet): Self = StObject.set(x, "ScheduledInstanceSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledInstanceSetUndefined: Self = StObject.set(x, "ScheduledInstanceSet", js.undefined)
    
    @scala.inline
    def setScheduledInstanceSetVarargs(value: ScheduledInstance*): Self = StObject.set(x, "ScheduledInstanceSet", js.Array(value :_*))
  }
}
