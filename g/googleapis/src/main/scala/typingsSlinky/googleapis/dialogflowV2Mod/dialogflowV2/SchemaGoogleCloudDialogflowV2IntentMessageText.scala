package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The text response message.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageText extends js.Object {
  /**
    * Optional. The collection of the agent&#39;s responses.
    */
  var text: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessageText {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessageText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageText]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageTextOps[Self <: SchemaGoogleCloudDialogflowV2IntentMessageText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

