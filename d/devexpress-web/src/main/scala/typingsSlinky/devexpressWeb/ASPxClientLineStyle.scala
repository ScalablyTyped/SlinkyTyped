package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines line style settings.
  */
@js.native
trait ASPxClientLineStyle extends ASPxClientWebChartElement {
  /**
    * Gets the dash style used to paint the line.
    */
  var dashStyle: String = js.native
  /**
    * Returns the join style for the ends of consecutive lines.
    */
  var lineJoin: String = js.native
  /**
    * Gets the thickness that corresponds to the value of the current ASPxClientLineStyle object.
    */
  var thickness: Double = js.native
}

object ASPxClientLineStyle {
  @scala.inline
  def apply(chart: ASPxClientWebChart, dashStyle: String, lineJoin: String, thickness: Double): ASPxClientLineStyle = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dashStyle = dashStyle.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientLineStyle]
  }
  @scala.inline
  implicit class ASPxClientLineStyleOps[Self <: ASPxClientLineStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineJoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

