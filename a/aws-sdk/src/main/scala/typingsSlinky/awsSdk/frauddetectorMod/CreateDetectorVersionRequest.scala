package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDetectorVersionRequest extends js.Object {
  /**
    * The description of the detector version.
    */
  var description: js.UndefOr[typingsSlinky.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The ID of the detector under which you want to create a new version.
    */
  var detectorId: identifier = js.native
  /**
    * The Amazon Sagemaker model endpoints to include in the detector version.
    */
  var externalModelEndpoints: js.UndefOr[ListOfStrings] = js.native
  /**
    * The model versions to include in the detector version.
    */
  var modelVersions: js.UndefOr[ListOfModelVersions] = js.native
  /**
    * The rules to include in the detector version.
    */
  var rules: RuleList = js.native
}

object CreateDetectorVersionRequest {
  @scala.inline
  def apply(detectorId: identifier, rules: RuleList): CreateDetectorVersionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetectorVersionRequest]
  }
  @scala.inline
  implicit class CreateDetectorVersionRequestOps[Self <: CreateDetectorVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectorId(value: identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: RuleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalModelEndpoints(value: ListOfStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalModelEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalModelEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalModelEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withModelVersions(value: ListOfModelVersions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVersions")(js.undefined)
        ret
    }
  }
  
}

