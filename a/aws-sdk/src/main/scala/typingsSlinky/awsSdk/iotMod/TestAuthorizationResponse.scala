package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestAuthorizationResponse extends js.Object {
  /**
    * The authentication results.
    */
  var authResults: js.UndefOr[AuthResults] = js.native
}

object TestAuthorizationResponse {
  @scala.inline
  def apply(): TestAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestAuthorizationResponse]
  }
  @scala.inline
  implicit class TestAuthorizationResponseOps[Self <: TestAuthorizationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthResults(value: AuthResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authResults")(js.undefined)
        ret
    }
  }
  
}

