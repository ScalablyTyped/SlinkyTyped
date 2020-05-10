package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVolumesResult extends js.Object {
  /**
    * The NextToken value to include in a future DescribeVolumes request. When the results of a DescribeVolumes request exceed MaxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the volumes.
    */
  var Volumes: js.UndefOr[VolumeList] = js.native
}

object DescribeVolumesResult {
  @scala.inline
  def apply(): DescribeVolumesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesResult]
  }
  @scala.inline
  implicit class DescribeVolumesResultOps[Self <: DescribeVolumesResult] (val x: Self) extends AnyVal {
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
    def withVolumes(value: VolumeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Volumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Volumes")(js.undefined)
        ret
    }
  }
  
}

