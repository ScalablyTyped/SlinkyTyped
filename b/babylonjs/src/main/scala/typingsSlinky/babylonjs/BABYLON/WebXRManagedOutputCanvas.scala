package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.WebGLRenderingContext
import typingsSlinky.babylonjs.XRSession
import typingsSlinky.babylonjs.XRWebGLLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebXRManagedOutputCanvas extends WebXRRenderTarget {
  var _addCanvas: js.Any = js.native
  var _canvas: js.Any = js.native
  var _engine: js.Any = js.native
  var _options: js.Any = js.native
  var _removeCanvas: js.Any = js.native
  var _setManagedOutputCanvas: js.Any = js.native
}

object WebXRManagedOutputCanvas {
  @scala.inline
  def apply(
    _addCanvas: js.Any,
    _canvas: js.Any,
    _engine: js.Any,
    _options: js.Any,
    _removeCanvas: js.Any,
    _setManagedOutputCanvas: js.Any,
    canvasContext: WebGLRenderingContext,
    dispose: () => Unit,
    initializeXRLayerAsync: XRSession => js.Promise[XRWebGLLayer]
  ): WebXRManagedOutputCanvas = {
    val __obj = js.Dynamic.literal(_addCanvas = _addCanvas.asInstanceOf[js.Any], _canvas = _canvas.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _removeCanvas = _removeCanvas.asInstanceOf[js.Any], _setManagedOutputCanvas = _setManagedOutputCanvas.asInstanceOf[js.Any], canvasContext = canvasContext.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), initializeXRLayerAsync = js.Any.fromFunction1(initializeXRLayerAsync))
    __obj.asInstanceOf[WebXRManagedOutputCanvas]
  }
  @scala.inline
  implicit class WebXRManagedOutputCanvasOps[Self <: WebXRManagedOutputCanvas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_addCanvas(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_addCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_canvas(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_engine(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_options(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_removeCanvas(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_removeCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setManagedOutputCanvas(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setManagedOutputCanvas")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

