package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  var category: String = js.native
  var descriptions: js.Array[ItemDescription] = js.native
  var effects: js.Array[ItemEffect] = js.native
  var fling_power: Double = js.native
  var names: Translations = js.native
  var pockets: js.Array[ItemPocket] = js.native
  var prices: js.Array[ItemPrice] = js.native
}

object Item {
  @scala.inline
  def apply(
    category: String,
    descriptions: js.Array[ItemDescription],
    effects: js.Array[ItemEffect],
    fling_power: Double,
    names: Translations,
    pockets: js.Array[ItemPocket],
    prices: js.Array[ItemPrice]
  ): Item = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], descriptions = descriptions.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], fling_power = fling_power.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], pockets = pockets.asInstanceOf[js.Any], prices = prices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptions(value: js.Array[ItemDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffects(value: js.Array[ItemEffect]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFling_power(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fling_power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: Translations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPockets(value: js.Array[ItemPocket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrices(value: js.Array[ItemPrice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

