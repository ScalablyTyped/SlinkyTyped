package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCellAlpha extends js.Object {
  var cellAlpha: js.UndefOr[Property] = js.native
  var color: js.UndefOr[Property] = js.native
  var lineCount: js.UndefOr[Property] = js.native
  var lineOffset: js.UndefOr[Property] = js.native
  var lineThickness: js.UndefOr[Property] = js.native
}

object AnonCellAlpha {
  @scala.inline
  def apply(): AnonCellAlpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCellAlpha]
  }
  @scala.inline
  implicit class AnonCellAlphaOps[Self <: AnonCellAlpha] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellAlpha(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withLineCount(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLineOffset(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLineThickness(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineThickness")(js.undefined)
        ret
    }
  }
  
}

