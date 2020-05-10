package typingsSlinky.instagramPrivateApi.storyResponseOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryMusicQuestionResponse extends StoryResponseOptions {
  var audio_asset_id: String = js.native
  var music_browse_session_id: js.UndefOr[String] = js.native
}

object StoryMusicQuestionResponse {
  @scala.inline
  def apply(audio_asset_id: String): StoryMusicQuestionResponse = {
    val __obj = js.Dynamic.literal(audio_asset_id = audio_asset_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryMusicQuestionResponse]
  }
  @scala.inline
  implicit class StoryMusicQuestionResponseOps[Self <: StoryMusicQuestionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio_asset_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio_asset_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMusic_browse_session_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("music_browse_session_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMusic_browse_session_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("music_browse_session_id")(js.undefined)
        ret
    }
  }
  
}

