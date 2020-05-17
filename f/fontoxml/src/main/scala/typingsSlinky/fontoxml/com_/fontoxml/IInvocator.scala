package typingsSlinky.fontoxml.com_.fontoxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInvocator extends js.Object {
  //Allow/disallow auto-save functionality.
  var autosave: js.UndefOr[Boolean] = js.native
  //The base URL where the CMS endpoints are exposed.
  var cmsBaseUrl: String = js.native
  //The document id's of the documents to load from the CMS.
  var documentIds: js.Array[String] = js.native
  //The edit session token to use for accessing the CMS endpoints.
  var editSessionToken: String = js.native
  //If set to a positive integer, enable the Heartbeat API to send every x seconds.
  var heartbeat: js.UndefOr[Double] = js.native
  //User information.
  var user: js.UndefOr[IUserInfo] = js.native
  //Workflow information.
  var workflow: js.UndefOr[IWorkflowInfo] = js.native
}

object IInvocator {
  @scala.inline
  def apply(cmsBaseUrl: String, documentIds: js.Array[String], editSessionToken: String): IInvocator = {
    val __obj = js.Dynamic.literal(cmsBaseUrl = cmsBaseUrl.asInstanceOf[js.Any], documentIds = documentIds.asInstanceOf[js.Any], editSessionToken = editSessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvocator]
  }
  @scala.inline
  implicit class IInvocatorOps[Self <: IInvocator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmsBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmsBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditSessionToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editSessionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutosave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutosave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeat")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: IUserInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflow(value: IWorkflowInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflow")(js.undefined)
        ret
    }
  }
  
}

