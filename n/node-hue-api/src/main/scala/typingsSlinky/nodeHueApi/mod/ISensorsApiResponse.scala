package typingsSlinky.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISensorsApiResponse extends js.Object {
  var sensors: js.Array[ISensor] = js.native
}

object ISensorsApiResponse {
  @scala.inline
  def apply(sensors: js.Array[ISensor]): ISensorsApiResponse = {
    val __obj = js.Dynamic.literal(sensors = sensors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISensorsApiResponse]
  }
  @scala.inline
  implicit class ISensorsApiResponseOps[Self <: ISensorsApiResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSensors(value: js.Array[ISensor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

