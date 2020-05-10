package typingsSlinky.pahoMqtt.mod._Global_.Paho.MQTT

import typingsSlinky.pahoMqtt.pahoMqttStrings.Debug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceElement extends js.Object {
  var message: String = js.native
  var severity: Debug = js.native
}

object TraceElement {
  @scala.inline
  def apply(message: String, severity: Debug): TraceElement = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceElement]
  }
  @scala.inline
  implicit class TraceElementOps[Self <: TraceElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeverity(value: Debug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

