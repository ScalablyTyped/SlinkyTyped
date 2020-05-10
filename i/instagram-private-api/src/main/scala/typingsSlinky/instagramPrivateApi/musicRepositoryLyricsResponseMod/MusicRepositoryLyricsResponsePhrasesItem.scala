package typingsSlinky.instagramPrivateApi.musicRepositoryLyricsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicRepositoryLyricsResponsePhrasesItem extends js.Object {
  var phrase: String = js.native
  var start_time_in_ms: Double = js.native
}

object MusicRepositoryLyricsResponsePhrasesItem {
  @scala.inline
  def apply(phrase: String, start_time_in_ms: Double): MusicRepositoryLyricsResponsePhrasesItem = {
    val __obj = js.Dynamic.literal(phrase = phrase.asInstanceOf[js.Any], start_time_in_ms = start_time_in_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicRepositoryLyricsResponsePhrasesItem]
  }
  @scala.inline
  implicit class MusicRepositoryLyricsResponsePhrasesItemOps[Self <: MusicRepositoryLyricsResponsePhrasesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_time_in_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time_in_ms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

