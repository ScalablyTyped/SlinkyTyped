package typingsSlinky.musicmatch.mod

import typingsSlinky.musicmatch.anon.Musicgenre
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryGenres extends js.Object {
  var music_genre_list: js.Array[Musicgenre] = js.native
}

object PrimaryGenres {
  @scala.inline
  def apply(music_genre_list: js.Array[Musicgenre]): PrimaryGenres = {
    val __obj = js.Dynamic.literal(music_genre_list = music_genre_list.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryGenres]
  }
  @scala.inline
  implicit class PrimaryGenresOps[Self <: PrimaryGenres] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMusic_genre_list(value: js.Array[Musicgenre]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("music_genre_list")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

