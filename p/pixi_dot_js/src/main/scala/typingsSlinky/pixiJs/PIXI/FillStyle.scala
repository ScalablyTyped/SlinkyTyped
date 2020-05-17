package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fill style object for Graphics.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait FillStyle extends js.Object {
  /**
    * The alpha value used when filling the Graphics object.
    *
    * @member {number} PIXI.FillStyle#alpha
    * @default 1
    */
  var alpha: Double = js.native
  /**
    * The hex color value used when coloring the Graphics object.
    *
    * @member {number} PIXI.FillStyle#color
    * @default 1
    */
  var color: Double = js.native
  /**
    * The transform aplpied to the texture.
    *
    * @member {string} PIXI.FillStyle#matrix
    * @default 0
    */
  var matrix: String = js.native
  /**
    * The texture to be used for the fill.
    *
    * @member {string} PIXI.FillStyle#texture
    * @default 0
    */
  var texture: String = js.native
  /**
    * If the current fill is visible.
    *
    * @member {boolean} PIXI.FillStyle#visible
    * @default false
    */
  var visible: Boolean = js.native
  /**
    * Destroy and don't use after this
    */
  def destroy(): Unit = js.native
  /**
    * Reset
    */
  def reset(): Unit = js.native
}

object FillStyle {
  @scala.inline
  def apply(
    alpha: Double,
    color: Double,
    destroy: () => Unit,
    matrix: String,
    reset: () => Unit,
    texture: String,
    visible: Boolean
  ): FillStyle = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), matrix = matrix.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), texture = texture.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillStyle]
  }
  @scala.inline
  implicit class FillStyleOps[Self <: FillStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMatrix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTexture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

