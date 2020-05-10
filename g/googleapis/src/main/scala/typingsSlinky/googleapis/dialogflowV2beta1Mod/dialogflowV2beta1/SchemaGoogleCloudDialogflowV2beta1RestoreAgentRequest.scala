package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for Agents.RestoreAgent.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1RestoreAgentRequest extends js.Object {
  /**
    * The agent to restore.  Example for how to restore an agent via the
    * command line: &lt;pre&gt;curl \
    * &#39;https://dialogflow.googleapis.com/v2beta1/projects/&amp;lt;project_name&amp;gt;/agent:restore\
    * -X POST \    -H &#39;Authorization: Bearer &#39;$(gcloud auth
    * application-default    print-access-token) \    -H &#39;Accept:
    * application/json&#39; \    -H &#39;Content-Type: application/json&#39; \
    * --compressed \    --data-binary &quot;{        &#39;agentContent&#39;:
    * &#39;$(cat &amp;lt;agent zip file&amp;gt; | base64 -w 0)&#39;
    * }&quot;&lt;/pre&gt;
    */
  var agentContent: js.UndefOr[String] = js.native
  /**
    * The URI to a Google Cloud Storage file containing the agent to restore.
    * Note: The URI must start with &quot;gs://&quot;.
    */
  var agentUri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1RestoreAgentRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1RestoreAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1RestoreAgentRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1RestoreAgentRequestOps[Self <: SchemaGoogleCloudDialogflowV2beta1RestoreAgentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentContent")(js.undefined)
        ret
    }
    @scala.inline
    def withAgentUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentUri")(js.undefined)
        ret
    }
  }
  
}

