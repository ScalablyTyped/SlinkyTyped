package typingsSlinky.googleapis

import typingsSlinky.googleapis.v32Mod.dfareportingV32.SchemaRecipient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmailOwnerDeliveryType extends js.Object {
  var emailOwner: js.UndefOr[Boolean] = js.native
  var emailOwnerDeliveryType: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var recipients: js.UndefOr[js.Array[SchemaRecipient]] = js.native
}

object AnonEmailOwnerDeliveryType {
  @scala.inline
  def apply(): AnonEmailOwnerDeliveryType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEmailOwnerDeliveryType]
  }
  @scala.inline
  implicit class AnonEmailOwnerDeliveryTypeOps[Self <: AnonEmailOwnerDeliveryType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailOwner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailOwnerDeliveryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailOwnerDeliveryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailOwnerDeliveryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailOwnerDeliveryType")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipients(value: js.Array[SchemaRecipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(js.undefined)
        ret
    }
  }
  
}

