package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieNames extends js.Object {
  /**
    * A complex type that contains one Name element for each cookie that you want CloudFront to forward to the origin for this cache behavior. It must contain the same number of items that is specified in the Quantity field. When you set Forward = whitelist (in the CookiePreferences object), this field must contain at least one item.
    */
  var Items: js.UndefOr[CookieNameList] = js.native
  /**
    * The number of different cookies that you want CloudFront to forward to the origin for this cache behavior. The value must equal the number of items that are in the Items field. When you set Forward = whitelist (in the CookiePreferences object), this value must be 1 or higher.
    */
  var Quantity: integer = js.native
}

object CookieNames {
  @scala.inline
  def apply(Quantity: integer): CookieNames = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieNames]
  }
  @scala.inline
  implicit class CookieNamesOps[Self <: CookieNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuantity(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: CookieNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(js.undefined)
        ret
    }
  }
  
}

