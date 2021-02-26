package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelReplicationTaskAssessmentRunResponse extends StObject {
  
  /**
    * The ReplicationTaskAssessmentRun object for the canceled assessment run.
    */
  var ReplicationTaskAssessmentRun: js.UndefOr[typingsSlinky.awsSdk.dmsMod.ReplicationTaskAssessmentRun] = js.native
}
object CancelReplicationTaskAssessmentRunResponse {
  
  @scala.inline
  def apply(): CancelReplicationTaskAssessmentRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelReplicationTaskAssessmentRunResponse]
  }
  
  @scala.inline
  implicit class CancelReplicationTaskAssessmentRunResponseMutableBuilder[Self <: CancelReplicationTaskAssessmentRunResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationTaskAssessmentRun(value: ReplicationTaskAssessmentRun): Self = StObject.set(x, "ReplicationTaskAssessmentRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskAssessmentRunUndefined: Self = StObject.set(x, "ReplicationTaskAssessmentRun", js.undefined)
  }
}
