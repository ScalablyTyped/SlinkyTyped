package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncDestinationDataSharing extends js.Object {
  /**
    * The sharing data type. Only Organization is supported.
    */
  var DestinationDataSharingType: js.UndefOr[ResourceDataSyncDestinationDataSharingType] = js.native
}

object ResourceDataSyncDestinationDataSharing {
  @scala.inline
  def apply(): ResourceDataSyncDestinationDataSharing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDataSyncDestinationDataSharing]
  }
  @scala.inline
  implicit class ResourceDataSyncDestinationDataSharingOps[Self <: ResourceDataSyncDestinationDataSharing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationDataSharingType(value: ResourceDataSyncDestinationDataSharingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationDataSharingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationDataSharingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationDataSharingType")(js.undefined)
        ret
    }
  }
  
}

