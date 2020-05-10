package typingsSlinky.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subset of beacon information served via the `beaconinfo.getforobserved`
  * method, which you call when users of your app encounter your beacons.
  */
@js.native
trait SchemaBeaconInfo extends js.Object {
  /**
    * The ID advertised by the beacon.
    */
  var advertisedId: js.UndefOr[SchemaAdvertisedId] = js.native
  /**
    * Attachments matching the type(s) requested. May be empty if no attachment
    * types were requested.
    */
  var attachments: js.UndefOr[js.Array[SchemaAttachmentInfo]] = js.native
  /**
    * The name under which the beacon is registered.
    */
  var beaconName: js.UndefOr[String] = js.native
}

object SchemaBeaconInfo {
  @scala.inline
  def apply(): SchemaBeaconInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBeaconInfo]
  }
  @scala.inline
  implicit class SchemaBeaconInfoOps[Self <: SchemaBeaconInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertisedId(value: SchemaAdvertisedId): Self = {
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
    def withAttachments(value: js.Array[SchemaAttachmentInfo]): Self = {
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

