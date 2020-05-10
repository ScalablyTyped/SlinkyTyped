package typingsSlinky.pulumiAws.getCallerIdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCallerIdentityResult extends js.Object {
  /**
    * The AWS Account ID number of the account that owns or contains the calling entity.
    */
  val accountId: String = js.native
  /**
    * The AWS ARN associated with the calling entity.
    */
  val arn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The unique identifier of the calling entity.
    */
  val userId: String = js.native
}

object GetCallerIdentityResult {
  @scala.inline
  def apply(accountId: String, arn: String, id: String, userId: String): GetCallerIdentityResult = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCallerIdentityResult]
  }
  @scala.inline
  implicit class GetCallerIdentityResultOps[Self <: GetCallerIdentityResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

