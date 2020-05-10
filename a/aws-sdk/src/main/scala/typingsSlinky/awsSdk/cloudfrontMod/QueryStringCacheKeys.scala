package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryStringCacheKeys extends js.Object {
  /**
    * A list that contains the query string parameters that you want CloudFront to use as a basis for caching for a cache behavior. If Quantity is 0, you can omit Items. 
    */
  var Items: js.UndefOr[QueryStringCacheKeysList] = js.native
  /**
    * The number of whitelisted query string parameters for a cache behavior.
    */
  var Quantity: integer = js.native
}

object QueryStringCacheKeys {
  @scala.inline
  def apply(Quantity: integer): QueryStringCacheKeys = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryStringCacheKeys]
  }
  @scala.inline
  implicit class QueryStringCacheKeysOps[Self <: QueryStringCacheKeys] (val x: Self) extends AnyVal {
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
    def withItems(value: QueryStringCacheKeysList): Self = {
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

