package typingsSlinky.amcharts.stockEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockEvent extends js.Object {
  /**
    * Opacity of bullet background.
    * @default 1
    */
  var backgroundAlpha: Double = js.native
  /**
    * Color of bullet background. #DADADA
    */
  var backgroundColor: String = js.native
  /**
    * Opacity of bullet border.
    * @default 1
    */
  var borderAlpha: Double = js.native
  /**
    * Bullet border color. #888888
    */
  var borderColor: String = js.native
  /**
    * The color of the event text. #000000
    */
  var color: String = js.native
  /**
    * Date of an event. Must be Date object, not a string.
    */
  var date: js.Date = js.native
  /**
    * graph on which event will be displayed.
    */
  var graph: typingsSlinky.amcharts.stockGraphMod.default = js.native
  /**
    * Roll-over background color. #CC0000
    */
  var rollOverColor: String = js.native
  /**
    * Specifies if the event should be displayed on category axis
    */
  var showOnAxis: Boolean = js.native
  /**
    * Letter which will be displayed on the event. Not all types can display letters.
    * "text" type can display longer texts.
    */
  var text: String = js.native
  /**
    * Type of bullet.
    * Possible values are:
    * "flag", "sign", "pin", "triangleUp", "triangleDown", "triangleLeft", "triangleRight", "text",
    * "arrowUp", "arrowDown"
    * @default "sign"
    */
  var `type`: String = js.native
  /**
    * A URL to go to when user clicks the event.
    */
  var url: String = js.native
  /**
    * target of url, "_blank" for example.
    */
  var urlTarget: String = js.native
}

object StockEvent {
  @scala.inline
  def apply(
    backgroundAlpha: Double,
    backgroundColor: String,
    borderAlpha: Double,
    borderColor: String,
    color: String,
    date: js.Date,
    graph: typingsSlinky.amcharts.stockGraphMod.default,
    rollOverColor: String,
    showOnAxis: Boolean,
    text: String,
    `type`: String,
    url: String,
    urlTarget: String
  ): StockEvent = {
    val __obj = js.Dynamic.literal(backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderAlpha = borderAlpha.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], rollOverColor = rollOverColor.asInstanceOf[js.Any], showOnAxis = showOnAxis.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlTarget = urlTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockEvent]
  }
  @scala.inline
  implicit class StockEventOps[Self <: StockEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraph(value: typingsSlinky.amcharts.stockGraphMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRollOverColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollOverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowOnAxis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlTarget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

