package typingsSlinky.cron.mod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron", "job")
@js.native
object job extends js.Object {
  def apply(
    cronTime: String | js.Date | Moment,
    onTick: js.Function0[Unit],
    onComplete: js.UndefOr[CronCommand | Null],
    start: js.UndefOr[Boolean],
    timeZone: js.UndefOr[String],
    context: js.UndefOr[js.Any],
    runOnInit: js.UndefOr[Boolean],
    utcOffset: js.UndefOr[String | Double],
    unrefTimeout: js.UndefOr[Boolean]
  ): CronJob = js.native
  def apply(options: CronJobParameters): CronJob = js.native
}

