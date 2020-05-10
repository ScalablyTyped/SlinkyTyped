package typingsSlinky.chrome

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.chrome.chrome.cast.Volume
import typingsSlinky.chrome.chrome.cast.media.EditTracksInfoRequest
import typingsSlinky.chrome.chrome.cast.media.GenericMediaMetadata
import typingsSlinky.chrome.chrome.cast.media.GetStatusRequest
import typingsSlinky.chrome.chrome.cast.media.LiveSeekableRange
import typingsSlinky.chrome.chrome.cast.media.LoadRequest
import typingsSlinky.chrome.chrome.cast.media.Media
import typingsSlinky.chrome.chrome.cast.media.MediaInfo
import typingsSlinky.chrome.chrome.cast.media.MovieMediaMetadata
import typingsSlinky.chrome.chrome.cast.media.MusicTrackMediaMetadata
import typingsSlinky.chrome.chrome.cast.media.PauseRequest
import typingsSlinky.chrome.chrome.cast.media.PhotoMediaMetadata
import typingsSlinky.chrome.chrome.cast.media.PlayRequest
import typingsSlinky.chrome.chrome.cast.media.QueueInsertItemsRequest
import typingsSlinky.chrome.chrome.cast.media.QueueItem
import typingsSlinky.chrome.chrome.cast.media.QueueLoadRequest
import typingsSlinky.chrome.chrome.cast.media.QueueRemoveItemsRequest
import typingsSlinky.chrome.chrome.cast.media.QueueReorderItemsRequest
import typingsSlinky.chrome.chrome.cast.media.QueueUpdateItemsRequest
import typingsSlinky.chrome.chrome.cast.media.SeekRequest
import typingsSlinky.chrome.chrome.cast.media.StopRequest
import typingsSlinky.chrome.chrome.cast.media.TextTrackStyle
import typingsSlinky.chrome.chrome.cast.media.Track
import typingsSlinky.chrome.chrome.cast.media.TrackType
import typingsSlinky.chrome.chrome.cast.media.TvShowMediaMetadata
import typingsSlinky.chrome.chrome.cast.media.VolumeRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmedia extends js.Object {
  var DEFAULT_MEDIA_RECEIVER_APP_ID: String = js.native
  var EditTracksInfoRequest: Instantiable2[
    js.UndefOr[/* activeTrackIds */ js.Array[Double]], 
    js.UndefOr[/* textTrackStyle */ TextTrackStyle], 
    typingsSlinky.chrome.chrome.cast.media.EditTracksInfoRequest
  ] = js.native
  var GenericMediaMetadata: Instantiable0[typingsSlinky.chrome.chrome.cast.media.GenericMediaMetadata] = js.native
  var GetStatusRequest: Instantiable0[typingsSlinky.chrome.chrome.cast.media.GetStatusRequest] = js.native
  var LiveSeekableRange: Instantiable4[
    js.UndefOr[/* start */ Double], 
    js.UndefOr[/* end */ Double], 
    js.UndefOr[/* isMovingWindow */ Boolean], 
    js.UndefOr[/* isLiveDone */ Boolean], 
    typingsSlinky.chrome.chrome.cast.media.LiveSeekableRange
  ] = js.native
  var LoadRequest: Instantiable1[/* mediaInfo */ MediaInfo, typingsSlinky.chrome.chrome.cast.media.LoadRequest] = js.native
  var Media: Instantiable2[
    /* sessionId */ String, 
    /* mediaSessionId */ Double, 
    typingsSlinky.chrome.chrome.cast.media.Media
  ] = js.native
  var MediaInfo: Instantiable2[
    /* contentId */ String, 
    /* contentType */ String, 
    typingsSlinky.chrome.chrome.cast.media.MediaInfo
  ] = js.native
  var MovieMediaMetadata: Instantiable0[typingsSlinky.chrome.chrome.cast.media.MovieMediaMetadata] = js.native
  var MusicTrackMediaMetadata: Instantiable0[typingsSlinky.chrome.chrome.cast.media.MusicTrackMediaMetadata] = js.native
  var PauseRequest: Instantiable0[typingsSlinky.chrome.chrome.cast.media.PauseRequest] = js.native
  var PhotoMediaMetadata: Instantiable0[typingsSlinky.chrome.chrome.cast.media.PhotoMediaMetadata] = js.native
  var PlayRequest: Instantiable0[typingsSlinky.chrome.chrome.cast.media.PlayRequest] = js.native
  var QueueInsertItemsRequest: Instantiable1[
    /* itemsToInsert */ js.Array[QueueItem], 
    typingsSlinky.chrome.chrome.cast.media.QueueInsertItemsRequest
  ] = js.native
  var QueueItem: Instantiable1[/* mediaInfo */ MediaInfo, typingsSlinky.chrome.chrome.cast.media.QueueItem] = js.native
  var QueueLoadRequest: Instantiable1[
    /* items */ js.Array[QueueItem], 
    typingsSlinky.chrome.chrome.cast.media.QueueLoadRequest
  ] = js.native
  var QueueRemoveItemsRequest: Instantiable1[
    /* itemIdsToRemove */ js.Array[Double], 
    typingsSlinky.chrome.chrome.cast.media.QueueRemoveItemsRequest
  ] = js.native
  var QueueReorderItemsRequest: Instantiable1[
    /* itemIdsToReorder */ js.Array[Double], 
    typingsSlinky.chrome.chrome.cast.media.QueueReorderItemsRequest
  ] = js.native
  var QueueUpdateItemsRequest: Instantiable1[
    /* itemsToUpdate */ js.Array[QueueItem], 
    typingsSlinky.chrome.chrome.cast.media.QueueUpdateItemsRequest
  ] = js.native
  var SeekRequest: Instantiable0[typingsSlinky.chrome.chrome.cast.media.SeekRequest] = js.native
  var StopRequest: Instantiable0[typingsSlinky.chrome.chrome.cast.media.StopRequest] = js.native
  var TextTrackStyle: Instantiable0[typingsSlinky.chrome.chrome.cast.media.TextTrackStyle] = js.native
  var Track: Instantiable2[
    /* trackId */ Double, 
    /* trackType */ TrackType, 
    typingsSlinky.chrome.chrome.cast.media.Track
  ] = js.native
  var TvShowMediaMetadata: Instantiable0[typingsSlinky.chrome.chrome.cast.media.TvShowMediaMetadata] = js.native
  var VolumeRequest: Instantiable1[/* volume */ Volume, typingsSlinky.chrome.chrome.cast.media.VolumeRequest] = js.native
  /**
    * @namespace
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.timeout
    */
  val timeout: Typeoftimeout = js.native
}

