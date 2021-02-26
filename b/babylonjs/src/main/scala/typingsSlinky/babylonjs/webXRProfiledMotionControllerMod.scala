package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.IMotionControllerProfile
import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRProfiledMotionControllerMod {
  
  @JSImport("babylonjs/XR/motionController/webXRProfiledMotionController", "WebXRProfiledMotionController")
  @js.native
  class WebXRProfiledMotionController protected () extends WebXRAbstractMotionController {
    def this(scene: Scene, xrInput: XRInputSource, _profile: IMotionControllerProfile, _repositoryUrl: String) = this()
    
    var _buttonMeshMapping: js.Any = js.native
    
    var _repositoryUrl: js.Any = js.native
    
    var _touchDots: js.Any = js.native
  }
}
