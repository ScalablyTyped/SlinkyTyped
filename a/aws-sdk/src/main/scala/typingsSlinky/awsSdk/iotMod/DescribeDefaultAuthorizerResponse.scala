package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDefaultAuthorizerResponse extends js.Object {
  /**
    * The default authorizer's description.
    */
  var authorizerDescription: js.UndefOr[AuthorizerDescription] = js.native
}

object DescribeDefaultAuthorizerResponse {
  @scala.inline
  def apply(): DescribeDefaultAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDefaultAuthorizerResponse]
  }
  @scala.inline
  implicit class DescribeDefaultAuthorizerResponseOps[Self <: DescribeDefaultAuthorizerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizerDescription(value: AuthorizerDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerDescription")(js.undefined)
        ret
    }
  }
  
}

