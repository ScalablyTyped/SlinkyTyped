package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DolbyVisionLevel6Metadata extends js.Object {
  /**
    * Maximum Content Light Level. Static HDR metadata that corresponds to the brightest pixel in the entire stream. Measured in nits.
    */
  var MaxCll: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * Maximum Frame-Average Light Level. Static HDR metadata that corresponds to the highest frame-average brightness in the entire stream. Measured in nits.
    */
  var MaxFall: js.UndefOr[integerMin0Max65535] = js.native
}

object DolbyVisionLevel6Metadata {
  @scala.inline
  def apply(): DolbyVisionLevel6Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DolbyVisionLevel6Metadata]
  }
  @scala.inline
  implicit class DolbyVisionLevel6MetadataOps[Self <: DolbyVisionLevel6Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxCll(value: integerMin0Max65535): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCll")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFall(value: integerMin0Max65535): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxFall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxFall")(js.undefined)
        ret
    }
  }
  
}

