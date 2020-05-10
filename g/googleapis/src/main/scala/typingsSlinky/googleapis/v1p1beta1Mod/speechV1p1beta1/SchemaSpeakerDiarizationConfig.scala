package typingsSlinky.googleapis.v1p1beta1Mod.speechV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSpeakerDiarizationConfig extends js.Object {
  /**
    * *Optional* If &#39;true&#39;, enables speaker detection for each
    * recognized word in the top alternative of the recognition result using a
    * speaker_tag provided in the WordInfo.
    */
  var enableSpeakerDiarization: js.UndefOr[Boolean] = js.native
  /**
    * *Optional* Only used if diarization_speaker_count is not set. Maximum
    * number of speakers in the conversation. This range gives you more
    * flexibility by allowing the system to automatically determine the correct
    * number of speakers. If not set, the default value is 6.
    */
  var maxSpeakerCount: js.UndefOr[Double] = js.native
  /**
    * *Optional* Only used if diarization_speaker_count is not set. Minimum
    * number of speakers in the conversation. This range gives you more
    * flexibility by allowing the system to automatically determine the correct
    * number of speakers. If not set, the default value is 2.
    */
  var minSpeakerCount: js.UndefOr[Double] = js.native
}

object SchemaSpeakerDiarizationConfig {
  @scala.inline
  def apply(): SchemaSpeakerDiarizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpeakerDiarizationConfig]
  }
  @scala.inline
  implicit class SchemaSpeakerDiarizationConfigOps[Self <: SchemaSpeakerDiarizationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableSpeakerDiarization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSpeakerDiarization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSpeakerDiarization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSpeakerDiarization")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSpeakerCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpeakerCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSpeakerCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpeakerCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSpeakerCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpeakerCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSpeakerCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpeakerCount")(js.undefined)
        ret
    }
  }
  
}

