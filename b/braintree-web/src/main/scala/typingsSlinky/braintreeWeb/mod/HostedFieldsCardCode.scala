package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description Information about the card type, sent in {@link HostedFields~stateObject|stateObjects}.
  * @property {string} type The code-friendly representation of the card type. It will be one of the following strings:
  * - `american-express`
  * - `diners-club`
  * - `discover`
  * - `jcb`
  * - `maestro`
  * - `master-card`
  * - `unionpay`
  * - `visa`
  * @property {string} niceType The pretty-printed card type. It will be one of the following strings:
  * - `American Express`
  * - `Diners Club`
  * - `Discover`
  * - `JCB`
  * - `Maestro`
  * - `MasterCard`
  * - `UnionPay`
  * - `Visa`
  * @property {object} code
  * This object contains data relevant to the security code requirements of the card brand.
  * For example, on a Visa card there will be a <code>CVV</code> of 3 digits, whereas an
  * American Express card requires a 4-digit <code>CID</code>.
  * @property {string} code.name <code>"CVV"</code> <code>"CID"</code> <code>"CVC"</code>
  * @property {number} code.size The expected length of the security code. Typically, this is 3 or 4.
  */
@js.native
trait HostedFieldsCardCode extends js.Object {
  var name: String = js.native
  var size: Double = js.native
}

object HostedFieldsCardCode {
  @scala.inline
  def apply(name: String, size: Double): HostedFieldsCardCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsCardCode]
  }
  @scala.inline
  implicit class HostedFieldsCardCodeOps[Self <: HostedFieldsCardCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

