package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVolumeStatusResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the status of the volumes.
    */
  var VolumeStatuses: js.UndefOr[VolumeStatusList] = js.native
}

object DescribeVolumeStatusResult {
  @scala.inline
  def apply(): DescribeVolumeStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumeStatusResult]
  }
  @scala.inline
  implicit class DescribeVolumeStatusResultOps[Self <: DescribeVolumeStatusResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
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
    @scala.inline
    def withVolumeStatuses(value: VolumeStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeStatuses")(js.undefined)
        ret
    }
  }
  
}

