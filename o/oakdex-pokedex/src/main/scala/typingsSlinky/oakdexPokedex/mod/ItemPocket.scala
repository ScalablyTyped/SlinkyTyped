package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemPocket extends js.Object {
  var generations: js.Array[Double] = js.native
  var pocket: String = js.native
}

object ItemPocket {
  @scala.inline
  def apply(generations: js.Array[Double], pocket: String): ItemPocket = {
    val __obj = js.Dynamic.literal(generations = generations.asInstanceOf[js.Any], pocket = pocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemPocket]
  }
  @scala.inline
  implicit class ItemPocketOps[Self <: ItemPocket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenerations(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPocket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pocket")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

