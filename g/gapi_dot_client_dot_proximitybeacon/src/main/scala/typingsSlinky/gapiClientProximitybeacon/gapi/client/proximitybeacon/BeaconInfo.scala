package typingsSlinky.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeaconInfo extends js.Object {
  /** The ID advertised by the beacon. */
  var advertisedId: js.UndefOr[AdvertisedId] = js.native
  /**
    * Attachments matching the type(s) requested.
    * May be empty if no attachment types were requested.
    */
  var attachments: js.UndefOr[js.Array[AttachmentInfo]] = js.native
  /** The name under which the beacon is registered. */
  var beaconName: js.UndefOr[String] = js.native
}

object BeaconInfo {
  @scala.inline
  def apply(): BeaconInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeaconInfo]
  }
  @scala.inline
  implicit class BeaconInfoOps[Self <: BeaconInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertisedId(value: AdvertisedId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertisedId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedId")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachments(value: js.Array[AttachmentInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withBeaconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeaconName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconName")(js.undefined)
        ret
    }
  }
  
}

