package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioLanguageSelection extends js.Object {
  /**
    * Selects a specific three-letter language code from within an audio source.
    */
  var LanguageCode: string = js.native
  /**
    * When set to "strict", the transport stream demux strictly identifies audio streams by their language descriptor. If a PMT update occurs such that an audio stream matching the initially selected language is no longer present then mute will be encoded until the language returns. If "loose", then on a PMT update the demux will choose another audio stream in the program with the same stream type if it can't find one with the same language.
    */
  var LanguageSelectionPolicy: js.UndefOr[AudioLanguageSelectionPolicy] = js.native
}

object AudioLanguageSelection {
  @scala.inline
  def apply(LanguageCode: string): AudioLanguageSelection = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioLanguageSelection]
  }
  @scala.inline
  implicit class AudioLanguageSelectionOps[Self <: AudioLanguageSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguageCode(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageSelectionPolicy(value: AudioLanguageSelectionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageSelectionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageSelectionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageSelectionPolicy")(js.undefined)
        ret
    }
  }
  
}

