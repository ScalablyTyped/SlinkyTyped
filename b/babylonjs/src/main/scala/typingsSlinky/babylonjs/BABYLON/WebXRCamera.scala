package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRCamera extends FreeCamera {
  
  var _firstFrame: js.Any = js.native
  
  var _referenceQuaternion: js.Any = js.native
  
  var _referencedPosition: js.Any = js.native
  
  /** @hidden */
  def _updateForDualEyeDebugging(): Unit = js.native
  
  var _updateFromXRSession: js.Any = js.native
  
  var _updateNumberOfRigCameras: js.Any = js.native
  
  var _updateReferenceSpace: js.Any = js.native
  
  var _updateReferenceSpaceOffset: js.Any = js.native
  
  var _xrInvPositionCache: js.Any = js.native
  
  var _xrInvQuaternionCache: js.Any = js.native
  
  var _xrSessionManager: js.Any = js.native
  
  /**
    * Should position compensation execute on first frame.
    * This is used when copying the position from a native (non XR) camera
    */
  var compensateOnFirstFrame: Boolean = js.native
  
  /**
    * Return the user's height, unrelated to the current ground.
    * This will be the y position of this camera, when ground level is 0.
    */
  def realWorldHeight: Double = js.native
  
  /**
    * Sets this camera's transformation based on a non-vr camera
    * @param otherCamera the non-vr camera to copy the transformation from
    * @param resetToBaseReferenceSpace should XR reset to the base reference space
    */
  def setTransformationFromNonVRCamera(): Unit = js.native
  def setTransformationFromNonVRCamera(otherCamera: js.UndefOr[scala.Nothing], resetToBaseReferenceSpace: Boolean): Unit = js.native
  def setTransformationFromNonVRCamera(otherCamera: Camera): Unit = js.native
  def setTransformationFromNonVRCamera(otherCamera: Camera, resetToBaseReferenceSpace: Boolean): Unit = js.native
}
