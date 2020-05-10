package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Asset extends js.Object {
  var GroundTruthManifest: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.GroundTruthManifest] = js.native
}

object Asset {
  @scala.inline
  def apply(): Asset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asset]
  }
  @scala.inline
  implicit class AssetOps[Self <: Asset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroundTruthManifest(value: GroundTruthManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroundTruthManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundTruthManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroundTruthManifest")(js.undefined)
        ret
    }
  }
  
}

