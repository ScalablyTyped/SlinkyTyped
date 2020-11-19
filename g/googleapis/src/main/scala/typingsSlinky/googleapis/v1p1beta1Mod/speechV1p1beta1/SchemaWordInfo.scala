package typingsSlinky.googleapis.v1p1beta1Mod.speechV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Word-specific information for recognized words.
  */
@js.native
trait SchemaWordInfo extends js.Object {
  
  /**
    * Output only. The confidence estimate between 0.0 and 1.0. A higher number
    * indicates an estimated greater likelihood that the recognized words are
    * correct. This field is set only for the top alternative of a
    * non-streaming result or, of a streaming result where `is_final=true`.
    * This field is not guaranteed to be accurate and users should not rely on
    * it to be always provided. The default of 0.0 is a sentinel value
    * indicating `confidence` was not set.
    */
  var confidence: js.UndefOr[Double] = js.native
  
  /**
    * Output only. Time offset relative to the beginning of the audio, and
    * corresponding to the end of the spoken word. This field is only set if
    * `enable_word_time_offsets=true` and only in the top hypothesis. This is
    * an experimental feature and the accuracy of the time offset can vary.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. A distinct integer value is assigned for every speaker
    * within the audio. This field specifies which one of those speakers was
    * detected to have spoken this word. Value ranges from &#39;1&#39; to
    * diarization_speaker_count. speaker_tag is set if
    * enable_speaker_diarization = &#39;true&#39; and only in the top
    * alternative.
    */
  var speakerTag: js.UndefOr[Double] = js.native
  
  /**
    * Output only. Time offset relative to the beginning of the audio, and
    * corresponding to the start of the spoken word. This field is only set if
    * `enable_word_time_offsets=true` and only in the top hypothesis. This is
    * an experimental feature and the accuracy of the time offset can vary.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The word corresponding to this set of information.
    */
  var word: js.UndefOr[String] = js.native
}
object SchemaWordInfo {
  
  @scala.inline
  def apply(): SchemaWordInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWordInfo]
  }
  
  @scala.inline
  implicit class SchemaWordInfoOps[Self <: SchemaWordInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setSpeakerTag(value: Double): Self = this.set("speakerTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeakerTag: Self = this.set("speakerTag", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setWord(value: String): Self = this.set("word", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWord: Self = this.set("word", js.undefined)
  }
}
