package typingsSlinky.appleMusicApi.AppleMusicApi

import typingsSlinky.appleMusicApi.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/song/relationships
@js.native
trait SongRelationships extends js.Object {
  var albums: Relationship[Album] = js.native
  var artists: Relationship[Artist] = js.native
  var genres: js.UndefOr[Relationship[Genre]] = js.native
  var station: js.UndefOr[AnonData] = js.native
}

object SongRelationships {
  @scala.inline
  def apply(albums: Relationship[Album], artists: Relationship[Artist]): SongRelationships = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[SongRelationships]
  }
  @scala.inline
  implicit class SongRelationshipsOps[Self <: SongRelationships] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbums(value: Relationship[Album]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtists(value: Relationship[Artist]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenres(value: Relationship[Genre]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genres")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenres: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genres")(js.undefined)
        ret
    }
    @scala.inline
    def withStation(value: AnonData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("station")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("station")(js.undefined)
        ret
    }
  }
  
}

