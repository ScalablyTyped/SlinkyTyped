package typingsSlinky.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PollForTaskInput extends StObject {
  
  /**
    * The public DNS name of the calling task runner.
    */
  var hostname: js.UndefOr[id] = js.native
  
  /**
    * Identity information for the EC2 instance that is hosting the task runner. You can get this value from the instance using http://169.254.169.254/latest/meta-data/instance-id. For more information, see Instance Metadata in the Amazon Elastic Compute Cloud User Guide. Passing in this value proves that your task runner is running on an EC2 instance, and ensures the proper AWS Data Pipeline service charges are applied to your pipeline.
    */
  var instanceIdentity: js.UndefOr[InstanceIdentity] = js.native
  
  /**
    * The type of task the task runner is configured to accept and process. The worker group is set as a field on objects in the pipeline when they are created. You can only specify a single value for workerGroup in the call to PollForTask. There are no wildcard values permitted in workerGroup; the string must be an exact, case-sensitive, match.
    */
  var workerGroup: String = js.native
}
object PollForTaskInput {
  
  @scala.inline
  def apply(workerGroup: String): PollForTaskInput = {
    val __obj = js.Dynamic.literal(workerGroup = workerGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollForTaskInput]
  }
  
  @scala.inline
  implicit class PollForTaskInputMutableBuilder[Self <: PollForTaskInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostname(value: id): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setInstanceIdentity(value: InstanceIdentity): Self = StObject.set(x, "instanceIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdentityUndefined: Self = StObject.set(x, "instanceIdentity", js.undefined)
    
    @scala.inline
    def setWorkerGroup(value: String): Self = StObject.set(x, "workerGroup", value.asInstanceOf[js.Any])
  }
}
