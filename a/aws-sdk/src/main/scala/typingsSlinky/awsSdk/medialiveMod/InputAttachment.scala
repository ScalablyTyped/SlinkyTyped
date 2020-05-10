package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputAttachment extends js.Object {
  /**
    * User-specified name for the attachment. This is required if the user wants to use this input in an input switch action.
    */
  var InputAttachmentName: js.UndefOr[string] = js.native
  /**
    * The ID of the input
    */
  var InputId: js.UndefOr[string] = js.native
  /**
    * Settings of an input (caption selector, etc.)
    */
  var InputSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.InputSettings] = js.native
}

object InputAttachment {
  @scala.inline
  def apply(): InputAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputAttachment]
  }
  @scala.inline
  implicit class InputAttachmentOps[Self <: InputAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputAttachmentName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputAttachmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputAttachmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputAttachmentName")(js.undefined)
        ret
    }
    @scala.inline
    def withInputId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputId")(js.undefined)
        ret
    }
    @scala.inline
    def withInputSettings(value: InputSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputSettings")(js.undefined)
        ret
    }
  }
  
}

