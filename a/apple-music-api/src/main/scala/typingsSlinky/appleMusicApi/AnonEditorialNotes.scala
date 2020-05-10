package typingsSlinky.appleMusicApi

import typingsSlinky.appleMusicApi.AppleMusicApi.EditorialNotes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEditorialNotes extends js.Object {
  var editorialNotes: js.UndefOr[EditorialNotes] = js.native
  var genreNames: js.Array[String] = js.native
  var name: String = js.native
  var url: String = js.native
}

object AnonEditorialNotes {
  @scala.inline
  def apply(genreNames: js.Array[String], name: String, url: String): AnonEditorialNotes = {
    val __obj = js.Dynamic.literal(genreNames = genreNames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEditorialNotes]
  }
  @scala.inline
  implicit class AnonEditorialNotesOps[Self <: AnonEditorialNotes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenreNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genreNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorialNotes(value: EditorialNotes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorialNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorialNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorialNotes")(js.undefined)
        ret
    }
  }
  
}

