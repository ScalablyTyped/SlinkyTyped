package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomActionTypeInput extends js.Object {
  /**
    * The category of the custom action, such as a build action or a test action.  Although Source and Approval are listed as valid values, they are not currently functional. These values are reserved for future use. 
    */
  var category: ActionCategory = js.native
  /**
    * The configuration properties for the custom action.  You can refer to a name in the configuration properties of the custom action within the URL templates by following the format of {Config:name}, as long as the configuration property is both required and not secret. For more information, see Create a Custom Action for a Pipeline. 
    */
  var configurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.native
  /**
    * The details of the input artifact for the action, such as its commit ID.
    */
  var inputArtifactDetails: ArtifactDetails = js.native
  /**
    * The details of the output artifact of the action, such as its commit ID.
    */
  var outputArtifactDetails: ArtifactDetails = js.native
  /**
    * The provider of the service used in the custom action, such as AWS CodeDeploy.
    */
  var provider: ActionProvider = js.native
  /**
    * URLs that provide users information about this custom action.
    */
  var settings: js.UndefOr[ActionTypeSettings] = js.native
  /**
    * The tags for the custom action.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The version identifier of the custom action.
    */
  var version: Version = js.native
}

object CreateCustomActionTypeInput {
  @scala.inline
  def apply(
    category: ActionCategory,
    inputArtifactDetails: ArtifactDetails,
    outputArtifactDetails: ArtifactDetails,
    provider: ActionProvider,
    version: Version
  ): CreateCustomActionTypeInput = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], inputArtifactDetails = inputArtifactDetails.asInstanceOf[js.Any], outputArtifactDetails = outputArtifactDetails.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomActionTypeInput]
  }
  @scala.inline
  implicit class CreateCustomActionTypeInputOps[Self <: CreateCustomActionTypeInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: ActionCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputArtifactDetails(value: ArtifactDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputArtifactDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputArtifactDetails(value: ArtifactDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputArtifactDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: ActionProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationProperties(value: ActionConfigurationPropertyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: ActionTypeSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

