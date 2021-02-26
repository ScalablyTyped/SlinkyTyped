package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.rayMod.Ray
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.WebXRAbstractMotionController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRInputSourceMod {
  
  @JSImport("babylonjs/XR/webXRInputSource", "WebXRInputSource")
  @js.native
  class WebXRInputSource protected () extends StObject {
    /**
      * Creates the input source object
      * @see https://doc.babylonjs.com/how_to/webxr_controllers_support
      * @param _scene the scene which the controller should be associated to
      * @param inputSource the underlying input source for the controller
      * @param _options options for this controller creation
      */
    def this(_scene: Scene, /** The underlying input source for the controller  */
    inputSource: XRInputSource) = this()
    def this(
      _scene: Scene,
      /** The underlying input source for the controller  */
    inputSource: XRInputSource,
      _options: IWebXRControllerOptions
    ) = this()
    
    var _disposed: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _tmpVector: js.Any = js.native
    
    var _uniqueId: js.Any = js.native
    
    /**
      * Disposes of the object
      */
    def dispose(): Unit = js.native
    
    /**
      * Gets a world space ray coming from the pointer or grip
      * @param result the resulting ray
      * @param gripIfAvailable use the grip mesh instead of the pointer, if available
      */
    def getWorldPointerRayToRef(result: Ray): Unit = js.native
    def getWorldPointerRayToRef(result: Ray, gripIfAvailable: Boolean): Unit = js.native
    
    /**
      * Represents the part of the controller that is held. This may not exist if the controller is the head mounted display itself, if thats the case only the pointer from the head will be availible
      */
    var grip: js.UndefOr[AbstractMesh] = js.native
    
    /** The underlying input source for the controller  */
    var inputSource: XRInputSource = js.native
    
    /**
      * If available, this is the gamepad object related to this controller.
      * Using this object it is possible to get click events and trackpad changes of the
      * webxr controller that is currently being used.
      */
    var motionController: js.UndefOr[WebXRAbstractMotionController] = js.native
    
    /**
      * Event that fires when the controller is removed/disposed.
      * The object provided as event data is this controller, after associated assets were disposed.
      * uniqueId is still available.
      */
    var onDisposeObservable: Observable[WebXRInputSource] = js.native
    
    /**
      * Will be triggered when the mesh associated with the motion controller is done loading.
      * It is also possible that this will never trigger (!) if no mesh was loaded, or if the developer decides to load a different mesh
      * A shortened version of controller -> motion controller -> on mesh loaded.
      */
    var onMeshLoadedObservable: Observable[AbstractMesh] = js.native
    
    /**
      * Observers registered here will trigger when a motion controller profile was assigned to this xr controller
      */
    var onMotionControllerInitObservable: Observable[WebXRAbstractMotionController] = js.native
    
    /**
      * Pointer which can be used to select objects or attach a visible laser to
      */
    var pointer: AbstractMesh = js.native
    
    /**
      * Get this controllers unique id
      */
    def uniqueId: String = js.native
    
    /**
      * Updates the controller pose based on the given XRFrame
      * @param xrFrame xr frame to update the pose with
      * @param referenceSpace reference space to use
      */
    def updateFromXRFrame(xrFrame: XRFrame, referenceSpace: XRReferenceSpace): Unit = js.native
  }
  
  @js.native
  trait IWebXRControllerOptions extends StObject {
    
    /**
      * Should the controller mesh be animated when a user interacts with it
      * The pressed buttons / thumbstick and touchpad animations will be disabled
      */
    var disableMotionControllerAnimation: js.UndefOr[Boolean] = js.native
    
    /**
      * Do not load the controller mesh, in case a different mesh needs to be loaded.
      */
    var doNotLoadControllerMesh: js.UndefOr[Boolean] = js.native
    
    /**
      * Force a specific controller type for this controller.
      * This can be used when creating your own profile or when testing different controllers
      */
    var forceControllerProfile: js.UndefOr[String] = js.native
    
    /**
      * Defines a rendering group ID for meshes that will be loaded.
      * This is for the default controllers only.
      */
    var renderingGroupId: js.UndefOr[Double] = js.native
  }
  object IWebXRControllerOptions {
    
    @scala.inline
    def apply(): IWebXRControllerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWebXRControllerOptions]
    }
    
    @scala.inline
    implicit class IWebXRControllerOptionsMutableBuilder[Self <: IWebXRControllerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableMotionControllerAnimation(value: Boolean): Self = StObject.set(x, "disableMotionControllerAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableMotionControllerAnimationUndefined: Self = StObject.set(x, "disableMotionControllerAnimation", js.undefined)
      
      @scala.inline
      def setDoNotLoadControllerMesh(value: Boolean): Self = StObject.set(x, "doNotLoadControllerMesh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoNotLoadControllerMeshUndefined: Self = StObject.set(x, "doNotLoadControllerMesh", js.undefined)
      
      @scala.inline
      def setForceControllerProfile(value: String): Self = StObject.set(x, "forceControllerProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceControllerProfileUndefined: Self = StObject.set(x, "forceControllerProfile", js.undefined)
      
      @scala.inline
      def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderingGroupIdUndefined: Self = StObject.set(x, "renderingGroupId", js.undefined)
    }
  }
}
