package typingsSlinky.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskProps
  extends TransformProps
     with FillProps
     with StrokeProps
     with ClipProps
     with VectorEffectProps
     with ResponderProps
     with TouchableProps
     with DefinitionProps
     with CommonMarkerProps
     with CommonMaskProps {
  var height: js.UndefOr[NumberProp] = js.native
  var maskContentUnits: js.UndefOr[TMaskUnits] = js.native
  var maskTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.native
  var maskUnits: js.UndefOr[TMaskUnits] = js.native
  var width: js.UndefOr[NumberProp] = js.native
  @JSName("x")
  var x_MaskProps: js.UndefOr[NumberProp] = js.native
  @JSName("y")
  var y_MaskProps: js.UndefOr[NumberProp] = js.native
}

object MaskProps {
  @scala.inline
  def apply(): MaskProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskProps]
  }
  @scala.inline
  implicit class MaskPropsOps[Self <: MaskProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskContentUnits(value: TMaskUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskContentUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskContentUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskContentUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskTransform(value: ColumnMajorTransformMatrix | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskUnits(value: TMaskUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

