package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Agents.SearchAgents.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1SearchAgentsResponse extends js.Object {
  /**
    * The list of agents. There will be a maximum number of items returned
    * based on the page_size field in the request.
    */
  var agents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Agent]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1SearchAgentsResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1SearchAgentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1SearchAgentsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1SearchAgentsResponseOps[Self <: SchemaGoogleCloudDialogflowV2beta1SearchAgentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgents(value: js.Array[SchemaGoogleCloudDialogflowV2beta1Agent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agents")(js.undefined)
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

