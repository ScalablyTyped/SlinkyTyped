package typingsSlinky.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queue extends StObject {
  
  /**
    * Overrides for task-level app_engine_routing. These settings apply only to App Engine tasks in this queue. Http tasks are not affected. If set, `app_engine_routing_override` is used
    * for all App Engine tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
    */
  var appEngineRoutingOverride: js.UndefOr[AppEngineRouting] = js.native
  
  /**
    * Caller-specified and required in CreateQueue, after which it becomes output only. The queue name. The queue name must have the following format:
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more
    * information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the
    * queue's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can
    * contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The last time this queue was purged. All tasks that were created before this time were purged. A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK,
    * or the Cloud Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue). Purge time will be truncated
    * to the nearest microsecond. Purge time will be unset if the queue has never been purged.
    */
  var purgeTime: js.UndefOr[String] = js.native
  
  /**
    * Rate limits for task dispatches. rate_limits and retry_config are related because they both control task attempts. However they control task attempts in different ways: *
    * rate_limits controls the total rate of dispatches from a queue (i.e. all traffic dispatched from the queue, regardless of whether the dispatch is from a first attempt or a retry). *
    * retry_config controls what happens to particular a task after its first attempt fails. That is, retry_config controls task retries (the second attempt, third attempt, etc). The
    * queue's actual dispatch rate is the result of: * Number of tasks in the queue * User-specified throttling: rate_limits, retry_config, and the queue's state. * System throttling due
    * to `429` (Too Many Requests) or `503` (Service Unavailable) responses from the worker, high error rates, or to smooth sudden large traffic spikes.
    */
  var rateLimits: js.UndefOr[RateLimits] = js.native
  
  /**
    * Settings that determine the retry behavior. * For tasks created using Cloud Tasks: the queue-level retry settings apply to all tasks in the queue that were created using Cloud
    * Tasks. Retry settings cannot be set on individual tasks. * For tasks created using the App Engine SDK: the queue-level retry settings apply to all tasks in the queue which do not
    * have retry settings explicitly set on the task and were created by the App Engine SDK. See [App Engine
    * documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
    */
  var retryConfig: js.UndefOr[RetryConfig] = js.native
  
  /** Configuration options for writing logs to [Stackdriver Logging](https://cloud.google.com/logging/docs/). If this field is unset, then no logs are written. */
  var stackdriverLoggingConfig: js.UndefOr[StackdriverLoggingConfig] = js.native
  
  /**
    * Output only. The state of the queue. `state` can only be changed by called PauseQueue, ResumeQueue, or uploading
    * [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue cannot be used to change `state`.
    */
  var state: js.UndefOr[String] = js.native
}
object Queue {
  
  @scala.inline
  def apply(): Queue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Queue]
  }
  
  @scala.inline
  implicit class QueueMutableBuilder[Self <: Queue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppEngineRoutingOverride(value: AppEngineRouting): Self = StObject.set(x, "appEngineRoutingOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppEngineRoutingOverrideUndefined: Self = StObject.set(x, "appEngineRoutingOverride", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPurgeTime(value: String): Self = StObject.set(x, "purgeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurgeTimeUndefined: Self = StObject.set(x, "purgeTime", js.undefined)
    
    @scala.inline
    def setRateLimits(value: RateLimits): Self = StObject.set(x, "rateLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateLimitsUndefined: Self = StObject.set(x, "rateLimits", js.undefined)
    
    @scala.inline
    def setRetryConfig(value: RetryConfig): Self = StObject.set(x, "retryConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryConfigUndefined: Self = StObject.set(x, "retryConfig", js.undefined)
    
    @scala.inline
    def setStackdriverLoggingConfig(value: StackdriverLoggingConfig): Self = StObject.set(x, "stackdriverLoggingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackdriverLoggingConfigUndefined: Self = StObject.set(x, "stackdriverLoggingConfig", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
