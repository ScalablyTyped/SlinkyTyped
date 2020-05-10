package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The device state, as reported by the device.
  */
@js.native
trait SchemaDeviceState extends js.Object {
  /**
    * The device state data.
    */
  var binaryData: js.UndefOr[String] = js.native
  /**
    * [Output only] The time at which this state version was updated in Cloud
    * IoT Core.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaDeviceState {
  @scala.inline
  def apply(): SchemaDeviceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceState]
  }
  @scala.inline
  implicit class SchemaDeviceStateOps[Self <: SchemaDeviceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaryData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryData")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

