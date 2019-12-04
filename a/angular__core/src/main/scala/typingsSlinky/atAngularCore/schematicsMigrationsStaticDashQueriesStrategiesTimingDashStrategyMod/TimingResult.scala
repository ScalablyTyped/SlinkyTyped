package typingsSlinky.atAngularCore.schematicsMigrationsStaticDashQueriesStrategiesTimingDashStrategyMod

import typingsSlinky.atAngularCore.schematicsMigrationsStaticDashQueriesAngularQueryDashDefinitionMod.QueryTiming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingResult extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var timing: QueryTiming | Null
}

object TimingResult {
  @scala.inline
  def apply(message: String = null, timing: QueryTiming = null): TimingResult = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingResult]
  }
}

