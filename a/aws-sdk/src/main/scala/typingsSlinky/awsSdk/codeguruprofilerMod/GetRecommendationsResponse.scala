package typingsSlinky.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRecommendationsResponse extends StObject {
  
  /**
    *  The list of anomalies that the analysis has found for this profile. 
    */
  var anomalies: Anomalies = js.native
  
  /**
    *  The end time of the profile the analysis data is about. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var profileEndTime: js.Date = js.native
  
  /**
    *  The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var profileStartTime: js.Date = js.native
  
  /**
    * The name of the profiling group the analysis data is about.
    */
  var profilingGroupName: ProfilingGroupName = js.native
  
  /**
    * The list of recommendations that the analysis found for this profile.
    */
  var recommendations: Recommendations = js.native
}
object GetRecommendationsResponse {
  
  @scala.inline
  def apply(
    anomalies: Anomalies,
    profileEndTime: js.Date,
    profileStartTime: js.Date,
    profilingGroupName: ProfilingGroupName,
    recommendations: Recommendations
  ): GetRecommendationsResponse = {
    val __obj = js.Dynamic.literal(anomalies = anomalies.asInstanceOf[js.Any], profileEndTime = profileEndTime.asInstanceOf[js.Any], profileStartTime = profileStartTime.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any], recommendations = recommendations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommendationsResponse]
  }
  
  @scala.inline
  implicit class GetRecommendationsResponseMutableBuilder[Self <: GetRecommendationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnomalies(value: Anomalies): Self = StObject.set(x, "anomalies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnomaliesVarargs(value: Anomaly*): Self = StObject.set(x, "anomalies", js.Array(value :_*))
    
    @scala.inline
    def setProfileEndTime(value: js.Date): Self = StObject.set(x, "profileEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileStartTime(value: js.Date): Self = StObject.set(x, "profileStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendations(value: Recommendations): Self = StObject.set(x, "recommendations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationsVarargs(value: Recommendation*): Self = StObject.set(x, "recommendations", js.Array(value :_*))
  }
}
