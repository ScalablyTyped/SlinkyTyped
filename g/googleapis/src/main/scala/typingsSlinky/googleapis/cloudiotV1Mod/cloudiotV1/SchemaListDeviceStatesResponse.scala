package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for `ListDeviceStates`.
  */
@js.native
trait SchemaListDeviceStatesResponse extends js.Object {
  /**
    * The last few device states. States are listed in descending order of
    * server update time, starting from the most recent one.
    */
  var deviceStates: js.UndefOr[js.Array[SchemaDeviceState]] = js.native
}

object SchemaListDeviceStatesResponse {
  @scala.inline
  def apply(): SchemaListDeviceStatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeviceStatesResponse]
  }
  @scala.inline
  implicit class SchemaListDeviceStatesResponseOps[Self <: SchemaListDeviceStatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceStates(value: js.Array[SchemaDeviceState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceStates")(js.undefined)
        ret
    }
  }
  
}

