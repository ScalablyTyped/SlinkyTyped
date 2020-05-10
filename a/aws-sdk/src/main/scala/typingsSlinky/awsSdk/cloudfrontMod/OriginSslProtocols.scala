package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginSslProtocols extends js.Object {
  /**
    * A list that contains allowed SSL/TLS protocols for this distribution.
    */
  var Items: SslProtocolsList = js.native
  /**
    * The number of SSL/TLS protocols that you want to allow CloudFront to use when establishing an HTTPS connection with this origin. 
    */
  var Quantity: integer = js.native
}

object OriginSslProtocols {
  @scala.inline
  def apply(Items: SslProtocolsList, Quantity: integer): OriginSslProtocols = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginSslProtocols]
  }
  @scala.inline
  implicit class OriginSslProtocolsOps[Self <: OriginSslProtocols] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: SslProtocolsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantity(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quantity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

