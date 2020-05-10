package typingsSlinky.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration of a purchase request for a product registered to the game.
  */
@js.native
trait PurchaseConfig extends js.Object {
  /**
    * An optional developer-specified payload, to be included in the returned purchase's signed request.
    */
  var developerPayload: js.UndefOr[String] = js.native
  /**
    * The identifier of the product to purchase
    */
  var productID: String = js.native
}

object PurchaseConfig {
  @scala.inline
  def apply(productID: String): PurchaseConfig = {
    val __obj = js.Dynamic.literal(productID = productID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseConfig]
  }
  @scala.inline
  implicit class PurchaseConfigOps[Self <: PurchaseConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeveloperPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerPayload")(js.undefined)
        ret
    }
  }
  
}

