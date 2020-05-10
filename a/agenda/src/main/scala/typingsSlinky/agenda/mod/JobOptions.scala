package typingsSlinky.agenda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobOptions extends js.Object {
  /**
    * Maximum number of that job that can be running at once (per instance of agenda)
    */
  var concurrency: js.UndefOr[Double] = js.native
  /**
    * Interval in ms of how long the job stays locked for (see multiple job processors for more info). A job will
    * automatically unlock if done() is called.
    */
  var lockLifetime: js.UndefOr[Double] = js.native
  /**
    * Maximum number of that job that can be locked at once (per instance of agenda)
    */
  var lockLimit: js.UndefOr[Double] = js.native
  /**
    * (lowest|low|normal|high|highest|number) specifies the priority of the job. Higher priority jobs will run
    * first.
    */
  var priority: js.UndefOr[String | Double] = js.native
}

object JobOptions {
  @scala.inline
  def apply(): JobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobOptions]
  }
  @scala.inline
  implicit class JobOptionsOps[Self <: JobOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withLockLifetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockLifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockLifetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockLifetime")(js.undefined)
        ret
    }
    @scala.inline
    def withLockLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
  }
  
}

