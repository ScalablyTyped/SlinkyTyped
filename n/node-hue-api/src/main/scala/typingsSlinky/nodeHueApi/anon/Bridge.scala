package typingsSlinky.nodeHueApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bridge extends js.Object {
  var bridge: Boolean = js.native
  var lights: js.Array[String] = js.native
  var sensors: js.Array[String] = js.native
}

object Bridge {
  @scala.inline
  def apply(bridge: Boolean, lights: js.Array[String], sensors: js.Array[String]): Bridge = {
    val __obj = js.Dynamic.literal(bridge = bridge.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], sensors = sensors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bridge]
  }
  @scala.inline
  implicit class BridgeOps[Self <: Bridge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBridge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLights(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSensors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

