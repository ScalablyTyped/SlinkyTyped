package typingsSlinky.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateRequest extends StObject {
  
  /**
    * The specification of data to be aggregated. At least one aggregateBy spec must be provided. All data that is specified will be aggregated using the same bucketing criteria. There
    * will be one dataset in the response for every aggregateBy spec.
    */
  var aggregateBy: js.UndefOr[js.Array[AggregateBy]] = js.native
  
  /**
    * Specifies that data be aggregated each activity segment recorded for a user. Similar to bucketByActivitySegment, but bucketing is done for each activity segment rather than all
    * segments of the same type. Mutually exclusive of other bucketing specifications.
    */
  var bucketByActivitySegment: js.UndefOr[BucketByActivity] = js.native
  
  /**
    * Specifies that data be aggregated by the type of activity being performed when the data was recorded. All data that was recorded during a certain activity type (.for the given time
    * range) will be aggregated into the same bucket. Data that was recorded while the user was not active will not be included in the response. Mutually exclusive of other bucketing
    * specifications.
    */
  var bucketByActivityType: js.UndefOr[BucketByActivity] = js.native
  
  /**
    * Specifies that data be aggregated by user sessions. Data that does not fall within the time range of a session will not be included in the response. Mutually exclusive of other
    * bucketing specifications.
    */
  var bucketBySession: js.UndefOr[BucketBySession] = js.native
  
  /** Specifies that data be aggregated by a single time interval. Mutually exclusive of other bucketing specifications. */
  var bucketByTime: js.UndefOr[BucketByTime] = js.native
  
  /** The end of a window of time. Data that intersects with this time window will be aggregated. The time is in milliseconds since epoch, inclusive. */
  var endTimeMillis: js.UndefOr[String] = js.native
  
  /** DO NOT POPULATE THIS FIELD. It is ignored. */
  var filteredDataQualityStandard: js.UndefOr[js.Array[String]] = js.native
  
  /** The start of a window of time. Data that intersects with this time window will be aggregated. The time is in milliseconds since epoch, inclusive. */
  var startTimeMillis: js.UndefOr[String] = js.native
}
object AggregateRequest {
  
  @scala.inline
  def apply(): AggregateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateRequest]
  }
  
  @scala.inline
  implicit class AggregateRequestMutableBuilder[Self <: AggregateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregateBy(value: js.Array[AggregateBy]): Self = StObject.set(x, "aggregateBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateByUndefined: Self = StObject.set(x, "aggregateBy", js.undefined)
    
    @scala.inline
    def setAggregateByVarargs(value: AggregateBy*): Self = StObject.set(x, "aggregateBy", js.Array(value :_*))
    
    @scala.inline
    def setBucketByActivitySegment(value: BucketByActivity): Self = StObject.set(x, "bucketByActivitySegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketByActivitySegmentUndefined: Self = StObject.set(x, "bucketByActivitySegment", js.undefined)
    
    @scala.inline
    def setBucketByActivityType(value: BucketByActivity): Self = StObject.set(x, "bucketByActivityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketByActivityTypeUndefined: Self = StObject.set(x, "bucketByActivityType", js.undefined)
    
    @scala.inline
    def setBucketBySession(value: BucketBySession): Self = StObject.set(x, "bucketBySession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketBySessionUndefined: Self = StObject.set(x, "bucketBySession", js.undefined)
    
    @scala.inline
    def setBucketByTime(value: BucketByTime): Self = StObject.set(x, "bucketByTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketByTimeUndefined: Self = StObject.set(x, "bucketByTime", js.undefined)
    
    @scala.inline
    def setEndTimeMillis(value: String): Self = StObject.set(x, "endTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeMillisUndefined: Self = StObject.set(x, "endTimeMillis", js.undefined)
    
    @scala.inline
    def setFilteredDataQualityStandard(value: js.Array[String]): Self = StObject.set(x, "filteredDataQualityStandard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredDataQualityStandardUndefined: Self = StObject.set(x, "filteredDataQualityStandard", js.undefined)
    
    @scala.inline
    def setFilteredDataQualityStandardVarargs(value: String*): Self = StObject.set(x, "filteredDataQualityStandard", js.Array(value :_*))
    
    @scala.inline
    def setStartTimeMillis(value: String): Self = StObject.set(x, "startTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeMillisUndefined: Self = StObject.set(x, "startTimeMillis", js.undefined)
  }
}
