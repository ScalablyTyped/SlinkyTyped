package typingsSlinky.expo.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.expo.aRMod.ARFrame
import typingsSlinky.expo.aRMod.ARFrameRequest
import typingsSlinky.expo.aRMod.ARMatrices
import typingsSlinky.expo.aRMod.ARStartResult
import typingsSlinky.expo.aRMod.AnchorsDidUpdateEvent
import typingsSlinky.expo.aRMod.CameraDidChangeTrackingStateEvent
import typingsSlinky.expo.aRMod.DetectionImage
import typingsSlinky.expo.aRMod.DidFailWithErrorEvent
import typingsSlinky.expo.aRMod.EventType
import typingsSlinky.expo.aRMod.FrameDidUpdateEvent
import typingsSlinky.expo.aRMod.HitTestResultTypes
import typingsSlinky.expo.aRMod.HitTestResults
import typingsSlinky.expo.aRMod.Matrix
import typingsSlinky.expo.aRMod.PlaneDetection
import typingsSlinky.expo.aRMod.ReactNativeNodeHandle
import typingsSlinky.expo.aRMod.SessionInterruptionEndedEvent
import typingsSlinky.expo.aRMod.SessionWasInterruptedEvent
import typingsSlinky.expo.aRMod.TrackingConfiguration
import typingsSlinky.expo.aRMod.Vector2
import typingsSlinky.expo.aRMod.VideoFormat
import typingsSlinky.expo.aRMod.WorldAlignment
import typingsSlinky.reactNative.mod.EmitterSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "AR")
@js.native
object AR extends js.Object {
  val AnchorEventTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AnchorEventType */ js.Any = js.native
  val AnchorTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AnchorType */ js.Any = js.native
  val EventTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventType */ js.Any = js.native
  val FrameAttributes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FrameAttribute */ js.Any = js.native
  val PlaneDetectionTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaneDetection */ js.Any = js.native
  val TrackingConfigurations: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TrackingConfiguration */ js.Any = js.native
  val TrackingStateReasons: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TrackingStateReason */ js.Any = js.native
  val TrackingStates: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TrackingState */ js.Any = js.native
  val WorldAlignmentTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WorldAlignment */ js.Any = js.native
  def getARMatrices(near: Double, far: Double): ARMatrices = js.native
  def getAutoFocusEnabled(): Boolean = js.native
  def getCameraTexture(): Double = js.native
  def getCurrentFrame(): ARFrame = js.native
  def getCurrentFrame(attributes: ARFrameRequest): ARFrame = js.native
  def getLightEstimationEnabled(): Boolean = js.native
  def getPlaneDetection(): PlaneDetection = js.native
  def getProvidesAudioData(): Boolean = js.native
  def getSupportedVideoFormats(configuration: TrackingConfiguration): js.Array[VideoFormat] = js.native
  def getUnavailabilityReason(): String = js.native
  def getVersion(): String = js.native
  def getWorldAlignment(): WorldAlignment = js.native
  def isAvailable(): Boolean = js.native
  def isConfigurationAvailable(configuration: TrackingConfiguration): Boolean = js.native
  def isFrontCameraAvailable(): Boolean = js.native
  def isRearCameraAvailable(): Boolean = js.native
  def onAnchorsDidUpdate(listener: js.Function1[/* event */ AnchorsDidUpdateEvent, Unit]): EmitterSubscription = js.native
  def onCameraDidChangeTrackingState(listener: js.Function1[/* event */ CameraDidChangeTrackingStateEvent, Unit]): EmitterSubscription = js.native
  def onDidFailWithError(listener: js.Function1[/* event */ DidFailWithErrorEvent, Unit]): EmitterSubscription = js.native
  def onFrameDidUpdate(listener: js.Function1[/* event */ FrameDidUpdateEvent, Unit]): EmitterSubscription = js.native
  def onSessionInterruptionEnded(listener: js.Function1[/* event */ SessionInterruptionEndedEvent, Unit]): EmitterSubscription = js.native
  def onSessionWasInterrupted(listener: js.Function1[/* event */ SessionWasInterruptedEvent, Unit]): EmitterSubscription = js.native
  def pause(): Unit = js.native
  def performHitTest(point: Vector2, types: HitTestResultTypes): HitTestResults = js.native
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(eventType: EventType): Unit = js.native
  def reset(): Unit = js.native
  def resume(): Unit = js.native
  def setAutoFocusEnabled(isAutoFocusEnabled: Boolean): Unit = js.native
  def setConfigurationAsync(configuration: TrackingConfiguration): js.Promise[Unit] = js.native
  def setDetectionImagesAsync(images: StringDictionary[DetectionImage]): js.Promise[Unit] = js.native
  def setLightEstimationEnabled(isLightEstimationEnabled: Boolean): Unit = js.native
  def setPlaneDetection(planeDetection: PlaneDetection): Unit = js.native
  def setProvidesAudioData(providesAudioData: Boolean): Unit = js.native
  def setWorldAlignment(worldAlignment: WorldAlignment): Unit = js.native
  def setWorldOriginAsync(matrix_float4x4: Matrix): js.Promise[Unit] = js.native
  def startAsync(node: ReactNativeNodeHandle, configuration: TrackingConfiguration): js.Promise[ARStartResult] = js.native
  def startAsync(node: ReactComponentClass[js.Object], configuration: TrackingConfiguration): js.Promise[ARStartResult] = js.native
  def stopAsync(): js.Promise[Unit] = js.native
  @js.native
  object AnchorEventType extends js.Object {
    /* "add" */ val Add: typingsSlinky.expo.aRMod.AnchorEventType.Add with String = js.native
    /* "remove" */ val Remove: typingsSlinky.expo.aRMod.AnchorEventType.Remove with String = js.native
    /* "update" */ val Update: typingsSlinky.expo.aRMod.AnchorEventType.Update with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.aRMod.AnchorEventType with String] = js.native
  }
  
  @js.native
  object AnchorType extends js.Object {
    /* "ARAnchor" */ val Anchor: typingsSlinky.expo.aRMod.AnchorType.Anchor with String = js.native
    /* "ARFaceAnchor" */ val Face: typingsSlinky.expo.aRMod.AnchorType.Face with String = js.native
    /* "ARImageAnchor" */ val Image: typingsSlinky.expo.aRMod.AnchorType.Image with String = js.native
    /* "ARPlaneAnchor" */ val Plane: typingsSlinky.expo.aRMod.AnchorType.Plane with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.aRMod.AnchorType with String] = js.native
  }
  
  @js.native
  object BlendShape extends js.Object {
    /* "browDown_L" */ val BrowDownL: typingsSlinky.expo.aRMod.BlendShape.BrowDownL with String = js.native
    /* "browDown_R" */ val BrowDownR: typingsSlinky.expo.aRMod.BlendShape.BrowDownR with String = js.native
    /* "browInnerUp" */ val BrowInnerUp: typingsSlinky.expo.aRMod.BlendShape.BrowInnerUp with String = js.native
    /* "browOuterUp_L" */ val BrowOuterUpL: typingsSlinky.expo.aRMod.BlendShape.BrowOuterUpL with String = js.native
    /* "browOuterUp_R" */ val BrowOuterUpR: typingsSlinky.expo.aRMod.BlendShape.BrowOuterUpR with String = js.native
    /* "cheekPuff" */ val CheekPuff: typingsSlinky.expo.aRMod.BlendShape.CheekPuff with String = js.native
    /* "cheekSquint_L" */ val CheekSquintL: typingsSlinky.expo.aRMod.BlendShape.CheekSquintL with String = js.native
    /* "cheekSquint_R" */ val CheekSquintR: typingsSlinky.expo.aRMod.BlendShape.CheekSquintR with String = js.native
    /* "eyeBlink_L" */ val EyeBlinkL: typingsSlinky.expo.aRMod.BlendShape.EyeBlinkL with String = js.native
    /* "eyeBlink_R" */ val EyeBlinkR: typingsSlinky.expo.aRMod.BlendShape.EyeBlinkR with String = js.native
    /* "eyeLookDown_L" */ val EyeLookDownL: typingsSlinky.expo.aRMod.BlendShape.EyeLookDownL with String = js.native
    /* "eyeLookDown_R" */ val EyeLookDownR: typingsSlinky.expo.aRMod.BlendShape.EyeLookDownR with String = js.native
    /* "eyeLookIn_L" */ val EyeLookInL: typingsSlinky.expo.aRMod.BlendShape.EyeLookInL with String = js.native
    /* "eyeLookIn_R" */ val EyeLookInR: typingsSlinky.expo.aRMod.BlendShape.EyeLookInR with String = js.native
    /* "eyeLookOut_L" */ val EyeLookOutL: typingsSlinky.expo.aRMod.BlendShape.EyeLookOutL with String = js.native
    /* "eyeLookOut_R" */ val EyeLookOutR: typingsSlinky.expo.aRMod.BlendShape.EyeLookOutR with String = js.native
    /* "eyeLookUp_L" */ val EyeLookUpL: typingsSlinky.expo.aRMod.BlendShape.EyeLookUpL with String = js.native
    /* "eyeLookUp_R" */ val EyeLookUpR: typingsSlinky.expo.aRMod.BlendShape.EyeLookUpR with String = js.native
    /* "eyeSquint_L" */ val EyeSquintL: typingsSlinky.expo.aRMod.BlendShape.EyeSquintL with String = js.native
    /* "eyeSquint_R" */ val EyeSquintR: typingsSlinky.expo.aRMod.BlendShape.EyeSquintR with String = js.native
    /* "eyeWide_L" */ val EyeWideL: typingsSlinky.expo.aRMod.BlendShape.EyeWideL with String = js.native
    /* "eyeWide_R" */ val EyeWideR: typingsSlinky.expo.aRMod.BlendShape.EyeWideR with String = js.native
    /* "jawForward" */ val JawForward: typingsSlinky.expo.aRMod.BlendShape.JawForward with String = js.native
    /* "jawLeft" */ val JawLeft: typingsSlinky.expo.aRMod.BlendShape.JawLeft with String = js.native
    /* "jawOpen" */ val JawOpen: typingsSlinky.expo.aRMod.BlendShape.JawOpen with String = js.native
    /* "jawRight" */ val JawRight: typingsSlinky.expo.aRMod.BlendShape.JawRight with String = js.native
    /* "mouthClose" */ val MouthClose: typingsSlinky.expo.aRMod.BlendShape.MouthClose with String = js.native
    /* "mouthDimple_L" */ val MouthDimpleL: typingsSlinky.expo.aRMod.BlendShape.MouthDimpleL with String = js.native
    /* "mouthDimple_R" */ val MouthDimpleR: typingsSlinky.expo.aRMod.BlendShape.MouthDimpleR with String = js.native
    /* "mouthFrown_L" */ val MouthFrownL: typingsSlinky.expo.aRMod.BlendShape.MouthFrownL with String = js.native
    /* "mouthFrown_R" */ val MouthFrownR: typingsSlinky.expo.aRMod.BlendShape.MouthFrownR with String = js.native
    /* "mouthFunnel" */ val MouthFunnel: typingsSlinky.expo.aRMod.BlendShape.MouthFunnel with String = js.native
    /* "mouthLeft" */ val MouthLeft: typingsSlinky.expo.aRMod.BlendShape.MouthLeft with String = js.native
    /* "mouthLowerDown_L" */ val MouthLowerDownL: typingsSlinky.expo.aRMod.BlendShape.MouthLowerDownL with String = js.native
    /* "mouthLowerDown_R" */ val MouthLowerDownR: typingsSlinky.expo.aRMod.BlendShape.MouthLowerDownR with String = js.native
    /* "mouthPress_L" */ val MouthPressL: typingsSlinky.expo.aRMod.BlendShape.MouthPressL with String = js.native
    /* "mouthPress_R" */ val MouthPressR: typingsSlinky.expo.aRMod.BlendShape.MouthPressR with String = js.native
    /* "mouthPucker" */ val MouthPucker: typingsSlinky.expo.aRMod.BlendShape.MouthPucker with String = js.native
    /* "mouthRight" */ val MouthRight: typingsSlinky.expo.aRMod.BlendShape.MouthRight with String = js.native
    /* "mouthRollLower" */ val MouthRollLower: typingsSlinky.expo.aRMod.BlendShape.MouthRollLower with String = js.native
    /* "mouthRollUpper" */ val MouthRollUpper: typingsSlinky.expo.aRMod.BlendShape.MouthRollUpper with String = js.native
    /* "mouthShrugLower" */ val MouthShrugLower: typingsSlinky.expo.aRMod.BlendShape.MouthShrugLower with String = js.native
    /* "mouthShrugUpper" */ val MouthShrugUpper: typingsSlinky.expo.aRMod.BlendShape.MouthShrugUpper with String = js.native
    /* "mouthSmile_L" */ val MouthSmileL: typingsSlinky.expo.aRMod.BlendShape.MouthSmileL with String = js.native
    /* "mouthSmile_R" */ val MouthSmileR: typingsSlinky.expo.aRMod.BlendShape.MouthSmileR with String = js.native
    /* "mouthStretch_L" */ val MouthStretchL: typingsSlinky.expo.aRMod.BlendShape.MouthStretchL with String = js.native
    /* "mouthStretch_R" */ val MouthStretchR: typingsSlinky.expo.aRMod.BlendShape.MouthStretchR with String = js.native
    /* "mouthUpperUp_L" */ val MouthUpperUpL: typingsSlinky.expo.aRMod.BlendShape.MouthUpperUpL with String = js.native
    /* "mouthUpperUp_R" */ val MouthUpperUpR: typingsSlinky.expo.aRMod.BlendShape.MouthUpperUpR with String = js.native
    /* "noseSneer_L" */ val NoseSneerL: typingsSlinky.expo.aRMod.BlendShape.NoseSneerL with String = js.native
    /* "noseSneer_R" */ val NoseSneerR: typingsSlinky.expo.aRMod.BlendShape.NoseSneerR with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.aRMod.BlendShape with String] = js.native
  }
  
  @js.native
  object DepthDataAccuracy extends js.Object {
    /* "AVDepthDataAccuracyAbsolute" */ val Absolute: typingsSlinky.expo.aRMod.DepthDataAccuracy.Absolute with String = js.native
    /* "AVDepthDataAccuracyRelative" */ val Relative: typingsSlinky.expo.aRMod.DepthDataAccuracy.Relative with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.aRMod.DepthDataAccuracy with String] = js.native
  }
  
  @js.native
  object DepthDataQuality extends js.Object {
    /* "AVDepthDataQualityHigh" */ val High: typingsSlinky.expo.aRMod.DepthDataQuality.High with String = js.native
    /* "AVDepthDataQualityLow" */ val Low: typingsSlinky.expo.aRMod.DepthDataQuality.Low with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.aRMod.DepthDataQuality with String] = js.native
  }
  
  @js.native
  object EventType extends js.Object {
    /* 2 */ val AnchorsDidUpdate: typingsSlinky.expo.aRMod.EventType.AnchorsDidUpdate with Double = js.native
    /* 3 */ val CameraDidChangeTrackingState: typingsSlinky.expo.aRMod.EventType.CameraDidChangeTrackingState with Double = js.native
    /* 1 */ val DidFailWithError: typingsSlinky.expo.aRMod.EventType.DidFailWithError with Double = js.native
    /* 0 */ val FrameDidUpdate: typingsSlinky.expo.aRMod.EventType.FrameDidUpdate with Double = js.native
    /* 5 */ val SessionInterruptionEnded: typingsSlinky.expo.aRMod.EventType.SessionInterruptionEnded with Double = js.native
    /* 4 */ val SessionWasInterrupted: typingsSlinky.expo.aRMod.EventType.SessionWasInterrupted with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.expo.aRMod.EventType with Double] = js.native
  }
  
  @js.native
  object FaceAnchorProp extends js.Object {
    /* "blendShapes" */ val BlendShapes: typingsSlinky.expo.aRMod.FaceAnchorProp.BlendShapes with String = js.native
    /* "geometry" */ val Geometry: typingsSlinky.expo.aRMod.FaceAnchorProp.Geometry with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.aRMod.FaceAnchorProp with String] = js.native
  }
  
  @js.native
  object FrameAttribute extends js.Object {
    /* "anchors" */ val Anchors: typingsSlinky.expo.aRMod.FrameAttribute.Anchors with String = js.native
    /* "capturedDepthData" */ val CapturedDepthData: typingsSlinky.expo.aRMod.FrameAttribute.CapturedDepthData with String = js.native
    /* "lightEstimation" */ val LightEstimation: typingsSlinky.expo.aRMod.FrameAttribute.LightEstimation with String = js.native
    /* "rawFeaturePoints" */ val RawFeaturePoints: typingsSlinky.expo.aRMod.FrameAttribute.RawFeaturePoints with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.aRMod.FrameAttribute with String] = js.native
  }
  
  @js.native
  object HitTestResultTypes extends js.Object {
    /* "existingPlane" */ val ExistingPlane: typingsSlinky.expo.aRMod.HitTestResultTypes.ExistingPlane with String = js.native
    /* "existingPlaneUsingExtent" */ val ExistingPlaneUsingExtent: typingsSlinky.expo.aRMod.HitTestResultTypes.ExistingPlaneUsingExtent with String = js.native
    /* "existingPlaneUsingGeometry" */ val ExistingPlaneUsingGeometry: typingsSlinky.expo.aRMod.HitTestResultTypes.ExistingPlaneUsingGeometry with String = js.native
    /* "featurePoint" */ val FeaturePoint: typingsSlinky.expo.aRMod.HitTestResultTypes.FeaturePoint with String = js.native
    /* "horizontalPlane" */ val HorizontalPlane: typingsSlinky.expo.aRMod.HitTestResultTypes.HorizontalPlane with String = js.native
    /* "verticalPlane" */ val VerticalPlane: typingsSlinky.expo.aRMod.HitTestResultTypes.VerticalPlane with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.aRMod.HitTestResultTypes with String] = js.native
  }
  
  @js.native
  object PlaneDetection extends js.Object {
    /* "horizontal" */ val Horizontal: typingsSlinky.expo.aRMod.PlaneDetection.Horizontal with String = js.native
    /* "none" */ val None: typingsSlinky.expo.aRMod.PlaneDetection.None with String = js.native
    /* "vertical" */ val Vertical: typingsSlinky.expo.aRMod.PlaneDetection.Vertical with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.aRMod.PlaneDetection with String] = js.native
  }
  
  @js.native
  object TrackingConfiguration extends js.Object {
    /* "ARFaceTrackingConfiguration" */ val Face: typingsSlinky.expo.aRMod.TrackingConfiguration.Face with String = js.native
    /* "AROrientationTrackingConfiguration" */ val Orientation: typingsSlinky.expo.aRMod.TrackingConfiguration.Orientation with String = js.native
    /* "ARWorldTrackingConfiguration" */ val World: typingsSlinky.expo.aRMod.TrackingConfiguration.World with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.aRMod.TrackingConfiguration with String] = js.native
  }
  
  @js.native
  object TrackingState extends js.Object {
    /* "ARTrackingStateLimited" */ val Limited: typingsSlinky.expo.aRMod.TrackingState.Limited with String = js.native
    /* "ARTrackingStateNormal" */ val Normal: typingsSlinky.expo.aRMod.TrackingState.Normal with String = js.native
    /* "ARTrackingStateNotAvailable" */ val NotAvailable: typingsSlinky.expo.aRMod.TrackingState.NotAvailable with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.aRMod.TrackingState with String] = js.native
  }
  
  @js.native
  object TrackingStateReason extends js.Object {
    /* "ARTrackingStateReasonExcessiveMotion" */ val ExcessiveMotion: typingsSlinky.expo.aRMod.TrackingStateReason.ExcessiveMotion with String = js.native
    /* "ARTrackingStateReasonInitializing" */ val Initializing: typingsSlinky.expo.aRMod.TrackingStateReason.Initializing with String = js.native
    /* "ARTrackingStateReasonInsufficientFeatures" */ val InsufficientFeatures: typingsSlinky.expo.aRMod.TrackingStateReason.InsufficientFeatures with String = js.native
    /* "ARTrackingStateReasonNone" */ val None: typingsSlinky.expo.aRMod.TrackingStateReason.None with String = js.native
    /* "ARTrackingStateReasonRelocalizing" */ val Relocalizing: typingsSlinky.expo.aRMod.TrackingStateReason.Relocalizing with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.aRMod.TrackingStateReason with String] = js.native
  }
  
  @js.native
  object WorldAlignment extends js.Object {
    /* "alignmentCamera" */ val AlignmentCamera: typingsSlinky.expo.aRMod.WorldAlignment.AlignmentCamera with String = js.native
    /* "gravity" */ val Gravity: typingsSlinky.expo.aRMod.WorldAlignment.Gravity with String = js.native
    /* "gravityAndHeading" */ val GravityAndHeading: typingsSlinky.expo.aRMod.WorldAlignment.GravityAndHeading with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.aRMod.WorldAlignment with String] = js.native
  }
  
}

