package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBSnapshotAttributesResult extends js.Object {
  var DBSnapshotAttributesResult: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBSnapshotAttributesResult] = js.native
}

object DescribeDBSnapshotAttributesResult {
  @scala.inline
  def apply(): DescribeDBSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBSnapshotAttributesResult]
  }
  @scala.inline
  implicit class DescribeDBSnapshotAttributesResultOps[Self <: DescribeDBSnapshotAttributesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBSnapshotAttributesResult(value: DBSnapshotAttributesResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSnapshotAttributesResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSnapshotAttributesResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSnapshotAttributesResult")(js.undefined)
        ret
    }
  }
  
}

