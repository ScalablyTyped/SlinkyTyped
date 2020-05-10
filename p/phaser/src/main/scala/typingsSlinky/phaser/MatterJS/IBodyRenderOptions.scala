package typingsSlinky.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBodyRenderOptions extends js.Object {
  /**
    * A hex color value that defines the fill color to use when rendering the body.
    *
    * @property fillColor
    * @type number
    */
  var fillColor: js.UndefOr[Double] = js.native
  /**
    * A value that defines the fill opacity to use when rendering the body.
    *
    * @property fillOpacity
    * @type number
    */
  var fillOpacity: js.UndefOr[Double] = js.native
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
    * Sets the opacity. 1.0 is fully opaque. 0.0 is fully translucent.
    *
    * @property opacity
    * @type number
    * @default 1
  		 */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * An `Object` that defines the sprite properties to use when rendering, if any.
    *
    * @property sprite
    * @type object
    */
  var sprite: js.UndefOr[IBodyRenderOptionsSprite] = js.native
  /**
    * A flag that indicates if the body should be rendered.
    *
    * @property visible
    * @type boolean
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object IBodyRenderOptions {
  @scala.inline
  def apply(): IBodyRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBodyRenderOptions]
  }
  @scala.inline
  implicit class IBodyRenderOptionsOps[Self <: IBodyRenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFillColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
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
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSprite(value: IBodyRenderOptionsSprite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSprite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite")(js.undefined)
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

