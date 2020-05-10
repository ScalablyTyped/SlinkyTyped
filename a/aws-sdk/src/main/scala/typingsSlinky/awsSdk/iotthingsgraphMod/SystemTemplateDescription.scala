package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemTemplateDescription extends js.Object {
  /**
    * The definition document of a system.
    */
  var definition: js.UndefOr[DefinitionDocument] = js.native
  /**
    * An object that contains summary information about a system.
    */
  var summary: js.UndefOr[SystemTemplateSummary] = js.native
  /**
    * The namespace version against which the system was validated. Use this value in your system instance.
    */
  var validatedNamespaceVersion: js.UndefOr[Version] = js.native
}

object SystemTemplateDescription {
  @scala.inline
  def apply(): SystemTemplateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemTemplateDescription]
  }
  @scala.inline
  implicit class SystemTemplateDescriptionOps[Self <: SystemTemplateDescription] (val x: Self) extends AnyVal {
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
    def withSummary(value: SystemTemplateSummary): Self = {
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

