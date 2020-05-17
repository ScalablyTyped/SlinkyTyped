package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.HTMLCanvasElement
import typingsSlinky.babylonjs.XRWebGLLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebXRManagedOutputCanvasOptions extends js.Object {
  /**
    * An optional canvas in case you wish to create it yourself and provide it here.
    * If not provided, a new canvas will be created
    */
  var canvasElement: js.UndefOr[HTMLCanvasElement] = js.native
  /**
    * Options for this XR Layer output
    */
  var canvasOptions: js.UndefOr[XRWebGLLayerOptions] = js.native
  /**
    * CSS styling for a newly created canvas (if not provided)
    */
  var newCanvasCssStyle: js.UndefOr[String] = js.native
}

object WebXRManagedOutputCanvasOptions {
  @scala.inline
  def apply(): WebXRManagedOutputCanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebXRManagedOutputCanvasOptions]
  }
  @scala.inline
  implicit class WebXRManagedOutputCanvasOptionsOps[Self <: WebXRManagedOutputCanvasOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvasElement(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasElement")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvasOptions(value: XRWebGLLayerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNewCanvasCssStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCanvasCssStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewCanvasCssStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCanvasCssStyle")(js.undefined)
        ret
    }
  }
  
}

