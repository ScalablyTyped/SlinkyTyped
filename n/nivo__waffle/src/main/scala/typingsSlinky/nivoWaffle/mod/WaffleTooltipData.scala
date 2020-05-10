package typingsSlinky.nivoWaffle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/waffle.@nivo/waffle.WaffleDatum & {  color  :string,   position  :number,   row  :number,   column  :number,   groupIndex  :number,   startAt  :number,   endAt  :number} */
@js.native
trait WaffleTooltipData extends js.Object {
  var color: String = js.native
  var column: Double = js.native
  var endAt: Double = js.native
  var groupIndex: Double = js.native
  var id: String | Double = js.native
  var label: String | Double = js.native
  var position: Double = js.native
  var row: Double = js.native
  var startAt: Double = js.native
  var value: Double = js.native
}

object WaffleTooltipData {
  @scala.inline
  def apply(
    color: String,
    column: Double,
    endAt: Double,
    groupIndex: Double,
    id: String | Double,
    label: String | Double,
    position: Double,
    row: Double,
    startAt: Double,
    value: Double
  ): WaffleTooltipData = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], endAt = endAt.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], startAt = startAt.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaffleTooltipData]
  }
  @scala.inline
  implicit class WaffleTooltipDataOps[Self <: WaffleTooltipData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

