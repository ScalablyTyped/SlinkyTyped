package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRadiusRequest extends js.Object {
  /**
    * The identifier of the directory for which to update the RADIUS server information.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * A RadiusSettings object that contains information about the RADIUS server.
    */
  var RadiusSettings: typingsSlinky.awsSdk.directoryserviceMod.RadiusSettings = js.native
}

object UpdateRadiusRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, RadiusSettings: RadiusSettings): UpdateRadiusRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], RadiusSettings = RadiusSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRadiusRequest]
  }
  @scala.inline
  implicit class UpdateRadiusRequestOps[Self <: UpdateRadiusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadiusSettings(value: RadiusSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadiusSettings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

