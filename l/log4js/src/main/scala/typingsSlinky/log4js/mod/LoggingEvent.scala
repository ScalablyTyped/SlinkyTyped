package typingsSlinky.log4js.mod

import typingsSlinky.log4js.anon.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingEvent extends js.Object {
  var categoryName: String = js.native
  var cluster: js.UndefOr[Worker] = js.native
  var context: js.Any = js.native
  	// level of message
  var data: js.Array[_] = js.native
  	// name of category
  var level: Level = js.native
  var pid: Double = js.native
  	// objects to log
  var startTime: js.Date = js.native
}

object LoggingEvent {
  @scala.inline
  def apply(
    categoryName: String,
    context: js.Any,
    data: js.Array[_],
    level: Level,
    pid: Double,
    startTime: js.Date
  ): LoggingEvent = {
    val __obj = js.Dynamic.literal(categoryName = categoryName.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingEvent]
  }
  @scala.inline
  implicit class LoggingEventOps[Self <: LoggingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCluster(value: Worker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(js.undefined)
        ret
    }
  }
  
}

