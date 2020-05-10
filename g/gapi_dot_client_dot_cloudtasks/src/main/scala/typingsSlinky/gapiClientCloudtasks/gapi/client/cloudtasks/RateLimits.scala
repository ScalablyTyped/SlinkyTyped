package typingsSlinky.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateLimits extends js.Object {
  /**
    * Output only.
    *
    * The max burst size limits how fast the queue is processed when
    * many tasks are in the queue and the rate is high. This field
    * allows the queue to have a high rate so processing starts shortly
    * after a task is enqueued, but still limits resource usage when
    * many tasks are enqueued in a short period of time.
    *
    * &#42; For App Engine queues, if
    * RateLimits.max_tasks_dispatched_per_second is 1, this
    * field is 10; otherwise this field is
    * RateLimits.max_tasks_dispatched_per_second / 5.
    * &#42; For pull queues, this field is output only and always 10,000.
    *
    * Note: For App Engine queues that were created through
    * `queue.yaml/xml`, `max_burst_size` might not have the same
    * settings as specified above; CloudTasks.UpdateQueue can be
    * used to set `max_burst_size` only to the values specified above.
    *
    * This field has the same meaning as
    * [bucket_size in queue.yaml](/appengine/docs/standard/python/config/queueref#bucket_size).
    */
  var maxBurstSize: js.UndefOr[Double] = js.native
  /**
    * The maximum number of concurrent tasks that Cloud Tasks allows
    * to be dispatched for this queue. After this threshold has been
    * reached, Cloud Tasks stops dispatching tasks until the number of
    * concurrent requests decreases.
    *
    * The maximum allowed value is 5,000.
    *
    * &#42; For App Engine queues, this field is 10 by default.
    * &#42; For pull queues, this field is output only and always -1, which
    * indicates no limit.
    *
    * This field has the same meaning as
    * [max_concurrent_requests in queue.yaml](/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
    */
  var maxConcurrentTasks: js.UndefOr[Double] = js.native
  /**
    * The maximum rate at which tasks are dispatched from this
    * queue.
    *
    * The maximum allowed value is 500.
    *
    * &#42; For App Engine queues, this field is 1 by default.
    * &#42; For pull queues, this field is output only and always 10,000.
    *
    * This field has the same meaning as
    * [rate in queue.yaml](/appengine/docs/standard/python/config/queueref#rate).
    */
  var maxTasksDispatchedPerSecond: js.UndefOr[Double] = js.native
}

object RateLimits {
  @scala.inline
  def apply(): RateLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateLimits]
  }
  @scala.inline
  implicit class RateLimitsOps[Self <: RateLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxBurstSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBurstSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBurstSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBurstSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrentTasks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrentTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentTasks")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTasksDispatchedPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTasksDispatchedPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTasksDispatchedPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTasksDispatchedPerSecond")(js.undefined)
        ret
    }
  }
  
}

