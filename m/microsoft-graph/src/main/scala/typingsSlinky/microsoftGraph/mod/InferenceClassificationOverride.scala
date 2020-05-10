package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferenceClassificationOverride extends Entity {
  /**
    * Specifies how incoming messages from a specific sender should always be classified as. The possible values are:
    * focused, other.
    */
  var classifyAs: js.UndefOr[InferenceClassificationType] = js.native
  // The email address information of the sender for whom the override is created.
  var senderEmailAddress: js.UndefOr[EmailAddress] = js.native
}

object InferenceClassificationOverride {
  @scala.inline
  def apply(): InferenceClassificationOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceClassificationOverride]
  }
  @scala.inline
  implicit class InferenceClassificationOverrideOps[Self <: InferenceClassificationOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassifyAs(value: InferenceClassificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifyAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassifyAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifyAs")(js.undefined)
        ret
    }
    @scala.inline
    def withSenderEmailAddress(value: EmailAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSenderEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderEmailAddress")(js.undefined)
        ret
    }
  }
  
}

