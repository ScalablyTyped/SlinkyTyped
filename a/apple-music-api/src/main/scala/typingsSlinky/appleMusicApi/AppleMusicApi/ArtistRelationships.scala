package typingsSlinky.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/artist/relationships
@js.native
trait ArtistRelationships extends js.Object {
  var albums: Relationship[Album] = js.native
  var genres: Relationship[Genre] = js.native
}

object ArtistRelationships {
  @scala.inline
  def apply(albums: Relationship[Album], genres: Relationship[Genre]): ArtistRelationships = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistRelationships]
  }
  @scala.inline
  implicit class ArtistRelationshipsOps[Self <: ArtistRelationships] (val x: Self) extends AnyVal {
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
    def withGenres(value: Relationship[Genre]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genres")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

