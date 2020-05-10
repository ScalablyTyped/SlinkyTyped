package typingsSlinky.instagramPrivateApi.musicRepositoryGenresResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicRepositoryGenresResponseItemsItem extends js.Object {
  var genre: MusicRepositoryGenresResponseGenre = js.native
}

object MusicRepositoryGenresResponseItemsItem {
  @scala.inline
  def apply(genre: MusicRepositoryGenresResponseGenre): MusicRepositoryGenresResponseItemsItem = {
    val __obj = js.Dynamic.literal(genre = genre.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicRepositoryGenresResponseItemsItem]
  }
  @scala.inline
  implicit class MusicRepositoryGenresResponseItemsItemOps[Self <: MusicRepositoryGenresResponseItemsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenre(value: MusicRepositoryGenresResponseGenre): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genre")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

