package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramShapeDefaultsConnectorDefaultsHover extends js.Object {
  var fill: js.UndefOr[String | DiagramShapeDefaultsConnectorDefaultsHoverFill] = js.native
  var stroke: js.UndefOr[String | DiagramShapeDefaultsConnectorDefaultsHoverStroke] = js.native
}

object DiagramShapeDefaultsConnectorDefaultsHover {
  @scala.inline
  def apply(): DiagramShapeDefaultsConnectorDefaultsHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsConnectorDefaultsHover]
  }
  @scala.inline
  implicit class DiagramShapeDefaultsConnectorDefaultsHoverOps[Self <: DiagramShapeDefaultsConnectorDefaultsHover] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: String | DiagramShapeDefaultsConnectorDefaultsHoverFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: String | DiagramShapeDefaultsConnectorDefaultsHoverStroke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
  }
  
}

