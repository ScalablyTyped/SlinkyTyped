package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a recipient.
  */
@js.native
trait SchemaRecipient extends js.Object {
  /**
    * The delivery type for the recipient.
    */
  var deliveryType: js.UndefOr[String] = js.native
  /**
    * The email address of the recipient.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#recipient.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaRecipient {
  @scala.inline
  def apply(): SchemaRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecipient]
  }
  @scala.inline
  implicit class SchemaRecipientOps[Self <: SchemaRecipient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryType")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