object Typeofmedia {
  @scala.inline
  def apply(
    DEFAULT_MEDIA_RECEIVER_APP_ID: String,
    EditTracksInfoRequest: Instantiable2[
      js.UndefOr[/* activeTrackIds */ js.Array[Double]], 
      js.UndefOr[/* textTrackStyle */ TextTrackStyle], 
      EditTracksInfoRequest
    ],
    GenericMediaMetadata: Instantiable0[GenericMediaMetadata],
    GetStatusRequest: Instantiable0[GetStatusRequest],
    LiveSeekableRange: Instantiable4[
      js.UndefOr[/* start */ Double], 
      js.UndefOr[/* end */ Double], 
      js.UndefOr[/* isMovingWindow */ Boolean], 
      js.UndefOr[/* isLiveDone */ Boolean], 
      LiveSeekableRange
    ],
    LoadRequest: Instantiable1[/* mediaInfo */ MediaInfo, LoadRequest],
    Media: Instantiable2[/* sessionId */ String, /* mediaSessionId */ Double, Media],
    MediaInfo: Instantiable2[/* contentId */ String, /* contentType */ String, MediaInfo],
    MovieMediaMetadata: Instantiable0[MovieMediaMetadata],
    MusicTrackMediaMetadata: Instantiable0[MusicTrackMediaMetadata],
    PauseRequest: Instantiable0[PauseRequest],
    PhotoMediaMetadata: Instantiable0[PhotoMediaMetadata],
    PlayRequest: Instantiable0[PlayRequest],
    QueueInsertItemsRequest: Instantiable1[/* itemsToInsert */ js.Array[QueueItem], QueueInsertItemsRequest],
    QueueItem: Instantiable1[/* mediaInfo */ MediaInfo, QueueItem],
    QueueLoadRequest: Instantiable1[/* items */ js.Array[QueueItem], QueueLoadRequest],
    QueueRemoveItemsRequest: Instantiable1[/* itemIdsToRemove */ js.Array[Double], QueueRemoveItemsRequest],
    QueueReorderItemsRequest: Instantiable1[/* itemIdsToReorder */ js.Array[Double], QueueReorderItemsRequest],
    QueueUpdateItemsRequest: Instantiable1[/* itemsToUpdate */ js.Array[QueueItem], QueueUpdateItemsRequest],
    SeekRequest: Instantiable0[SeekRequest],
    StopRequest: Instantiable0[StopRequest],
    TextTrackStyle: Instantiable0[TextTrackStyle],
    Track: Instantiable2[/* trackId */ Double, /* trackType */ TrackType, Track],
    TvShowMediaMetadata: Instantiable0[TvShowMediaMetadata],
    VolumeRequest: Instantiable1[/* volume */ Volume, VolumeRequest],
    timeout: Typeoftimeout
  ): Typeofmedia = {
    val __obj = js.Dynamic.literal(DEFAULT_MEDIA_RECEIVER_APP_ID = DEFAULT_MEDIA_RECEIVER_APP_ID.asInstanceOf[js.Any], EditTracksInfoRequest = EditTracksInfoRequest.asInstanceOf[js.Any], GenericMediaMetadata = GenericMediaMetadata.asInstanceOf[js.Any], GetStatusRequest = GetStatusRequest.asInstanceOf[js.Any], LiveSeekableRange = LiveSeekableRange.asInstanceOf[js.Any], LoadRequest = LoadRequest.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], MediaInfo = MediaInfo.asInstanceOf[js.Any], MovieMediaMetadata = MovieMediaMetadata.asInstanceOf[js.Any], MusicTrackMediaMetadata = MusicTrackMediaMetadata.asInstanceOf[js.Any], PauseRequest = PauseRequest.asInstanceOf[js.Any], PhotoMediaMetadata = PhotoMediaMetadata.asInstanceOf[js.Any], PlayRequest = PlayRequest.asInstanceOf[js.Any], QueueInsertItemsRequest = QueueInsertItemsRequest.asInstanceOf[js.Any], QueueItem = QueueItem.asInstanceOf[js.Any], QueueLoadRequest = QueueLoadRequest.asInstanceOf[js.Any], QueueRemoveItemsRequest = QueueRemoveItemsRequest.asInstanceOf[js.Any], QueueReorderItemsRequest = QueueReorderItemsRequest.asInstanceOf[js.Any], QueueUpdateItemsRequest = QueueUpdateItemsRequest.asInstanceOf[js.Any], SeekRequest = SeekRequest.asInstanceOf[js.Any], StopRequest = StopRequest.asInstanceOf[js.Any], TextTrackStyle = TextTrackStyle.asInstanceOf[js.Any], Track = Track.asInstanceOf[js.Any], TvShowMediaMetadata = TvShowMediaMetadata.asInstanceOf[js.Any], VolumeRequest = VolumeRequest.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofmedia]
  }
  @scala.inline
  implicit class TypeofmediaOps[Self <: Typeofmedia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEFAULT_MEDIA_RECEIVER_APP_ID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MEDIA_RECEIVER_APP_ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditTracksInfoRequest(
      value: Instantiable2[
          js.UndefOr[/* activeTrackIds */ js.Array[Double]], 
          js.UndefOr[/* textTrackStyle */ TextTrackStyle], 
          EditTracksInfoRequest
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EditTracksInfoRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenericMediaMetadata(value: Instantiable0[GenericMediaMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenericMediaMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStatusRequest(value: Instantiable0[GetStatusRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetStatusRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiveSeekableRange(
      value: Instantiable4[
          js.UndefOr[/* start */ Double], 
          js.UndefOr[/* end */ Double], 
          js.UndefOr[/* isMovingWindow */ Boolean], 
          js.UndefOr[/* isLiveDone */ Boolean], 
          LiveSeekableRange
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiveSeekableRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadRequest(value: Instantiable1[/* mediaInfo */ MediaInfo, LoadRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: Instantiable2[/* sessionId */ String, /* mediaSessionId */ Double, Media]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaInfo(value: Instantiable2[/* contentId */ String, /* contentType */ String, MediaInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMovieMediaMetadata(value: Instantiable0[MovieMediaMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MovieMediaMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMusicTrackMediaMetadata(value: Instantiable0[MusicTrackMediaMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MusicTrackMediaMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPauseRequest(value: Instantiable0[PauseRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PauseRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotoMediaMetadata(value: Instantiable0[PhotoMediaMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhotoMediaMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayRequest(value: Instantiable0[PlayRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueInsertItemsRequest(value: Instantiable1[/* itemsToInsert */ js.Array[QueueItem], QueueInsertItemsRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueInsertItemsRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueItem(value: Instantiable1[/* mediaInfo */ MediaInfo, QueueItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueLoadRequest(value: Instantiable1[/* items */ js.Array[QueueItem], QueueLoadRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueLoadRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueRemoveItemsRequest(value: Instantiable1[/* itemIdsToRemove */ js.Array[Double], QueueRemoveItemsRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueRemoveItemsRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueReorderItemsRequest(value: Instantiable1[/* itemIdsToReorder */ js.Array[Double], QueueReorderItemsRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueReorderItemsRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueUpdateItemsRequest(value: Instantiable1[/* itemsToUpdate */ js.Array[QueueItem], QueueUpdateItemsRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueUpdateItemsRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeekRequest(value: Instantiable0[SeekRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeekRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopRequest(value: Instantiable0[StopRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextTrackStyle(value: Instantiable0[TextTrackStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextTrackStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrack(value: Instantiable2[/* trackId */ Double, /* trackType */ TrackType, Track]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTvShowMediaMetadata(value: Instantiable0[TvShowMediaMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TvShowMediaMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeRequest(value: Instantiable1[/* volume */ Volume, VolumeRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Typeoftimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

