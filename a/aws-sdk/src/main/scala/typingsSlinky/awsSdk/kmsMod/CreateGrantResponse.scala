package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGrantResponse extends js.Object {
  /**
    * The unique identifier for the grant. You can use the GrantId in a subsequent RetireGrant or RevokeGrant operation.
    */
  var GrantId: js.UndefOr[GrantIdType] = js.native
  /**
    * The grant token. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
    */
  var GrantToken: js.UndefOr[GrantTokenType] = js.native
}

object CreateGrantResponse {
  @scala.inline
  def apply(): CreateGrantResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGrantResponse]
  }
  @scala.inline
  implicit class CreateGrantResponseOps[Self <: CreateGrantResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrantId(value: GrantIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantId")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantToken(value: GrantTokenType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantToken")(js.undefined)
        ret
    }
  }
  
}

