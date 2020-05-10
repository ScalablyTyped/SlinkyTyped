package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedAdvisorResourceDetail extends js.Object {
  /**
    * Specifies whether the AWS resource was ignored by Trusted Advisor because it was marked as suppressed by the user.
    */
  var isSuppressed: js.UndefOr[Boolean] = js.native
  /**
    * Additional information about the identified resource. The exact metadata and its order can be obtained by inspecting the TrustedAdvisorCheckDescription object returned by the call to DescribeTrustedAdvisorChecks. Metadata contains all the data that is shown in the Excel download, even in those cases where the UI shows just summary data.
    */
  var metadata: StringList = js.native
  /**
    * The AWS region in which the identified resource is located.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * The unique identifier for the identified resource.
    */
  var resourceId: String = js.native
  /**
    * The status code for the resource identified in the Trusted Advisor check.
    */
  var status: String = js.native
}

object TrustedAdvisorResourceDetail {
  @scala.inline
  def apply(metadata: StringList, resourceId: String, status: String): TrustedAdvisorResourceDetail = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedAdvisorResourceDetail]
  }
  @scala.inline
  implicit class TrustedAdvisorResourceDetailOps[Self <: TrustedAdvisorResourceDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSuppressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuppressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSuppressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuppressed")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
  }
  
}

