package typingsSlinky.instagramPrivateApi.musicRepositoryLyricsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicRepositoryLyricsResponseRootObject extends js.Object {
  var lyrics: MusicRepositoryLyricsResponseLyrics = js.native
  var status: String = js.native
}

object MusicRepositoryLyricsResponseRootObject {
  @scala.inline
  def apply(lyrics: MusicRepositoryLyricsResponseLyrics, status: String): MusicRepositoryLyricsResponseRootObject = {
    val __obj = js.Dynamic.literal(lyrics = lyrics.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicRepositoryLyricsResponseRootObject]
  }
  @scala.inline
  implicit class MusicRepositoryLyricsResponseRootObjectOps[Self <: MusicRepositoryLyricsResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLyrics(value: MusicRepositoryLyricsResponseLyrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lyrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

