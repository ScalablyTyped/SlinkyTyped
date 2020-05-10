package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDefaultClusterParametersResult extends js.Object {
  var DefaultClusterParameters: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.DefaultClusterParameters] = js.native
}

object DescribeDefaultClusterParametersResult {
  @scala.inline
  def apply(): DescribeDefaultClusterParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDefaultClusterParametersResult]
  }
  @scala.inline
  implicit class DescribeDefaultClusterParametersResultOps[Self <: DescribeDefaultClusterParametersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultClusterParameters(value: DefaultClusterParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultClusterParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultClusterParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultClusterParameters")(js.undefined)
        ret
    }
  }
  
}

