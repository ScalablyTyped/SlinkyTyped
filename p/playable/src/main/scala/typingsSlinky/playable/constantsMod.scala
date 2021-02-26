package typingsSlinky.playable

import typingsSlinky.playable.engineStateMod.EngineState
import typingsSlinky.playable.errorsMod.Error
import typingsSlinky.playable.liveStateMod.LiveState
import typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority
import typingsSlinky.playable.mediaStreamMod.MediaStreamType
import typingsSlinky.playable.textLabelsMod.TextLabel
import typingsSlinky.playable.uiMod.UIEvent
import typingsSlinky.playable.videoMod.VideoEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("playable/dist/src/constants", "ENGINE_STATES")
  @js.native
  object ENGINE_STATES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EngineState with String] = js.native
    
    /* "engine-state/ended" */ val ENDED: typingsSlinky.playable.engineStateMod.EngineState.ENDED with String = js.native
    
    /* "engine-state/load-started" */ val LOAD_STARTED: typingsSlinky.playable.engineStateMod.EngineState.LOAD_STARTED with String = js.native
    
    /* "engine-state/metadata-loaded" */ val METADATA_LOADED: typingsSlinky.playable.engineStateMod.EngineState.METADATA_LOADED with String = js.native
    
    /* "engine-state/paused" */ val PAUSED: typingsSlinky.playable.engineStateMod.EngineState.PAUSED with String = js.native
    
    /* "engine-state/playing" */ val PLAYING: typingsSlinky.playable.engineStateMod.EngineState.PLAYING with String = js.native
    
    /* "engine-state/play-requested" */ val PLAY_REQUESTED: typingsSlinky.playable.engineStateMod.EngineState.PLAY_REQUESTED with String = js.native
    
    /* "engine-state/ready-to-play" */ val READY_TO_PLAY: typingsSlinky.playable.engineStateMod.EngineState.READY_TO_PLAY with String = js.native
    
    /* "engine-state/seek-in-progress" */ val SEEK_IN_PROGRESS: typingsSlinky.playable.engineStateMod.EngineState.SEEK_IN_PROGRESS with String = js.native
    
    /* "engine-state/src-set" */ val SRC_SET: typingsSlinky.playable.engineStateMod.EngineState.SRC_SET with String = js.native
    
    /* "engine-state/waiting" */ val WAITING: typingsSlinky.playable.engineStateMod.EngineState.WAITING with String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "ERRORS")
  @js.native
  object ERRORS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Error with String] = js.native
    
    /* "error-content-load" */ val CONTENT_LOAD: typingsSlinky.playable.errorsMod.Error.CONTENT_LOAD with String = js.native
    
    /* "error-content-parse" */ val CONTENT_PARSE: typingsSlinky.playable.errorsMod.Error.CONTENT_PARSE with String = js.native
    
    /* "error-level-load" */ val LEVEL_LOAD: typingsSlinky.playable.errorsMod.Error.LEVEL_LOAD with String = js.native
    
    /* "error-manifest-incompatible" */ val MANIFEST_INCOMPATIBLE: typingsSlinky.playable.errorsMod.Error.MANIFEST_INCOMPATIBLE with String = js.native
    
    /* "error-manifest-load" */ val MANIFEST_LOAD: typingsSlinky.playable.errorsMod.Error.MANIFEST_LOAD with String = js.native
    
    /* "error-manifest-parse" */ val MANIFEST_PARSE: typingsSlinky.playable.errorsMod.Error.MANIFEST_PARSE with String = js.native
    
    /* "error-media" */ val MEDIA: typingsSlinky.playable.errorsMod.Error.MEDIA with String = js.native
    
    /* "error-src-parse" */ val SRC_PARSE: typingsSlinky.playable.errorsMod.Error.SRC_PARSE with String = js.native
    
    /* "error-unknown" */ val UNKNOWN: typingsSlinky.playable.errorsMod.Error.UNKNOWN with String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "EngineState")
  @js.native
  object EngineState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.playable.engineStateMod.EngineState with String] = js.native
    
    /* "engine-state/ended" */ val ENDED: typingsSlinky.playable.engineStateMod.EngineState.ENDED with String = js.native
    
    /* "engine-state/load-started" */ val LOAD_STARTED: typingsSlinky.playable.engineStateMod.EngineState.LOAD_STARTED with String = js.native
    
    /* "engine-state/metadata-loaded" */ val METADATA_LOADED: typingsSlinky.playable.engineStateMod.EngineState.METADATA_LOADED with String = js.native
    
    /* "engine-state/paused" */ val PAUSED: typingsSlinky.playable.engineStateMod.EngineState.PAUSED with String = js.native
    
    /* "engine-state/playing" */ val PLAYING: typingsSlinky.playable.engineStateMod.EngineState.PLAYING with String = js.native
    
    /* "engine-state/play-requested" */ val PLAY_REQUESTED: typingsSlinky.playable.engineStateMod.EngineState.PLAY_REQUESTED with String = js.native
    
    /* "engine-state/ready-to-play" */ val READY_TO_PLAY: typingsSlinky.playable.engineStateMod.EngineState.READY_TO_PLAY with String = js.native
    
    /* "engine-state/seek-in-progress" */ val SEEK_IN_PROGRESS: typingsSlinky.playable.engineStateMod.EngineState.SEEK_IN_PROGRESS with String = js.native
    
    /* "engine-state/src-set" */ val SRC_SET: typingsSlinky.playable.engineStateMod.EngineState.SRC_SET with String = js.native
    
    /* "engine-state/waiting" */ val WAITING: typingsSlinky.playable.engineStateMod.EngineState.WAITING with String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "Error")
  @js.native
  object Error extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.playable.errorsMod.Error with String] = js.native
    
    /* "error-content-load" */ val CONTENT_LOAD: typingsSlinky.playable.errorsMod.Error.CONTENT_LOAD with String = js.native
    
    /* "error-content-parse" */ val CONTENT_PARSE: typingsSlinky.playable.errorsMod.Error.CONTENT_PARSE with String = js.native
    
    /* "error-level-load" */ val LEVEL_LOAD: typingsSlinky.playable.errorsMod.Error.LEVEL_LOAD with String = js.native
    
    /* "error-manifest-incompatible" */ val MANIFEST_INCOMPATIBLE: typingsSlinky.playable.errorsMod.Error.MANIFEST_INCOMPATIBLE with String = js.native
    
    /* "error-manifest-load" */ val MANIFEST_LOAD: typingsSlinky.playable.errorsMod.Error.MANIFEST_LOAD with String = js.native
    
    /* "error-manifest-parse" */ val MANIFEST_PARSE: typingsSlinky.playable.errorsMod.Error.MANIFEST_PARSE with String = js.native
    
    /* "error-media" */ val MEDIA: typingsSlinky.playable.errorsMod.Error.MEDIA with String = js.native
    
    /* "error-src-parse" */ val SRC_PARSE: typingsSlinky.playable.errorsMod.Error.SRC_PARSE with String = js.native
    
    /* "error-unknown" */ val UNKNOWN: typingsSlinky.playable.errorsMod.Error.UNKNOWN with String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "LIVE_STATES")
  @js.native
  object LIVE_STATES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LiveState with String] = js.native
    
    /* "live-state/ended" */ val ENDED: typingsSlinky.playable.liveStateMod.LiveState.ENDED with String = js.native
    
    /* "live-state/initial" */ val INITIAL: typingsSlinky.playable.liveStateMod.LiveState.INITIAL with String = js.native
    
    /* "live-state/none" */ val NONE: typingsSlinky.playable.liveStateMod.LiveState.NONE with String = js.native
    
    /* "live-state/not-sync" */ val NOT_SYNC: typingsSlinky.playable.liveStateMod.LiveState.NOT_SYNC with String = js.native
    
    /* "live-state/sync" */ val SYNC: typingsSlinky.playable.liveStateMod.LiveState.SYNC with String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "LiveState")
  @js.native
  object LiveState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.playable.liveStateMod.LiveState with String] = js.native
    
    /* "live-state/ended" */ val ENDED: typingsSlinky.playable.liveStateMod.LiveState.ENDED with String = js.native
    
    /* "live-state/initial" */ val INITIAL: typingsSlinky.playable.liveStateMod.LiveState.INITIAL with String = js.native
    
    /* "live-state/none" */ val NONE: typingsSlinky.playable.liveStateMod.LiveState.NONE with String = js.native
    
    /* "live-state/not-sync" */ val NOT_SYNC: typingsSlinky.playable.liveStateMod.LiveState.NOT_SYNC with String = js.native
    
    /* "live-state/sync" */ val SYNC: typingsSlinky.playable.liveStateMod.LiveState.SYNC with String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "MEDIA_STREAM_DELIVERY_PRIORITY")
  @js.native
  object MEDIA_STREAM_DELIVERY_PRIORITY extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MediaStreamDeliveryPriority with Double] = js.native
    
    /* 1 */ val ADAPTIVE_VIA_MSE: typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority.ADAPTIVE_VIA_MSE with Double = js.native
    
    /* 3 */ val FORCED: typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority.FORCED with Double = js.native
    
    /* 2 */ val NATIVE_ADAPTIVE: typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_ADAPTIVE with Double = js.native
    
    /* 0 */ val NATIVE_PROGRESSIVE: typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_PROGRESSIVE with Double = js.native
  }
  
  @JSImport("playable/dist/src/constants", "MEDIA_STREAM_TYPES")
  @js.native
  object MEDIA_STREAM_TYPES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaStreamType with String] = js.native
    
    /* "DASH" */ val DASH: typingsSlinky.playable.mediaStreamMod.MediaStreamType.DASH with String = js.native
    
    /* "HLS" */ val HLS: typingsSlinky.playable.mediaStreamMod.MediaStreamType.HLS with String = js.native
    
    /* "MKV" */ val MKV: typingsSlinky.playable.mediaStreamMod.MediaStreamType.MKV with String = js.native
    
    /* "MOV" */ val MOV: typingsSlinky.playable.mediaStreamMod.MediaStreamType.MOV with String = js.native
    
    /* "MP4" */ val MP4: typingsSlinky.playable.mediaStreamMod.MediaStreamType.MP4 with String = js.native
    
    /* "OGG" */ val OGG: typingsSlinky.playable.mediaStreamMod.MediaStreamType.OGG with String = js.native
    
    /* "WEBM" */ val WEBM: typingsSlinky.playable.mediaStreamMod.MediaStreamType.WEBM with String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "MediaStreamDeliveryPriority")
  @js.native
  object MediaStreamDeliveryPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority with Double] = js.native
    
    /* 1 */ val ADAPTIVE_VIA_MSE: typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority.ADAPTIVE_VIA_MSE with Double = js.native
    
    /* 3 */ val FORCED: typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority.FORCED with Double = js.native
    
    /* 2 */ val NATIVE_ADAPTIVE: typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_ADAPTIVE with Double = js.native
    
    /* 0 */ val NATIVE_PROGRESSIVE: typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_PROGRESSIVE with Double = js.native
  }
  
  @JSImport("playable/dist/src/constants", "MediaStreamType")
  @js.native
  object MediaStreamType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.playable.mediaStreamMod.MediaStreamType with String] = js.native
    
    /* "DASH" */ val DASH: typingsSlinky.playable.mediaStreamMod.MediaStreamType.DASH with String = js.native
    
    /* "HLS" */ val HLS: typingsSlinky.playable.mediaStreamMod.MediaStreamType.HLS with String = js.native
    
    /* "MKV" */ val MKV: typingsSlinky.playable.mediaStreamMod.MediaStreamType.MKV with String = js.native
    
    /* "MOV" */ val MOV: typingsSlinky.playable.mediaStreamMod.MediaStreamType.MOV with String = js.native
    
    /* "MP4" */ val MP4: typingsSlinky.playable.mediaStreamMod.MediaStreamType.MP4 with String = js.native
    
    /* "OGG" */ val OGG: typingsSlinky.playable.mediaStreamMod.MediaStreamType.OGG with String = js.native
    
    /* "WEBM" */ val WEBM: typingsSlinky.playable.mediaStreamMod.MediaStreamType.WEBM with String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "TEXT_LABELS")
  @js.native
  object TEXT_LABELS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TextLabel with String] = js.native
    
    /* "download-button-label" */ val DOWNLOAD_BUTTON_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.DOWNLOAD_BUTTON_LABEL with String = js.native
    
    /* "download-button-tooltip" */ val DOWNLOAD_BUTTON_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.DOWNLOAD_BUTTON_TOOLTIP with String = js.native
    
    /* "enter-full-screen-label" */ val ENTER_FULL_SCREEN_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.ENTER_FULL_SCREEN_LABEL with String = js.native
    
    /* "enter-full-screen-tooltip" */ val ENTER_FULL_SCREEN_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.ENTER_FULL_SCREEN_TOOLTIP with String = js.native
    
    /* "enter-picture-in-picture-button-label" */ val ENTER_PICTURE_IN_PICTURE_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.ENTER_PICTURE_IN_PICTURE_LABEL with String = js.native
    
    /* "enter-picture-in-picture-button-tooltip" */ val ENTER_PICTURE_IN_PICTURE_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.ENTER_PICTURE_IN_PICTURE_TOOLTIP with String = js.native
    
    /* "exit-full-screen-label" */ val EXIT_FULL_SCREEN_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.EXIT_FULL_SCREEN_LABEL with String = js.native
    
    /* "exit-full-screen-tooltip" */ val EXIT_FULL_SCREEN_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.EXIT_FULL_SCREEN_TOOLTIP with String = js.native
    
    /* "exit-picture-in-picture-button-label" */ val EXIT_PICTURE_IN_PICTURE_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.EXIT_PICTURE_IN_PICTURE_LABEL with String = js.native
    
    /* "exit-picture-in-picture-button-tooltip" */ val EXIT_PICTURE_IN_PICTURE_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.EXIT_PICTURE_IN_PICTURE_TOOLTIP with String = js.native
    
    /* "live-indicator-text" */ val LIVE_INDICATOR_TEXT: typingsSlinky.playable.textLabelsMod.TextLabel.LIVE_INDICATOR_TEXT with String = js.native
    
    /* "live-sync-button-label" */ val LIVE_SYNC_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.LIVE_SYNC_LABEL with String = js.native
    
    /* "live-sync-button-tooltip" */ val LIVE_SYNC_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.LIVE_SYNC_TOOLTIP with String = js.native
    
    /* "logo-label" */ val LOGO_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.LOGO_LABEL with String = js.native
    
    /* "logo-tooltip" */ val LOGO_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.LOGO_TOOLTIP with String = js.native
    
    /* "mute-control-label" */ val MUTE_CONTROL_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.MUTE_CONTROL_LABEL with String = js.native
    
    /* "mute-control-tooltip" */ val MUTE_CONTROL_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.MUTE_CONTROL_TOOLTIP with String = js.native
    
    /* "pause-control-label" */ val PAUSE_CONTROL_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.PAUSE_CONTROL_LABEL with String = js.native
    
    /* "play-control-label" */ val PLAY_CONTROL_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.PLAY_CONTROL_LABEL with String = js.native
    
    /* "progress-control-label" */ val PROGRESS_CONTROL_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.PROGRESS_CONTROL_LABEL with String = js.native
    
    /* "progress-control-value" */ val PROGRESS_CONTROL_VALUE: typingsSlinky.playable.textLabelsMod.TextLabel.PROGRESS_CONTROL_VALUE with String = js.native
    
    /* "unmute-control-label" */ val UNMUTE_CONTROL_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.UNMUTE_CONTROL_LABEL with String = js.native
    
    /* "unmute-control-label" */ val UNMUTE_CONTROL_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.UNMUTE_CONTROL_TOOLTIP with String = js.native
    
    /* "volume-control-label" */ val VOLUME_CONTROL_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.VOLUME_CONTROL_LABEL with String = js.native
    
    /* "volume-control-value" */ val VOLUME_CONTROL_VALUE: typingsSlinky.playable.textLabelsMod.TextLabel.VOLUME_CONTROL_VALUE with String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "TextLabel")
  @js.native
  object TextLabel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.playable.textLabelsMod.TextLabel with String] = js.native
    
    /* "download-button-label" */ val DOWNLOAD_BUTTON_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.DOWNLOAD_BUTTON_LABEL with String = js.native
    
    /* "download-button-tooltip" */ val DOWNLOAD_BUTTON_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.DOWNLOAD_BUTTON_TOOLTIP with String = js.native
    
    /* "enter-full-screen-label" */ val ENTER_FULL_SCREEN_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.ENTER_FULL_SCREEN_LABEL with String = js.native
    
    /* "enter-full-screen-tooltip" */ val ENTER_FULL_SCREEN_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.ENTER_FULL_SCREEN_TOOLTIP with String = js.native
    
    /* "enter-picture-in-picture-button-label" */ val ENTER_PICTURE_IN_PICTURE_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.ENTER_PICTURE_IN_PICTURE_LABEL with String = js.native
    
    /* "enter-picture-in-picture-button-tooltip" */ val ENTER_PICTURE_IN_PICTURE_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.ENTER_PICTURE_IN_PICTURE_TOOLTIP with String = js.native
    
    /* "exit-full-screen-label" */ val EXIT_FULL_SCREEN_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.EXIT_FULL_SCREEN_LABEL with String = js.native
    
    /* "exit-full-screen-tooltip" */ val EXIT_FULL_SCREEN_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.EXIT_FULL_SCREEN_TOOLTIP with String = js.native
    
    /* "exit-picture-in-picture-button-label" */ val EXIT_PICTURE_IN_PICTURE_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.EXIT_PICTURE_IN_PICTURE_LABEL with String = js.native
    
    /* "exit-picture-in-picture-button-tooltip" */ val EXIT_PICTURE_IN_PICTURE_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.EXIT_PICTURE_IN_PICTURE_TOOLTIP with String = js.native
    
    /* "live-indicator-text" */ val LIVE_INDICATOR_TEXT: typingsSlinky.playable.textLabelsMod.TextLabel.LIVE_INDICATOR_TEXT with String = js.native
    
    /* "live-sync-button-label" */ val LIVE_SYNC_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.LIVE_SYNC_LABEL with String = js.native
    
    /* "live-sync-button-tooltip" */ val LIVE_SYNC_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.LIVE_SYNC_TOOLTIP with String = js.native
    
    /* "logo-label" */ val LOGO_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.LOGO_LABEL with String = js.native
    
    /* "logo-tooltip" */ val LOGO_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.LOGO_TOOLTIP with String = js.native
    
    /* "mute-control-label" */ val MUTE_CONTROL_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.MUTE_CONTROL_LABEL with String = js.native
    
    /* "mute-control-tooltip" */ val MUTE_CONTROL_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.MUTE_CONTROL_TOOLTIP with String = js.native
    
    /* "pause-control-label" */ val PAUSE_CONTROL_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.PAUSE_CONTROL_LABEL with String = js.native
    
    /* "play-control-label" */ val PLAY_CONTROL_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.PLAY_CONTROL_LABEL with String = js.native
    
    /* "progress-control-label" */ val PROGRESS_CONTROL_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.PROGRESS_CONTROL_LABEL with String = js.native
    
    /* "progress-control-value" */ val PROGRESS_CONTROL_VALUE: typingsSlinky.playable.textLabelsMod.TextLabel.PROGRESS_CONTROL_VALUE with String = js.native
    
    /* "unmute-control-label" */ val UNMUTE_CONTROL_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.UNMUTE_CONTROL_LABEL with String = js.native
    
    /* "unmute-control-label" */ val UNMUTE_CONTROL_TOOLTIP: typingsSlinky.playable.textLabelsMod.TextLabel.UNMUTE_CONTROL_TOOLTIP with String = js.native
    
    /* "volume-control-label" */ val VOLUME_CONTROL_LABEL: typingsSlinky.playable.textLabelsMod.TextLabel.VOLUME_CONTROL_LABEL with String = js.native
    
    /* "volume-control-value" */ val VOLUME_CONTROL_VALUE: typingsSlinky.playable.textLabelsMod.TextLabel.VOLUME_CONTROL_VALUE with String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "UIEvent")
  @js.native
  object UIEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.playable.uiMod.UIEvent with String] = js.native
    
    /* "ui-events/control-drag-end" */ val CONTROL_DRAG_END: typingsSlinky.playable.uiMod.UIEvent.CONTROL_DRAG_END with String = js.native
    
    /* "ui-events/control-drag-start" */ val CONTROL_DRAG_START: typingsSlinky.playable.uiMod.UIEvent.CONTROL_DRAG_START with String = js.native
    
    /* "ui-events/decrease-volume-with-keyboard" */ val DECREASE_VOLUME_WITH_KEYBOARD: typingsSlinky.playable.uiMod.UIEvent.DECREASE_VOLUME_WITH_KEYBOARD with String = js.native
    
    /* "ui-events/enter-full-screen-click" */ val ENTER_FULL_SCREEN_CLICK: typingsSlinky.playable.uiMod.UIEvent.ENTER_FULL_SCREEN_CLICK with String = js.native
    
    /* "ui-events/enter-full-screen-with-screen-click" */ val ENTER_FULL_SCREEN_WITH_SCREEN_CLICK: typingsSlinky.playable.uiMod.UIEvent.ENTER_FULL_SCREEN_WITH_SCREEN_CLICK with String = js.native
    
    /* "ui-events/enter-picture-in-picture-click" */ val ENTER_PICTURE_IN_PICTURE_CLICK: typingsSlinky.playable.uiMod.UIEvent.ENTER_PICTURE_IN_PICTURE_CLICK with String = js.native
    
    /* "ui-events/exit-full-screen-click" */ val EXIT_FULL_SCREEN_CLICK: typingsSlinky.playable.uiMod.UIEvent.EXIT_FULL_SCREEN_CLICK with String = js.native
    
    /* "ui-events/exit-full-screen-with-screen-click" */ val EXIT_FULL_SCREEN_WITH_SCREEN_CLICK: typingsSlinky.playable.uiMod.UIEvent.EXIT_FULL_SCREEN_WITH_SCREEN_CLICK with String = js.native
    
    /* "ui-events/exit-picture-in-picture-click" */ val EXIT_PICTURE_IN_PICTURE_CLICK: typingsSlinky.playable.uiMod.UIEvent.EXIT_PICTURE_IN_PICTURE_CLICK with String = js.native
    
    /* "ui-events/focus-enter-on-player" */ val FOCUS_ENTER_ON_PLAYER: typingsSlinky.playable.uiMod.UIEvent.FOCUS_ENTER_ON_PLAYER with String = js.native
    
    /* "ui-events/focus-leave-on-player" */ val FOCUS_LEAVE_ON_PLAYER: typingsSlinky.playable.uiMod.UIEvent.FOCUS_LEAVE_ON_PLAYER with String = js.native
    
    /* "ui-events/full-screen-state-changed" */ val FULL_SCREEN_STATE_CHANGED: typingsSlinky.playable.uiMod.UIEvent.FULL_SCREEN_STATE_CHANGED with String = js.native
    
    /* "ui-events/go-backward-with-keyboard" */ val GO_BACKWARD_WITH_KEYBOARD: typingsSlinky.playable.uiMod.UIEvent.GO_BACKWARD_WITH_KEYBOARD with String = js.native
    
    /* "ui-events/go-forward-with-keyboard" */ val GO_FORWARD_WITH_KEYBOARD: typingsSlinky.playable.uiMod.UIEvent.GO_FORWARD_WITH_KEYBOARD with String = js.native
    
    /* "ui-events/hide-interaction-indicator" */ val HIDE_INTERACTION_INDICATOR: typingsSlinky.playable.uiMod.UIEvent.HIDE_INTERACTION_INDICATOR with String = js.native
    
    /* "ui-events/increase-volume-with-keyboard" */ val INCREASE_VOLUME_WITH_KEYBOARD: typingsSlinky.playable.uiMod.UIEvent.INCREASE_VOLUME_WITH_KEYBOARD with String = js.native
    
    /* "ui-events/keyboard-keydown-intercepted" */ val KEYBOARD_KEYDOWN_INTERCEPTED: typingsSlinky.playable.uiMod.UIEvent.KEYBOARD_KEYDOWN_INTERCEPTED with String = js.native
    
    /* "ui-events/loader-hide" */ val LOADER_HIDE: typingsSlinky.playable.uiMod.UIEvent.LOADER_HIDE with String = js.native
    
    /* "ui-events/loader-show" */ val LOADER_SHOW: typingsSlinky.playable.uiMod.UIEvent.LOADER_SHOW with String = js.native
    
    /* "ui-events/loading-cover-hide" */ val LOADING_COVER_HIDE: typingsSlinky.playable.uiMod.UIEvent.LOADING_COVER_HIDE with String = js.native
    
    /* "ui-events/loading-cover-show" */ val LOADING_COVER_SHOW: typingsSlinky.playable.uiMod.UIEvent.LOADING_COVER_SHOW with String = js.native
    
    /* "ui-events/main-block-hide" */ val MAIN_BLOCK_HIDE: typingsSlinky.playable.uiMod.UIEvent.MAIN_BLOCK_HIDE with String = js.native
    
    /* "ui-events/main-block-show" */ val MAIN_BLOCK_SHOW: typingsSlinky.playable.uiMod.UIEvent.MAIN_BLOCK_SHOW with String = js.native
    
    /* "ui-events/mouse-enter-on-player" */ val MOUSE_ENTER_ON_PLAYER: typingsSlinky.playable.uiMod.UIEvent.MOUSE_ENTER_ON_PLAYER with String = js.native
    
    /* "ui-events/mouse-leave-on-player" */ val MOUSE_LEAVE_ON_PLAYER: typingsSlinky.playable.uiMod.UIEvent.MOUSE_LEAVE_ON_PLAYER with String = js.native
    
    /* "ui-events/mouse-move-on-player" */ val MOUSE_MOVE_ON_PLAYER: typingsSlinky.playable.uiMod.UIEvent.MOUSE_MOVE_ON_PLAYER with String = js.native
    
    /* "ui-events/mute-click" */ val MUTE_CLICK: typingsSlinky.playable.uiMod.UIEvent.MUTE_CLICK with String = js.native
    
    /* "ui-events/mute-with-keyboard" */ val MUTE_WITH_KEYBOARD: typingsSlinky.playable.uiMod.UIEvent.MUTE_WITH_KEYBOARD with String = js.native
    
    /* "ui-events/pause-click" */ val PAUSE_CLICK: typingsSlinky.playable.uiMod.UIEvent.PAUSE_CLICK with String = js.native
    
    /* "ui-events/pause-with-screen-click" */ val PAUSE_WITH_SCREEN_CLICK: typingsSlinky.playable.uiMod.UIEvent.PAUSE_WITH_SCREEN_CLICK with String = js.native
    
    /* "ui-events/picture-in-picture-status-changed" */ val PICTURE_IN_PICTURE_STATUS_CHANGE: typingsSlinky.playable.uiMod.UIEvent.PICTURE_IN_PICTURE_STATUS_CHANGE with String = js.native
    
    /* "ui-events/play-click" */ val PLAY_CLICK: typingsSlinky.playable.uiMod.UIEvent.PLAY_CLICK with String = js.native
    
    /* "ui-events/play-overlay-click" */ val PLAY_OVERLAY_CLICK: typingsSlinky.playable.uiMod.UIEvent.PLAY_OVERLAY_CLICK with String = js.native
    
    /* "ui-events/play-with-screen-click" */ val PLAY_WITH_SCREEN_CLICK: typingsSlinky.playable.uiMod.UIEvent.PLAY_WITH_SCREEN_CLICK with String = js.native
    
    /* "ui-events/progress-change" */ val PROGRESS_CHANGE: typingsSlinky.playable.uiMod.UIEvent.PROGRESS_CHANGE with String = js.native
    
    /* "ui-events/progress-drag-ended" */ val PROGRESS_DRAG_ENDED: typingsSlinky.playable.uiMod.UIEvent.PROGRESS_DRAG_ENDED with String = js.native
    
    /* "ui-events/progress-drag-started" */ val PROGRESS_DRAG_STARTED: typingsSlinky.playable.uiMod.UIEvent.PROGRESS_DRAG_STARTED with String = js.native
    
    /* "ui-events/progress-sync-button-mouse-enter" */ val PROGRESS_SYNC_BUTTON_MOUSE_ENTER: typingsSlinky.playable.uiMod.UIEvent.PROGRESS_SYNC_BUTTON_MOUSE_ENTER with String = js.native
    
    /* "ui-events/progress-sync-button-mouse-leave" */ val PROGRESS_SYNC_BUTTON_MOUSE_LEAVE: typingsSlinky.playable.uiMod.UIEvent.PROGRESS_SYNC_BUTTON_MOUSE_LEAVE with String = js.native
    
    /* "ui-events/progress-user-previewing-frame" */ val PROGRESS_USER_PREVIEWING_FRAME: typingsSlinky.playable.uiMod.UIEvent.PROGRESS_USER_PREVIEWING_FRAME with String = js.native
    
    /* "ui-events/resize" */ val RESIZE: typingsSlinky.playable.uiMod.UIEvent.RESIZE with String = js.native
    
    /* "ui-events/toggle-playback-with-keyboard" */ val TOGGLE_PLAYBACK_WITH_KEYBOARD: typingsSlinky.playable.uiMod.UIEvent.TOGGLE_PLAYBACK_WITH_KEYBOARD with String = js.native
    
    /* "ui-events/unmute-click" */ val UNMUTE_CLICK: typingsSlinky.playable.uiMod.UIEvent.UNMUTE_CLICK with String = js.native
    
    /* "ui-events/unmute-with-keyboard" */ val UNMUTE_WITH_KEYBOARD: typingsSlinky.playable.uiMod.UIEvent.UNMUTE_WITH_KEYBOARD with String = js.native
    
    /* "ui-events/volume-change" */ val VOLUME_CHANGE: typingsSlinky.playable.uiMod.UIEvent.VOLUME_CHANGE with String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "UI_EVENTS")
  @js.native
  object UI_EVENTS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UIEvent with String] = js.native
    
    /* "ui-events/control-drag-end" */ val CONTROL_DRAG_END: typingsSlinky.playable.uiMod.UIEvent.CONTROL_DRAG_END with String = js.native
    
    /* "ui-events/control-drag-start" */ val CONTROL_DRAG_START: typingsSlinky.playable.uiMod.UIEvent.CONTROL_DRAG_START with String = js.native
    
    /* "ui-events/decrease-volume-with-keyboard" */ val DECREASE_VOLUME_WITH_KEYBOARD: typingsSlinky.playable.uiMod.UIEvent.DECREASE_VOLUME_WITH_KEYBOARD with String = js.native
    
    /* "ui-events/enter-full-screen-click" */ val ENTER_FULL_SCREEN_CLICK: typingsSlinky.playable.uiMod.UIEvent.ENTER_FULL_SCREEN_CLICK with String = js.native
    
    /* "ui-events/enter-full-screen-with-screen-click" */ val ENTER_FULL_SCREEN_WITH_SCREEN_CLICK: typingsSlinky.playable.uiMod.UIEvent.ENTER_FULL_SCREEN_WITH_SCREEN_CLICK with String = js.native
    
    /* "ui-events/enter-picture-in-picture-click" */ val ENTER_PICTURE_IN_PICTURE_CLICK: typingsSlinky.playable.uiMod.UIEvent.ENTER_PICTURE_IN_PICTURE_CLICK with String = js.native
    
    /* "ui-events/exit-full-screen-click" */ val EXIT_FULL_SCREEN_CLICK: typingsSlinky.playable.uiMod.UIEvent.EXIT_FULL_SCREEN_CLICK with String = js.native
    
    /* "ui-events/exit-full-screen-with-screen-click" */ val EXIT_FULL_SCREEN_WITH_SCREEN_CLICK: typingsSlinky.playable.uiMod.UIEvent.EXIT_FULL_SCREEN_WITH_SCREEN_CLICK with String = js.native
    
    /* "ui-events/exit-picture-in-picture-click" */ val EXIT_PICTURE_IN_PICTURE_CLICK: typingsSlinky.playable.uiMod.UIEvent.EXIT_PICTURE_IN_PICTURE_CLICK with String = js.native
    
    /* "ui-events/focus-enter-on-player" */ val FOCUS_ENTER_ON_PLAYER: typingsSlinky.playable.uiMod.UIEvent.FOCUS_ENTER_ON_PLAYER with String = js.native
    
    /* "ui-events/focus-leave-on-player" */ val FOCUS_LEAVE_ON_PLAYER: typingsSlinky.playable.uiMod.UIEvent.FOCUS_LEAVE_ON_PLAYER with String = js.native
    
    /* "ui-events/full-screen-state-changed" */ val FULL_SCREEN_STATE_CHANGED: typingsSlinky.playable.uiMod.UIEvent.FULL_SCREEN_STATE_CHANGED with String = js.native
    
    /* "ui-events/go-backward-with-keyboard" */ val GO_BACKWARD_WITH_KEYBOARD: typingsSlinky.playable.uiMod.UIEvent.GO_BACKWARD_WITH_KEYBOARD with String = js.native
    
    /* "ui-events/go-forward-with-keyboard" */ val GO_FORWARD_WITH_KEYBOARD: typingsSlinky.playable.uiMod.UIEvent.GO_FORWARD_WITH_KEYBOARD with String = js.native
    
    /* "ui-events/hide-interaction-indicator" */ val HIDE_INTERACTION_INDICATOR: typingsSlinky.playable.uiMod.UIEvent.HIDE_INTERACTION_INDICATOR with String = js.native
    
    /* "ui-events/increase-volume-with-keyboard" */ val INCREASE_VOLUME_WITH_KEYBOARD: typingsSlinky.playable.uiMod.UIEvent.INCREASE_VOLUME_WITH_KEYBOARD with String = js.native
    
    /* "ui-events/keyboard-keydown-intercepted" */ val KEYBOARD_KEYDOWN_INTERCEPTED: typingsSlinky.playable.uiMod.UIEvent.KEYBOARD_KEYDOWN_INTERCEPTED with String = js.native
    
    /* "ui-events/loader-hide" */ val LOADER_HIDE: typingsSlinky.playable.uiMod.UIEvent.LOADER_HIDE with String = js.native
    
    /* "ui-events/loader-show" */ val LOADER_SHOW: typingsSlinky.playable.uiMod.UIEvent.LOADER_SHOW with String = js.native
    
    /* "ui-events/loading-cover-hide" */ val LOADING_COVER_HIDE: typingsSlinky.playable.uiMod.UIEvent.LOADING_COVER_HIDE with String = js.native
    
    /* "ui-events/loading-cover-show" */ val LOADING_COVER_SHOW: typingsSlinky.playable.uiMod.UIEvent.LOADING_COVER_SHOW with String = js.native
    
    /* "ui-events/main-block-hide" */ val MAIN_BLOCK_HIDE: typingsSlinky.playable.uiMod.UIEvent.MAIN_BLOCK_HIDE with String = js.native
    
    /* "ui-events/main-block-show" */ val MAIN_BLOCK_SHOW: typingsSlinky.playable.uiMod.UIEvent.MAIN_BLOCK_SHOW with String = js.native
    
    /* "ui-events/mouse-enter-on-player" */ val MOUSE_ENTER_ON_PLAYER: typingsSlinky.playable.uiMod.UIEvent.MOUSE_ENTER_ON_PLAYER with String = js.native
    
    /* "ui-events/mouse-leave-on-player" */ val MOUSE_LEAVE_ON_PLAYER: typingsSlinky.playable.uiMod.UIEvent.MOUSE_LEAVE_ON_PLAYER with String = js.native
    
    /* "ui-events/mouse-move-on-player" */ val MOUSE_MOVE_ON_PLAYER: typingsSlinky.playable.uiMod.UIEvent.MOUSE_MOVE_ON_PLAYER with String = js.native
    
    /* "ui-events/mute-click" */ val MUTE_CLICK: typingsSlinky.playable.uiMod.UIEvent.MUTE_CLICK with String = js.native
    
    /* "ui-events/mute-with-keyboard" */ val MUTE_WITH_KEYBOARD: typingsSlinky.playable.uiMod.UIEvent.MUTE_WITH_KEYBOARD with String = js.native
    
    /* "ui-events/pause-click" */ val PAUSE_CLICK: typingsSlinky.playable.uiMod.UIEvent.PAUSE_CLICK with String = js.native
    
    /* "ui-events/pause-with-screen-click" */ val PAUSE_WITH_SCREEN_CLICK: typingsSlinky.playable.uiMod.UIEvent.PAUSE_WITH_SCREEN_CLICK with String = js.native
    
    /* "ui-events/picture-in-picture-status-changed" */ val PICTURE_IN_PICTURE_STATUS_CHANGE: typingsSlinky.playable.uiMod.UIEvent.PICTURE_IN_PICTURE_STATUS_CHANGE with String = js.native
    
    /* "ui-events/play-click" */ val PLAY_CLICK: typingsSlinky.playable.uiMod.UIEvent.PLAY_CLICK with String = js.native
    
    /* "ui-events/play-overlay-click" */ val PLAY_OVERLAY_CLICK: typingsSlinky.playable.uiMod.UIEvent.PLAY_OVERLAY_CLICK with String = js.native
    
    /* "ui-events/play-with-screen-click" */ val PLAY_WITH_SCREEN_CLICK: typingsSlinky.playable.uiMod.UIEvent.PLAY_WITH_SCREEN_CLICK with String = js.native
    
    /* "ui-events/progress-change" */ val PROGRESS_CHANGE: typingsSlinky.playable.uiMod.UIEvent.PROGRESS_CHANGE with String = js.native
    
    /* "ui-events/progress-drag-ended" */ val PROGRESS_DRAG_ENDED: typingsSlinky.playable.uiMod.UIEvent.PROGRESS_DRAG_ENDED with String = js.native
    
    /* "ui-events/progress-drag-started" */ val PROGRESS_DRAG_STARTED: typingsSlinky.playable.uiMod.UIEvent.PROGRESS_DRAG_STARTED with String = js.native
    
    /* "ui-events/progress-sync-button-mouse-enter" */ val PROGRESS_SYNC_BUTTON_MOUSE_ENTER: typingsSlinky.playable.uiMod.UIEvent.PROGRESS_SYNC_BUTTON_MOUSE_ENTER with String = js.native
    
    /* "ui-events/progress-sync-button-mouse-leave" */ val PROGRESS_SYNC_BUTTON_MOUSE_LEAVE: typingsSlinky.playable.uiMod.UIEvent.PROGRESS_SYNC_BUTTON_MOUSE_LEAVE with String = js.native
    
    /* "ui-events/progress-user-previewing-frame" */ val PROGRESS_USER_PREVIEWING_FRAME: typingsSlinky.playable.uiMod.UIEvent.PROGRESS_USER_PREVIEWING_FRAME with String = js.native
    
    /* "ui-events/resize" */ val RESIZE: typingsSlinky.playable.uiMod.UIEvent.RESIZE with String = js.native
    
    /* "ui-events/toggle-playback-with-keyboard" */ val TOGGLE_PLAYBACK_WITH_KEYBOARD: typingsSlinky.playable.uiMod.UIEvent.TOGGLE_PLAYBACK_WITH_KEYBOARD with String = js.native
    
    /* "ui-events/unmute-click" */ val UNMUTE_CLICK: typingsSlinky.playable.uiMod.UIEvent.UNMUTE_CLICK with String = js.native
    
    /* "ui-events/unmute-with-keyboard" */ val UNMUTE_WITH_KEYBOARD: typingsSlinky.playable.uiMod.UIEvent.UNMUTE_WITH_KEYBOARD with String = js.native
    
    /* "ui-events/volume-change" */ val VOLUME_CHANGE: typingsSlinky.playable.uiMod.UIEvent.VOLUME_CHANGE with String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "VIDEO_EVENTS")
  @js.native
  object VIDEO_EVENTS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VideoEvent with String] = js.native
    
    /* "video-events/chunk-loaded" */ val CHUNK_LOADED: typingsSlinky.playable.videoMod.VideoEvent.CHUNK_LOADED with String = js.native
    
    /* "video-events/current-time-updated" */ val CURRENT_TIME_UPDATED: typingsSlinky.playable.videoMod.VideoEvent.CURRENT_TIME_UPDATED with String = js.native
    
    /* "video-events/duration-updated" */ val DURATION_UPDATED: typingsSlinky.playable.videoMod.VideoEvent.DURATION_UPDATED with String = js.native
    
    /* "video-events/dynamic-content-ended" */ val DYNAMIC_CONTENT_ENDED: typingsSlinky.playable.videoMod.VideoEvent.DYNAMIC_CONTENT_ENDED with String = js.native
    
    /* "video-events/error" */ val ERROR: typingsSlinky.playable.videoMod.VideoEvent.ERROR with String = js.native
    
    /* "video-events/live-state-changed" */ val LIVE_STATE_CHANGED: typingsSlinky.playable.videoMod.VideoEvent.LIVE_STATE_CHANGED with String = js.native
    
    /* "video-events/mute-changed" */ val MUTE_CHANGED: typingsSlinky.playable.videoMod.VideoEvent.MUTE_CHANGED with String = js.native
    
    /* "video-events/play-aborted" */ val PLAY_ABORTED: typingsSlinky.playable.videoMod.VideoEvent.PLAY_ABORTED with String = js.native
    
    /* "video-events/play-request" */ val PLAY_REQUEST: typingsSlinky.playable.videoMod.VideoEvent.PLAY_REQUEST with String = js.native
    
    /* "video-events/reset-playback" */ val RESET: typingsSlinky.playable.videoMod.VideoEvent.RESET with String = js.native
    
    /* "video-events/seek-in-progress" */ val SEEK_IN_PROGRESS: typingsSlinky.playable.videoMod.VideoEvent.SEEK_IN_PROGRESS with String = js.native
    
    /* "video-events/sound-state-changed" */ val SOUND_STATE_CHANGED: typingsSlinky.playable.videoMod.VideoEvent.SOUND_STATE_CHANGED with String = js.native
    
    /* "video-events/state-changed" */ val STATE_CHANGED: typingsSlinky.playable.videoMod.VideoEvent.STATE_CHANGED with String = js.native
    
    /* "video-events/upload-stalled" */ val UPLOAD_STALLED: typingsSlinky.playable.videoMod.VideoEvent.UPLOAD_STALLED with String = js.native
    
    /* "video-events/upload-suspend" */ val UPLOAD_SUSPEND: typingsSlinky.playable.videoMod.VideoEvent.UPLOAD_SUSPEND with String = js.native
    
    /* "video-events/volume-changed" */ val VOLUME_CHANGED: typingsSlinky.playable.videoMod.VideoEvent.VOLUME_CHANGED with String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "VideoEvent")
  @js.native
  object VideoEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.playable.videoMod.VideoEvent with String] = js.native
    
    /* "video-events/chunk-loaded" */ val CHUNK_LOADED: typingsSlinky.playable.videoMod.VideoEvent.CHUNK_LOADED with String = js.native
    
    /* "video-events/current-time-updated" */ val CURRENT_TIME_UPDATED: typingsSlinky.playable.videoMod.VideoEvent.CURRENT_TIME_UPDATED with String = js.native
    
    /* "video-events/duration-updated" */ val DURATION_UPDATED: typingsSlinky.playable.videoMod.VideoEvent.DURATION_UPDATED with String = js.native
    
    /* "video-events/dynamic-content-ended" */ val DYNAMIC_CONTENT_ENDED: typingsSlinky.playable.videoMod.VideoEvent.DYNAMIC_CONTENT_ENDED with String = js.native
    
    /* "video-events/error" */ val ERROR: typingsSlinky.playable.videoMod.VideoEvent.ERROR with String = js.native
    
    /* "video-events/live-state-changed" */ val LIVE_STATE_CHANGED: typingsSlinky.playable.videoMod.VideoEvent.LIVE_STATE_CHANGED with String = js.native
    
    /* "video-events/mute-changed" */ val MUTE_CHANGED: typingsSlinky.playable.videoMod.VideoEvent.MUTE_CHANGED with String = js.native
    
    /* "video-events/play-aborted" */ val PLAY_ABORTED: typingsSlinky.playable.videoMod.VideoEvent.PLAY_ABORTED with String = js.native
    
    /* "video-events/play-request" */ val PLAY_REQUEST: typingsSlinky.playable.videoMod.VideoEvent.PLAY_REQUEST with String = js.native
    
    /* "video-events/reset-playback" */ val RESET: typingsSlinky.playable.videoMod.VideoEvent.RESET with String = js.native
    
    /* "video-events/seek-in-progress" */ val SEEK_IN_PROGRESS: typingsSlinky.playable.videoMod.VideoEvent.SEEK_IN_PROGRESS with String = js.native
    
    /* "video-events/sound-state-changed" */ val SOUND_STATE_CHANGED: typingsSlinky.playable.videoMod.VideoEvent.SOUND_STATE_CHANGED with String = js.native
    
    /* "video-events/state-changed" */ val STATE_CHANGED: typingsSlinky.playable.videoMod.VideoEvent.STATE_CHANGED with String = js.native
    
    /* "video-events/upload-stalled" */ val UPLOAD_STALLED: typingsSlinky.playable.videoMod.VideoEvent.UPLOAD_STALLED with String = js.native
    
    /* "video-events/upload-suspend" */ val UPLOAD_SUSPEND: typingsSlinky.playable.videoMod.VideoEvent.UPLOAD_SUSPEND with String = js.native
    
    /* "video-events/volume-changed" */ val VOLUME_CHANGED: typingsSlinky.playable.videoMod.VideoEvent.VOLUME_CHANGED with String = js.native
  }
}
