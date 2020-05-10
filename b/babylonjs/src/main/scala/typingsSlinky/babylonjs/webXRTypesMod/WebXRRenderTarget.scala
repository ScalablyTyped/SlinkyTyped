package typingsSlinky.babylonjs.webXRTypesMod

import typingsSlinky.babylonjs.WebGLRenderingContext
import typingsSlinky.babylonjs.XRSession
import typingsSlinky.babylonjs.XRWebGLLayer
import typingsSlinky.babylonjs.sceneMod.IDisposable
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebXRRenderTarget extends IDisposable {
  /**
    * xrpresent context of the canvas which can be used to display/mirror xr content
    */
  var canvasContext: WebGLRenderingContext = js.native
  /**
    * xr layer for the canvas
    */
  var xrLayer: Nullable[XRWebGLLayer] = js.native
  /**
    * Initializes the xr layer for the session
    * @param xrSession xr session
    * @returns a promise that will resolve once the XR Layer has been created
    */
  def initializeXRLayerAsync(xrSession: XRSession): js.Promise[XRWebGLLayer] = js.native
}

object WebXRRenderTarget {
  @scala.inline
  def apply(
    canvasContext: WebGLRenderingContext,
    dispose: () => Unit,
    initializeXRLayerAsync: XRSession => js.Promise[XRWebGLLayer]
  ): WebXRRenderTarget = {
    val __obj = js.Dynamic.literal(canvasContext = canvasContext.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), initializeXRLayerAsync = js.Any.fromFunction1(initializeXRLayerAsync))
    __obj.asInstanceOf[WebXRRenderTarget]
  }
  @scala.inline
  implicit class WebXRRenderTargetOps[Self <: WebXRRenderTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvasContext(value: WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitializeXRLayerAsync(value: XRSession => js.Promise[XRWebGLLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializeXRLayerAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXrLayer(value: Nullable[XRWebGLLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xrLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXrLayerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xrLayer")(null)
        ret
    }
  }
  
}

