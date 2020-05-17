package typingsSlinky.hellosignEmbedded.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Haspin extends js.Object {
  var has_pin: Boolean = js.native
  var last_reminded_at: Double = js.native
  var last_viewed_at: Double = js.native
  var order: Double = js.native
  var signature_id: String = js.native
  var signed_at: Double = js.native
  var signer_email_address: String = js.native
  var signer_name: String = js.native
  var status_code: String = js.native
}

object Haspin {
  @scala.inline
  def apply(
    has_pin: Boolean,
    last_reminded_at: Double,
    last_viewed_at: Double,
    order: Double,
    signature_id: String,
    signed_at: Double,
    signer_email_address: String,
    signer_name: String,
    status_code: String
  ): Haspin = {
    val __obj = js.Dynamic.literal(has_pin = has_pin.asInstanceOf[js.Any], last_reminded_at = last_reminded_at.asInstanceOf[js.Any], last_viewed_at = last_viewed_at.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], signature_id = signature_id.asInstanceOf[js.Any], signed_at = signed_at.asInstanceOf[js.Any], signer_email_address = signer_email_address.asInstanceOf[js.Any], signer_name = signer_name.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Haspin]
  }
  @scala.inline
  implicit class HaspinOps[Self <: Haspin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHas_pin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_pin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_reminded_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_reminded_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_viewed_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_viewed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigned_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigner_email_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer_email_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigner_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_code")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

