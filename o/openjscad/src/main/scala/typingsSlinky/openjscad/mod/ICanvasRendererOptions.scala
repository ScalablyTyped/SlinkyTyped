package typingsSlinky.openjscad.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  function OrbitControls(object: any, domElement: any): void;
  function SpriteCanvasMaterial(parameters?: any): void;
  */
@js.native
trait ICanvasRendererOptions extends js.Object {
  var alpha: js.UndefOr[Boolean] = js.native
  var canvas: js.UndefOr[HTMLCanvasElement] = js.native
}

object ICanvasRendererOptions {
  @scala.inline
  def apply(): ICanvasRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICanvasRendererOptions]
  }
  @scala.inline
  implicit class ICanvasRendererOptionsOps[Self <: ICanvasRendererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
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
  }
  
}

