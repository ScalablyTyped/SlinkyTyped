package typingsSlinky.jsonrpcSerializer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeserializeObject_ extends js.Object {
  var payload: RequestPayloadObject | NotificationPayloadObject | SuccessPayloadObject | ErrorPayloadObject = js.native
  var `type`: PayloadType = js.native
}

object DeserializeObject_ {
  @scala.inline
  def apply(
    payload: RequestPayloadObject | NotificationPayloadObject | SuccessPayloadObject | ErrorPayloadObject,
    `type`: PayloadType
  ): DeserializeObject_ = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeObject_]
  }
  @scala.inline
  implicit class DeserializeObject_Ops[Self <: DeserializeObject_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayload(
      value: RequestPayloadObject | NotificationPayloadObject | SuccessPayloadObject | ErrorPayloadObject
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PayloadType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

