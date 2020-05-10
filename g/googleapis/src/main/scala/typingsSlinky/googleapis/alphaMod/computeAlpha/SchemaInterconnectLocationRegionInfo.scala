package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about any potential InterconnectAttachments between an
  * Interconnect at a specific InterconnectLocation, and a specific Cloud
  * Region.
  */
@js.native
trait SchemaInterconnectLocationRegionInfo extends js.Object {
  /**
    * Expected round-trip time in milliseconds, from this InterconnectLocation
    * to a VM in this region.
    */
  var expectedRttMs: js.UndefOr[String] = js.native
  /**
    * Identifies the network presence of this location.
    */
  var locationPresence: js.UndefOr[String] = js.native
  /**
    * URL for the region of this location.
    */
  var region: js.UndefOr[String] = js.native
}

object SchemaInterconnectLocationRegionInfo {
  @scala.inline
  def apply(): SchemaInterconnectLocationRegionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectLocationRegionInfo]
  }
  @scala.inline
  implicit class SchemaInterconnectLocationRegionInfoOps[Self <: SchemaInterconnectLocationRegionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpectedRttMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedRttMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedRttMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedRttMs")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationPresence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationPresence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationPresence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationPresence")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
  }
  
}

