package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVolumesModificationsResult extends js.Object {
  /**
    * Token for pagination, null if there are no more results 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the volume modifications.
    */
  var VolumesModifications: js.UndefOr[VolumeModificationList] = js.native
}

object DescribeVolumesModificationsResult {
  @scala.inline
  def apply(): DescribeVolumesModificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesModificationsResult]
  }
  @scala.inline
  implicit class DescribeVolumesModificationsResultOps[Self <: DescribeVolumesModificationsResult] (val x: Self) extends AnyVal {
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
    def withVolumesModifications(value: VolumeModificationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumesModifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumesModifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumesModifications")(js.undefined)
        ret
    }
  }
  
}

