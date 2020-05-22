package typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typingsSlinky.applicationinsightsJs.AI.MessageData
import typingsSlinky.applicationinsightsJs.AI.SeverityLevel
import typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import typingsSlinky.applicationinsightsJs.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trace
  extends MessageData
     with ISerializable {
  @JSName("aiDataContract")
  var aiDataContract_Trace: Message
}

object Trace {
  @scala.inline
  def apply(
    aiDataContract: Message,
    message: String,
    properties: js.Any,
    severityLevel: SeverityLevel,
    ver: Double
  ): Trace = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], severityLevel = severityLevel.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trace]
  }
}

