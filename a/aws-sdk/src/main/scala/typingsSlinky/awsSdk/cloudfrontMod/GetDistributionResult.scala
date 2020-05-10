package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDistributionResult extends js.Object {
  /**
    * The distribution's information.
    */
  var Distribution: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.Distribution] = js.native
  /**
    * The current version of the distribution's information. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
}

object GetDistributionResult {
  @scala.inline
  def apply(): GetDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionResult]
  }
  @scala.inline
  implicit class GetDistributionResultOps[Self <: GetDistributionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistribution(value: Distribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Distribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Distribution")(js.undefined)
        ret
    }
    @scala.inline
    def withETag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutETag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(js.undefined)
        ret
    }
  }
  
}

