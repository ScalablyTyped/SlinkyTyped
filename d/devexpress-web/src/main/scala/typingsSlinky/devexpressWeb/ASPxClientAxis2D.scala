package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Axis2D class.
  */
@js.native
trait ASPxClientAxis2D extends ASPxClientAxisBase {
  /**
    * Provides access to an axis title object.
    */
  var axisTitle: ASPxClientAxisTitle = js.native
  /**
    * Provides access to the collection of the axis constant lines.
    */
  var constantLines: js.Array[ASPxClientConstantLine] = js.native
  /**
    * Provides access to the axis strips collection.
    */
  var strips: js.Array[ASPxClientStrip] = js.native
}

object ASPxClientAxis2D {
  @scala.inline
  def apply(
    axisTitle: ASPxClientAxisTitle,
    chart: ASPxClientWebChart,
    constantLines: js.Array[ASPxClientConstantLine],
    diagram: ASPxClientXYDiagramBase,
    name: String,
    range: ASPxClientAxisRange,
    strips: js.Array[ASPxClientStrip]
  ): ASPxClientAxis2D = {
    val __obj = js.Dynamic.literal(axisTitle = axisTitle.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], constantLines = constantLines.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], strips = strips.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxis2D]
  }
  @scala.inline
  implicit class ASPxClientAxis2DOps[Self <: ASPxClientAxis2D] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisTitle(value: ASPxClientAxisTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstantLines(value: js.Array[ASPxClientConstantLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constantLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrips(value: js.Array[ASPxClientStrip]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strips")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

