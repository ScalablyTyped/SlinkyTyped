package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.WebGLRenderingContext
import typingsSlinky.babylonjs.XRSession
import typingsSlinky.babylonjs.XRWebGLLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRRenderTarget extends IDisposable {
  
  /**
    * xrpresent context of the canvas which can be used to display/mirror xr content
    */
  var canvasContext: WebGLRenderingContext = js.native
  
  /**
    * Initializes the xr layer for the session
    * @param xrSession xr session
    * @returns a promise that will resolve once the XR Layer has been created
    */
  def initializeXRLayerAsync(xrSession: XRSession): js.Promise[XRWebGLLayer] = js.native
  
  /**
    * xr layer for the canvas
    */
  var xrLayer: Nullable[XRWebGLLayer] = js.native
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
  implicit class WebXRRenderTargetMutableBuilder[Self <: WebXRRenderTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvasContext(value: WebGLRenderingContext): Self = StObject.set(x, "canvasContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializeXRLayerAsync(value: XRSession => js.Promise[XRWebGLLayer]): Self = StObject.set(x, "initializeXRLayerAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXrLayer(value: Nullable[XRWebGLLayer]): Self = StObject.set(x, "xrLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrLayerNull: Self = StObject.set(x, "xrLayer", null)
  }
}
