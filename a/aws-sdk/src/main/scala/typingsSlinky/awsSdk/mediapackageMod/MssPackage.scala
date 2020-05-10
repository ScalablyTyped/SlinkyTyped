package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MssPackage extends js.Object {
  var Encryption: js.UndefOr[MssEncryption] = js.native
  /**
    * The time window (in seconds) contained in each manifest.
    */
  var ManifestWindowSeconds: js.UndefOr[integer] = js.native
  /**
    * The duration (in seconds) of each segment.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
  var StreamSelection: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.StreamSelection] = js.native
}

object MssPackage {
  @scala.inline
  def apply(): MssPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MssPackage]
  }
  @scala.inline
  implicit class MssPackageOps[Self <: MssPackage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withManifestWindowSeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestWindowSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestWindowSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestWindowSeconds")(js.undefined)
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
    @scala.inline
    def withStreamSelection(value: StreamSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamSelection")(js.undefined)
        ret
    }
  }
  
}

