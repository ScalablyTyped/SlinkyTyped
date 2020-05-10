package typingsSlinky.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterConstraintRenderConfig extends js.Object {
  /**
    * The color value of constraint anchors.
    */
  var anchorColor: js.UndefOr[Double] = js.native
  /**
    * The size of the circles drawn as the constraint anchors.
    */
  var anchorSize: js.UndefOr[Double] = js.native
  /**
    * If this constraint has anchors, should they be rendered? Pin constraints never have anchors.
    */
  var anchors: js.UndefOr[Boolean] = js.native
  /**
    * The color value of the line stroke when rendering this constraint.
    */
  var lineColor: js.UndefOr[Double] = js.native
  /**
    * The opacity of the line when rendering this constraint, a value between 0 and 1.
    */
  var lineOpacity: js.UndefOr[Double] = js.native
  /**
    * If rendering lines, the thickness of the line.
    */
  var lineThickness: js.UndefOr[Double] = js.native
  /**
    * The size of the circles drawn when rendering pin constraints.
    */
  var pinSize: js.UndefOr[Double] = js.native
  /**
    * Should this constraint be rendered by the Debug Renderer?
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object MatterConstraintRenderConfig {
  @scala.inline
  def apply(): MatterConstraintRenderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterConstraintRenderConfig]
  }
  @scala.inline
  implicit class MatterConstraintRenderConfigOps[Self <: MatterConstraintRenderConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorColor")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorSize")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchors")(js.undefined)
        ret
    }
    @scala.inline
    def withLineColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withLineThickness(value: Double): Self = {
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
    @scala.inline
    def withPinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

