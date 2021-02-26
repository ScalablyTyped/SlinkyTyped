package typingsSlinky.reactNativeVideo.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNative.reactNativeStrings.`box-none`
import typingsSlinky.reactNative.reactNativeStrings.`box-only`
import typingsSlinky.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsSlinky.reactNative.reactNativeStrings.assertive
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.button
import typingsSlinky.reactNative.reactNativeStrings.no
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.polite
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_checked
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsSlinky.reactNative.reactNativeStrings.yes
import typingsSlinky.reactNativeVideo.anon.BufferForPlaybackAfterRebufferMs
import typingsSlinky.reactNativeVideo.anon.Headers
import typingsSlinky.reactNativeVideo.anon.Language
import typingsSlinky.reactNativeVideo.anon.Type
import typingsSlinky.reactNativeVideo.anon.Value
import typingsSlinky.reactNativeVideo.mod.FilterType
import typingsSlinky.reactNativeVideo.mod.LoadError
import typingsSlinky.reactNativeVideo.mod.OnBandwidthUpdateData
import typingsSlinky.reactNativeVideo.mod.OnBufferData
import typingsSlinky.reactNativeVideo.mod.OnExternalPlaybackChangeData
import typingsSlinky.reactNativeVideo.mod.OnLoadData
import typingsSlinky.reactNativeVideo.mod.OnPictureInPictureStatusData
import typingsSlinky.reactNativeVideo.mod.OnPlaybackRateData
import typingsSlinky.reactNativeVideo.mod.OnProgressData
import typingsSlinky.reactNativeVideo.mod.OnSeekData
import typingsSlinky.reactNativeVideo.mod.VideoProperties
import typingsSlinky.reactNativeVideo.mod.default
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.all
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.contain
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.cover
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.ignore
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.landscape
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.obey
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.portrait
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeVideo {
  
  @scala.inline
  def apply(source: Headers | Double): Builder = {
    val __props = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[VideoProperties]))
  }
  
  @JSImport("react-native-video", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def accessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): this.type = set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityTraitsVarargs(value: AccessibilityTrait*): this.type = set("accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowsExternalPlayback(value: Boolean): this.type = set("allowsExternalPlayback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def audioOnly(value: Boolean): this.type = set("audioOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def automaticallyWaitsToMinimizeStalling(value: Boolean): this.type = set("automaticallyWaitsToMinimizeStalling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bufferConfig(value: BufferForPlaybackAfterRebufferMs): this.type = set("bufferConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def controls(value: Boolean): this.type = set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def currentTime(value: Double): this.type = set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableFocus(value: Boolean): this.type = set("disableFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filter(value: FilterType): this.type = set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterEnable(value: Boolean): this.type = set("filterEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fullscreen(value: Boolean): this.type = set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fullscreenAutorotate(value: Boolean): this.type = set("fullscreenAutorotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fullscreenOrientation(value: all | landscape | portrait): this.type = set("fullscreenOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideShutterView(value: Boolean): this.type = set("hideShutterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ignoreSilentSwitch(value: ignore | obey): this.type = set("ignoreSilentSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxBitRate(value: Double): this.type = set("maxBitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minLoadRetryCount(value: Double): this.type = set("minLoadRetryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def muted(value: Boolean): this.type = set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAudioBecomingNoisy(value: () => Unit): this.type = set("onAudioBecomingNoisy", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAudioFocusChanged(value: () => Unit): this.type = set("onAudioFocusChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def onBandwidthUpdate(value: /* data */ OnBandwidthUpdateData => Unit): this.type = set("onBandwidthUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBuffer(value: /* data */ OnBufferData => Unit): this.type = set("onBuffer", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnd(value: () => Unit): this.type = set("onEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def onError(value: /* error */ LoadError => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExternalPlaybackChange(value: /* data */ OnExternalPlaybackChangeData => Unit): this.type = set("onExternalPlaybackChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFullscreenPlayerDidDismiss(value: () => Unit): this.type = set("onFullscreenPlayerDidDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def onFullscreenPlayerDidPresent(value: () => Unit): this.type = set("onFullscreenPlayerDidPresent", js.Any.fromFunction0(value))
    
    @scala.inline
    def onFullscreenPlayerWillDismiss(value: () => Unit): this.type = set("onFullscreenPlayerWillDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def onFullscreenPlayerWillPresent(value: () => Unit): this.type = set("onFullscreenPlayerWillPresent", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoad(value: /* data */ OnLoadData => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadStart(value: () => Unit): this.type = set("onLoadStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPictureInPictureStatusChanged(value: /* data */ OnPictureInPictureStatusData => Unit): this.type = set("onPictureInPictureStatusChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlaybackRateChange(value: /* data */ OnPlaybackRateData => Unit): this.type = set("onPlaybackRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlaybackResume(value: () => Unit): this.type = set("onPlaybackResume", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPlaybackStalled(value: () => Unit): this.type = set("onPlaybackStalled", js.Any.fromFunction0(value))
    
    @scala.inline
    def onProgress(value: /* data */ OnProgressData => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReadyForDisplay(value: () => Unit): this.type = set("onReadyForDisplay", js.Any.fromFunction0(value))
    
    @scala.inline
    def onResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderGrant", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderTerminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRestoreUserInterfaceForPictureInPictureStop(value: () => Unit): this.type = set("onRestoreUserInterfaceForPictureInPictureStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def onSeek(value: /* data */ OnSeekData => Unit): this.type = set("onSeek", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTimedMetadata(value: () => Unit): this.type = set("onTimedMetadata", js.Any.fromFunction0(value))
    
    @scala.inline
    def onTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVideoBuffer(value: () => Unit): this.type = set("onVideoBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def onVideoEnd(value: () => Unit): this.type = set("onVideoEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def onVideoError(value: () => Unit): this.type = set("onVideoError", js.Any.fromFunction0(value))
    
    @scala.inline
    def onVideoFullscreenPlayerDidDismiss(value: () => Unit): this.type = set("onVideoFullscreenPlayerDidDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def onVideoFullscreenPlayerDidPresent(value: () => Unit): this.type = set("onVideoFullscreenPlayerDidPresent", js.Any.fromFunction0(value))
    
    @scala.inline
    def onVideoFullscreenPlayerWillDismiss(value: () => Unit): this.type = set("onVideoFullscreenPlayerWillDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def onVideoFullscreenPlayerWillPresent(value: () => Unit): this.type = set("onVideoFullscreenPlayerWillPresent", js.Any.fromFunction0(value))
    
    @scala.inline
    def onVideoLoad(value: () => Unit): this.type = set("onVideoLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def onVideoLoadStart(value: () => Unit): this.type = set("onVideoLoadStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def onVideoProgress(value: () => Unit): this.type = set("onVideoProgress", js.Any.fromFunction0(value))
    
    @scala.inline
    def onVideoSeek(value: () => Unit): this.type = set("onVideoSeek", js.Any.fromFunction0(value))
    
    @scala.inline
    def paused(value: Boolean): this.type = set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pictureInPicture(value: Boolean): this.type = set("pictureInPicture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def playInBackground(value: Boolean): this.type = set("playInBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def playWhenInactive(value: Boolean): this.type = set("playWhenInactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def poster(value: String): this.type = set("poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def posterResizeMode(value: stretch | contain | cover | typingsSlinky.reactNativeVideo.reactNativeVideoStrings.none): this.type = set("posterResizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preventsDisplaySleepDuringVideoPlayback(value: Boolean): this.type = set("preventsDisplaySleepDuringVideoPlayback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressUpdateInterval(value: Double): this.type = set("progressUpdateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rate(value: Double): this.type = set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def repeat(value: Boolean): this.type = set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reportBandwidth(value: Boolean): this.type = set("reportBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resizeMode(value: stretch | contain | cover | typingsSlinky.reactNativeVideo.reactNativeVideoStrings.none): this.type = set("resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotation(value: Double): this.type = set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleX(value: Double): this.type = set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleY(value: Double): this.type = set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def seek(value: Double): this.type = set("seek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedAudioTrack(value: Type): this.type = set("selectedAudioTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedTextTrack(value: Type): this.type = set("selectedTextTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedVideoTrack(value: Value): this.type = set("selectedVideoTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def src(value: js.Any): this.type = set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stereoPan(value: Double): this.type = set("stereoPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textTracks(value: js.Array[Language]): this.type = set("textTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textTracksVarargs(value: Language*): this.type = set("textTracks", js.Array(value :_*))
    
    @scala.inline
    def translateX(value: Double): this.type = set("translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translateY(value: Double): this.type = set("translateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useTextureView(value: Boolean): this.type = set("useTextureView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def volume(value: Double): this.type = set("volume", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VideoProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
