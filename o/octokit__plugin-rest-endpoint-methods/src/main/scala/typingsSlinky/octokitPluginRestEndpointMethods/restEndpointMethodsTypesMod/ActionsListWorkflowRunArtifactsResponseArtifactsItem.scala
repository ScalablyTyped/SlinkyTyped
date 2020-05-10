package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsListWorkflowRunArtifactsResponseArtifactsItem extends js.Object {
  var archive_download_url: String = js.native
  var created_at: String = js.native
  var expired: String = js.native
  var expires_at: String = js.native
  var id: Double = js.native
  var name: String = js.native
  var node_id: String = js.native
  var size_in_bytes: Double = js.native
}

object ActionsListWorkflowRunArtifactsResponseArtifactsItem {
  @scala.inline
  def apply(
    archive_download_url: String,
    created_at: String,
    expired: String,
    expires_at: String,
    id: Double,
    name: String,
    node_id: String,
    size_in_bytes: Double
  ): ActionsListWorkflowRunArtifactsResponseArtifactsItem = {
    val __obj = js.Dynamic.literal(archive_download_url = archive_download_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], size_in_bytes = size_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListWorkflowRunArtifactsResponseArtifactsItem]
  }
  @scala.inline
  implicit class ActionsListWorkflowRunArtifactsResponseArtifactsItemOps[Self <: ActionsListWorkflowRunArtifactsResponseArtifactsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchive_download_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archive_download_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpired(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize_in_bytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size_in_bytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

