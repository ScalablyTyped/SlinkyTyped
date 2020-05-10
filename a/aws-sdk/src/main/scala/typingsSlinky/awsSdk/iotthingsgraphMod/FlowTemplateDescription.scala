package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowTemplateDescription extends js.Object {
  /**
    * A workflow's definition document.
    */
  var definition: js.UndefOr[DefinitionDocument] = js.native
  /**
    * An object that contains summary information about a workflow.
    */
  var summary: js.UndefOr[FlowTemplateSummary] = js.native
  /**
    * The version of the user's namespace against which the workflow was validated. Use this value in your system instance.
    */
  var validatedNamespaceVersion: js.UndefOr[Version] = js.native
}

object FlowTemplateDescription {
  @scala.inline
  def apply(): FlowTemplateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowTemplateDescription]
  }
  @scala.inline
  implicit class FlowTemplateDescriptionOps[Self <: FlowTemplateDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinition(value: DefinitionDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: FlowTemplateSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withValidatedNamespaceVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatedNamespaceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidatedNamespaceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatedNamespaceVersion")(js.undefined)
        ret
    }
  }
  
}

