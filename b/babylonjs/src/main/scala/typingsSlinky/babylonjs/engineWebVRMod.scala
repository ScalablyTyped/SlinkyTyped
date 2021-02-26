package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.engineMod.IDisplayChangedEventArgs
import typingsSlinky.babylonjs.mathSizeMod.Size
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.babylonjs.webVRCameraMod.WebVROptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineWebVRMod {
  
  @js.native
  trait IVRPresentationAttributes extends StObject {
    
    /**
      * Enables foveation in VR to improve perf. 0 none, 1 low, 2 medium, 3 high (Default is 1)
      */
    var foveationLevel: Double = js.native
    
    /**
      * Defines a boolean indicating that we want to get 72hz mode on Oculus Browser (default is off eg. 60hz)
      */
    var highRefreshRate: Boolean = js.native
  }
  object IVRPresentationAttributes {
    
    @scala.inline
    def apply(foveationLevel: Double, highRefreshRate: Boolean): IVRPresentationAttributes = {
      val __obj = js.Dynamic.literal(foveationLevel = foveationLevel.asInstanceOf[js.Any], highRefreshRate = highRefreshRate.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVRPresentationAttributes]
    }
    
    @scala.inline
    implicit class IVRPresentationAttributesMutableBuilder[Self <: IVRPresentationAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFoveationLevel(value: Double): Self = StObject.set(x, "foveationLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighRefreshRate(value: Boolean): Self = StObject.set(x, "highRefreshRate", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    @js.native
    trait Engine extends StObject {
      
      /** @hidden */
      def _getVRDisplaysAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
      
      /** @hidden */
      var _oldHardwareScaleFactor: Double = js.native
      
      /** @hidden */
      var _oldSize: Size = js.native
      
      /** @hidden */
      def _onVRDisplayPointerRestricted(): Unit = js.native
      
      /** @hidden */
      def _onVRDisplayPointerUnrestricted(): Unit = js.native
      
      /** @hidden */
      def _onVRFullScreenTriggered(): Unit = js.native
      
      /** @hidden */
      var _onVrDisplayConnect: Nullable[js.Function1[/* display */ _, Unit]] = js.native
      
      /** @hidden */
      var _onVrDisplayDisconnect: Nullable[js.Function0[Unit]] = js.native
      
      /** @hidden */
      var _onVrDisplayPresentChange: Nullable[js.Function0[Unit]] = js.native
      
      /** @hidden */
      var _vrDisplay: js.Any = js.native
      
      /** @hidden */
      var _vrExclusivePointerMode: Boolean = js.native
      
      /** @hidden */
      var _vrSupported: Boolean = js.native
      
      /** @hidden */
      var _webVRInitPromise: js.Promise[IDisplayChangedEventArgs] = js.native
      
      /**
        * Call this function to switch to webVR mode
        * Will do nothing if webVR is not supported or if there is no webVR device
        * @param options the webvr options provided to the camera. mainly used for multiview
        * @see https://doc.babylonjs.com/how_to/webvr_camera
        */
      def enableVR(options: WebVROptions): Unit = js.native
      
      /**
        * Gets the current webVR device
        * @returns the current webVR device (or null)
        */
      def getVRDevice(): js.Any = js.native
      
      /**
        * Initializes a webVR display and starts listening to display change events
        * The onVRDisplayChangedObservable will be notified upon these changes
        * @returns A promise containing a VRDisplay and if vr is supported
        */
      def initWebVRAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
      
      /**
        * Gets a boolean indicating that the engine is currently in VR exclusive mode for the pointers
        * @see https://docs.microsoft.com/en-us/microsoft-edge/webvr/essentials#mouse-input
        */
      var isInVRExclusivePointerMode: Boolean = js.native
      
      /**
        * Gets a boolean indicating if a webVR device was detected
        * @returns true if a webVR device was detected
        */
      def isVRDevicePresent(): Boolean = js.native
      
      /**
        * Observable signaled when VR display mode changes
        */
      var onVRDisplayChangedObservable: Observable[IDisplayChangedEventArgs] = js.native
      
      /**
        * Observable signaled when VR request present is complete
        */
      var onVRRequestPresentComplete: Observable[Boolean] = js.native
      
      /**
        * Observable signaled when VR request present starts
        */
      var onVRRequestPresentStart: Observable[Engine] = js.native
      
      /**
        * Gets or sets the presentation attributes used to configure VR rendering
        */
      var vrPresentationAttributes: js.UndefOr[IVRPresentationAttributes] = js.native
    }
    object Engine {
      
      @scala.inline
      def apply(
        _getVRDisplaysAsync: () => js.Promise[IDisplayChangedEventArgs],
        _oldHardwareScaleFactor: Double,
        _oldSize: Size,
        _onVRDisplayPointerRestricted: () => Unit,
        _onVRDisplayPointerUnrestricted: () => Unit,
        _onVRFullScreenTriggered: () => Unit,
        _vrDisplay: js.Any,
        _vrExclusivePointerMode: Boolean,
        _vrSupported: Boolean,
        _webVRInitPromise: js.Promise[IDisplayChangedEventArgs],
        enableVR: WebVROptions => Unit,
        getVRDevice: () => js.Any,
        initWebVRAsync: () => js.Promise[IDisplayChangedEventArgs],
        isInVRExclusivePointerMode: Boolean,
        isVRDevicePresent: () => Boolean,
        onVRDisplayChangedObservable: Observable[IDisplayChangedEventArgs],
        onVRRequestPresentComplete: Observable[Boolean],
        onVRRequestPresentStart: Observable[Engine]
      ): Engine = {
        val __obj = js.Dynamic.literal(_getVRDisplaysAsync = js.Any.fromFunction0(_getVRDisplaysAsync), _oldHardwareScaleFactor = _oldHardwareScaleFactor.asInstanceOf[js.Any], _oldSize = _oldSize.asInstanceOf[js.Any], _onVRDisplayPointerRestricted = js.Any.fromFunction0(_onVRDisplayPointerRestricted), _onVRDisplayPointerUnrestricted = js.Any.fromFunction0(_onVRDisplayPointerUnrestricted), _onVRFullScreenTriggered = js.Any.fromFunction0(_onVRFullScreenTriggered), _vrDisplay = _vrDisplay.asInstanceOf[js.Any], _vrExclusivePointerMode = _vrExclusivePointerMode.asInstanceOf[js.Any], _vrSupported = _vrSupported.asInstanceOf[js.Any], _webVRInitPromise = _webVRInitPromise.asInstanceOf[js.Any], enableVR = js.Any.fromFunction1(enableVR), getVRDevice = js.Any.fromFunction0(getVRDevice), initWebVRAsync = js.Any.fromFunction0(initWebVRAsync), isInVRExclusivePointerMode = isInVRExclusivePointerMode.asInstanceOf[js.Any], isVRDevicePresent = js.Any.fromFunction0(isVRDevicePresent), onVRDisplayChangedObservable = onVRDisplayChangedObservable.asInstanceOf[js.Any], onVRRequestPresentComplete = onVRRequestPresentComplete.asInstanceOf[js.Any], onVRRequestPresentStart = onVRRequestPresentStart.asInstanceOf[js.Any])
        __obj.asInstanceOf[Engine]
      }
      
      @scala.inline
      implicit class EngineMutableBuilder[Self <: Engine] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnableVR(value: WebVROptions => Unit): Self = StObject.set(x, "enableVR", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetVRDevice(value: () => js.Any): Self = StObject.set(x, "getVRDevice", js.Any.fromFunction0(value))
        
        @scala.inline
        def setInitWebVRAsync(value: () => js.Promise[IDisplayChangedEventArgs]): Self = StObject.set(x, "initWebVRAsync", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsInVRExclusivePointerMode(value: Boolean): Self = StObject.set(x, "isInVRExclusivePointerMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsVRDevicePresent(value: () => Boolean): Self = StObject.set(x, "isVRDevicePresent", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnVRDisplayChangedObservable(value: Observable[IDisplayChangedEventArgs]): Self = StObject.set(x, "onVRDisplayChangedObservable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnVRRequestPresentComplete(value: Observable[Boolean]): Self = StObject.set(x, "onVRRequestPresentComplete", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnVRRequestPresentStart(value: Observable[Engine]): Self = StObject.set(x, "onVRRequestPresentStart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVrPresentationAttributes(value: IVRPresentationAttributes): Self = StObject.set(x, "vrPresentationAttributes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVrPresentationAttributesUndefined: Self = StObject.set(x, "vrPresentationAttributes", js.undefined)
        
        @scala.inline
        def set_getVRDisplaysAsync(value: () => js.Promise[IDisplayChangedEventArgs]): Self = StObject.set(x, "_getVRDisplaysAsync", js.Any.fromFunction0(value))
        
        @scala.inline
        def set_oldHardwareScaleFactor(value: Double): Self = StObject.set(x, "_oldHardwareScaleFactor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_oldSize(value: Size): Self = StObject.set(x, "_oldSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_onVRDisplayPointerRestricted(value: () => Unit): Self = StObject.set(x, "_onVRDisplayPointerRestricted", js.Any.fromFunction0(value))
        
        @scala.inline
        def set_onVRDisplayPointerUnrestricted(value: () => Unit): Self = StObject.set(x, "_onVRDisplayPointerUnrestricted", js.Any.fromFunction0(value))
        
        @scala.inline
        def set_onVRFullScreenTriggered(value: () => Unit): Self = StObject.set(x, "_onVRFullScreenTriggered", js.Any.fromFunction0(value))
        
        @scala.inline
        def set_onVrDisplayConnect(value: /* display */ _ => Unit): Self = StObject.set(x, "_onVrDisplayConnect", js.Any.fromFunction1(value))
        
        @scala.inline
        def set_onVrDisplayConnectNull: Self = StObject.set(x, "_onVrDisplayConnect", null)
        
        @scala.inline
        def set_onVrDisplayDisconnect(value: () => Unit): Self = StObject.set(x, "_onVrDisplayDisconnect", js.Any.fromFunction0(value))
        
        @scala.inline
        def set_onVrDisplayDisconnectNull: Self = StObject.set(x, "_onVrDisplayDisconnect", null)
        
        @scala.inline
        def set_onVrDisplayPresentChange(value: () => Unit): Self = StObject.set(x, "_onVrDisplayPresentChange", js.Any.fromFunction0(value))
        
        @scala.inline
        def set_onVrDisplayPresentChangeNull: Self = StObject.set(x, "_onVrDisplayPresentChange", null)
        
        @scala.inline
        def set_vrDisplay(value: js.Any): Self = StObject.set(x, "_vrDisplay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_vrExclusivePointerMode(value: Boolean): Self = StObject.set(x, "_vrExclusivePointerMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_vrSupported(value: Boolean): Self = StObject.set(x, "_vrSupported", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_webVRInitPromise(value: js.Promise[IDisplayChangedEventArgs]): Self = StObject.set(x, "_webVRInitPromise", value.asInstanceOf[js.Any])
      }
    }
  }
}
