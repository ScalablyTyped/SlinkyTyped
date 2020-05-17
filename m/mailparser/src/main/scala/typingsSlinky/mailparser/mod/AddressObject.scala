package typingsSlinky.mailparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Address object.
  */
@js.native
trait AddressObject extends HeaderValue {
  /**
  	 * A formatted address string for HTML context.
  	 */
  var html: String = js.native
  /**
  	 * A formatted address string for plaintext context.
  	 */
  var text: String = js.native
  /**
  	 * An array with address details.
  	 */
  var value: js.Array[EmailAddress] = js.native
}

object AddressObject {
  @scala.inline
  def apply(html: String, text: String, value: js.Array[EmailAddress]): AddressObject = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressObject]
  }
  @scala.inline
  implicit class AddressObjectOps[Self <: AddressObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Array[EmailAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

