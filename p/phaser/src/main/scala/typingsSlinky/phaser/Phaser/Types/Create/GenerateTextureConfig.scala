package typingsSlinky.phaser.Phaser.Types.Create

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateTextureConfig extends js.Object {
  /**
    * [description]
    */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.native
  /**
    * [description]
    */
  var clearCanvas: js.UndefOr[Boolean] = js.native
  /**
    * [description]
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * [description]
    */
  var palette: js.UndefOr[Palette] = js.native
  /**
    * The height of each 'pixel' in the generated texture.
    */
  var pixelHeight: js.UndefOr[Double] = js.native
  /**
    * The width of each 'pixel' in the generated texture.
    */
  var pixelWidth: js.UndefOr[Double] = js.native
  /**
    * [description]
    */
  var postRender: js.UndefOr[GenerateTextureCallback] = js.native
  /**
    * [description]
    */
  var preRender: js.UndefOr[GenerateTextureCallback] = js.native
  /**
    * [description]
    */
  var resizeCanvas: js.UndefOr[Boolean] = js.native
}

object GenerateTextureConfig {
  @scala.inline
  def apply(): GenerateTextureConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateTextureConfig]
  }
  @scala.inline
  implicit class GenerateTextureConfigOps[Self <: GenerateTextureConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvas(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(js.undefined)
        ret
    }
    @scala.inline
    def withClearCanvas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCanvas")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(value: Palette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPostRender(value: (/* canvas */ HTMLCanvasElement, /* context */ CanvasRenderingContext2D) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPostRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postRender")(js.undefined)
        ret
    }
    @scala.inline
    def withPreRender(value: (/* canvas */ HTMLCanvasElement, /* context */ CanvasRenderingContext2D) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPreRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRender")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeCanvas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeCanvas")(js.undefined)
        ret
    }
  }
  
}

