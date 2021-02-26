package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.mathVectorMod.Matrix
import typingsSlinky.babylonjs.mathVectorMod.Quaternion
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typingsSlinky.babylonjs.webXRHitTestLegacyMod.IWebXRLegacyHitResult
import typingsSlinky.babylonjs.webXRHitTestLegacyMod.IWebXRLegacyHitTestOptions
import typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRHitTestMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.babylonjs.sceneMod.IDisposable because Already inherited
  - typingsSlinky.babylonjs.webXRFeaturesManagerMod.IWebXRFeature because Already inherited
  - typingsSlinky.babylonjs.webXRHitTestLegacyMod.IWebXRHitTestFeature because var conflicts: attached, dependsOn, disableAutoAttach, isDisposed, xrNativeFeatureName. Inlined onHitTestResultObservable */ @JSImport("babylonjs/XR/features/WebXRHitTest", "WebXRHitTest")
  @js.native
  class WebXRHitTest protected () extends WebXRAbstractFeature {
    /**
      * Creates a new instance of the hit test feature
      * @param _xrSessionManager an instance of WebXRSessionManager
      * @param options options to use when constructing this feature
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    def this(
      _xrSessionManager: WebXRSessionManager,
      /**
      * options to use when constructing this feature
      */
    options: IWebXRHitTestOptions
    ) = this()
    
    var _processWebXRHitTestResult: js.Any = js.native
    
    var _tmpMat: js.Any = js.native
    
    var _tmpPos: js.Any = js.native
    
    var _tmpQuat: js.Any = js.native
    
    var _transientXrHitTestSource: js.Any = js.native
    
    var _xrHitTestSource: js.Any = js.native
    
    /**
      * When set to true, each hit test will have its own position/rotation objects
      * When set to false, position and rotation objects will be reused for each hit test. It is expected that
      * the developers will clone them or copy them as they see fit.
      */
    var autoCloneTransformation: Boolean = js.native
    
    var initHitTestSource: js.Any = js.native
    
    /**
      * Triggered when new babylon (transformed) hit test results are available
      * Note - this will be called when results come back from the device. It can be an empty array!!
      */
    var onHitTestResultObservable: Observable[js.Array[IWebXRHitResult]] = js.native
    
    /**
      * options to use when constructing this feature
      */
    val options: IWebXRHitTestOptions = js.native
    
    /**
      * Use this to temporarily pause hit test checks.
      */
    var paused: Boolean = js.native
  }
  /* static members */
  object WebXRHitTest {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRHitTest", "WebXRHitTest.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/WebXRHitTest", "WebXRHitTest.Version")
    @js.native
    val Version: Double = js.native
  }
  
  @js.native
  trait IWebXRHitResult extends IWebXRLegacyHitResult {
    
    /**
      * The input source that generated this hit test (if transient)
      */
    var inputSource: js.UndefOr[XRInputSource] = js.native
    
    /**
      * Is this a transient hit test
      */
    var isTransient: js.UndefOr[Boolean] = js.native
    
    /**
      * Position of the hit test result
      */
    var position: Vector3 = js.native
    
    /**
      * Rotation of the hit test result
      */
    var rotationQuaternion: Quaternion = js.native
    
    /**
      * The native hit test result
      */
    @JSName("xrHitResult")
    var xrHitResult_IWebXRHitResult: XRHitTestResult = js.native
  }
  object IWebXRHitResult {
    
    @scala.inline
    def apply(
      position: Vector3,
      rotationQuaternion: Quaternion,
      transformationMatrix: Matrix,
      xrHitResult: XRHitTestResult
    ): IWebXRHitResult = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], rotationQuaternion = rotationQuaternion.asInstanceOf[js.Any], transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrHitResult = xrHitResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRHitResult]
    }
    
    @scala.inline
    implicit class IWebXRHitResultMutableBuilder[Self <: IWebXRHitResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputSource(value: XRInputSource): Self = StObject.set(x, "inputSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputSourceUndefined: Self = StObject.set(x, "inputSource", js.undefined)
      
      @scala.inline
      def setIsTransient(value: Boolean): Self = StObject.set(x, "isTransient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTransientUndefined: Self = StObject.set(x, "isTransient", js.undefined)
      
      @scala.inline
      def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationQuaternion(value: Quaternion): Self = StObject.set(x, "rotationQuaternion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXrHitResult(value: XRHitTestResult): Self = StObject.set(x, "xrHitResult", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IWebXRHitTestOptions extends IWebXRLegacyHitTestOptions {
    
    /**
      * Do not create a permanent hit test. Will usually be used when only
      * transient inputs are needed.
      */
    var disablePermanentHitTest: js.UndefOr[Boolean] = js.native
    
    /**
      * Enable transient (for example touch-based) hit test inspections
      */
    var enableTransientHitTest: js.UndefOr[Boolean] = js.native
    
    /**
      * Override the default entity type(s) of the hit-test result
      */
    var entityTypes: js.UndefOr[js.Array[XRHitTestTrackableType]] = js.native
    
    /**
      * Offset ray for the permanent hit test
      */
    var offsetRay: js.UndefOr[Vector3] = js.native
    
    /**
      * Offset ray for the transient hit test
      */
    var transientOffsetRay: js.UndefOr[Vector3] = js.native
    
    /**
      * Instead of using viewer space for hit tests, use the reference space defined in the session manager
      */
    var useReferenceSpace: js.UndefOr[Boolean] = js.native
  }
  object IWebXRHitTestOptions {
    
    @scala.inline
    def apply(): IWebXRHitTestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWebXRHitTestOptions]
    }
    
    @scala.inline
    implicit class IWebXRHitTestOptionsMutableBuilder[Self <: IWebXRHitTestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisablePermanentHitTest(value: Boolean): Self = StObject.set(x, "disablePermanentHitTest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePermanentHitTestUndefined: Self = StObject.set(x, "disablePermanentHitTest", js.undefined)
      
      @scala.inline
      def setEnableTransientHitTest(value: Boolean): Self = StObject.set(x, "enableTransientHitTest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTransientHitTestUndefined: Self = StObject.set(x, "enableTransientHitTest", js.undefined)
      
      @scala.inline
      def setEntityTypes(value: js.Array[XRHitTestTrackableType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
      
      @scala.inline
      def setEntityTypesVarargs(value: XRHitTestTrackableType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
      
      @scala.inline
      def setOffsetRay(value: Vector3): Self = StObject.set(x, "offsetRay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetRayUndefined: Self = StObject.set(x, "offsetRay", js.undefined)
      
      @scala.inline
      def setTransientOffsetRay(value: Vector3): Self = StObject.set(x, "transientOffsetRay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransientOffsetRayUndefined: Self = StObject.set(x, "transientOffsetRay", js.undefined)
      
      @scala.inline
      def setUseReferenceSpace(value: Boolean): Self = StObject.set(x, "useReferenceSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseReferenceSpaceUndefined: Self = StObject.set(x, "useReferenceSpace", js.undefined)
    }
  }
}
