package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Intents.ListIntents.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2ListIntentsResponse extends js.Object {
  /**
    * The list of agent intents. There will be a maximum number of items
    * returned based on the page_size field in the request.
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Intent]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2ListIntentsResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2ListIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ListIntentsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2ListIntentsResponseOps[Self <: SchemaGoogleCloudDialogflowV2ListIntentsResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

