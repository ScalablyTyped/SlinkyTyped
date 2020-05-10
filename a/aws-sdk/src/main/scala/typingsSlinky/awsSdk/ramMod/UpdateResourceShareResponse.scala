package typingsSlinky.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResourceShareResponse extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * Information about the resource share.
    */
  var resourceShare: js.UndefOr[ResourceShare] = js.native
}

object UpdateResourceShareResponse {
  @scala.inline
  def apply(): UpdateResourceShareResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResourceShareResponse]
  }
  @scala.inline
  implicit class UpdateResourceShareResponseOps[Self <: UpdateResourceShareResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withResourceShare(value: ResourceShare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceShare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShare")(js.undefined)
        ret
    }
  }
  
}

