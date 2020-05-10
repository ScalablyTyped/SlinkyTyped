package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A document resource.  Note: resource
  * `projects.agent.knowledgeBases.documents` is deprecated, please use
  * `projects.knowledgeBases.documents` instead.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1Document extends js.Object {
  /**
    * The raw content of the document. This field is only permitted for
    * EXTRACTIVE_QA and FAQ knowledge types. Note: This field is in the process
    * of being deprecated, please use raw_content instead.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The URI where the file content is located.  For documents stored in
    * Google Cloud Storage, these URIs must have the form
    * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.  NOTE: External URLs must
    * correspond to public webpages, i.e., they must be indexed by Google
    * Search. In particular, URLs for showing documents in Google Cloud Storage
    * (i.e. the URL in your browser) are not supported. Instead use the `gs://`
    * format URI described above.
    */
  var contentUri: js.UndefOr[String] = js.native
  /**
    * Required. The display name of the document. The name must be 1024 bytes
    * or less; otherwise, the creation request fails.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Required. The knowledge type of document content.
    */
  var knowledgeTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The MIME type of this document.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * The document resource name. The name must be empty when creating a
    * document. Format: `projects/&lt;Project
    * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document
    * ID&gt;`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The raw content of the document. This field is only permitted for
    * EXTRACTIVE_QA and FAQ knowledge types.
    */
  var rawContent: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1Document {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1Document]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1DocumentOps[Self <: SchemaGoogleCloudDialogflowV2beta1Document] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUri")(js.undefined)
        ret
    }
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
    def withKnowledgeTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knowledgeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnowledgeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knowledgeTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
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
    @scala.inline
    def withRawContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawContent")(js.undefined)
        ret
    }
  }
  
}

