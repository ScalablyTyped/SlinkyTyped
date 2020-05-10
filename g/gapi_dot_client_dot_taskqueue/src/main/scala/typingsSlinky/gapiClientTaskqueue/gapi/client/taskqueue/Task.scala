package typingsSlinky.gapiClientTaskqueue.gapi.client.taskqueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  /** Time (in seconds since the epoch) at which the task was enqueued. */
  var enqueueTimestamp: js.UndefOr[String] = js.native
  /** Name of the task. */
  var id: js.UndefOr[String] = js.native
  /** The kind of object returned, in this case set to task. */
  var kind: js.UndefOr[String] = js.native
  /** Time (in seconds since the epoch) at which the task lease will expire. This value is 0 if the task isnt currently leased out to a worker. */
  var leaseTimestamp: js.UndefOr[String] = js.native
  /** A bag of bytes which is the task payload. The payload on the JSON side is always Base64 encoded. */
  var payloadBase64: js.UndefOr[String] = js.native
  /** Name of the queue that the task is in. */
  var queueName: js.UndefOr[String] = js.native
  /** The number of leases applied to this task. */
  var retry_count: js.UndefOr[Double] = js.native
  /** Tag for the task, could be used later to lease tasks grouped by a specific tag. */
  var tag: js.UndefOr[String] = js.native
}

object Task {
  @scala.inline
  def apply(): Task = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Task]
  }
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnqueueTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enqueueTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnqueueTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enqueueTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaseTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaseTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadBase64(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadBase64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloadBase64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadBase64")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueName")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_count")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

