package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import typingsSlinky.babylonjs.webXRTypesMod.WebXRRenderTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/webXRManagedOutputCanvas", JSImport.Namespace)
@js.native
object webXRManagedOutputCanvasMod extends js.Object {
  
  @js.native
  class WebXRManagedOutputCanvas protected () extends WebXRRenderTarget {
    /**
      * Initializes the canvas to be added/removed upon entering/exiting xr
      * @param _xrSessionManager The XR Session manager
      * @param _options optional configuration for this canvas output. defaults will be used if not provided
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    def this(_xrSessionManager: WebXRSessionManager, _options: WebXRManagedOutputCanvasOptions) = this()
    
    var _addCanvas: js.Any = js.native
    
    var _canvas: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _removeCanvas: js.Any = js.native
    
    var _setManagedOutputCanvas: js.Any = js.native
  }
  
  @js.native
  class WebXRManagedOutputCanvasOptions () extends js.Object {
    
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
  /* static members */
  @js.native
  object WebXRManagedOutputCanvasOptions extends js.Object {
    
    /**
      * Get the default values of the configuration object
      * @returns default values of this configuration object
      */
    def GetDefaults(): WebXRManagedOutputCanvasOptions = js.native
  }
}
