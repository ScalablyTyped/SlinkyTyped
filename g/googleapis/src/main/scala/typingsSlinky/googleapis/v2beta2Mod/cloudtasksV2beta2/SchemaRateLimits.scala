package typingsSlinky.googleapis.v2beta2Mod.cloudtasksV2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rate limits.  This message determines the maximum rate that tasks can be
  * dispatched by a queue, regardless of whether the dispatch is a first task
  * attempt or a retry.  Note: The debugging command, RunTask, will run a task
  * even if the queue has reached its RateLimits.
  */
@js.native
trait SchemaRateLimits extends js.Object {
  
  /**
    * Output only. The max burst size.  Max burst size limits how fast tasks in
    * queue are processed when many tasks are in the queue and the rate is
    * high. This field allows the queue to have a high rate so processing
    * starts shortly after a task is enqueued, but still limits resource usage
    * when many tasks are enqueued in a short period of time.  The [token
    * bucket](https://wikipedia.org/wiki/Token_Bucket) algorithm is used to
    * control the rate of task dispatches. Each queue has a token bucket that
    * holds tokens, up to the maximum specified by `max_burst_size`. Each time
    * a task is dispatched, a token is removed from the bucket. Tasks will be
    * dispatched until the queue&#39;s bucket runs out of tokens. The bucket
    * will be continuously refilled with new tokens based on
    * max_tasks_dispatched_per_second.  Cloud Tasks will pick the value of
    * `max_burst_size` based on the value of max_tasks_dispatched_per_second.
    * For App Engine queues that were created or updated using
    * `queue.yaml/xml`, `max_burst_size` is equal to
    * [bucket_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size).
    * Since `max_burst_size` is output only, if UpdateQueue is called on a
    * queue created by `queue.yaml/xml`, `max_burst_size` will be reset based
    * on the value of max_tasks_dispatched_per_second, regardless of whether
    * max_tasks_dispatched_per_second is updated.
    */
  var maxBurstSize: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of concurrent tasks that Cloud Tasks allows to be
    * dispatched for this queue. After this threshold has been reached, Cloud
    * Tasks stops dispatching tasks until the number of concurrent requests
    * decreases.  If unspecified when the queue is created, Cloud Tasks will
    * pick the default.   The maximum allowed value is 5,000.  This field is
    * output only for pull queues and always -1, which indicates no limit. No
    * other queue types can have `max_concurrent_tasks` set to -1.   This field
    * has the same meaning as [max_concurrent_requests in
    * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
    */
  var maxConcurrentTasks: js.UndefOr[Double] = js.native
  
  /**
    * The maximum rate at which tasks are dispatched from this queue.  If
    * unspecified when the queue is created, Cloud Tasks will pick the default.
    * * For App Engine queues, the maximum allowed value   is 500. * This field
    * is output only   for pull queues. In addition to the
    * `max_tasks_dispatched_per_second` limit, a maximum of 10 QPS of
    * LeaseTasks requests are allowed per pull queue.   This field has the same
    * meaning as [rate in
    * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
    */
  var maxTasksDispatchedPerSecond: js.UndefOr[Double] = js.native
}
object SchemaRateLimits {
  
  @scala.inline
  def apply(): SchemaRateLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRateLimits]
  }
  
  @scala.inline
  implicit class SchemaRateLimitsOps[Self <: SchemaRateLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxBurstSize(value: Double): Self = this.set("maxBurstSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBurstSize: Self = this.set("maxBurstSize", js.undefined)
    
    @scala.inline
    def setMaxConcurrentTasks(value: Double): Self = this.set("maxConcurrentTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrentTasks: Self = this.set("maxConcurrentTasks", js.undefined)
    
    @scala.inline
    def setMaxTasksDispatchedPerSecond(value: Double): Self = this.set("maxTasksDispatchedPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTasksDispatchedPerSecond: Self = this.set("maxTasksDispatchedPerSecond", js.undefined)
  }
}
