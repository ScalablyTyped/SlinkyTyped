package typingsSlinky.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterTimeline extends StObject {
  
  /**
    * The creation date and time of the cluster.
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The date and time when the cluster was terminated.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The date and time when the cluster was ready to execute steps.
    */
  var ReadyDateTime: js.UndefOr[js.Date] = js.native
}
object ClusterTimeline {
  
  @scala.inline
  def apply(): ClusterTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterTimeline]
  }
  
  @scala.inline
  implicit class ClusterTimelineMutableBuilder[Self <: ClusterTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: js.Date): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    @scala.inline
    def setReadyDateTime(value: js.Date): Self = StObject.set(x, "ReadyDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyDateTimeUndefined: Self = StObject.set(x, "ReadyDateTime", js.undefined)
  }
}
