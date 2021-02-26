package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSnapshotSchedulesOutputMessage extends StObject {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the marker parameter and retrying the command. If the marker field is empty, all response records have been retrieved for the request.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * A list of SnapshotSchedules.
    */
  var SnapshotSchedules: js.UndefOr[SnapshotScheduleList] = js.native
}
object DescribeSnapshotSchedulesOutputMessage {
  
  @scala.inline
  def apply(): DescribeSnapshotSchedulesOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotSchedulesOutputMessage]
  }
  
  @scala.inline
  implicit class DescribeSnapshotSchedulesOutputMessageMutableBuilder[Self <: DescribeSnapshotSchedulesOutputMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setSnapshotSchedules(value: SnapshotScheduleList): Self = StObject.set(x, "SnapshotSchedules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotSchedulesUndefined: Self = StObject.set(x, "SnapshotSchedules", js.undefined)
    
    @scala.inline
    def setSnapshotSchedulesVarargs(value: SnapshotSchedule*): Self = StObject.set(x, "SnapshotSchedules", js.Array(value :_*))
  }
}
