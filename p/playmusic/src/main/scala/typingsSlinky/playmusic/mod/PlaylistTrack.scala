package typingsSlinky.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistTrack extends js.Object {
  var album: js.UndefOr[String] = js.native
  var albumArtRef: js.UndefOr[js.Array[ArtRef]] = js.native
  var albumArtist: js.UndefOr[String] = js.native
  var albumAvailableForPurchase: js.UndefOr[Boolean] = js.native
  var albumId: js.UndefOr[String] = js.native
  var artist: js.UndefOr[String] = js.native
  var artistArtRef: js.UndefOr[js.Array[ArtRef]] = js.native
  var artistId: js.UndefOr[js.Array[String]] = js.native
  var composer: js.UndefOr[String] = js.native
  var contentType: js.UndefOr[String] = js.native
  var discNumber: js.UndefOr[Double] = js.native
  var durationMillis: js.UndefOr[String] = js.native
  var estimatedSize: js.UndefOr[String] = js.native
  var genre: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var nid: js.UndefOr[String] = js.native
  var playCount: js.UndefOr[Double] = js.native
  var storeId: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var trackAvailableForPurchase: js.UndefOr[Boolean] = js.native
  var trackAvailableForSubscription: js.UndefOr[Boolean] = js.native
  var trackNumber: js.UndefOr[Double] = js.native
  var trackType: js.UndefOr[String] = js.native
  var year: js.UndefOr[Double] = js.native
}

object PlaylistTrack {
  @scala.inline
  def apply(): PlaylistTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistTrack]
  }
  @scala.inline
  implicit class PlaylistTrackOps[Self <: PlaylistTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album")(js.undefined)
        ret
    }
    @scala.inline
    def withAlbumArtRef(value: js.Array[ArtRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumArtRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbumArtRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumArtRef")(js.undefined)
        ret
    }
    @scala.inline
    def withAlbumArtist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumArtist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbumArtist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumArtist")(js.undefined)
        ret
    }
    @scala.inline
    def withAlbumAvailableForPurchase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumAvailableForPurchase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbumAvailableForPurchase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumAvailableForPurchase")(js.undefined)
        ret
    }
    @scala.inline
    def withAlbumId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbumId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumId")(js.undefined)
        ret
    }
    @scala.inline
    def withArtist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(js.undefined)
        ret
    }
    @scala.inline
    def withArtistArtRef(value: js.Array[ArtRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artistArtRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtistArtRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artistArtRef")(js.undefined)
        ret
    }
    @scala.inline
    def withArtistId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artistId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtistId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artistId")(js.undefined)
        ret
    }
    @scala.inline
    def withComposer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composer")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGenre(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genre")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nid")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playCount")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeId")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackAvailableForPurchase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackAvailableForPurchase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackAvailableForPurchase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackAvailableForPurchase")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackAvailableForSubscription(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackAvailableForSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackAvailableForSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackAvailableForSubscription")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackType")(js.undefined)
        ret
    }
    @scala.inline
    def withYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(js.undefined)
        ret
    }
  }
  
}

