package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionDescription extends js.Object {
  /**
    * Specifies which input caption selector to use as a caption source when generating output captions. This field should match a captionSelector name.
    */
  var CaptionSelectorName: string = js.native
  /**
    * Additional settings for captions destination that depend on the destination type.
    */
  var DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.native
  /**
    * ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/
    */
  var LanguageCode: js.UndefOr[string] = js.native
  /**
    * Human readable information to indicate captions available for players (eg. English, or Spanish).
    */
  var LanguageDescription: js.UndefOr[string] = js.native
  /**
    * Name of the caption description.  Used to associate a caption description with an output.  Names must be unique within an event.
    */
  var Name: string = js.native
}

object CaptionDescription {
  @scala.inline
  def apply(CaptionSelectorName: string, Name: string): CaptionDescription = {
    val __obj = js.Dynamic.literal(CaptionSelectorName = CaptionSelectorName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionDescription]
  }
  @scala.inline
  implicit class CaptionDescriptionOps[Self <: CaptionDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptionSelectorName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionSelectorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationSettings(value: CaptionDestinationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageDescription")(js.undefined)
        ret
    }
  }
  
}

