package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionType extends js.Object {
  /**
    * The configuration properties for the action type.
    */
  var actionConfigurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.native
  /**
    * Represents information about an action type.
    */
  var id: ActionTypeId = js.native
  /**
    * The details of the input artifact for the action, such as its commit ID.
    */
  var inputArtifactDetails: ArtifactDetails = js.native
  /**
    * The details of the output artifact of the action, such as its commit ID.
    */
  var outputArtifactDetails: ArtifactDetails = js.native
  /**
    * The settings for the action type.
    */
  var settings: js.UndefOr[ActionTypeSettings] = js.native
}

object ActionType {
  @scala.inline
  def apply(id: ActionTypeId, inputArtifactDetails: ArtifactDetails, outputArtifactDetails: ArtifactDetails): ActionType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], inputArtifactDetails = inputArtifactDetails.asInstanceOf[js.Any], outputArtifactDetails = outputArtifactDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionType]
  }
  @scala.inline
  implicit class ActionTypeOps[Self <: ActionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: ActionTypeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
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
    def withActionConfigurationProperties(value: ActionConfigurationPropertyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionConfigurationProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionConfigurationProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionConfigurationProperties")(js.undefined)
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
  }
  
}

