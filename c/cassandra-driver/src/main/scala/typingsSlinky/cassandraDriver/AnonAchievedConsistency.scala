package typingsSlinky.cassandraDriver

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cassandraDriver.typesMod.types.Uuid
import typingsSlinky.cassandraDriver.typesMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAchievedConsistency extends js.Object {
  var achievedConsistency: consistencies = js.native
  var customPayload: js.Any = js.native
  var queriedHost: String = js.native
  var speculativeExecutions: Double = js.native
  var traceId: Uuid = js.native
  var triedHosts: StringDictionary[js.Any] = js.native
  var warnings: js.Array[String] = js.native
}

object AnonAchievedConsistency {
  @scala.inline
  def apply(
    achievedConsistency: consistencies,
    customPayload: js.Any,
    queriedHost: String,
    speculativeExecutions: Double,
    traceId: Uuid,
    triedHosts: StringDictionary[js.Any],
    warnings: js.Array[String]
  ): AnonAchievedConsistency = {
    val __obj = js.Dynamic.literal(achievedConsistency = achievedConsistency.asInstanceOf[js.Any], customPayload = customPayload.asInstanceOf[js.Any], queriedHost = queriedHost.asInstanceOf[js.Any], speculativeExecutions = speculativeExecutions.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any], triedHosts = triedHosts.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAchievedConsistency]
  }
  @scala.inline
  implicit class AnonAchievedConsistencyOps[Self <: AnonAchievedConsistency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAchievedConsistency(value: consistencies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("achievedConsistency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomPayload(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueriedHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queriedHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeculativeExecutions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speculativeExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraceId(value: Uuid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriedHosts(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triedHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

