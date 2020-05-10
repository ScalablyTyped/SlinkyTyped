package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeDeliveryDetailsType extends js.Object {
  /**
    * The attribute name.
    */
  var AttributeName: js.UndefOr[AttributeNameType] = js.native
  /**
    * The delivery medium (email message or phone number).
    */
  var DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.native
  /**
    * The destination for the code delivery details.
    */
  var Destination: js.UndefOr[StringType] = js.native
}

object CodeDeliveryDetailsType {
  @scala.inline
  def apply(): CodeDeliveryDetailsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeDeliveryDetailsType]
  }
  @scala.inline
  implicit class CodeDeliveryDetailsTypeOps[Self <: CodeDeliveryDetailsType] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withDestination(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(js.undefined)
        ret
    }
  }
  
}

