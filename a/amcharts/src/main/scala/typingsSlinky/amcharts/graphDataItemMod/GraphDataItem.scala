package typingsSlinky.amcharts.graphDataItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphDataItem extends js.Object {
  /**
    * Opacity of the data item.
    */
  var alpha: Double = js.native
  /**
    * Bullet type.
    */
  var bullet: String = js.native
  /**
    * Bullet size.
    */
  var bulletSize: Double = js.native
  /**
    * Category value.
    */
  var category: String = js.native
  /**
    * Color of the data item.
    */
  var color: String = js.native
  /**
    * Custom bullet (path to file name).
    */
  var customBullet: String = js.native
  /**
    * Original object from data provider.
    */
  var dataContext: js.Object = js.native
  /**
    * Description.
    */
  var description: String = js.native
  /**
    * Array of colors of the data item, used by column and candlestick chart only.
    */
  var fillColors: js.Array[_] = js.native
  /**
    * Object which holds percents when recalculateToPercents is set to true.
    */
  var percents: js.Object = js.native
  /**
    * SerialDataItem of this graphDataItem
    */
  var serialDataItem: typingsSlinky.amcharts.serialDataItemMod.default = js.native
  /**
    * url
    */
  var url: String = js.native
  /**
    * Object which holds values of the data item (value, open, close, low, high).
    */
  var values: js.Object = js.native
  /**
    * x coordinate of the data item.
    */
  var x: Double = js.native
  /**
    * y coordinate of the data item.
    */
  var y: Double = js.native
}

object GraphDataItem {
  @scala.inline
  def apply(
    alpha: Double,
    bullet: String,
    bulletSize: Double,
    category: String,
    color: String,
    customBullet: String,
    dataContext: js.Object,
    description: String,
    fillColors: js.Array[_],
    percents: js.Object,
    serialDataItem: typingsSlinky.amcharts.serialDataItemMod.default,
    url: String,
    values: js.Object,
    x: Double,
    y: Double
  ): GraphDataItem = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], bullet = bullet.asInstanceOf[js.Any], bulletSize = bulletSize.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], customBullet = customBullet.asInstanceOf[js.Any], dataContext = dataContext.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fillColors = fillColors.asInstanceOf[js.Any], percents = percents.asInstanceOf[js.Any], serialDataItem = serialDataItem.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDataItem]
  }
  @scala.inline
  implicit class GraphDataItemOps[Self <: GraphDataItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBullet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bullet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBulletSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomBullet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBullet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillColors(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercents(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialDataItem(value: typingsSlinky.amcharts.serialDataItemMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialDataItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

