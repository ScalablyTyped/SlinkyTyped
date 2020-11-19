package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.anon.Friction
import typingsSlinky.babylonjs.anon.ImpostorSize
import typingsSlinky.babylonjs.anon.ImpostorType
import typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostor
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typingsSlinky.babylonjs.webXRInputMod.WebXRInput
import typingsSlinky.babylonjs.webXRInputSourceMod.WebXRInputSource
import typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/WebXRControllerPhysics", JSImport.Namespace)
@js.native
object webXRControllerPhysicsMod extends js.Object {
  
  @js.native
  class IWebXRControllerPhysicsOptions () extends js.Object {
    
    /**
      * Should the headset get its own impostor
      */
    var enableHeadsetImpostor: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional parameters for the headset impostor
      */
    var headsetImpostorParams: js.UndefOr[Friction] = js.native
    
    /**
      * The physics properties of the future impostors
      */
    var physicsProperties: js.UndefOr[ImpostorSize] = js.native
    
    /**
      * the xr input to use with this pointer selection
      */
    var xrInput: WebXRInput = js.native
  }
  
  @js.native
  class WebXRControllerPhysics protected () extends WebXRAbstractFeature {
    /**
      * Construct a new Controller Physics Feature
      * @param _xrSessionManager the corresponding xr session manager
      * @param _options options to create this feature with
      */
    def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRControllerPhysicsOptions) = this()
    
    var _attachController: js.Any = js.native
    
    var _controllers: js.Any = js.native
    
    var _debugMode: js.Any = js.native
    
    var _delta: js.Any = js.native
    
    var _detachController: js.Any = js.native
    
    /**
      * @hidden
      * enable debugging - will show console outputs and the impostor mesh
      */
    def _enablePhysicsDebug(): Unit = js.native
    
    var _headsetImpostor: js.Any = js.native
    
    var _headsetMesh: js.Any = js.native
    
    var _lastTimestamp: js.Any = js.native
    
    /* protected */ def _onXRFrame(_xrFrame: js.Any): Unit = js.native
    
    val _options: js.Any = js.native
    
    var _tmpQuaternion: js.Any = js.native
    
    var _tmpVector: js.Any = js.native
    
    /**
      * Manually add a controller (if no xrInput was provided or physics engine was not enabled)
      * @param xrController the controller to add
      */
    def addController(xrController: WebXRInputSource): Unit = js.native
    
    /**
      * Get the headset impostor, if enabled
      * @returns the impostor
      */
    def getHeadsetImpostor(): js.UndefOr[PhysicsImpostor] = js.native
    
    def getImpostorForController(controller: String): Nullable[PhysicsImpostor] = js.native
    /**
      * Get the physics impostor of a specific controller.
      * The impostor is not attached to a mesh because a mesh for each controller is not obligatory
      * @param controller the controller or the controller id of which to get the impostor
      * @returns the impostor or null
      */
    def getImpostorForController(controller: WebXRInputSource): Nullable[PhysicsImpostor] = js.native
    
    /**
      * Update the physics properties provided in the constructor
      * @param newProperties the new properties object
      */
    def setPhysicsProperties(newProperties: ImpostorType): Unit = js.native
  }
  /* static members */
  @js.native
  object WebXRControllerPhysics extends js.Object {
    
    /**
      * The module's name
      */
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the webxr specs version
      */
    val Version: Double = js.native
  }
}
