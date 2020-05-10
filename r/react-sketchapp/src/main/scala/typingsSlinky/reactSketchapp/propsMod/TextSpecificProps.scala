package typingsSlinky.reactSketchapp.propsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextSpecificProps
  extends FillProps
     with StrokeProps
     with ClipProps
     with TransformProps
     with DefinationProps
     with FontProps {
  var alignmentBaseline: js.UndefOr[AlignmentBaseline] = js.native
  var baselineShift: js.UndefOr[BaselineShift] = js.native
  var fontData: js.UndefOr[js.Object] = js.native
  var fontFeatureSettings: js.UndefOr[FontFeatureSettings] = js.native
  var lengthAdjust: js.UndefOr[LengthAdjust] = js.native
  var textLength: js.UndefOr[TextLength] = js.native
  var verticalAlign: js.UndefOr[VerticalAlign] = js.native
}

object TextSpecificProps {
  @scala.inline
  def apply(): TextSpecificProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSpecificProps]
  }
  @scala.inline
  implicit class TextSpecificPropsOps[Self <: TextSpecificProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignmentBaseline(value: AlignmentBaseline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignmentBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineShift(value: BaselineShift): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineShift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineShift")(js.undefined)
        ret
    }
    @scala.inline
    def withFontData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontData")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFeatureSettings(value: FontFeatureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFeatureSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFeatureSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFeatureSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withLengthAdjust(value: LengthAdjust): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthAdjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLengthAdjust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthAdjust")(js.undefined)
        ret
    }
    @scala.inline
    def withTextLength(value: TextLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLength")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlign(value: VerticalAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
        ret
    }
  }
  
}

