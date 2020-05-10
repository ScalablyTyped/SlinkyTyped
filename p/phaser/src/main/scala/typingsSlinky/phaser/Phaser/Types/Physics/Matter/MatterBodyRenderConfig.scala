package typingsSlinky.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterBodyRenderConfig extends js.Object {
  /**
    * The color value of the fill when rendering this body.
    */
  var fillColor: js.UndefOr[Double] = js.native
  /**
    * The opacity of the fill when rendering this body, a value between 0 and 1.
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * The color value of the line stroke when rendering this body.
    */
  var lineColor: js.UndefOr[Double] = js.native
  /**
    * The opacity of the line when rendering this body, a value between 0 and 1.
    */
  var lineOpacity: js.UndefOr[Double] = js.native
  /**
    * If rendering lines, the thickness of the line.
    */
  var lineThickness: js.UndefOr[Double] = js.native
  /**
    * The opacity of the body and all parts within it.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Controls the offset between the body and the parent Game Object, if it has one.
    */
  var sprite: js.UndefOr[js.Object] = js.native
  /**
    * The horizontal offset between the body and the parent Game Object texture, if it has one.
    */
  @JSName("sprite.xOffset")
  var spriteDotxOffset: js.UndefOr[Double] = js.native
  /**
    * The vertical offset between the body and the parent Game Object texture, if it has one.
    */
  @JSName("sprite.yOffset")
  var spriteDotyOffset: js.UndefOr[Double] = js.native
  /**
    * Should this body be rendered by the Debug Renderer?
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object MatterBodyRenderConfig {
  @scala.inline
  def apply(): MatterBodyRenderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterBodyRenderConfig]
  }
  @scala.inline
  implicit class MatterBodyRenderConfigOps[Self <: MatterBodyRenderConfig] (val x: Self) extends AnyVal {
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
    def withSprite(value: js.Object): Self = {
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
    def withSpriteDotxOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite.xOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpriteDotxOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite.xOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSpriteDotyOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite.yOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpriteDotyOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite.yOffset")(js.undefined)
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

