package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowedMethods extends js.Object {
  var CachedMethods: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.CachedMethods] = js.native
  /**
    * A complex type that contains the HTTP methods that you want CloudFront to process and forward to your origin.
    */
  var Items: MethodsList = js.native
  /**
    * The number of HTTP methods that you want CloudFront to forward to your origin. Valid values are 2 (for GET and HEAD requests), 3 (for GET, HEAD, and OPTIONS requests) and 7 (for GET, HEAD, OPTIONS, PUT, PATCH, POST, and DELETE requests).
    */
  var Quantity: integer = js.native
}

object AllowedMethods {
  @scala.inline
  def apply(Items: MethodsList, Quantity: integer): AllowedMethods = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedMethods]
  }
  @scala.inline
  implicit class AllowedMethodsOps[Self <: AllowedMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: MethodsList): Self = {
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
    @scala.inline
    def withCachedMethods(value: CachedMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CachedMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachedMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CachedMethods")(js.undefined)
        ret
    }
  }
  
}

