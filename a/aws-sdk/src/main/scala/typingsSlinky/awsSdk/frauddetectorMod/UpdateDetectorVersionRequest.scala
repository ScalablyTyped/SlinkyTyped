package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDetectorVersionRequest extends js.Object {
  /**
    * The detector version description. 
    */
  var description: js.UndefOr[typingsSlinky.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The parent detector ID for the detector version you want to update.
    */
  var detectorId: identifier = js.native
  /**
    * The detector version ID. 
    */
  var detectorVersionId: nonEmptyString = js.native
  /**
    * The Amazon SageMaker model endpoints to include in the detector version.
    */
  var externalModelEndpoints: ListOfStrings = js.native
  /**
    * The model versions to include in the detector version.
    */
  var modelVersions: js.UndefOr[ListOfModelVersions] = js.native
  /**
    * The rules to include in the detector version.
    */
  var rules: RuleList = js.native
}

object UpdateDetectorVersionRequest {
  @scala.inline
  def apply(
    detectorId: identifier,
    detectorVersionId: nonEmptyString,
    externalModelEndpoints: ListOfStrings,
    rules: RuleList
  ): UpdateDetectorVersionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any], externalModelEndpoints = externalModelEndpoints.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorVersionRequest]
  }
  @scala.inline
  implicit class UpdateDetectorVersionRequestOps[Self <: UpdateDetectorVersionRequest] (val x: Self) extends AnyVal {
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
    def withDetectorVersionId(value: nonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalModelEndpoints(value: ListOfStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalModelEndpoints")(value.asInstanceOf[js.Any])
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

