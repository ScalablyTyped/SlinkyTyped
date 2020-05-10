package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAggregationAuthorizationRequest extends js.Object {
  /**
    * The 12-digit account ID of the account authorized to aggregate data.
    */
  var AuthorizedAccountId: AccountId = js.native
  /**
    * The region authorized to collect aggregated data.
    */
  var AuthorizedAwsRegion: AwsRegion = js.native
  /**
    * An array of tag object.
    */
  var Tags: js.UndefOr[TagsList] = js.native
}

object PutAggregationAuthorizationRequest {
  @scala.inline
  def apply(AuthorizedAccountId: AccountId, AuthorizedAwsRegion: AwsRegion): PutAggregationAuthorizationRequest = {
    val __obj = js.Dynamic.literal(AuthorizedAccountId = AuthorizedAccountId.asInstanceOf[js.Any], AuthorizedAwsRegion = AuthorizedAwsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAggregationAuthorizationRequest]
  }
  @scala.inline
  implicit class PutAggregationAuthorizationRequestOps[Self <: PutAggregationAuthorizationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizedAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizedAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorizedAwsRegion(value: AwsRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizedAwsRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

