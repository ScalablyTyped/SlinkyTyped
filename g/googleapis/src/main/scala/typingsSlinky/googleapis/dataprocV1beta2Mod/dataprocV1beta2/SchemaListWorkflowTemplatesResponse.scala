package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to a request to list workflow templates in a project.
  */
@js.native
trait SchemaListWorkflowTemplatesResponse extends js.Object {
  /**
    * Output only. This token is included in the response if there are more
    * results to fetch. To fetch additional results, provide this value as the
    * page_token in a subsequent
    * &lt;code&gt;ListWorkflowTemplatesRequest&lt;/code&gt;.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. WorkflowTemplates list.
    */
  var templates: js.UndefOr[js.Array[SchemaWorkflowTemplate]] = js.native
}

object SchemaListWorkflowTemplatesResponse {
  @scala.inline
  def apply(): SchemaListWorkflowTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListWorkflowTemplatesResponse]
  }
  @scala.inline
  implicit class SchemaListWorkflowTemplatesResponseOps[Self <: SchemaListWorkflowTemplatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withTemplates(value: js.Array[SchemaWorkflowTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(js.undefined)
        ret
    }
  }
  
}

