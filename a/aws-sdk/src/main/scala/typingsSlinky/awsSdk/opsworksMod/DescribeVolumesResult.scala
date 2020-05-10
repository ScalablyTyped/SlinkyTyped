package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVolumesResult extends js.Object {
  /**
    * An array of volume IDs.
    */
  var Volumes: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.Volumes] = js.native
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
    def withVolumes(value: Volumes): Self = {
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

