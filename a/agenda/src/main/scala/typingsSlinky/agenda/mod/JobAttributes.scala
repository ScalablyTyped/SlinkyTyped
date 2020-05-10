package typingsSlinky.agenda.mod

import typingsSlinky.mongodb.mod.ObjectID_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The database record associated with a job.
  */
@js.native
trait JobAttributes[T /* <: JobAttributesData */] extends js.Object {
  /**
    * The record identity.
    */
  var _id: ObjectID_ = js.native
  /**
    * The job details.
    */
  var data: T = js.native
  /**
    * Job's state
    */
  var disabled: Boolean = js.native
  /**
    * The number of times the job has failed.
    */
  var failCount: Double = js.native
  /**
    * The reason the job failed.
    */
  var failReason: String = js.native
  /**
    * The date/time the job last failed.
    */
  var failedAt: js.Date = js.native
  /**
    * Date/time the job last finished running.
    */
  var lastFinishedAt: js.Date = js.native
  /**
    * Date/time the job was las modified.
    */
  var lastModifiedBy: String = js.native
  /**
    * Date/time the job was last run.
    */
  var lastRunAt: js.Date = js.native
  /**
    * Date/time the job was locked.
    */
  var lockedAt: js.Date = js.native
  /**
    * The name of the job.
    */
  var name: String = js.native
  /**
    * Date/time the job will run next.
    */
  var nextRunAt: js.Date = js.native
  /**
    * The priority of the job.
    */
  var priority: Double = js.native
  /**
    * How often the job is repeated using a human-readable or cron format.
    */
  var repeatInterval: String | Double = js.native
  /**
    * The timezone that conforms to [moment-timezone](http://momentjs.com/timezone/).
    */
  var repeatTimezone: String = js.native
  /**
    * The type of the job (single|normal).
    */
  var `type`: String = js.native
}

object JobAttributes {
  @scala.inline
  def apply[T](
    _id: ObjectID_,
    data: T,
    disabled: Boolean,
    failCount: Double,
    failReason: String,
    failedAt: js.Date,
    lastFinishedAt: js.Date,
    lastModifiedBy: String,
    lastRunAt: js.Date,
    lockedAt: js.Date,
    name: String,
    nextRunAt: js.Date,
    priority: Double,
    repeatInterval: String | Double,
    repeatTimezone: String,
    `type`: String
  ): JobAttributes[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], failCount = failCount.asInstanceOf[js.Any], failReason = failReason.asInstanceOf[js.Any], failedAt = failedAt.asInstanceOf[js.Any], lastFinishedAt = lastFinishedAt.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastRunAt = lastRunAt.asInstanceOf[js.Any], lockedAt = lockedAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextRunAt = nextRunAt.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], repeatInterval = repeatInterval.asInstanceOf[js.Any], repeatTimezone = repeatTimezone.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobAttributes[T]]
  }
  @scala.inline
  implicit class JobAttributesOps[Self[t] <: JobAttributes[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_id(value: ObjectID_): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailCount(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailReason(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailedAt(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastFinishedAt(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFinishedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedBy(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastRunAt(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRunAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockedAt(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextRunAt(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRunAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatInterval(value: String | Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatTimezone(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatTimezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

