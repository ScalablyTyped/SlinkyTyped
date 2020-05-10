package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InspectorServiceAttributes extends js.Object {
  /**
    * The ARN of the assessment run during which the finding is generated.
    */
  var assessmentRunArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the rules package that is used to generate the finding.
    */
  var rulesPackageArn: js.UndefOr[Arn] = js.native
  /**
    * The schema version of this data type.
    */
  var schemaVersion: NumericVersion = js.native
}

object InspectorServiceAttributes {
  @scala.inline
  def apply(schemaVersion: NumericVersion): InspectorServiceAttributes = {
    val __obj = js.Dynamic.literal(schemaVersion = schemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorServiceAttributes]
  }
  @scala.inline
  implicit class InspectorServiceAttributesOps[Self <: InspectorServiceAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchemaVersion(value: NumericVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssessmentRunArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assessmentRunArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssessmentRunArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assessmentRunArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRulesPackageArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesPackageArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRulesPackageArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesPackageArn")(js.undefined)
        ret
    }
  }
  
}

