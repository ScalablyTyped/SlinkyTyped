package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MFAOptionType extends js.Object {
  /**
    * The attribute name of the MFA option type. The only valid value is phone_number.
    */
  var AttributeName: js.UndefOr[AttributeNameType] = js.native
  /**
    * The delivery medium to send the MFA code. You can use this parameter to set only the SMS delivery medium value.
    */
  var DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.native
}

object MFAOptionType {
  @scala.inline
  def apply(): MFAOptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MFAOptionType]
  }
  @scala.inline
  implicit class MFAOptionTypeOps[Self <: MFAOptionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: AttributeNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryMedium(value: DeliveryMediumType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryMedium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryMedium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryMedium")(js.undefined)
        ret
    }
  }
  
}

