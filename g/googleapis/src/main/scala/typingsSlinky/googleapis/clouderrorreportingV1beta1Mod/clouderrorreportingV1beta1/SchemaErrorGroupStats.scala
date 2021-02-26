package typingsSlinky.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data extracted for a specific group based on certain filter criteria, such
  * as a given time period and/or service filter.
  */
@js.native
trait SchemaErrorGroupStats extends StObject {
  
  /**
    * Service contexts with a non-zero error count for the given filter
    * criteria. This list can be truncated if multiple services are affected.
    * Refer to `num_affected_services` for the total count.
    */
  var affectedServices: js.UndefOr[js.Array[SchemaServiceContext]] = js.native
  
  /**
    * Approximate number of affected users in the given group that match the
    * filter criteria. Users are distinguished by data in the `ErrorContext` of
    * the individual error events, such as their login name or their remote IP
    * address in case of HTTP requests. The number of affected users can be
    * zero even if the number of errors is non-zero if no data was provided
    * from which the affected user could be deduced. Users are counted based on
    * data in the request context that was provided in the error report. If
    * more users are implicitly affected, such as due to a crash of the whole
    * service, this is not reflected here.
    */
  var affectedUsersCount: js.UndefOr[String] = js.native
  
  /**
    * Approximate total number of events in the given group that match the
    * filter criteria.
    */
  var count: js.UndefOr[String] = js.native
  
  /**
    * Approximate first occurrence that was ever seen for this group and which
    * matches the given filter criteria, ignoring the time_range that was
    * specified in the request.
    */
  var firstSeenTime: js.UndefOr[String] = js.native
  
  /**
    * Group data that is independent of the filter criteria.
    */
  var group: js.UndefOr[SchemaErrorGroup] = js.native
  
  /**
    * Approximate last occurrence that was ever seen for this group and which
    * matches the given filter criteria, ignoring the time_range that was
    * specified in the request.
    */
  var lastSeenTime: js.UndefOr[String] = js.native
  
  /**
    * The total number of services with a non-zero error count for the given
    * filter criteria.
    */
  var numAffectedServices: js.UndefOr[Double] = js.native
  
  /**
    * An arbitrary event that is chosen as representative for the whole group.
    * The representative event is intended to be used as a quick preview for
    * the whole group. Events in the group are usually sufficiently similar to
    * each other such that showing an arbitrary representative provides insight
    * into the characteristics of the group as a whole.
    */
  var representative: js.UndefOr[SchemaErrorEvent] = js.native
  
  /**
    * Approximate number of occurrences over time. Timed counts returned by
    * ListGroups are guaranteed to be:  - Inside the requested time interval -
    * Non-overlapping, and - Ordered by ascending time.
    */
  var timedCounts: js.UndefOr[js.Array[SchemaTimedCount]] = js.native
}
object SchemaErrorGroupStats {
  
  @scala.inline
  def apply(): SchemaErrorGroupStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorGroupStats]
  }
  
  @scala.inline
  implicit class SchemaErrorGroupStatsMutableBuilder[Self <: SchemaErrorGroupStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffectedServices(value: js.Array[SchemaServiceContext]): Self = StObject.set(x, "affectedServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffectedServicesUndefined: Self = StObject.set(x, "affectedServices", js.undefined)
    
    @scala.inline
    def setAffectedServicesVarargs(value: SchemaServiceContext*): Self = StObject.set(x, "affectedServices", js.Array(value :_*))
    
    @scala.inline
    def setAffectedUsersCount(value: String): Self = StObject.set(x, "affectedUsersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffectedUsersCountUndefined: Self = StObject.set(x, "affectedUsersCount", js.undefined)
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setFirstSeenTime(value: String): Self = StObject.set(x, "firstSeenTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSeenTimeUndefined: Self = StObject.set(x, "firstSeenTime", js.undefined)
    
    @scala.inline
    def setGroup(value: SchemaErrorGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setLastSeenTime(value: String): Self = StObject.set(x, "lastSeenTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSeenTimeUndefined: Self = StObject.set(x, "lastSeenTime", js.undefined)
    
    @scala.inline
    def setNumAffectedServices(value: Double): Self = StObject.set(x, "numAffectedServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumAffectedServicesUndefined: Self = StObject.set(x, "numAffectedServices", js.undefined)
    
    @scala.inline
    def setRepresentative(value: SchemaErrorEvent): Self = StObject.set(x, "representative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepresentativeUndefined: Self = StObject.set(x, "representative", js.undefined)
    
    @scala.inline
    def setTimedCounts(value: js.Array[SchemaTimedCount]): Self = StObject.set(x, "timedCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedCountsUndefined: Self = StObject.set(x, "timedCounts", js.undefined)
    
    @scala.inline
    def setTimedCountsVarargs(value: SchemaTimedCount*): Self = StObject.set(x, "timedCounts", js.Array(value :_*))
  }
}
