package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.poseEnabledControllerMod.GamePadFactory
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gamepads/Controllers/index", JSImport.Namespace)
@js.native
object controllersIndexMod extends js.Object {
  
  @js.native
  class DaydreamController protected ()
    extends typingsSlinky.babylonjs.daydreamControllerMod.DaydreamController {
    /**
      * Creates a new DaydreamController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: js.Any) = this()
  }
  /* static members */
  @js.native
  object DaydreamController extends js.Object {
    
    /**
      * Gamepad Id prefix used to identify Daydream Controller.
      */
    val GAMEPAD_ID_PREFIX: String = js.native
    
    /**
      * Base Url for the controller model.
      */
    var MODEL_BASE_URL: String = js.native
    
    /**
      * File name for the controller model.
      */
    var MODEL_FILENAME: String = js.native
  }
  
  @js.native
  class GearVRController protected ()
    extends typingsSlinky.babylonjs.gearVRControllerMod.GearVRController {
    /**
      * Creates a new GearVRController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: js.Any) = this()
  }
  /* static members */
  @js.native
  object GearVRController extends js.Object {
    
    /**
      * Gamepad Id prefix used to identify this controller.
      */
    val GAMEPAD_ID_PREFIX: String = js.native
    
    /**
      * Base Url for the controller model.
      */
    var MODEL_BASE_URL: String = js.native
    
    /**
      * File name for the controller model.
      */
    var MODEL_FILENAME: String = js.native
  }
  
  @js.native
  class GenericController protected ()
    extends typingsSlinky.babylonjs.genericControllerMod.GenericController {
    /**
      * Creates a new GenericController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: js.Any) = this()
  }
  /* static members */
  @js.native
  object GenericController extends js.Object {
    
    /**
      * Base Url for the controller model.
      */
    val MODEL_BASE_URL: String = js.native
    
    /**
      * File name for the controller model.
      */
    val MODEL_FILENAME: String = js.native
  }
  
  @js.native
  class OculusTouchController protected ()
    extends typingsSlinky.babylonjs.oculusTouchControllerMod.OculusTouchController {
    /**
      * Creates a new OculusTouchController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: js.Any) = this()
  }
  /* static members */
  @js.native
  object OculusTouchController extends js.Object {
    
    /**
      * Base Url for the controller model.
      */
    var MODEL_BASE_URL: String = js.native
    
    /**
      * File name for the left controller model.
      */
    var MODEL_LEFT_FILENAME: String = js.native
    
    /**
      * File name for the right controller model.
      */
    var MODEL_RIGHT_FILENAME: String = js.native
    
    /**
      * Base Url for the Quest controller model.
      */
    var QUEST_MODEL_BASE_URL: String = js.native
    
    /**
      * @hidden
      * If the controllers are running on a device that needs the updated Quest controller models
      */
    var _IsQuest: Boolean = js.native
  }
  
  @js.native
  class PoseEnabledController protected ()
    extends typingsSlinky.babylonjs.poseEnabledControllerMod.PoseEnabledController {
    /**
      * Creates a new PoseEnabledController from a gamepad
      * @param browserGamepad the gamepad that the PoseEnabledController should be created from
      */
    def this(browserGamepad: js.Any) = this()
  }
  /* static members */
  @js.native
  object PoseEnabledController extends js.Object {
    
    /**
      * Name of the child mesh that can be used to cast a ray from the controller
      */
    val POINTING_POSE: String = js.native
  }
  
  @js.native
  class PoseEnabledControllerHelper ()
    extends typingsSlinky.babylonjs.poseEnabledControllerMod.PoseEnabledControllerHelper
  /* static members */
  @js.native
  object PoseEnabledControllerHelper extends js.Object {
    
    /**
      * Initializes a gamepad as the controller type it is specified as (eg. windows mixed reality controller)
      * @param vrGamepad the gamepad to initialized
      * @returns a vr controller of the type the gamepad identified as
      */
    def InitiateController(vrGamepad: js.Any): typingsSlinky.babylonjs.gamepadMod.Gamepad = js.native
    
    /** @hidden */
    var _ControllerFactories: js.Array[GamePadFactory] = js.native
    
    /** @hidden */
    var _DefaultControllerFactory: Nullable[js.Function1[/* gamepadInfo */ _, typingsSlinky.babylonjs.gamepadMod.Gamepad]] = js.native
  }
  
  @js.native
  object PoseEnabledControllerType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.babylonjs.poseEnabledControllerMod.PoseEnabledControllerType with Double
      ] = js.native
    
    /* 4 */ val DAYDREAM: typingsSlinky.babylonjs.poseEnabledControllerMod.PoseEnabledControllerType.DAYDREAM with Double = js.native
    
    /* 3 */ val GEAR_VR: typingsSlinky.babylonjs.poseEnabledControllerMod.PoseEnabledControllerType.GEAR_VR with Double = js.native
    
    /* 5 */ val GENERIC: typingsSlinky.babylonjs.poseEnabledControllerMod.PoseEnabledControllerType.GENERIC with Double = js.native
    
    /* 1 */ val OCULUS: typingsSlinky.babylonjs.poseEnabledControllerMod.PoseEnabledControllerType.OCULUS with Double = js.native
    
    /* 0 */ val VIVE: typingsSlinky.babylonjs.poseEnabledControllerMod.PoseEnabledControllerType.VIVE with Double = js.native
    
    /* 2 */ val WINDOWS: typingsSlinky.babylonjs.poseEnabledControllerMod.PoseEnabledControllerType.WINDOWS with Double = js.native
  }
  
  @js.native
  class ViveController protected ()
    extends typingsSlinky.babylonjs.viveControllerMod.ViveController {
    /**
      * Creates a new ViveController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: js.Any) = this()
  }
  /* static members */
  @js.native
  object ViveController extends js.Object {
    
    /**
      * Base Url for the controller model.
      */
    var MODEL_BASE_URL: String = js.native
    
    /**
      * File name for the controller model.
      */
    var MODEL_FILENAME: String = js.native
  }
  
  @js.native
  abstract class WebVRController protected ()
    extends typingsSlinky.babylonjs.webVRControllerMod.WebVRController {
    /**
      * Creates a new WebVRController from a gamepad
      * @param vrGamepad the gamepad that the WebVRController should be created from
      */
    def this(vrGamepad: js.Any) = this()
  }
  
  @js.native
  class WindowsMotionController protected ()
    extends typingsSlinky.babylonjs.windowsMotionControllerMod.WindowsMotionController {
    /**
      * Creates a new WindowsMotionController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: js.Any) = this()
  }
  /* static members */
  @js.native
  object WindowsMotionController extends js.Object {
    
    /**
      * The controller id pattern for this controller type
      */
    val GAMEPAD_ID_PATTERN: js.Any = js.native
    
    /**
      * The controller name prefix for this controller type
      */
    val GAMEPAD_ID_PREFIX: String = js.native
    
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
  
  @js.native
  class XRWindowsMotionController protected ()
    extends typingsSlinky.babylonjs.windowsMotionControllerMod.XRWindowsMotionController {
    /**
      * Construct a new XR-Based windows motion controller
      *
      * @param gamepadInfo the gamepad object from the browser
      */
    def this(gamepadInfo: js.Any) = this()
  }
}
