package typingsSlinky.hlsJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // interface Segment {}
  // interface TimeRange {}
  // interface SubtitleTracks {}
  type CustomLogger = js.Function1[/* repeated */ js.Any, scala.Unit]
  type K_AUDIO_TRACKS_UPDATED = typingsSlinky.hlsJs.hlsJsStrings.hlsAudioTracksUpdated
  type K_AUDIO_TRACK_LOADED = typingsSlinky.hlsJs.hlsJsStrings.hlsAudioTrackLoaded
  type K_AUDIO_TRACK_LOADING = typingsSlinky.hlsJs.hlsJsStrings.hlsAudioTrackLoading
  type K_AUDIO_TRACK_LOAD_ERROR = typingsSlinky.hlsJs.hlsJsStrings.audioTrackLoadError
  type K_AUDIO_TRACK_LOAD_TIMEOUT = typingsSlinky.hlsJs.hlsJsStrings.audioTrackLoadTimeout
  type K_AUDIO_TRACK_SWITCH = typingsSlinky.hlsJs.hlsJsStrings.hlsAudioTrackSwitch
  type K_AUDIO_TRACK_SWITCHED = typingsSlinky.hlsJs.hlsJsStrings.hlsAudioTrackSwitched
  type K_AUDIO_TRACK_SWITCHING = typingsSlinky.hlsJs.hlsJsStrings.hlsAudioTrackSwitching
  type K_BUFFER_ADD_CODEC_ERROR = typingsSlinky.hlsJs.hlsJsStrings.bufferAddCodecError
  type K_BUFFER_APPENDED = typingsSlinky.hlsJs.hlsJsStrings.hlsBufferAppended
  type K_BUFFER_APPENDING = typingsSlinky.hlsJs.hlsJsStrings.hlsBufferAppending
  type K_BUFFER_APPENDING_ERROR = typingsSlinky.hlsJs.hlsJsStrings.bufferAppendingError
  type K_BUFFER_APPEND_ERROR = typingsSlinky.hlsJs.hlsJsStrings.bufferAppendError
  type K_BUFFER_CODECS = typingsSlinky.hlsJs.hlsJsStrings.hlsBufferCodecs
  type K_BUFFER_CREATED = typingsSlinky.hlsJs.hlsJsStrings.hlsBufferCreated
  type K_BUFFER_EOS = typingsSlinky.hlsJs.hlsJsStrings.hlsBufferEOS
  type K_BUFFER_FLUSHED = typingsSlinky.hlsJs.hlsJsStrings.hlsBufferFlushed
  type K_BUFFER_FLUSHING = typingsSlinky.hlsJs.hlsJsStrings.hlsBufferFlushing
  type K_BUFFER_FULL_ERROR = typingsSlinky.hlsJs.hlsJsStrings.bufferFullError
  type K_BUFFER_NUDGE_ON_STALL = typingsSlinky.hlsJs.hlsJsStrings.bufferNudgeOnStall
  type K_BUFFER_RESET = typingsSlinky.hlsJs.hlsJsStrings.hlsBufferReset
  type K_BUFFER_SEEK_OVER_HOLE = typingsSlinky.hlsJs.hlsJsStrings.bufferSeekOverHole
  type K_BUFFER_STALLED_ERROR = typingsSlinky.hlsJs.hlsJsStrings.bufferStalledError
  type K_DESTROYING = typingsSlinky.hlsJs.hlsJsStrings.hlsDestroying
  type K_ERROR = typingsSlinky.hlsJs.hlsJsStrings.hlsError
  type K_FPS_DROP = typingsSlinky.hlsJs.hlsJsStrings.hlsFpsDrop
  type K_FPS_DROP_LEVEL_CAPPING = typingsSlinky.hlsJs.hlsJsStrings.hlsFpsDropLevelCapping
  type K_FRAG_BUFFERED = typingsSlinky.hlsJs.hlsJsStrings.hlsFragBuffered
  type K_FRAG_CHANGED = typingsSlinky.hlsJs.hlsJsStrings.hlsFragChanged
  type K_FRAG_DECRYPTED = typingsSlinky.hlsJs.hlsJsStrings.hlsFragDecrypted
  type K_FRAG_DECRYPT_ERROR = typingsSlinky.hlsJs.hlsJsStrings.fragDecryptError
  type K_FRAG_LOADED = typingsSlinky.hlsJs.hlsJsStrings.hlsFragLoaded
  type K_FRAG_LOADING = typingsSlinky.hlsJs.hlsJsStrings.hlsFragLoading
  type K_FRAG_LOAD_EMERGENCY_ABORTED = typingsSlinky.hlsJs.hlsJsStrings.hlsFragLoadEmergencyAborted
  type K_FRAG_LOAD_ERROR = typingsSlinky.hlsJs.hlsJsStrings.fragLoadError
  type K_FRAG_LOAD_PROGRESS = typingsSlinky.hlsJs.hlsJsStrings.hlsFragLoadProgress
  type K_FRAG_LOAD_TIMEOUT = typingsSlinky.hlsJs.hlsJsStrings.fragLoadTimeout
  type K_FRAG_LOOP_LOADING_ERROR = typingsSlinky.hlsJs.hlsJsStrings.fragLoopLoadingError
  type K_FRAG_PARSED = typingsSlinky.hlsJs.hlsJsStrings.hlsFragParsed
  type K_FRAG_PARSING_DATA = typingsSlinky.hlsJs.hlsJsStrings.hlsFragParsingData
  type K_FRAG_PARSING_ERROR = typingsSlinky.hlsJs.hlsJsStrings.fragParsingError
  type K_FRAG_PARSING_INIT_SEGMENT = typingsSlinky.hlsJs.hlsJsStrings.hlsFragParsingInitSegment
  type K_FRAG_PARSING_METADATA = typingsSlinky.hlsJs.hlsJsStrings.hlsFragParsingMetadata
  type K_FRAG_PARSING_USERDATA = typingsSlinky.hlsJs.hlsJsStrings.hlsFragParsingUserData
  type K_INIT_PTS_FOUND = typingsSlinky.hlsJs.hlsJsStrings.hlsInitPtsFound
  type K_INTERNAL_EXCEPTION = typingsSlinky.hlsJs.hlsJsStrings.interalException
  type K_KEY_LOADED = typingsSlinky.hlsJs.hlsJsStrings.hlsKeyLoaded
  type K_KEY_LOADING = typingsSlinky.hlsJs.hlsJsStrings.hlsKeyLoading
  type K_KEY_LOAD_ERROR = typingsSlinky.hlsJs.hlsJsStrings.keyLoadError
  type K_KEY_LOAD_TIMEOUT = typingsSlinky.hlsJs.hlsJsStrings.keyLoadTimeout
  type K_KEY_SYSTEM_ERROR = typingsSlinky.hlsJs.hlsJsStrings.keySystemError
  type K_LEVEL_LOADED = typingsSlinky.hlsJs.hlsJsStrings.hlsLevelLoaded
  type K_LEVEL_LOADING = typingsSlinky.hlsJs.hlsJsStrings.hlsLevelLoading
  type K_LEVEL_LOAD_ERROR = typingsSlinky.hlsJs.hlsJsStrings.levelLoadError
  type K_LEVEL_LOAD_TIMEOUT = typingsSlinky.hlsJs.hlsJsStrings.levelLoadTimeout
  type K_LEVEL_PTS_UPDATED = typingsSlinky.hlsJs.hlsJsStrings.hlsLevelPtsUpdated
  type K_LEVEL_SWITCHED = typingsSlinky.hlsJs.hlsJsStrings.hlsLevelSwitched
  type K_LEVEL_SWITCHING = typingsSlinky.hlsJs.hlsJsStrings.hlsLevelSwitching
  // OTHER_ERROR //
  type K_LEVEL_SWITCH_ERROR = typingsSlinky.hlsJs.hlsJsStrings.levelSwitchError
  type K_LEVEL_UPDATED = typingsSlinky.hlsJs.hlsJsStrings.hlsLevelUpdated
  // MEDIA_ERRORS //
  type K_MANIFEST_INCOMPATIBLE_CODECS_ERROR = typingsSlinky.hlsJs.hlsJsStrings.manifestIncompatibleCodecsError
  type K_MANIFEST_LOADED = typingsSlinky.hlsJs.hlsJsStrings.hlsManifestLoaded
  type K_MANIFEST_LOADING = typingsSlinky.hlsJs.hlsJsStrings.hlsManifestLoading
  // Error Keys
  type K_MANIFEST_LOAD_ERROR = typingsSlinky.hlsJs.hlsJsStrings.manifestLoadError
  type K_MANIFEST_LOAD_TIMEOUT = typingsSlinky.hlsJs.hlsJsStrings.manifestLoadTimeout
  type K_MANIFEST_PARSED = typingsSlinky.hlsJs.hlsJsStrings.hlsManifestParsed
  type K_MANIFEST_PARSING_ERROR = typingsSlinky.hlsJs.hlsJsStrings.manifestParsingError
  type K_MEDIA_ATTACHED = typingsSlinky.hlsJs.hlsJsStrings.hlsMediaAttached
  type K_MEDIA_ATTACHING = typingsSlinky.hlsJs.hlsJsStrings.hlsMediaAttaching
  type K_MEDIA_DETACHED = typingsSlinky.hlsJs.hlsJsStrings.hlsMediaDetached
  type K_MEDIA_DETACHING = typingsSlinky.hlsJs.hlsJsStrings.hlsMediaDetaching
  type K_MEDIA_ERROR = typingsSlinky.hlsJs.hlsJsStrings.mediaError
  type K_MUX_ERROR = typingsSlinky.hlsJs.hlsJsStrings.muxError
  // Error Type Keys
  type K_NETWORK_ERROR = typingsSlinky.hlsJs.hlsJsStrings.networkError
  type K_OTHER_ERROR = typingsSlinky.hlsJs.hlsJsStrings.otherError
  // MUX_ERROR //
  type K_REMUX_ALLOC_ERROR = typingsSlinky.hlsJs.hlsJsStrings.remuxAllocError
  type K_STREAM_STATE_TRANSITION = typingsSlinky.hlsJs.hlsJsStrings.hlsStreamStateTransition
  type K_SUBTITLE_FRAG_PROCESSED = typingsSlinky.hlsJs.hlsJsStrings.hlsSubtitleFragProcessed
  type K_SUBTITLE_TRACKS_UPDATED = typingsSlinky.hlsJs.hlsJsStrings.hlsSubtitleTracksUpdated
  type K_SUBTITLE_TRACK_LOADED = typingsSlinky.hlsJs.hlsJsStrings.hlsSubtitleTrackLoaded
  type K_SUBTITLE_TRACK_LOADING = typingsSlinky.hlsJs.hlsJsStrings.hlsSubtitleTrackLoading
  type K_SUBTITLE_TRACK_SWITCH = typingsSlinky.hlsJs.hlsJsStrings.hlsSubtitleTrackSwitch
  type LevelAttr = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
