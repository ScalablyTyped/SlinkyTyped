package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemPrice extends js.Object {
  var buying: Double = js.native
  var games: js.Array[String] = js.native
  var selling: Double = js.native
}

object ItemPrice {
  @scala.inline
  def apply(buying: Double, games: js.Array[String], selling: Double): ItemPrice = {
    val __obj = js.Dynamic.literal(buying = buying.asInstanceOf[js.Any], games = games.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemPrice]
  }
  @scala.inline
  implicit class ItemPriceOps[Self <: ItemPrice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuying(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("games")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelling(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selling")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

