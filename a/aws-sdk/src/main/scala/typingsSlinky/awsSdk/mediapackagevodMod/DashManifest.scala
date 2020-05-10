package typingsSlinky.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashManifest extends js.Object {
  /**
    * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
    */
  var ManifestLayout: js.UndefOr[typingsSlinky.awsSdk.mediapackagevodMod.ManifestLayout] = js.native
  /**
    * An optional string to include in the name of the manifest.
    */
  var ManifestName: js.UndefOr[string] = js.native
  /**
    * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
    */
  var MinBufferTimeSeconds: js.UndefOr[integer] = js.native
  /**
    * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
    */
  var Profile: js.UndefOr[typingsSlinky.awsSdk.mediapackagevodMod.Profile] = js.native
  var StreamSelection: js.UndefOr[typingsSlinky.awsSdk.mediapackagevodMod.StreamSelection] = js.native
}

object DashManifest {
  @scala.inline
  def apply(): DashManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashManifest]
  }
  @scala.inline
  implicit class DashManifestOps[Self <: DashManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManifestLayout(value: ManifestLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestName")(js.undefined)
        ret
    }
    @scala.inline
    def withMinBufferTimeSeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinBufferTimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinBufferTimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinBufferTimeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: Profile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profile")(js.undefined)
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

