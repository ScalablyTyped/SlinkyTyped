package typingsSlinky.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CmafPackage extends js.Object {
  var Encryption: js.UndefOr[CmafEncryption] = js.native
  /**
    * A list of HLS manifest configurations.
    */
  var HlsManifests: listOfHlsManifest = js.native
  /**
    * Duration (in seconds) of each fragment. Actual fragments will be
  rounded to the nearest multiple of the source fragment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
}

object CmafPackage {
  @scala.inline
  def apply(HlsManifests: listOfHlsManifest): CmafPackage = {
    val __obj = js.Dynamic.literal(HlsManifests = HlsManifests.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmafPackage]
  }
  @scala.inline
  implicit class CmafPackageOps[Self <: CmafPackage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHlsManifests(value: listOfHlsManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsManifests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryption(value: CmafEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentDurationSeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentDurationSeconds")(js.undefined)
        ret
    }
  }
  
}

