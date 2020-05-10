package typingsSlinky.ipp

import typingsSlinky.ipp.mod.JobState
import typingsSlinky.ipp.mod.JobStateReasons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonJobstate extends js.Object {
  var `job-id`: Double = js.native
  var `job-state`: JobState = js.native
  var `job-state-message`: js.UndefOr[String] = js.native
  var `job-state-reasons`: js.Array[JobStateReasons] = js.native
  var `job-uri`: String = js.native
  var `number-of-intervening-jobs`: js.UndefOr[Double] = js.native
}

object AnonJobstate {
  @scala.inline
  def apply(
    `job-id`: Double,
    `job-state`: JobState,
    `job-state-reasons`: js.Array[JobStateReasons],
    `job-uri`: String
  ): AnonJobstate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("job-id")(`job-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("job-state")(`job-state`.asInstanceOf[js.Any])
    __obj.updateDynamic("job-state-reasons")(`job-state-reasons`.asInstanceOf[js.Any])
    __obj.updateDynamic("job-uri")(`job-uri`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJobstate]
  }
  @scala.inline
  implicit class AnonJobstateOps[Self <: AnonJobstate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withJob-id`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withJob-state`(value: JobState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withJob-state-reasons`(value: js.Array[JobStateReasons]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-state-reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withJob-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withJob-state-message`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-state-message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-state-message`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-state-message")(js.undefined)
        ret
    }
    @scala.inline
    def `withNumber-of-intervening-jobs`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number-of-intervening-jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNumber-of-intervening-jobs`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number-of-intervening-jobs")(js.undefined)
        ret
    }
  }
  
}

