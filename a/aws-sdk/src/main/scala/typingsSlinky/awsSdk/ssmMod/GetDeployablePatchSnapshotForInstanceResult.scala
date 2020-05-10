package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeployablePatchSnapshotForInstanceResult extends js.Object {
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstanceId] = js.native
  /**
    * Returns the specific operating system (for example Windows Server 2012 or Amazon Linux 2015.09) on the instance for the specified patch snapshot.
    */
  var Product: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Product] = js.native
  /**
    * A pre-signed Amazon S3 URL that can be used to download the patch snapshot.
    */
  var SnapshotDownloadUrl: js.UndefOr[typingsSlinky.awsSdk.ssmMod.SnapshotDownloadUrl] = js.native
  /**
    * The user-defined snapshot ID.
    */
  var SnapshotId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.SnapshotId] = js.native
}

object GetDeployablePatchSnapshotForInstanceResult {
  @scala.inline
  def apply(): GetDeployablePatchSnapshotForInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeployablePatchSnapshotForInstanceResult]
  }
  @scala.inline
  implicit class GetDeployablePatchSnapshotForInstanceResultOps[Self <: GetDeployablePatchSnapshotForInstanceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct(value: Product): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Product")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotDownloadUrl(value: SnapshotDownloadUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotDownloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotDownloadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotDownloadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotId(value: SnapshotId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotId")(js.undefined)
        ret
    }
  }
  
}

