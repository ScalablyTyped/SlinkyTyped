package typingsSlinky.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourceShareRequest extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: String = js.native
}

object DeleteResourceShareRequest {
  @scala.inline
  def apply(resourceShareArn: String): DeleteResourceShareRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceShareRequest]
  }
  @scala.inline
  implicit class DeleteResourceShareRequestOps[Self <: DeleteResourceShareRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceShareArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(js.undefined)
        ret
    }
  }
  
}

