package typingsSlinky.hlsJs

import typingsSlinky.hlsJs.mod.K_AUDIO_TRACKS_UPDATED
import typingsSlinky.hlsJs.mod.K_AUDIO_TRACK_LOADED
import typingsSlinky.hlsJs.mod.K_AUDIO_TRACK_LOADING
import typingsSlinky.hlsJs.mod.K_AUDIO_TRACK_SWITCH
import typingsSlinky.hlsJs.mod.K_AUDIO_TRACK_SWITCHED
import typingsSlinky.hlsJs.mod.K_AUDIO_TRACK_SWITCHING
import typingsSlinky.hlsJs.mod.K_BUFFER_APPENDED
import typingsSlinky.hlsJs.mod.K_BUFFER_APPENDING
import typingsSlinky.hlsJs.mod.K_BUFFER_CODECS
import typingsSlinky.hlsJs.mod.K_BUFFER_CREATED
import typingsSlinky.hlsJs.mod.K_BUFFER_EOS
import typingsSlinky.hlsJs.mod.K_BUFFER_FLUSHED
import typingsSlinky.hlsJs.mod.K_BUFFER_FLUSHING
import typingsSlinky.hlsJs.mod.K_BUFFER_RESET
import typingsSlinky.hlsJs.mod.K_DESTROYING
import typingsSlinky.hlsJs.mod.K_ERROR
import typingsSlinky.hlsJs.mod.K_FPS_DROP
import typingsSlinky.hlsJs.mod.K_FPS_DROP_LEVEL_CAPPING
import typingsSlinky.hlsJs.mod.K_FRAG_BUFFERED
import typingsSlinky.hlsJs.mod.K_FRAG_CHANGED
import typingsSlinky.hlsJs.mod.K_FRAG_DECRYPTED
import typingsSlinky.hlsJs.mod.K_FRAG_LOADED
import typingsSlinky.hlsJs.mod.K_FRAG_LOADING
import typingsSlinky.hlsJs.mod.K_FRAG_LOAD_EMERGENCY_ABORTED
import typingsSlinky.hlsJs.mod.K_FRAG_LOAD_PROGRESS
import typingsSlinky.hlsJs.mod.K_FRAG_PARSED
import typingsSlinky.hlsJs.mod.K_FRAG_PARSING_DATA
import typingsSlinky.hlsJs.mod.K_FRAG_PARSING_INIT_SEGMENT
import typingsSlinky.hlsJs.mod.K_FRAG_PARSING_METADATA
import typingsSlinky.hlsJs.mod.K_FRAG_PARSING_USERDATA
import typingsSlinky.hlsJs.mod.K_INIT_PTS_FOUND
import typingsSlinky.hlsJs.mod.K_KEY_LOADED
import typingsSlinky.hlsJs.mod.K_KEY_LOADING
import typingsSlinky.hlsJs.mod.K_LEVEL_LOADED
import typingsSlinky.hlsJs.mod.K_LEVEL_LOADING
import typingsSlinky.hlsJs.mod.K_LEVEL_PTS_UPDATED
import typingsSlinky.hlsJs.mod.K_LEVEL_SWITCHED
import typingsSlinky.hlsJs.mod.K_LEVEL_SWITCHING
import typingsSlinky.hlsJs.mod.K_LEVEL_UPDATED
import typingsSlinky.hlsJs.mod.K_MANIFEST_LOADED
import typingsSlinky.hlsJs.mod.K_MANIFEST_LOADING
import typingsSlinky.hlsJs.mod.K_MANIFEST_PARSED
import typingsSlinky.hlsJs.mod.K_MEDIA_ATTACHED
import typingsSlinky.hlsJs.mod.K_MEDIA_ATTACHING
import typingsSlinky.hlsJs.mod.K_MEDIA_DETACHED
import typingsSlinky.hlsJs.mod.K_MEDIA_DETACHING
import typingsSlinky.hlsJs.mod.K_STREAM_STATE_TRANSITION
import typingsSlinky.hlsJs.mod.K_SUBTITLE_FRAG_PROCESSED
import typingsSlinky.hlsJs.mod.K_SUBTITLE_TRACKS_UPDATED
import typingsSlinky.hlsJs.mod.K_SUBTITLE_TRACK_LOADED
import typingsSlinky.hlsJs.mod.K_SUBTITLE_TRACK_LOADING
import typingsSlinky.hlsJs.mod.K_SUBTITLE_TRACK_SWITCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAUDIOTRACKLOADED extends js.Object {
  /**
    * fired to notify that audio track lists has been updated
    * data: { audioTracks : audioTracks }
    */
  var AUDIO_TRACKS_UPDATED: K_AUDIO_TRACKS_UPDATED = js.native
  /**
    * fired when an audio track loading finishes
    * data: { details : levelDetails object, id : audio track id, stats : { trequest, tfirst, tload, mtime } }
    */
  var AUDIO_TRACK_LOADED: K_AUDIO_TRACK_LOADED = js.native
  /**
    * fired when an audio track loading starts
    * data: { url : audio track URL, id : audio track id }
    */
  var AUDIO_TRACK_LOADING: K_AUDIO_TRACK_LOADING = js.native
  /**
    * fired when an audio track switch occurs. deprecated in favor AUDIO_TRACK_SWITCHING
    * data: { id : audio track id }
    */
  var AUDIO_TRACK_SWITCH: K_AUDIO_TRACK_SWITCH = js.native
  /**
    * fired when an audio track switch actually occurs
    * data: { id : audio track id }
    */
  var AUDIO_TRACK_SWITCHED: K_AUDIO_TRACK_SWITCHED = js.native
  /**
    * fired when an audio track switching is requested
    * data: { id : audio track id }
    */
  var AUDIO_TRACK_SWITCHING: K_AUDIO_TRACK_SWITCHING = js.native
  /**
    * fired when we are done with appending a media segment to the buffer
    * data: { parent : segment parent that triggered BUFFER_APPENDING, pending : nb of segments waiting for appending for this segment parent }
    */
  var BUFFER_APPENDED: K_BUFFER_APPENDED = js.native
  /**
    * fired when we append a segment to the buffer
    * data: { segment: segment object }
    */
  var BUFFER_APPENDING: K_BUFFER_APPENDING = js.native
  /**
    * fired when we know about the codecs that we need buffers for to push into
    * data: { tracks : { container, codec, levelCodec, initSegment, metadata } }
    */
  var BUFFER_CODECS: K_BUFFER_CODECS = js.native
  /**
    * fired when sourcebuffers have been created
    * data: { tracks: tracks }
    */
  var BUFFER_CREATED: K_BUFFER_CREATED = js.native
  /**
    * fired when the stream is finished and we want to notify the media buffer that there will be no more data
    * data: { }
    */
  var BUFFER_EOS: K_BUFFER_EOS = js.native
  /**
    * fired when the media buffer has been flushed
    * data: { }
    */
  var BUFFER_FLUSHED: K_BUFFER_FLUSHED = js.native
  /**
    * fired when the media buffer should be flushed
    * data: { }
    */
  var BUFFER_FLUSHING: K_BUFFER_FLUSHING = js.native
  /**
    * fired when the buffer is going to be reset
    * data: { }
    */
  var BUFFER_RESET: K_BUFFER_RESET = js.native
  /**
    * fired when hls.js instance starts destroying. Different from MEDIA_DETACHED as one could want to detach and reattach a video to the instance of hls.js to handle mid-rolls for example.
    * data: { }
    */
  var DESTROYING: K_DESTROYING = js.native
  /**
    *  Identifier for an error event
    * data: { type : error type, details : error details, fatal : is error fatal or not, other error specific data }
    */
  var ERROR: K_ERROR = js.native
  /**
    * triggered when FPS drop in last monitoring period is higher than given threshold
    * data: { curentDropped : nb of dropped frames in last monitoring period,
    *         currentDecoded : nb of decoded frames in last monitoring period,
    *         totalDropped : total dropped frames on this video element }
    */
  var FPS_DROP: K_FPS_DROP = js.native
  /**
    * triggered when FPS drop triggers auto level capping
    * data: { level: suggested new auto level capping by fps controller, droppedLevel : level has to much dropped frame will be restricted }
    */
  var FPS_DROP_LEVEL_CAPPING: K_FPS_DROP_LEVEL_CAPPING = js.native
  /**
    * fired when fragment remuxed MP4 boxes have all been appended into SourceBuffer
    * data: { id: demuxer id, frag : fragment object, stats : { trequest, tfirst, tload, tparsed, tbuffered, length} }
    */
  var FRAG_BUFFERED: K_FRAG_BUFFERED = js.native
  /**
    * fired when fragment matching with current video position is changing
    * data: { frag : fragment object }
    */
  var FRAG_CHANGED: K_FRAG_CHANGED = js.native
  /**
    * fired when a fragment decryption is completed
    * data: { id: demuxer id, frag: fragment object, stats: { tstart, tdecrypt } }
    */
  var FRAG_DECRYPTED: K_FRAG_DECRYPTED = js.native
  /**
    * fired when a fragment loading is completed
    * data: { frag : fragment object, payload : fragment payload, stats : { trequest, tfirst, tload, length}}
    */
  var FRAG_LOADED: K_FRAG_LOADED = js.native
  /**
    * fired when a fragment loading starts
    * data: { frag : fragment object }
    */
  var FRAG_LOADING: K_FRAG_LOADING = js.native
  /**
    * identifier for fragment load aborting for emergency switch down
    * data: { frag: fragment object }
    */
  var FRAG_LOAD_EMERGENCY_ABORTED: K_FRAG_LOAD_EMERGENCY_ABORTED = js.native
  /**
    * fired when a fragment load is in progress
    * data: { frag : fragment object with frag.loaded=stats.loaded, stats : { trequest, tfirst, loaded, total } }
    */
  var FRAG_LOAD_PROGRESS: K_FRAG_LOAD_PROGRESS = js.native
  /**
    * fired when fragment parsing is completed
    * data: { id: demuxer id}
    */
  var FRAG_PARSED: K_FRAG_PARSED = js.native
  /**
    * fired when moof/mdat have been extracted from fragment
    * data: { id: demuxer id,
    *        moof : moof MP4 box,
    *        mdat : mdat MP4 box,
    *        startPTS : PTS of first sample,
    *        endPTS : PTS of last sample,
    *        startDTS : DTS of first sample,
    *        endDTS : DTS of last sample,
    *        type : stream type (audio or video),
    *        nb : number of samples}
    */
  var FRAG_PARSING_DATA: K_FRAG_PARSING_DATA = js.native
  /**
    * fired when Init Segment has been extracted from fragment
    * data: { id: demuxer id, moov : moov MP4 box, codecs : codecs found while parsing fragment}
    */
  var FRAG_PARSING_INIT_SEGMENT: K_FRAG_PARSING_INIT_SEGMENT = js.native
  /**
    * fired when parsing id3 is completed
    * data: { id: demuxer id, samples : [ id3 pes - pts and dts timestamp are relative, values are in seconds]}
    */
  var FRAG_PARSING_METADATA: K_FRAG_PARSING_METADATA = js.native
  /**
    * fired when parsing sei text is completed
    * data: { id : demuxer id, frag: fragment object, samples : [ sei samples pes ] }
    */
  var FRAG_PARSING_USERDATA: K_FRAG_PARSING_USERDATA = js.native
  /**
    * fired when first timestamp has been found
    * data: { id: demuxer id, frag: fragment object, initPTS: initPTS }
    */
  var INIT_PTS_FOUND: K_INIT_PTS_FOUND = js.native
  /**
    * fired when a decryption key loading is completed
    * data: { frag: fragment object }
    */
  var KEY_LOADED: K_KEY_LOADED = js.native
  /**
    * fired when a decryption key loading starts
    * data: { frag: fragment object }
    */
  var KEY_LOADING: K_KEY_LOADING = js.native
  /**
    * fired when a level playlist loading finishes
    * data: { details : levelDetails object, levelId : id of loaded level, stats : { trequest, tfirst, tload, mtime } }
    */
  var LEVEL_LOADED: K_LEVEL_LOADED = js.native
  /**
    * fired when a level playlist loading starts
    * data: { url : level URL, level : id of level being loaded }
    */
  var LEVEL_LOADING: K_LEVEL_LOADING = js.native
  /**
    * fired when a level's PTS information has been updated after parsing a fragment
    * data: { details: levelDetails object, level : id of updated level, drift: PTS drift observed when parsing last fragment }
    */
  var LEVEL_PTS_UPDATED: K_LEVEL_PTS_UPDATED = js.native
  /**
    * fired when a level switch is effective
    * data: { level: level object }
    */
  var LEVEL_SWITCHED: K_LEVEL_SWITCHED = js.native
  /**
    * fired when a level switch is requested
    * data: { level: Level }
    */
  var LEVEL_SWITCHING: K_LEVEL_SWITCHING = js.native
  /**
    * fired when a level's details have been updated based on previous details, after it has been loaded
    * data: { details : levelDetails object, level : id of updated level }
    */
  var LEVEL_UPDATED: K_LEVEL_UPDATED = js.native
  /**
    * fired after manifest has been loaded
    * data: { levels : [available quality levels] , audioTracks : [ available audio tracks], url : manifestURL, stats : { trequest, tfirst, tload, mtime}}
    */
  var MANIFEST_LOADED: K_MANIFEST_LOADED = js.native
  /**
    * fired to signal that a manifest loading starts
    * data: { url : manifestURL }
    */
  var MANIFEST_LOADING: K_MANIFEST_LOADING = js.native
  /**
    * fired after manifest has been parsed
    * data: { levels : [ available quality levels ], firstLevel : index of first quality level appearing in Manifest }
    */
  var MANIFEST_PARSED: K_MANIFEST_PARSED = js.native
  /**
    * fired when Media has been succesfully attached to hls instance
    * data: { video , mediaSource }
    */
  var MEDIA_ATTACHED: K_MEDIA_ATTACHED = js.native
  /**
    * fired to attach Media to hls instance
    * data: { video , mediaSource }
    */
  var MEDIA_ATTACHING: K_MEDIA_ATTACHING = js.native
  /**
    * fired when Media has been detached from hls instance
    * data: { }
    */
  var MEDIA_DETACHED: K_MEDIA_DETACHED = js.native
  /**
    * fired before detaching Media from hls instance
    * data: { }
    */
  var MEDIA_DETACHING: K_MEDIA_DETACHING = js.native
  /**
    * fired upon stream controller state transitions
    * data: { previousState, nextState }
    */
  var STREAM_STATE_TRANSITION: K_STREAM_STATE_TRANSITION = js.native
  /**
    * fired when a subtitle fragment has been processed
    * data: { success : boolean, frag : the processed frag }
    */
  var SUBTITLE_FRAG_PROCESSED: K_SUBTITLE_FRAG_PROCESSED = js.native
  /**
    * fired to notify that subtitle track lists has been updated
    * data: { subtitleTracks : subtitleTracks }
    */
  var SUBTITLE_TRACKS_UPDATED: K_SUBTITLE_TRACKS_UPDATED = js.native
  /**
    * fired when a subtitle track loading finishes
    * data: { details : levelDetails object, id : subtitle track id, stats : { trequest, tfirst, tload, mtime } }
    */
  var SUBTITLE_TRACK_LOADED: K_SUBTITLE_TRACK_LOADED = js.native
  /**
    * fired when a subtitle track loading starts
    * data: { url : subtitle track URL, id : subtitle track id }
    */
  var SUBTITLE_TRACK_LOADING: K_SUBTITLE_TRACK_LOADING = js.native
  /**
    * fired when an subtitle track switch occurs
    * data: { id : subtitle track id }
    */
  var SUBTITLE_TRACK_SWITCH: K_SUBTITLE_TRACK_SWITCH = js.native
}

