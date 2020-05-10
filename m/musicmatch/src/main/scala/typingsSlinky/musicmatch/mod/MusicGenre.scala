package typingsSlinky.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicGenre extends js.Object {
  var music_genre_id: Double = js.native
  var music_genre_name: String = js.native
  var music_genre_name_extended: String = js.native
  var music_genre_parent_id: Double = js.native
  var music_genre_vanity: String = js.native
}

object MusicGenre {
  @scala.inline
  def apply(
    music_genre_id: Double,
    music_genre_name: String,
    music_genre_name_extended: String,
    music_genre_parent_id: Double,
    music_genre_vanity: String
  ): MusicGenre = {
    val __obj = js.Dynamic.literal(music_genre_id = music_genre_id.asInstanceOf[js.Any], music_genre_name = music_genre_name.asInstanceOf[js.Any], music_genre_name_extended = music_genre_name_extended.asInstanceOf[js.Any], music_genre_parent_id = music_genre_parent_id.asInstanceOf[js.Any], music_genre_vanity = music_genre_vanity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicGenre]
  }
  @scala.inline
  implicit class MusicGenreOps[Self <: MusicGenre] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMusic_genre_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("music_genre_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMusic_genre_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("music_genre_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMusic_genre_name_extended(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("music_genre_name_extended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMusic_genre_parent_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("music_genre_parent_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMusic_genre_vanity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("music_genre_vanity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

