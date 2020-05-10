package typingsSlinky.beanstalkd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeanstalkdJobStats extends js.Object {
  /** The time in seconds since the put command that created this job. */
  var age: Double = js.native
  /** The number of times this job has been buried. */
  var buries: Double = js.native
  /** The integer number of seconds to wait before putting this job in the ready queue. */
  var delay: Double = js.native
  /**
    * The number of the earliest binlog file containing this job.
    * If -b wasn't used, this will be 0.
    */
  var file: Double = js.native
  /** The job id. */
  var id: String = js.native
  /** The number of times this job has been kicked. */
  var kicks: Double = js.native
  /** The priority value set by the put, release, or bury commands. */
  var pri: Double = js.native
  /** The number of times a client has released this job from a reservation. */
  var releases: Double = js.native
  /** The number of times this job has been reserved. */
  var reserves: Double = js.native
  /** The job state. */
  var state: String = js.native
  /**
    * The number of seconds left until the server puts this job into the ready queue.
    * This number is only meaningful if the job is reserved or delayed.
    * If the job is reserved and this amount of time elapses before its state changes, it is considered to have timed out.
    */
  var `time-left`: Double = js.native
  /** The number of times this job has timed out during a reservation. */
  var timeouts: Double = js.native
  /** Time to run: The integer number of seconds a worker is allowed to run this job. */
  var ttr: Double = js.native
  /** The name of the tube that contains this job. */
  var tube: String = js.native
}

object BeanstalkdJobStats {
  @scala.inline
  def apply(
    age: Double,
    buries: Double,
    delay: Double,
    file: Double,
    id: String,
    kicks: Double,
    pri: Double,
    releases: Double,
    reserves: Double,
    state: String,
    `time-left`: Double,
    timeouts: Double,
    ttr: Double,
    tube: String
  ): BeanstalkdJobStats = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], buries = buries.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kicks = kicks.asInstanceOf[js.Any], pri = pri.asInstanceOf[js.Any], releases = releases.asInstanceOf[js.Any], reserves = reserves.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeouts = timeouts.asInstanceOf[js.Any], ttr = ttr.asInstanceOf[js.Any], tube = tube.asInstanceOf[js.Any])
    __obj.updateDynamic("time-left")(`time-left`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeanstalkdJobStats]
  }
  @scala.inline
  implicit class BeanstalkdJobStatsOps[Self <: BeanstalkdJobStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKicks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPri(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleases(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReserves(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTime-left`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeouts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTtr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTube(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tube")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

