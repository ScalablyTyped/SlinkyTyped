package typingsSlinky.reactSketchapp.rectMod

import typingsSlinky.reactSketchapp.propsMod.ClipProps
import typingsSlinky.reactSketchapp.propsMod.DefinationProps
import typingsSlinky.reactSketchapp.propsMod.FillProps
import typingsSlinky.reactSketchapp.propsMod.NumberProp
import typingsSlinky.reactSketchapp.propsMod.StrokeProps
import typingsSlinky.reactSketchapp.propsMod.TransformProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RectProps
  extends FillProps
     with StrokeProps
     with ClipProps
     with TransformProps
     with DefinationProps {
  var height: NumberProp = js.native
  var rx: js.UndefOr[NumberProp] = js.native
  var ry: js.UndefOr[NumberProp] = js.native
  var width: NumberProp = js.native
  @JSName("x")
  var x_RectProps: NumberProp = js.native
  @JSName("y")
  var y_RectProps: NumberProp = js.native
}

object RectProps {
  @scala.inline
  def apply(height: NumberProp, width: NumberProp, x: NumberProp, y: NumberProp): RectProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectProps]
  }
  @scala.inline
  implicit class RectPropsOps[Self <: RectProps] (val x: Self) extends AnyVal {
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
    def withWidth(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRx(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx")(js.undefined)
        ret
    }
    @scala.inline
    def withRy(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ry")(js.undefined)
        ret
    }
  }
  
}

