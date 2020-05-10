package typingsSlinky.instagramPrivateApi.musicRepositoryMoodsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicRepositoryMoodsResponseMood extends js.Object {
  var cover_artwork_uri: String = js.native
  var id: String = js.native
  var name: String = js.native
}

object MusicRepositoryMoodsResponseMood {
  @scala.inline
  def apply(cover_artwork_uri: String, id: String, name: String): MusicRepositoryMoodsResponseMood = {
    val __obj = js.Dynamic.literal(cover_artwork_uri = cover_artwork_uri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicRepositoryMoodsResponseMood]
  }
  @scala.inline
  implicit class MusicRepositoryMoodsResponseMoodOps[Self <: MusicRepositoryMoodsResponseMood] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCover_artwork_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover_artwork_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

