package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCachediSCSIVolumesOutput extends js.Object {
  /**
    * An array of objects where each object contains metadata about one cached volume.
    */
  var CachediSCSIVolumes: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.CachediSCSIVolumes] = js.native
}

object DescribeCachediSCSIVolumesOutput {
  @scala.inline
  def apply(): DescribeCachediSCSIVolumesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCachediSCSIVolumesOutput]
  }
  @scala.inline
  implicit class DescribeCachediSCSIVolumesOutputOps[Self <: DescribeCachediSCSIVolumesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCachediSCSIVolumes(value: CachediSCSIVolumes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CachediSCSIVolumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachediSCSIVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CachediSCSIVolumes")(js.undefined)
        ret
    }
  }
  
}

