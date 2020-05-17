package typingsSlinky.applicationinsightsJs.anon

import typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  var measurements: FieldType = js.native
  var message: FieldType = js.native
  var properties: FieldType = js.native
  var severityLevel: FieldType = js.native
  var ver: FieldType = js.native
}

object Message {
  @scala.inline
  def apply(
    measurements: FieldType,
    message: FieldType,
    properties: FieldType,
    severityLevel: FieldType,
    ver: FieldType
  ): Message = {
    val __obj = js.Dynamic.literal(measurements = measurements.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], severityLevel = severityLevel.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeasurements(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeverityLevel(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVer(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

