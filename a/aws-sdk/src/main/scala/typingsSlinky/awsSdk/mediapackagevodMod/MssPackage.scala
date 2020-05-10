package typingsSlinky.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MssPackage extends js.Object {
  var Encryption: js.UndefOr[MssEncryption] = js.native
  /**
    * A list of MSS manifest configurations.
    */
  var MssManifests: listOfMssManifest = js.native
  /**
    * The duration (in seconds) of each segment.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
}

object MssPackage {
  @scala.inline
  def apply(MssManifests: listOfMssManifest): MssPackage = {
    val __obj = js.Dynamic.literal(MssManifests = MssManifests.asInstanceOf[js.Any])
    __obj.asInstanceOf[MssPackage]
  }
  @scala.inline
  implicit class MssPackageOps[Self <: MssPackage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMssManifests(value: listOfMssManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MssManifests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryption(value: MssEncryption): Self = {
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

