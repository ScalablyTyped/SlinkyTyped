package typingsSlinky.awsIotDeviceSdk

import typingsSlinky.awsIotDeviceSdk.awsIotDeviceSdkNumbers.`0`
import typingsSlinky.awsIotDeviceSdk.awsIotDeviceSdkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQos extends js.Object {
  var qos: `0` | `1` = js.native
}

object AnonQos {
  @scala.inline
  def apply(qos: `0` | `1`): AnonQos = {
    val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQos]
  }
  @scala.inline
  implicit class AnonQosOps[Self <: AnonQos] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQos(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

