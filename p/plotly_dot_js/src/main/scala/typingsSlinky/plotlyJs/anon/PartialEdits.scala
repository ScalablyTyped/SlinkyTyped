package typingsSlinky.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Edits> */
@js.native
trait PartialEdits extends js.Object {
  var annotationPosition: js.UndefOr[Boolean] = js.native
  var annotationTail: js.UndefOr[Boolean] = js.native
  var annotationText: js.UndefOr[Boolean] = js.native
  var axisTitleText: js.UndefOr[Boolean] = js.native
  var colorbarPosition: js.UndefOr[Boolean] = js.native
  var colorbarTitleText: js.UndefOr[Boolean] = js.native
  var legendPosition: js.UndefOr[Boolean] = js.native
  var legendText: js.UndefOr[Boolean] = js.native
  var shapePosition: js.UndefOr[Boolean] = js.native
  var titleText: js.UndefOr[Boolean] = js.native
}

object PartialEdits {
  @scala.inline
  def apply(): PartialEdits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEdits]
  }
  @scala.inline
  implicit class PartialEditsOps[Self <: PartialEdits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationTail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationTail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationTail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationTail")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationText")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisTitleText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTitleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisTitleText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTitleText")(js.undefined)
        ret
    }
    @scala.inline
    def withColorbarPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorbarPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorbarPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorbarPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withColorbarTitleText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorbarTitleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorbarTitleText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorbarTitleText")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendText")(js.undefined)
        ret
    }
    @scala.inline
    def withShapePosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(js.undefined)
        ret
    }
  }
  
}

