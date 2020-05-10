package typingsSlinky.dygraphs.dygraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesLegendData extends js.Object {
  /**
    * Assigned or generated series color
    */
  var color: String = js.native
  /**
    * Series line dash
    */
  var dashHTML: String = js.native
  /**
    * Whether currently focused or not
    */
  var isHighlighted: Boolean = js.native
  /**
    * Whether the series line is inside the selected/zoomed region
    */
  var isVisible: Boolean = js.native
  /**
    * Assigned label to this series
    */
  var label: String = js.native
  /**
    * Generated label html for this series
    */
  var labelHTML: String = js.native
  /**
    * y value of this series
    */
  var y: Double = js.native
  /**
    * Generated html for y value
    */
  var yHTML: String = js.native
}

object SeriesLegendData {
  @scala.inline
  def apply(
    color: String,
    dashHTML: String,
    isHighlighted: Boolean,
    isVisible: Boolean,
    label: String,
    labelHTML: String,
    y: Double,
    yHTML: String
  ): SeriesLegendData = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], dashHTML = dashHTML.asInstanceOf[js.Any], isHighlighted = isHighlighted.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelHTML = labelHTML.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yHTML = yHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesLegendData]
  }
  @scala.inline
  implicit class SeriesLegendDataOps[Self <: SeriesLegendData] (val x: Self) extends AnyVal {
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
    def withDashHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHighlighted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHighlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yHTML")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

