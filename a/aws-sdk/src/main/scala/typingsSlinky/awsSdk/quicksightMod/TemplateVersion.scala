package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateVersion extends js.Object {
  /**
    * The time that this template version was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * Schema of the dataset identified by the placeholder. The idea is that any dashboard created from the template should be bound to new datasets matching the same schema described through this API. .
    */
  var DataSetConfigurations: js.UndefOr[DataSetConfigurationList] = js.native
  /**
    * The description of the template.
    */
  var Description: js.UndefOr[VersionDescription] = js.native
  /**
    * Errors associated with the template.
    */
  var Errors: js.UndefOr[TemplateErrorList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the analysis or template which was used to create this template.
    */
  var SourceEntityArn: js.UndefOr[Arn] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[ResourceStatus] = js.native
  /**
    * The version number of the template.
    */
  var VersionNumber: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.VersionNumber] = js.native
}

object TemplateVersion {
  @scala.inline
  def apply(): TemplateVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateVersion]
  }
  @scala.inline
  implicit class TemplateVersionOps[Self <: TemplateVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSetConfigurations(value: DataSetConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSetConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: VersionDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: TemplateErrorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceEntityArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceEntityArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceEntityArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceEntityArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ResourceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionNumber(value: VersionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionNumber")(js.undefined)
        ret
    }
  }
  
}

