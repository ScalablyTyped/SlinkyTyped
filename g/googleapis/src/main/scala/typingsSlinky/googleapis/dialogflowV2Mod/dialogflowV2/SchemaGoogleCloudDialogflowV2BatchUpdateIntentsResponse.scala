package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Intents.BatchUpdateIntents.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2BatchUpdateIntentsResponse extends js.Object {
  /**
    * The collection of updated or created intents.
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Intent]] = js.native
}

object SchemaGoogleCloudDialogflowV2BatchUpdateIntentsResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2BatchUpdateIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2BatchUpdateIntentsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2BatchUpdateIntentsResponseOps[Self <: SchemaGoogleCloudDialogflowV2BatchUpdateIntentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntents(value: js.Array[SchemaGoogleCloudDialogflowV2Intent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intents")(js.undefined)
        ret
    }
  }
  
}

