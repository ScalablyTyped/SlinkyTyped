package typingsSlinky.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTemplateRequest extends js.Object {
  /**
    * The export template options. Supported values include 'IncludeParameterDefaultValue',
    * 'IncludeComments' or 'IncludeParameterDefaultValue, IncludeComments
    */
  var options: js.UndefOr[String] = js.native
  /**
    * The IDs of the resources. The only supported string currently is '*' (all resources). Future
    * updates will support exporting specific resources.
    */
  var resources: js.UndefOr[js.Array[String]] = js.native
}

object ExportTemplateRequest {
  @scala.inline
  def apply(): ExportTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTemplateRequest]
  }
  @scala.inline
  implicit class ExportTemplateRequestOps[Self <: ExportTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
  }
  
}

