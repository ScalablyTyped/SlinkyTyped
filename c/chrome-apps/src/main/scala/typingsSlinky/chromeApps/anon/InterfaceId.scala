package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceId extends js.Object {
  var interfaceId: js.UndefOr[integer] = js.native
  var productId: integer = js.native
  var vendorId: integer = js.native
}

object InterfaceId {
  @scala.inline
  def apply(productId: integer, vendorId: integer): InterfaceId = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceId]
  }
  @scala.inline
  implicit class InterfaceIdOps[Self <: InterfaceId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendorId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceId")(js.undefined)
        ret
    }
  }
  
}

