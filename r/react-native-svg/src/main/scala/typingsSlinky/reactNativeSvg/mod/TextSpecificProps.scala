package typingsSlinky.reactNativeSvg.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextSpecificProps
  extends TransformProps
     with FillProps
     with StrokeProps
     with ClipProps
     with VectorEffectProps
     with ResponderProps
     with TouchableProps
     with DefinitionProps
     with CommonMarkerProps
     with CommonMaskProps
     with FontProps {
  var alignmentBaseline: js.UndefOr[AlignmentBaseline] = js.native
  var baselineShift: js.UndefOr[BaselineShift] = js.native
  var fontData: js.UndefOr[Null | StringDictionary[js.Any]] = js.native
  var lengthAdjust: js.UndefOr[LengthAdjust] = js.native
  var textLength: js.UndefOr[NumberProp] = js.native
  var verticalAlign: js.UndefOr[NumberProp] = js.native
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
    def withFontData(value: StringDictionary[js.Any]): Self = {
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
    def withFontDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontData")(null)
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
    def withTextLength(value: NumberProp): Self = {
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
    def withVerticalAlign(value: NumberProp): Self = {
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

