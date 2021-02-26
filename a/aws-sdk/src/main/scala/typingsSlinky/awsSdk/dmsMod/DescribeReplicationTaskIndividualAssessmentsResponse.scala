package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReplicationTaskIndividualAssessmentsResponse extends StObject {
  
  /**
    * A pagination token returned for you to pass to a subsequent request. If you pass this token as the Marker value in a subsequent request, the response includes only records beyond the marker, up to the value specified in the request by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * One or more individual assessments as specified by Filters.
    */
  var ReplicationTaskIndividualAssessments: js.UndefOr[ReplicationTaskIndividualAssessmentList] = js.native
}
object DescribeReplicationTaskIndividualAssessmentsResponse {
  
  @scala.inline
  def apply(): DescribeReplicationTaskIndividualAssessmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationTaskIndividualAssessmentsResponse]
  }
  
  @scala.inline
  implicit class DescribeReplicationTaskIndividualAssessmentsResponseMutableBuilder[Self <: DescribeReplicationTaskIndividualAssessmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setReplicationTaskIndividualAssessments(value: ReplicationTaskIndividualAssessmentList): Self = StObject.set(x, "ReplicationTaskIndividualAssessments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskIndividualAssessmentsUndefined: Self = StObject.set(x, "ReplicationTaskIndividualAssessments", js.undefined)
    
    @scala.inline
    def setReplicationTaskIndividualAssessmentsVarargs(value: ReplicationTaskIndividualAssessment*): Self = StObject.set(x, "ReplicationTaskIndividualAssessments", js.Array(value :_*))
  }
}
