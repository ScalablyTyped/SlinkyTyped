package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFastSnapshotRestoresResult extends js.Object {
  /**
    * Information about the state of fast snapshot restores.
    */
  var FastSnapshotRestores: js.UndefOr[DescribeFastSnapshotRestoreSuccessSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.NextToken] = js.native
}

object DescribeFastSnapshotRestoresResult {
  @scala.inline
  def apply(): DescribeFastSnapshotRestoresResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFastSnapshotRestoresResult]
  }
  @scala.inline
  implicit class DescribeFastSnapshotRestoresResultOps[Self <: DescribeFastSnapshotRestoresResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFastSnapshotRestores(value: DescribeFastSnapshotRestoreSuccessSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FastSnapshotRestores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastSnapshotRestores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FastSnapshotRestores")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

