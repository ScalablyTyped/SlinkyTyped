package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents knowledge base resource.  Note: resource
  * `projects.agent.knowledgeBases` is deprecated, please use
  * `projects.knowledgeBases` instead.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1KnowledgeBase extends js.Object {
  /**
    * Required. The display name of the knowledge base. The name must be 1024
    * bytes or less; otherwise, the creation request fails.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The knowledge base resource name. The name must be empty when creating a
    * knowledge base. Format: `projects/&lt;Project
    * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1KnowledgeBase {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1KnowledgeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1KnowledgeBase]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1KnowledgeBaseOps[Self <: SchemaGoogleCloudDialogflowV2beta1KnowledgeBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

