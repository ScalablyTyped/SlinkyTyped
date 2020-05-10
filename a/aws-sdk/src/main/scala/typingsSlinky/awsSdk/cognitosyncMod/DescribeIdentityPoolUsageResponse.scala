package typingsSlinky.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdentityPoolUsageResponse extends js.Object {
  /**
    * Information about the usage of the identity pool.
    */
  var IdentityPoolUsage: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.IdentityPoolUsage] = js.native
}

object DescribeIdentityPoolUsageResponse {
  @scala.inline
  def apply(): DescribeIdentityPoolUsageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityPoolUsageResponse]
  }
  @scala.inline
  implicit class DescribeIdentityPoolUsageResponseOps[Self <: DescribeIdentityPoolUsageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityPoolUsage(value: IdentityPoolUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityPoolUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolUsage")(js.undefined)
        ret
    }
  }
  
}

