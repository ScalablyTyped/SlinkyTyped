package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDistributionRequest extends js.Object {
  /**
    * The distribution's configuration information.
    */
  var DistributionConfig: typingsSlinky.awsSdk.cloudfrontMod.DistributionConfig = js.native
  /**
    * The distribution's id.
    */
  var Id: String = js.native
  /**
    * The value of the ETag header that you received when retrieving the distribution's configuration. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
}

object UpdateDistributionRequest {
  @scala.inline
  def apply(DistributionConfig: DistributionConfig, Id: String): UpdateDistributionRequest = {
    val __obj = js.Dynamic.literal(DistributionConfig = DistributionConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDistributionRequest]
  }
  @scala.inline
  implicit class UpdateDistributionRequestOps[Self <: UpdateDistributionRequest] (val x: Self) extends AnyVal {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIfMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfMatch")(js.undefined)
        ret
    }
  }
  
}

