package typingsSlinky.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edits extends js.Object {
  var annotationPosition: Boolean = js.native
  var annotationTail: Boolean = js.native
  var annotationText: Boolean = js.native
  var axisTitleText: Boolean = js.native
  var colorbarPosition: Boolean = js.native
  var colorbarTitleText: Boolean = js.native
  var legendPosition: Boolean = js.native
  var legendText: Boolean = js.native
  var shapePosition: Boolean = js.native
  var titleText: Boolean = js.native
}

object Edits {
  @scala.inline
  def apply(
    annotationPosition: Boolean,
    annotationTail: Boolean,
    annotationText: Boolean,
    axisTitleText: Boolean,
    colorbarPosition: Boolean,
    colorbarTitleText: Boolean,
    legendPosition: Boolean,
    legendText: Boolean,
    shapePosition: Boolean,
    titleText: Boolean
  ): Edits = {
    val __obj = js.Dynamic.literal(annotationPosition = annotationPosition.asInstanceOf[js.Any], annotationTail = annotationTail.asInstanceOf[js.Any], annotationText = annotationText.asInstanceOf[js.Any], axisTitleText = axisTitleText.asInstanceOf[js.Any], colorbarPosition = colorbarPosition.asInstanceOf[js.Any], colorbarTitleText = colorbarTitleText.asInstanceOf[js.Any], legendPosition = legendPosition.asInstanceOf[js.Any], legendText = legendText.asInstanceOf[js.Any], shapePosition = shapePosition.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edits]
  }
  @scala.inline
  implicit class EditsOps[Self <: Edits] (val x: Self) extends AnyVal {
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
    def withAnnotationTail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationTail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotationText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisTitleText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTitleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorbarPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorbarPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorbarTitleText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorbarTitleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegendPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegendText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapePosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

