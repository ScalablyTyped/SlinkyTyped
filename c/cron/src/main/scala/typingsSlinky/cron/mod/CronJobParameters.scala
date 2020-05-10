package typingsSlinky.cron.mod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CronJobParameters extends js.Object {
  /**
    * The context within which to execute the onTick method. This defaults to the cronjob itself allowing you to call ```this.stop()```. However, if you change this you'll have access to the functions and values within your context object.
    */
  var context: js.UndefOr[js.Any] = js.native
  /**
    * The time to fire off your job. This can be in the form of cron syntax or a JS ```Date``` object.
    */
  var cronTime: String | js.Date | Moment = js.native
  /**
    * A function that will fire when the job is stopped with ```job.stop()```, and may also be called by ```onTick``` at the end of each run.
    */
  var onComplete: js.UndefOr[CronCommand | Null] = js.native
  /**
    * The function to fire at the specified time. If an ```onComplete``` callback was provided, ```onTick``` will receive it as an argument. ```onTick``` may call ```onComplete``` when it has finished its work.
    */
  var onTick: CronCommand = js.native
  /**
    * This will immediately fire your ```onTick``` function as soon as the requisit initialization has happened. This option is set to ```false``` by default for backwards compatibility.
    */
  var runOnInit: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether to start the job just before exiting the constructor. By default this is set to false. If left at default you will need to call ```job.start()``` in order to start the job (assuming ```job``` is the variable you set the cronjob to). This does not immediately fire your ```onTick``` function, it just gives you more control over the behavior of your jobs.
    */
  var start: js.UndefOr[Boolean] = js.native
  /**
    * Specify the timezone for the execution. This will modify the actual time relative to your timezone. If the timezone is invalid, an error is thrown. You can check all timezones available at [Moment Timezone Website](http://momentjs.com/timezone/). Probably don't use both ```timeZone``` and ```utcOffset``` together or weird things may happen.
    */
  var timeZone: js.UndefOr[String] = js.native
  /**
    * If you have code that keeps the event loop running and want to stop the node process when that finishes regardless of the state of your cronjob, you can do so making use of this parameter. This is off by default and cron will run as if it needs to control the event loop. For more information take a look at [timers#timers_timeout_unref](https://nodejs.org/api/timers.html#timers_timeout_unref) from the NodeJS docs.
    */
  var unrefTimeout: js.UndefOr[Boolean] = js.native
  /**
    * This allows you to specify the offset of your timezone rather than using the ```timeZone``` param. Probably don't use both ```timeZone``` and ```utcOffset``` together or weird things may happen.
    */
  var utcOffset: js.UndefOr[String | Double] = js.native
}

object CronJobParameters {
  @scala.inline
  def apply(cronTime: String | js.Date | Moment, onTick: CronCommand): CronJobParameters = {
    val __obj = js.Dynamic.literal(cronTime = cronTime.asInstanceOf[js.Any], onTick = onTick.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronJobParameters]
  }
  @scala.inline
  implicit class CronJobParametersOps[Self <: CronJobParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCronTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cronTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCronTime(value: String | js.Date | Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cronTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTickFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnTick(value: CronCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompleteFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnComplete(value: CronCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompleteNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(null)
        ret
    }
    @scala.inline
    def withRunOnInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOnInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOnInit")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withUnrefTimeout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unrefTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnrefTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unrefTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUtcOffset(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utcOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtcOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utcOffset")(js.undefined)
        ret
    }
  }
  
}

