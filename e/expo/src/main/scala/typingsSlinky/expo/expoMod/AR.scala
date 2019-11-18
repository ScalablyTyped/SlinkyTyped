package typingsSlinky.expo.expoMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expo.buildARMod.ARFrame
import typingsSlinky.expo.buildARMod.ARFrameRequest
import typingsSlinky.expo.buildARMod.ARMatrices
import typingsSlinky.expo.buildARMod.ARStartResult
import typingsSlinky.expo.buildARMod.AnchorsDidUpdateEvent
import typingsSlinky.expo.buildARMod.CameraDidChangeTrackingStateEvent
import typingsSlinky.expo.buildARMod.DetectionImage
import typingsSlinky.expo.buildARMod.DidFailWithErrorEvent
import typingsSlinky.expo.buildARMod.EventType
import typingsSlinky.expo.buildARMod.FrameDidUpdateEvent
import typingsSlinky.expo.buildARMod.HitTestResultTypes
import typingsSlinky.expo.buildARMod.HitTestResults
import typingsSlinky.expo.buildARMod.Matrix
import typingsSlinky.expo.buildARMod.PlaneDetection
import typingsSlinky.expo.buildARMod.ReactNativeNodeHandle
import typingsSlinky.expo.buildARMod.SessionInterruptionEndedEvent
import typingsSlinky.expo.buildARMod.SessionWasInterruptedEvent
import typingsSlinky.expo.buildARMod.TrackingConfiguration
import typingsSlinky.expo.buildARMod.Vector2
import typingsSlinky.expo.buildARMod.VideoFormat
import typingsSlinky.expo.buildARMod.WorldAlignment
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashNative.reactDashNativeMod.EmitterSubscription
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
  def startAsync(node: Component[js.Object, js.Object, _], configuration: TrackingConfiguration): js.Promise[ARStartResult] = js.native
  def stopAsync(): js.Promise[Unit] = js.native
  @js.native
  object AnchorEventType extends js.Object {
    /* "add" */ val Add: typingsSlinky.expo.buildARMod.AnchorEventType.Add with String = js.native
    /* "remove" */ val Remove: typingsSlinky.expo.buildARMod.AnchorEventType.Remove with String = js.native
    /* "update" */ val Update: typingsSlinky.expo.buildARMod.AnchorEventType.Update with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.buildARMod.AnchorEventType with String] = js.native
  }
  
  @js.native
  object AnchorType extends js.Object {
    /* "ARAnchor" */ val Anchor: typingsSlinky.expo.buildARMod.AnchorType.Anchor with String = js.native
    /* "ARFaceAnchor" */ val Face: typingsSlinky.expo.buildARMod.AnchorType.Face with String = js.native
    /* "ARImageAnchor" */ val Image: typingsSlinky.expo.buildARMod.AnchorType.Image with String = js.native
    /* "ARPlaneAnchor" */ val Plane: typingsSlinky.expo.buildARMod.AnchorType.Plane with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.buildARMod.AnchorType with String] = js.native
  }
  
  @js.native
  object BlendShape extends js.Object {
    /* "browDown_L" */ val BrowDownL: typingsSlinky.expo.buildARMod.BlendShape.BrowDownL with String = js.native
    /* "browDown_R" */ val BrowDownR: typingsSlinky.expo.buildARMod.BlendShape.BrowDownR with String = js.native
    /* "browInnerUp" */ val BrowInnerUp: typingsSlinky.expo.buildARMod.BlendShape.BrowInnerUp with String = js.native
    /* "browOuterUp_L" */ val BrowOuterUpL: typingsSlinky.expo.buildARMod.BlendShape.BrowOuterUpL with String = js.native
    /* "browOuterUp_R" */ val BrowOuterUpR: typingsSlinky.expo.buildARMod.BlendShape.BrowOuterUpR with String = js.native
    /* "cheekPuff" */ val CheekPuff: typingsSlinky.expo.buildARMod.BlendShape.CheekPuff with String = js.native
    /* "cheekSquint_L" */ val CheekSquintL: typingsSlinky.expo.buildARMod.BlendShape.CheekSquintL with String = js.native
    /* "cheekSquint_R" */ val CheekSquintR: typingsSlinky.expo.buildARMod.BlendShape.CheekSquintR with String = js.native
    /* "eyeBlink_L" */ val EyeBlinkL: typingsSlinky.expo.buildARMod.BlendShape.EyeBlinkL with String = js.native
    /* "eyeBlink_R" */ val EyeBlinkR: typingsSlinky.expo.buildARMod.BlendShape.EyeBlinkR with String = js.native
    /* "eyeLookDown_L" */ val EyeLookDownL: typingsSlinky.expo.buildARMod.BlendShape.EyeLookDownL with String = js.native
    /* "eyeLookDown_R" */ val EyeLookDownR: typingsSlinky.expo.buildARMod.BlendShape.EyeLookDownR with String = js.native
    /* "eyeLookIn_L" */ val EyeLookInL: typingsSlinky.expo.buildARMod.BlendShape.EyeLookInL with String = js.native
    /* "eyeLookIn_R" */ val EyeLookInR: typingsSlinky.expo.buildARMod.BlendShape.EyeLookInR with String = js.native
    /* "eyeLookOut_L" */ val EyeLookOutL: typingsSlinky.expo.buildARMod.BlendShape.EyeLookOutL with String = js.native
    /* "eyeLookOut_R" */ val EyeLookOutR: typingsSlinky.expo.buildARMod.BlendShape.EyeLookOutR with String = js.native
    /* "eyeLookUp_L" */ val EyeLookUpL: typingsSlinky.expo.buildARMod.BlendShape.EyeLookUpL with String = js.native
    /* "eyeLookUp_R" */ val EyeLookUpR: typingsSlinky.expo.buildARMod.BlendShape.EyeLookUpR with String = js.native
    /* "eyeSquint_L" */ val EyeSquintL: typingsSlinky.expo.buildARMod.BlendShape.EyeSquintL with String = js.native
    /* "eyeSquint_R" */ val EyeSquintR: typingsSlinky.expo.buildARMod.BlendShape.EyeSquintR with String = js.native
    /* "eyeWide_L" */ val EyeWideL: typingsSlinky.expo.buildARMod.BlendShape.EyeWideL with String = js.native
    /* "eyeWide_R" */ val EyeWideR: typingsSlinky.expo.buildARMod.BlendShape.EyeWideR with String = js.native
    /* "jawForward" */ val JawForward: typingsSlinky.expo.buildARMod.BlendShape.JawForward with String = js.native
    /* "jawLeft" */ val JawLeft: typingsSlinky.expo.buildARMod.BlendShape.JawLeft with String = js.native
    /* "jawOpen" */ val JawOpen: typingsSlinky.expo.buildARMod.BlendShape.JawOpen with String = js.native
    /* "jawRight" */ val JawRight: typingsSlinky.expo.buildARMod.BlendShape.JawRight with String = js.native
    /* "mouthClose" */ val MouthClose: typingsSlinky.expo.buildARMod.BlendShape.MouthClose with String = js.native
    /* "mouthDimple_L" */ val MouthDimpleL: typingsSlinky.expo.buildARMod.BlendShape.MouthDimpleL with String = js.native
    /* "mouthDimple_R" */ val MouthDimpleR: typingsSlinky.expo.buildARMod.BlendShape.MouthDimpleR with String = js.native
    /* "mouthFrown_L" */ val MouthFrownL: typingsSlinky.expo.buildARMod.BlendShape.MouthFrownL with String = js.native
    /* "mouthFrown_R" */ val MouthFrownR: typingsSlinky.expo.buildARMod.BlendShape.MouthFrownR with String = js.native
    /* "mouthFunnel" */ val MouthFunnel: typingsSlinky.expo.buildARMod.BlendShape.MouthFunnel with String = js.native
    /* "mouthLeft" */ val MouthLeft: typingsSlinky.expo.buildARMod.BlendShape.MouthLeft with String = js.native
    /* "mouthLowerDown_L" */ val MouthLowerDownL: typingsSlinky.expo.buildARMod.BlendShape.MouthLowerDownL with String = js.native
    /* "mouthLowerDown_R" */ val MouthLowerDownR: typingsSlinky.expo.buildARMod.BlendShape.MouthLowerDownR with String = js.native
    /* "mouthPress_L" */ val MouthPressL: typingsSlinky.expo.buildARMod.BlendShape.MouthPressL with String = js.native
    /* "mouthPress_R" */ val MouthPressR: typingsSlinky.expo.buildARMod.BlendShape.MouthPressR with String = js.native
    /* "mouthPucker" */ val MouthPucker: typingsSlinky.expo.buildARMod.BlendShape.MouthPucker with String = js.native
    /* "mouthRight" */ val MouthRight: typingsSlinky.expo.buildARMod.BlendShape.MouthRight with String = js.native
    /* "mouthRollLower" */ val MouthRollLower: typingsSlinky.expo.buildARMod.BlendShape.MouthRollLower with String = js.native
    /* "mouthRollUpper" */ val MouthRollUpper: typingsSlinky.expo.buildARMod.BlendShape.MouthRollUpper with String = js.native
    /* "mouthShrugLower" */ val MouthShrugLower: typingsSlinky.expo.buildARMod.BlendShape.MouthShrugLower with String = js.native
    /* "mouthShrugUpper" */ val MouthShrugUpper: typingsSlinky.expo.buildARMod.BlendShape.MouthShrugUpper with String = js.native
    /* "mouthSmile_L" */ val MouthSmileL: typingsSlinky.expo.buildARMod.BlendShape.MouthSmileL with String = js.native
    /* "mouthSmile_R" */ val MouthSmileR: typingsSlinky.expo.buildARMod.BlendShape.MouthSmileR with String = js.native
    /* "mouthStretch_L" */ val MouthStretchL: typingsSlinky.expo.buildARMod.BlendShape.MouthStretchL with String = js.native
    /* "mouthStretch_R" */ val MouthStretchR: typingsSlinky.expo.buildARMod.BlendShape.MouthStretchR with String = js.native
    /* "mouthUpperUp_L" */ val MouthUpperUpL: typingsSlinky.expo.buildARMod.BlendShape.MouthUpperUpL with String = js.native
    /* "mouthUpperUp_R" */ val MouthUpperUpR: typingsSlinky.expo.buildARMod.BlendShape.MouthUpperUpR with String = js.native
    /* "noseSneer_L" */ val NoseSneerL: typingsSlinky.expo.buildARMod.BlendShape.NoseSneerL with String = js.native
    /* "noseSneer_R" */ val NoseSneerR: typingsSlinky.expo.buildARMod.BlendShape.NoseSneerR with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.buildARMod.BlendShape with String] = js.native
  }
  
  @js.native
  object DepthDataAccuracy extends js.Object {
    /* "AVDepthDataAccuracyAbsolute" */ val Absolute: typingsSlinky.expo.buildARMod.DepthDataAccuracy.Absolute with String = js.native
    /* "AVDepthDataAccuracyRelative" */ val Relative: typingsSlinky.expo.buildARMod.DepthDataAccuracy.Relative with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.buildARMod.DepthDataAccuracy with String] = js.native
  }
  
  @js.native
  object DepthDataQuality extends js.Object {
    /* "AVDepthDataQualityHigh" */ val High: typingsSlinky.expo.buildARMod.DepthDataQuality.High with String = js.native
    /* "AVDepthDataQualityLow" */ val Low: typingsSlinky.expo.buildARMod.DepthDataQuality.Low with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.buildARMod.DepthDataQuality with String] = js.native
  }
  
  @js.native
  object EventType extends js.Object {
    /* 2 */ val AnchorsDidUpdate: typingsSlinky.expo.buildARMod.EventType.AnchorsDidUpdate with Double = js.native
    /* 3 */ val CameraDidChangeTrackingState: typingsSlinky.expo.buildARMod.EventType.CameraDidChangeTrackingState with Double = js.native
    /* 1 */ val DidFailWithError: typingsSlinky.expo.buildARMod.EventType.DidFailWithError with Double = js.native
    /* 0 */ val FrameDidUpdate: typingsSlinky.expo.buildARMod.EventType.FrameDidUpdate with Double = js.native
    /* 5 */ val SessionInterruptionEnded: typingsSlinky.expo.buildARMod.EventType.SessionInterruptionEnded with Double = js.native
    /* 4 */ val SessionWasInterrupted: typingsSlinky.expo.buildARMod.EventType.SessionWasInterrupted with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.expo.buildARMod.EventType with Double] = js.native
  }
  
  @js.native
  object FaceAnchorProp extends js.Object {
    /* "blendShapes" */ val BlendShapes: typingsSlinky.expo.buildARMod.FaceAnchorProp.BlendShapes with String = js.native
    /* "geometry" */ val Geometry: typingsSlinky.expo.buildARMod.FaceAnchorProp.Geometry with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.buildARMod.FaceAnchorProp with String] = js.native
  }
  
  @js.native
  object FrameAttribute extends js.Object {
    /* "anchors" */ val Anchors: typingsSlinky.expo.buildARMod.FrameAttribute.Anchors with String = js.native
    /* "capturedDepthData" */ val CapturedDepthData: typingsSlinky.expo.buildARMod.FrameAttribute.CapturedDepthData with String = js.native
    /* "lightEstimation" */ val LightEstimation: typingsSlinky.expo.buildARMod.FrameAttribute.LightEstimation with String = js.native
    /* "rawFeaturePoints" */ val RawFeaturePoints: typingsSlinky.expo.buildARMod.FrameAttribute.RawFeaturePoints with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.buildARMod.FrameAttribute with String] = js.native
  }
  
  @js.native
  object HitTestResultTypes extends js.Object {
    /* "existingPlane" */ val ExistingPlane: typingsSlinky.expo.buildARMod.HitTestResultTypes.ExistingPlane with String = js.native
    /* "existingPlaneUsingExtent" */ val ExistingPlaneUsingExtent: typingsSlinky.expo.buildARMod.HitTestResultTypes.ExistingPlaneUsingExtent with String = js.native
    /* "existingPlaneUsingGeometry" */ val ExistingPlaneUsingGeometry: typingsSlinky.expo.buildARMod.HitTestResultTypes.ExistingPlaneUsingGeometry with String = js.native
    /* "featurePoint" */ val FeaturePoint: typingsSlinky.expo.buildARMod.HitTestResultTypes.FeaturePoint with String = js.native
    /* "horizontalPlane" */ val HorizontalPlane: typingsSlinky.expo.buildARMod.HitTestResultTypes.HorizontalPlane with String = js.native
    /* "verticalPlane" */ val VerticalPlane: typingsSlinky.expo.buildARMod.HitTestResultTypes.VerticalPlane with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.buildARMod.HitTestResultTypes with String] = js.native
  }
  
  @js.native
  object PlaneDetection extends js.Object {
    /* "horizontal" */ val Horizontal: typingsSlinky.expo.buildARMod.PlaneDetection.Horizontal with String = js.native
    /* "none" */ val None: typingsSlinky.expo.buildARMod.PlaneDetection.None with String = js.native
    /* "vertical" */ val Vertical: typingsSlinky.expo.buildARMod.PlaneDetection.Vertical with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.buildARMod.PlaneDetection with String] = js.native
  }
  
  @js.native
  object TrackingConfiguration extends js.Object {
    /* "ARFaceTrackingConfiguration" */ val Face: typingsSlinky.expo.buildARMod.TrackingConfiguration.Face with String = js.native
    /* "AROrientationTrackingConfiguration" */ val Orientation: typingsSlinky.expo.buildARMod.TrackingConfiguration.Orientation with String = js.native
    /* "ARWorldTrackingConfiguration" */ val World: typingsSlinky.expo.buildARMod.TrackingConfiguration.World with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.buildARMod.TrackingConfiguration with String] = js.native
  }
  
  @js.native
  object TrackingState extends js.Object {
    /* "ARTrackingStateLimited" */ val Limited: typingsSlinky.expo.buildARMod.TrackingState.Limited with String = js.native
    /* "ARTrackingStateNormal" */ val Normal: typingsSlinky.expo.buildARMod.TrackingState.Normal with String = js.native
    /* "ARTrackingStateNotAvailable" */ val NotAvailable: typingsSlinky.expo.buildARMod.TrackingState.NotAvailable with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.buildARMod.TrackingState with String] = js.native
  }
  
  @js.native
  object TrackingStateReason extends js.Object {
    /* "ARTrackingStateReasonExcessiveMotion" */ val ExcessiveMotion: typingsSlinky.expo.buildARMod.TrackingStateReason.ExcessiveMotion with String = js.native
    /* "ARTrackingStateReasonInitializing" */ val Initializing: typingsSlinky.expo.buildARMod.TrackingStateReason.Initializing with String = js.native
    /* "ARTrackingStateReasonInsufficientFeatures" */ val InsufficientFeatures: typingsSlinky.expo.buildARMod.TrackingStateReason.InsufficientFeatures with String = js.native
    /* "ARTrackingStateReasonNone" */ val None: typingsSlinky.expo.buildARMod.TrackingStateReason.None with String = js.native
    /* "ARTrackingStateReasonRelocalizing" */ val Relocalizing: typingsSlinky.expo.buildARMod.TrackingStateReason.Relocalizing with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.buildARMod.TrackingStateReason with String] = js.native
  }
  
  @js.native
  object WorldAlignment extends js.Object {
    /* "alignmentCamera" */ val AlignmentCamera: typingsSlinky.expo.buildARMod.WorldAlignment.AlignmentCamera with String = js.native
    /* "gravity" */ val Gravity: typingsSlinky.expo.buildARMod.WorldAlignment.Gravity with String = js.native
    /* "gravityAndHeading" */ val GravityAndHeading: typingsSlinky.expo.buildARMod.WorldAlignment.GravityAndHeading with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.buildARMod.WorldAlignment with String] = js.native
  }
  
}

