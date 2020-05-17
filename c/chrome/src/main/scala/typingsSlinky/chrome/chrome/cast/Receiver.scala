package typingsSlinky.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Receiver extends js.Object {
  var capabilities: js.Array[Capability] = js.native
  var displayStatus: ReceiverDisplayStatus = js.native
  var friendlyName: String = js.native
  var label: String = js.native
  var receiverType: ReceiverType = js.native
  var volume: Volume = js.native
}

object Receiver {
  @scala.inline
  def apply(
    capabilities: js.Array[Capability],
    displayStatus: ReceiverDisplayStatus,
    friendlyName: String,
    label: String,
    receiverType: ReceiverType,
    volume: Volume
  ): Receiver = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], displayStatus = displayStatus.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], receiverType = receiverType.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Receiver]
  }
  @scala.inline
  implicit class ReceiverOps[Self <: Receiver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapabilities(value: js.Array[Capability]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayStatus(value: ReceiverDisplayStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiverType(value: ReceiverType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiverType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: Volume): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

