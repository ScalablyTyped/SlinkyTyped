package typingsSlinky.oracleOraclejet.ojchartMod.ojChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ItemContext extends js.Object {
  var itemIndex: Double = js.native
  var seriesIndex: Double = js.native
  var subId: String = js.native
}

object ItemContext {
  @scala.inline
  def apply(itemIndex: Double, seriesIndex: Double, subId: String): ItemContext = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemContext]
  }
  @scala.inline
  implicit class ItemContextOps[Self <: ItemContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeriesIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

