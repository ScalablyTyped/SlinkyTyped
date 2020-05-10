package typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesLongRunningOperationMetadata extends js.Object {
  /** Number of devices parsed in your requests. */
  var devicesCount: js.UndefOr[Double] = js.native
  /** The overall processing status. */
  var processingStatus: js.UndefOr[String] = js.native
  /** Processing progress from 0 to 100. */
  var progress: js.UndefOr[Double] = js.native
}

object DevicesLongRunningOperationMetadata {
  @scala.inline
  def apply(): DevicesLongRunningOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicesLongRunningOperationMetadata]
  }
  @scala.inline
  implicit class DevicesLongRunningOperationMetadataOps[Self <: DevicesLongRunningOperationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevicesCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevicesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicesCount")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
  }
  
}

