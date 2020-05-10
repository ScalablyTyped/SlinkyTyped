package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSoftwareUpdateJobResponse extends js.Object {
  /**
    * The IoT Job ARN corresponding to this update.
    */
  var IotJobArn: js.UndefOr[string] = js.native
  /**
    * The IoT Job Id corresponding to this update.
    */
  var IotJobId: js.UndefOr[string] = js.native
  /**
    * The software version installed on the device or devices after the update.
    */
  var PlatformSoftwareVersion: js.UndefOr[string] = js.native
}

object CreateSoftwareUpdateJobResponse {
  @scala.inline
  def apply(): CreateSoftwareUpdateJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSoftwareUpdateJobResponse]
  }
  @scala.inline
  implicit class CreateSoftwareUpdateJobResponseOps[Self <: CreateSoftwareUpdateJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIotJobArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IotJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIotJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IotJobArn")(js.undefined)
        ret
    }
    @scala.inline
    def withIotJobId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IotJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIotJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IotJobId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformSoftwareVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformSoftwareVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformSoftwareVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformSoftwareVersion")(js.undefined)
        ret
    }
  }
  
}

