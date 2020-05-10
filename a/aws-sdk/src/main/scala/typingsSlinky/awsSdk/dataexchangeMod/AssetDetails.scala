package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetDetails extends js.Object {
  var S3SnapshotAsset: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.S3SnapshotAsset] = js.native
}

object AssetDetails {
  @scala.inline
  def apply(): AssetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetDetails]
  }
  @scala.inline
  implicit class AssetDetailsOps[Self <: AssetDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3SnapshotAsset(value: S3SnapshotAsset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3SnapshotAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3SnapshotAsset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3SnapshotAsset")(js.undefined)
        ret
    }
  }
  
}

