package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProrate extends js.Object {
  /**
    * Default price cannot be zero and must be less than the full subscription
    * price. Default price is always in the developer&#39;s Checkout merchant
    * currency. Targeted countries have their prices set automatically based on
    * the default_price.
    */
  var defaultPrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * Defines the first day on which the price takes effect.
    */
  var start: js.UndefOr[SchemaMonthDay] = js.native
}

object SchemaProrate {
  @scala.inline
  def apply(): SchemaProrate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProrate]
  }
  @scala.inline
  implicit class SchemaProrateOps[Self <: SchemaProrate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultPrice(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: SchemaMonthDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

