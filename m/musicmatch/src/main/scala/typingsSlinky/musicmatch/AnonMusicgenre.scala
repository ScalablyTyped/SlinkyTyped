package typingsSlinky.musicmatch

import typingsSlinky.musicmatch.mod.MusicGenre
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMusicgenre extends js.Object {
  var music_genre: MusicGenre = js.native
}

object AnonMusicgenre {
  @scala.inline
  def apply(music_genre: MusicGenre): AnonMusicgenre = {
    val __obj = js.Dynamic.literal(music_genre = music_genre.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMusicgenre]
  }
  @scala.inline
  implicit class AnonMusicgenreOps[Self <: AnonMusicgenre] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMusic_genre(value: MusicGenre): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("music_genre")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

