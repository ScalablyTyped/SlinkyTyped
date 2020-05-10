package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSwitchScheduleActionSettings extends js.Object {
  /**
    * The name of the input attachment (not the name of the input!) to switch to. The name is specified in the channel configuration.
    */
  var InputAttachmentNameReference: string = js.native
  /**
    * Settings to let you create a clip of the file input, in order to set up the input to ingest only a portion of the file.
    */
  var InputClippingSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.InputClippingSettings] = js.native
  /**
    * The value for the variable portion of the URL for the dynamic input, for this instance of the input. Each time you use the same dynamic input in an input switch action, you can provide a different value, in order to connect the input to a different content source.
    */
  var UrlPath: js.UndefOr[listOfString] = js.native
}

object InputSwitchScheduleActionSettings {
  @scala.inline
  def apply(InputAttachmentNameReference: string): InputSwitchScheduleActionSettings = {
    val __obj = js.Dynamic.literal(InputAttachmentNameReference = InputAttachmentNameReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSwitchScheduleActionSettings]
  }
  @scala.inline
  implicit class InputSwitchScheduleActionSettingsOps[Self <: InputSwitchScheduleActionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputAttachmentNameReference(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputAttachmentNameReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputClippingSettings(value: InputClippingSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputClippingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputClippingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputClippingSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlPath(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UrlPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UrlPath")(js.undefined)
        ret
    }
  }
  
}

