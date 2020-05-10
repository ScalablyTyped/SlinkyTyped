package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  /**
    * The names of the AudioDescriptions used as audio sources for this output.
    */
  var AudioDescriptionNames: js.UndefOr[listOfString] = js.native
  /**
    * The names of the CaptionDescriptions used as caption sources for this output.
    */
  var CaptionDescriptionNames: js.UndefOr[listOfString] = js.native
  /**
    * The name used to identify an output.
    */
  var OutputName: js.UndefOr[stringMin1Max255] = js.native
  /**
    * Output type-specific settings.
    */
  var OutputSettings: typingsSlinky.awsSdk.medialiveMod.OutputSettings = js.native
  /**
    * The name of the VideoDescription used as the source for this output.
    */
  var VideoDescriptionName: js.UndefOr[string] = js.native
}

object Output {
  @scala.inline
  def apply(OutputSettings: OutputSettings): Output = {
    val __obj = js.Dynamic.literal(OutputSettings = OutputSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputSettings(value: OutputSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioDescriptionNames(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioDescriptionNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioDescriptionNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioDescriptionNames")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionDescriptionNames(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionDescriptionNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionDescriptionNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionDescriptionNames")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputName(value: stringMin1Max255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputName")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoDescriptionName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoDescriptionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoDescriptionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoDescriptionName")(js.undefined)
        ret
    }
  }
  
}

