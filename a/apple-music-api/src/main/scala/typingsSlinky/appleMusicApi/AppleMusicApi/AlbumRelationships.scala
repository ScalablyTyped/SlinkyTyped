package typingsSlinky.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/album/relationships
@js.native
trait AlbumRelationships extends js.Object {
  var artists: Relationship[Artist] = js.native
}

object AlbumRelationships {
  @scala.inline
  def apply(artists: Relationship[Artist]): AlbumRelationships = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumRelationships]
  }
  @scala.inline
  implicit class AlbumRelationshipsOps[Self <: AlbumRelationships] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtists(value: Relationship[Artist]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artists")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