object AnonAUDIOTRACKLOADED {
  @scala.inline
  def apply(
    AUDIO_TRACKS_UPDATED: K_AUDIO_TRACKS_UPDATED,
    AUDIO_TRACK_LOADED: K_AUDIO_TRACK_LOADED,
    AUDIO_TRACK_LOADING: K_AUDIO_TRACK_LOADING,
    AUDIO_TRACK_SWITCH: K_AUDIO_TRACK_SWITCH,
    AUDIO_TRACK_SWITCHED: K_AUDIO_TRACK_SWITCHED,
    AUDIO_TRACK_SWITCHING: K_AUDIO_TRACK_SWITCHING,
    BUFFER_APPENDED: K_BUFFER_APPENDED,
    BUFFER_APPENDING: K_BUFFER_APPENDING,
    BUFFER_CODECS: K_BUFFER_CODECS,
    BUFFER_CREATED: K_BUFFER_CREATED,
    BUFFER_EOS: K_BUFFER_EOS,
    BUFFER_FLUSHED: K_BUFFER_FLUSHED,
    BUFFER_FLUSHING: K_BUFFER_FLUSHING,
    BUFFER_RESET: K_BUFFER_RESET,
    DESTROYING: K_DESTROYING,
    ERROR: K_ERROR,
    FPS_DROP: K_FPS_DROP,
    FPS_DROP_LEVEL_CAPPING: K_FPS_DROP_LEVEL_CAPPING,
    FRAG_BUFFERED: K_FRAG_BUFFERED,
    FRAG_CHANGED: K_FRAG_CHANGED,
    FRAG_DECRYPTED: K_FRAG_DECRYPTED,
    FRAG_LOADED: K_FRAG_LOADED,
    FRAG_LOADING: K_FRAG_LOADING,
    FRAG_LOAD_EMERGENCY_ABORTED: K_FRAG_LOAD_EMERGENCY_ABORTED,
    FRAG_LOAD_PROGRESS: K_FRAG_LOAD_PROGRESS,
    FRAG_PARSED: K_FRAG_PARSED,
    FRAG_PARSING_DATA: K_FRAG_PARSING_DATA,
    FRAG_PARSING_INIT_SEGMENT: K_FRAG_PARSING_INIT_SEGMENT,
    FRAG_PARSING_METADATA: K_FRAG_PARSING_METADATA,
    FRAG_PARSING_USERDATA: K_FRAG_PARSING_USERDATA,
    INIT_PTS_FOUND: K_INIT_PTS_FOUND,
    KEY_LOADED: K_KEY_LOADED,
    KEY_LOADING: K_KEY_LOADING,
    LEVEL_LOADED: K_LEVEL_LOADED,
    LEVEL_LOADING: K_LEVEL_LOADING,
    LEVEL_PTS_UPDATED: K_LEVEL_PTS_UPDATED,
    LEVEL_SWITCHED: K_LEVEL_SWITCHED,
    LEVEL_SWITCHING: K_LEVEL_SWITCHING,
    LEVEL_UPDATED: K_LEVEL_UPDATED,
    MANIFEST_LOADED: K_MANIFEST_LOADED,
    MANIFEST_LOADING: K_MANIFEST_LOADING,
    MANIFEST_PARSED: K_MANIFEST_PARSED,
    MEDIA_ATTACHED: K_MEDIA_ATTACHED,
    MEDIA_ATTACHING: K_MEDIA_ATTACHING,
    MEDIA_DETACHED: K_MEDIA_DETACHED,
    MEDIA_DETACHING: K_MEDIA_DETACHING,
    STREAM_STATE_TRANSITION: K_STREAM_STATE_TRANSITION,
    SUBTITLE_FRAG_PROCESSED: K_SUBTITLE_FRAG_PROCESSED,
    SUBTITLE_TRACKS_UPDATED: K_SUBTITLE_TRACKS_UPDATED,
    SUBTITLE_TRACK_LOADED: K_SUBTITLE_TRACK_LOADED,
    SUBTITLE_TRACK_LOADING: K_SUBTITLE_TRACK_LOADING,
    SUBTITLE_TRACK_SWITCH: K_SUBTITLE_TRACK_SWITCH
  ): AnonAUDIOTRACKLOADED = {
    val __obj = js.Dynamic.literal(AUDIO_TRACKS_UPDATED = AUDIO_TRACKS_UPDATED.asInstanceOf[js.Any], AUDIO_TRACK_LOADED = AUDIO_TRACK_LOADED.asInstanceOf[js.Any], AUDIO_TRACK_LOADING = AUDIO_TRACK_LOADING.asInstanceOf[js.Any], AUDIO_TRACK_SWITCH = AUDIO_TRACK_SWITCH.asInstanceOf[js.Any], AUDIO_TRACK_SWITCHED = AUDIO_TRACK_SWITCHED.asInstanceOf[js.Any], AUDIO_TRACK_SWITCHING = AUDIO_TRACK_SWITCHING.asInstanceOf[js.Any], BUFFER_APPENDED = BUFFER_APPENDED.asInstanceOf[js.Any], BUFFER_APPENDING = BUFFER_APPENDING.asInstanceOf[js.Any], BUFFER_CODECS = BUFFER_CODECS.asInstanceOf[js.Any], BUFFER_CREATED = BUFFER_CREATED.asInstanceOf[js.Any], BUFFER_EOS = BUFFER_EOS.asInstanceOf[js.Any], BUFFER_FLUSHED = BUFFER_FLUSHED.asInstanceOf[js.Any], BUFFER_FLUSHING = BUFFER_FLUSHING.asInstanceOf[js.Any], BUFFER_RESET = BUFFER_RESET.asInstanceOf[js.Any], DESTROYING = DESTROYING.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FPS_DROP = FPS_DROP.asInstanceOf[js.Any], FPS_DROP_LEVEL_CAPPING = FPS_DROP_LEVEL_CAPPING.asInstanceOf[js.Any], FRAG_BUFFERED = FRAG_BUFFERED.asInstanceOf[js.Any], FRAG_CHANGED = FRAG_CHANGED.asInstanceOf[js.Any], FRAG_DECRYPTED = FRAG_DECRYPTED.asInstanceOf[js.Any], FRAG_LOADED = FRAG_LOADED.asInstanceOf[js.Any], FRAG_LOADING = FRAG_LOADING.asInstanceOf[js.Any], FRAG_LOAD_EMERGENCY_ABORTED = FRAG_LOAD_EMERGENCY_ABORTED.asInstanceOf[js.Any], FRAG_LOAD_PROGRESS = FRAG_LOAD_PROGRESS.asInstanceOf[js.Any], FRAG_PARSED = FRAG_PARSED.asInstanceOf[js.Any], FRAG_PARSING_DATA = FRAG_PARSING_DATA.asInstanceOf[js.Any], FRAG_PARSING_INIT_SEGMENT = FRAG_PARSING_INIT_SEGMENT.asInstanceOf[js.Any], FRAG_PARSING_METADATA = FRAG_PARSING_METADATA.asInstanceOf[js.Any], FRAG_PARSING_USERDATA = FRAG_PARSING_USERDATA.asInstanceOf[js.Any], INIT_PTS_FOUND = INIT_PTS_FOUND.asInstanceOf[js.Any], KEY_LOADED = KEY_LOADED.asInstanceOf[js.Any], KEY_LOADING = KEY_LOADING.asInstanceOf[js.Any], LEVEL_LOADED = LEVEL_LOADED.asInstanceOf[js.Any], LEVEL_LOADING = LEVEL_LOADING.asInstanceOf[js.Any], LEVEL_PTS_UPDATED = LEVEL_PTS_UPDATED.asInstanceOf[js.Any], LEVEL_SWITCHED = LEVEL_SWITCHED.asInstanceOf[js.Any], LEVEL_SWITCHING = LEVEL_SWITCHING.asInstanceOf[js.Any], LEVEL_UPDATED = LEVEL_UPDATED.asInstanceOf[js.Any], MANIFEST_LOADED = MANIFEST_LOADED.asInstanceOf[js.Any], MANIFEST_LOADING = MANIFEST_LOADING.asInstanceOf[js.Any], MANIFEST_PARSED = MANIFEST_PARSED.asInstanceOf[js.Any], MEDIA_ATTACHED = MEDIA_ATTACHED.asInstanceOf[js.Any], MEDIA_ATTACHING = MEDIA_ATTACHING.asInstanceOf[js.Any], MEDIA_DETACHED = MEDIA_DETACHED.asInstanceOf[js.Any], MEDIA_DETACHING = MEDIA_DETACHING.asInstanceOf[js.Any], STREAM_STATE_TRANSITION = STREAM_STATE_TRANSITION.asInstanceOf[js.Any], SUBTITLE_FRAG_PROCESSED = SUBTITLE_FRAG_PROCESSED.asInstanceOf[js.Any], SUBTITLE_TRACKS_UPDATED = SUBTITLE_TRACKS_UPDATED.asInstanceOf[js.Any], SUBTITLE_TRACK_LOADED = SUBTITLE_TRACK_LOADED.asInstanceOf[js.Any], SUBTITLE_TRACK_LOADING = SUBTITLE_TRACK_LOADING.asInstanceOf[js.Any], SUBTITLE_TRACK_SWITCH = SUBTITLE_TRACK_SWITCH.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAUDIOTRACKLOADED]
  }
  @scala.inline
  implicit class AnonAUDIOTRACKLOADEDOps[Self <: AnonAUDIOTRACKLOADED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAUDIO_TRACKS_UPDATED(value: K_AUDIO_TRACKS_UPDATED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACKS_UPDATED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAUDIO_TRACK_LOADED(value: K_AUDIO_TRACK_LOADED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_LOADED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAUDIO_TRACK_LOADING(value: K_AUDIO_TRACK_LOADING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_LOADING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAUDIO_TRACK_SWITCH(value: K_AUDIO_TRACK_SWITCH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_SWITCH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAUDIO_TRACK_SWITCHED(value: K_AUDIO_TRACK_SWITCHED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_SWITCHED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAUDIO_TRACK_SWITCHING(value: K_AUDIO_TRACK_SWITCHING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_SWITCHING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBUFFER_APPENDED(value: K_BUFFER_APPENDED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_APPENDED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBUFFER_APPENDING(value: K_BUFFER_APPENDING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_APPENDING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBUFFER_CODECS(value: K_BUFFER_CODECS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_CODECS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBUFFER_CREATED(value: K_BUFFER_CREATED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_CREATED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBUFFER_EOS(value: K_BUFFER_EOS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_EOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBUFFER_FLUSHED(value: K_BUFFER_FLUSHED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_FLUSHED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBUFFER_FLUSHING(value: K_BUFFER_FLUSHING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_FLUSHING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBUFFER_RESET(value: K_BUFFER_RESET): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_RESET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDESTROYING(value: K_DESTROYING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DESTROYING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: K_ERROR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFPS_DROP(value: K_FPS_DROP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FPS_DROP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFPS_DROP_LEVEL_CAPPING(value: K_FPS_DROP_LEVEL_CAPPING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FPS_DROP_LEVEL_CAPPING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAG_BUFFERED(value: K_FRAG_BUFFERED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAG_BUFFERED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAG_CHANGED(value: K_FRAG_CHANGED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAG_CHANGED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAG_DECRYPTED(value: K_FRAG_DECRYPTED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAG_DECRYPTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAG_LOADED(value: K_FRAG_LOADED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOADED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAG_LOADING(value: K_FRAG_LOADING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOADING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAG_LOAD_EMERGENCY_ABORTED(value: K_FRAG_LOAD_EMERGENCY_ABORTED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOAD_EMERGENCY_ABORTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAG_LOAD_PROGRESS(value: K_FRAG_LOAD_PROGRESS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOAD_PROGRESS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAG_PARSED(value: K_FRAG_PARSED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAG_PARSING_DATA(value: K_FRAG_PARSING_DATA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSING_DATA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAG_PARSING_INIT_SEGMENT(value: K_FRAG_PARSING_INIT_SEGMENT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSING_INIT_SEGMENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAG_PARSING_METADATA(value: K_FRAG_PARSING_METADATA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSING_METADATA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAG_PARSING_USERDATA(value: K_FRAG_PARSING_USERDATA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSING_USERDATA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINIT_PTS_FOUND(value: K_INIT_PTS_FOUND): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INIT_PTS_FOUND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKEY_LOADED(value: K_KEY_LOADED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KEY_LOADED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKEY_LOADING(value: K_KEY_LOADING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KEY_LOADING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEVEL_LOADED(value: K_LEVEL_LOADED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_LOADED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEVEL_LOADING(value: K_LEVEL_LOADING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_LOADING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEVEL_PTS_UPDATED(value: K_LEVEL_PTS_UPDATED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_PTS_UPDATED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEVEL_SWITCHED(value: K_LEVEL_SWITCHED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_SWITCHED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEVEL_SWITCHING(value: K_LEVEL_SWITCHING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_SWITCHING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEVEL_UPDATED(value: K_LEVEL_UPDATED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_UPDATED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMANIFEST_LOADED(value: K_MANIFEST_LOADED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_LOADED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMANIFEST_LOADING(value: K_MANIFEST_LOADING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_LOADING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMANIFEST_PARSED(value: K_MANIFEST_PARSED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_PARSED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEDIA_ATTACHED(value: K_MEDIA_ATTACHED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ATTACHED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEDIA_ATTACHING(value: K_MEDIA_ATTACHING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ATTACHING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEDIA_DETACHED(value: K_MEDIA_DETACHED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_DETACHED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEDIA_DETACHING(value: K_MEDIA_DETACHING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_DETACHING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTREAM_STATE_TRANSITION(value: K_STREAM_STATE_TRANSITION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STREAM_STATE_TRANSITION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUBTITLE_FRAG_PROCESSED(value: K_SUBTITLE_FRAG_PROCESSED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUBTITLE_FRAG_PROCESSED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUBTITLE_TRACKS_UPDATED(value: K_SUBTITLE_TRACKS_UPDATED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUBTITLE_TRACKS_UPDATED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUBTITLE_TRACK_LOADED(value: K_SUBTITLE_TRACK_LOADED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUBTITLE_TRACK_LOADED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUBTITLE_TRACK_LOADING(value: K_SUBTITLE_TRACK_LOADING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUBTITLE_TRACK_LOADING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUBTITLE_TRACK_SWITCH(value: K_SUBTITLE_TRACK_SWITCH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUBTITLE_TRACK_SWITCH")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

