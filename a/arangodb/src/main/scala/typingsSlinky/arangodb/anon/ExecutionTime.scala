package typingsSlinky.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionTime extends js.Object {
  var executionTime: Double = js.native
  var filtered: Double = js.native
  var fullCount: Double = js.native
  var httpRequests: Double = js.native
  var scannedFull: Double = js.native
  var scannedIndex: Double = js.native
  var writesExecuted: Double = js.native
  var writesIgnored: Double = js.native
}

object ExecutionTime {
  @scala.inline
  def apply(
    executionTime: Double,
    filtered: Double,
    fullCount: Double,
    httpRequests: Double,
    scannedFull: Double,
    scannedIndex: Double,
    writesExecuted: Double,
    writesIgnored: Double
  ): ExecutionTime = {
    val __obj = js.Dynamic.literal(executionTime = executionTime.asInstanceOf[js.Any], filtered = filtered.asInstanceOf[js.Any], fullCount = fullCount.asInstanceOf[js.Any], httpRequests = httpRequests.asInstanceOf[js.Any], scannedFull = scannedFull.asInstanceOf[js.Any], scannedIndex = scannedIndex.asInstanceOf[js.Any], writesExecuted = writesExecuted.asInstanceOf[js.Any], writesIgnored = writesIgnored.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionTime]
  }
  @scala.inline
  implicit class ExecutionTimeOps[Self <: ExecutionTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiltered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScannedFull(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scannedFull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScannedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scannedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritesExecuted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writesExecuted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritesIgnored(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writesIgnored")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

