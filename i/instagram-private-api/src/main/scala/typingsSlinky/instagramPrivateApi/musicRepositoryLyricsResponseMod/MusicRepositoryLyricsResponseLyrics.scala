package typingsSlinky.instagramPrivateApi.musicRepositoryLyricsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicRepositoryLyricsResponseLyrics extends js.Object {
  var phrases: js.Array[MusicRepositoryLyricsResponsePhrasesItem] = js.native
}

object MusicRepositoryLyricsResponseLyrics {
  @scala.inline
  def apply(phrases: js.Array[MusicRepositoryLyricsResponsePhrasesItem]): MusicRepositoryLyricsResponseLyrics = {
    val __obj = js.Dynamic.literal(phrases = phrases.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicRepositoryLyricsResponseLyrics]
  }
  @scala.inline
  implicit class MusicRepositoryLyricsResponseLyricsOps[Self <: MusicRepositoryLyricsResponseLyrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhrases(value: js.Array[MusicRepositoryLyricsResponsePhrasesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phrases")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

