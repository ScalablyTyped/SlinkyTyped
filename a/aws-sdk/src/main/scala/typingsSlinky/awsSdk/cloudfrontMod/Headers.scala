package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  /**
    * A list that contains one Name element for each header that you want CloudFront to use for caching in this cache behavior. If Quantity is 0, omit Items.
    */
  var Items: js.UndefOr[HeaderList] = js.native
  /**
    * The number of different headers that you want CloudFront to base caching on for this cache behavior. You can configure each cache behavior in a web distribution to do one of the following:    Forward all headers to your origin: Specify 1 for Quantity and * for Name.  CloudFront doesn't cache the objects that are associated with this cache behavior. Instead, CloudFront sends every request to the origin.      Forward a whitelist of headers you specify: Specify the number of headers that you want CloudFront to base caching on. Then specify the header names in Name elements. CloudFront caches your objects based on the values in the specified headers.    Forward only the default headers: Specify 0 for Quantity and omit Items. In this configuration, CloudFront doesn't cache based on the values in the request headers.   Regardless of which option you choose, CloudFront forwards headers to your origin based on whether the origin is an S3 bucket or a custom origin. See the following documentation:    S3 bucket: See HTTP Request Headers That CloudFront Removes or Updates     Custom origin: See HTTP Request Headers and CloudFront Behavior   
    */
  var Quantity: integer = js.native
}

object Headers {
  @scala.inline
  def apply(Quantity: integer): Headers = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
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
    def withItems(value: HeaderList): Self = {
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

