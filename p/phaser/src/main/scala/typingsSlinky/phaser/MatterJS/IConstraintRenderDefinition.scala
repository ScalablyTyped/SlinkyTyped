package typingsSlinky.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConstraintRenderDefinition extends js.Object {
  /**
    * A hex color value that defines the color to use when rendering the anchors.
    *
    * @property anchorColor
    * @type number
    */
  var anchorColor: js.UndefOr[Double] = js.native
  /**
    * The size of the anchors during rendering.
    *
    * @property anchorSize
    * @type number
    */
  var anchorSize: js.UndefOr[Double] = js.native
  /**
    * A flag that indicates if the constraint anchors should be rendered.
    *
    * @property anchors
    * @type boolean
    * @default true
    */
  var anchors: js.UndefOr[Boolean] = js.native
  /**
    * A hex color value that defines the line color to use when rendering the body.
    *
    * @property lineColor
    * @type number
    */
  var lineColor: js.UndefOr[Double] = js.native
  /**
    * A value that defines the line opacity to use when rendering the body.
    *
    * @property lineOpacity
    * @type number
    */
  var lineOpacity: js.UndefOr[Double] = js.native
  /**
    * A `Number` that defines the line width to use when rendering the body outline.
    *
    * @property lineThickness
    * @type number
    */
  var lineThickness: js.UndefOr[Double] = js.native
  /**
    * The size of the pins during rendering.
    *
    * @property pinSize
    * @type number
    */
  var pinSize: js.UndefOr[Double] = js.native
  /**
    * The type of constraint.
    *
    * @property type
    * @type string
    * @default 'line'
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * A flag that indicates if the constraint should be rendered.
    *
    * @property visible
    * @type boolean
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object IConstraintRenderDefinition {
  @scala.inline
  def apply(): IConstraintRenderDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConstraintRenderDefinition]
  }
  @scala.inline
  implicit class IConstraintRenderDefinitionOps[Self <: IConstraintRenderDefinition] (val x: Self) extends AnyVal {
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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

