package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ConstantLine class.
  */
@js.native
trait ASPxClientConstantLine extends ASPxClientWebChartElementNamed {
  /**
    * Gets the axis that owns the current constant line object.
    */
  var axis: ASPxClientAxis = js.native
  /**
    * Gets the constant line title.
    */
  var title: String = js.native
  /**
    * Gets the constant line's position along the axis.
    */
  var value: js.Any = js.native
}

object ASPxClientConstantLine {
  @scala.inline
  def apply(axis: ASPxClientAxis, chart: ASPxClientWebChart, name: String, title: String, value: js.Any): ASPxClientConstantLine = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientConstantLine]
  }
  @scala.inline
  implicit class ASPxClientConstantLineOps[Self <: ASPxClientConstantLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: ASPxClientAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

