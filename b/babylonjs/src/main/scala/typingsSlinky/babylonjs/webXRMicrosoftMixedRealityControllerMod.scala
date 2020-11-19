package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.anon.Axes
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandness
import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/motionController/webXRMicrosoftMixedRealityController", JSImport.Namespace)
@js.native
object webXRMicrosoftMixedRealityControllerMod extends js.Object {
  
  @js.native
  class WebXRMicrosoftMixedRealityController protected () extends WebXRAbstractMotionController {
    def this(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: MotionControllerHandness) = this()
    
    val _mapping: Axes = js.native
    
    /* protected */ def _updateModel(): Unit = js.native
  }
  /* static members */
  @js.native
  object WebXRMicrosoftMixedRealityController extends js.Object {
    
    /**
      * The base url used to load the left and right controller models
      */
    var MODEL_BASE_URL: String = js.native
    
    /**
      * The name of the left controller model file
      */
    var MODEL_LEFT_FILENAME: String = js.native
    
    /**
      * The name of the right controller model file
      */
    var MODEL_RIGHT_FILENAME: String = js.native
  }
}
