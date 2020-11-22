package typingsSlinky.babylonjs.webXRAnchorSystemMod

import typingsSlinky.babylonjs.XRReferenceSpace
import typingsSlinky.babylonjs.mathVectorMod.Quaternion
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typingsSlinky.babylonjs.webXRHitTestMod.IWebXRHitResult
import typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/WebXRAnchorSystem", "WebXRAnchorSystem")
@js.native
class WebXRAnchorSystem protected () extends WebXRAbstractFeature {
  /**
    * constructs a new anchor system
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param _options configuration object for this feature
    */
  def this(_xrSessionManager: WebXRSessionManager) = this()
  def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRAnchorSystemOptions) = this()
  
  var _createAnchorAtTransformation: js.Any = js.native
  
  /**
    * avoiding using Array.find for global support.
    * @param xrAnchor the plane to find in the array
    */
  var _findIndexInAnchorArray: js.Any = js.native
  
  var _futureAnchors: js.Any = js.native
  
  var _lastFrameDetected: js.Any = js.native
  
  var _options: js.Any = js.native
  
  var _populateTmpTransformation: js.Any = js.native
  
  var _referenceSpaceForFrameAnchors: js.Any = js.native
  
  var _tmpQuaternion: js.Any = js.native
  
  var _tmpVector: js.Any = js.native
  
  var _trackedAnchors: js.Any = js.native
  
  var _updateAnchorWithXRFrame: js.Any = js.native
  
  /**
    * Add a new anchor at a specific position and rotation
    * This function will add a new anchor per default in the next available frame. Unless forced, the createAnchor function
    * will be called in the next xrFrame loop to make sure that the anchor can be created correctly.
    * An anchor is tracked only after it is added to the trackerAnchors in xrFrame. The promise returned here does not yet guaranty that.
    * Use onAnchorAddedObservable to get newly added anchors if you require tracking guaranty.
    *
    * @param position the position in which to add an anchor
    * @param rotationQuaternion an optional rotation for the anchor transformation
    * @param forceCreateInCurrentFrame force the creation of this anchor in the current frame. Must be called inside xrFrame loop!
    * @returns A promise that fulfills when babylon has created the corresponding WebXRAnchor object and tracking has begun
    */
  def addAnchorAtPositionAndRotationAsync(position: Vector3): js.Promise[IWebXRAnchor] = js.native
  def addAnchorAtPositionAndRotationAsync(
    position: Vector3,
    rotationQuaternion: js.UndefOr[scala.Nothing],
    forceCreateInCurrentFrame: Boolean
  ): js.Promise[IWebXRAnchor] = js.native
  def addAnchorAtPositionAndRotationAsync(position: Vector3, rotationQuaternion: Quaternion): js.Promise[IWebXRAnchor] = js.native
  def addAnchorAtPositionAndRotationAsync(position: Vector3, rotationQuaternion: Quaternion, forceCreateInCurrentFrame: Boolean): js.Promise[IWebXRAnchor] = js.native
  
  /**
    * Create a new anchor point using a hit test result at a specific point in the scene
    * An anchor is tracked only after it is added to the trackerAnchors in xrFrame. The promise returned here does not yet guaranty that.
    * Use onAnchorAddedObservable to get newly added anchors if you require tracking guaranty.
    *
    * @param hitTestResult The hit test result to use for this anchor creation
    * @param position an optional position offset for this anchor
    * @param rotationQuaternion an optional rotation offset for this anchor
    * @returns A promise that fulfills when babylon has created the corresponding WebXRAnchor object and tracking has begun
    */
  def addAnchorPointUsingHitTestResultAsync(hitTestResult: IWebXRHitResult): js.Promise[IWebXRAnchor] = js.native
  def addAnchorPointUsingHitTestResultAsync(
    hitTestResult: IWebXRHitResult,
    position: js.UndefOr[scala.Nothing],
    rotationQuaternion: Quaternion
  ): js.Promise[IWebXRAnchor] = js.native
  def addAnchorPointUsingHitTestResultAsync(hitTestResult: IWebXRHitResult, position: Vector3): js.Promise[IWebXRAnchor] = js.native
  def addAnchorPointUsingHitTestResultAsync(hitTestResult: IWebXRHitResult, position: Vector3, rotationQuaternion: Quaternion): js.Promise[IWebXRAnchor] = js.native
  
  /**
    * Get the list of anchors currently being tracked by the system
    */
  def anchors: js.Array[IWebXRAnchor] = js.native
  
  /**
    * Observers registered here will be executed when a new anchor was added to the session
    */
  var onAnchorAddedObservable: Observable[IWebXRAnchor] = js.native
  
  /**
    * Observers registered here will be executed when an anchor was removed from the session
    */
  var onAnchorRemovedObservable: Observable[IWebXRAnchor] = js.native
  
  /**
    * Observers registered here will be executed when an existing anchor updates
    * This can execute N times every frame
    */
  var onAnchorUpdatedObservable: Observable[IWebXRAnchor] = js.native
  
  /**
    * Set the reference space to use for anchor creation, when not using a hit test.
    * Will default to the session's reference space if not defined
    */
  def referenceSpaceForFrameAnchors_=(referenceSpace: XRReferenceSpace): Unit = js.native
}
/* static members */
@JSImport("babylonjs/XR/features/WebXRAnchorSystem", "WebXRAnchorSystem")
@js.native
object WebXRAnchorSystem extends js.Object {
  
  /**
    * The module's name
    */
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  val Version: Double = js.native
}
