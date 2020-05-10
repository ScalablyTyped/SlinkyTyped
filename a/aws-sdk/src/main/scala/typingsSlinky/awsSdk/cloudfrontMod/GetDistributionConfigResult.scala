package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDistributionConfigResult extends js.Object {
  /**
    * The distribution's configuration information.
    */
  var DistributionConfig: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.DistributionConfig] = js.native
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
}

object GetDistributionConfigResult {
  @scala.inline
  def apply(): GetDistributionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionConfigResult]
  }
  @scala.inline
  implicit class GetDistributionConfigResultOps[Self <: GetDistributionConfigResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistributionConfig(value: DistributionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistributionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistributionConfig")(js.undefined)
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

