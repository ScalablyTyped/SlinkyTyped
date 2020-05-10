package typingsSlinky.pulumiAws.inputMod.redshift

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterSnapshotCopy extends js.Object {
  /**
    * The destination region that you want to copy snapshots to.
    */
  var destinationRegion: Input[String] = js.native
  /**
    * The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
    */
  var grantName: js.UndefOr[Input[String]] = js.native
  /**
    * The number of days to retain automated snapshots in the destination region after they are copied from the source region. Defaults to `7`.
    */
  var retentionPeriod: js.UndefOr[Input[Double]] = js.native
}

object ClusterSnapshotCopy {
  @scala.inline
  def apply(destinationRegion: Input[String]): ClusterSnapshotCopy = {
    val __obj = js.Dynamic.literal(destinationRegion = destinationRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSnapshotCopy]
  }
  @scala.inline
  implicit class ClusterSnapshotCopyOps[Self <: ClusterSnapshotCopy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationRegion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrantName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantName")(js.undefined)
        ret
    }
    @scala.inline
    def withRetentionPeriod(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPeriod")(js.undefined)
        ret
    }
  }
  
}

