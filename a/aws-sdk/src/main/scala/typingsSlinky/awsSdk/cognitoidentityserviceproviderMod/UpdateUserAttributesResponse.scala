package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserAttributesResponse extends js.Object {
  /**
    * The code delivery details list from the server for the request to update user attributes.
    */
  var CodeDeliveryDetailsList: js.UndefOr[CodeDeliveryDetailsListType] = js.native
}

object UpdateUserAttributesResponse {
  @scala.inline
  def apply(): UpdateUserAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserAttributesResponse]
  }
  @scala.inline
  implicit class UpdateUserAttributesResponseOps[Self <: UpdateUserAttributesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeDeliveryDetailsList(value: CodeDeliveryDetailsListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeDeliveryDetailsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeDeliveryDetailsList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeDeliveryDetailsList")(js.undefined)
        ret
    }
  }
  
}

