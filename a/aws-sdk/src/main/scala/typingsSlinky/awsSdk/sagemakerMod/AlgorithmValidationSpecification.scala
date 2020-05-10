package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgorithmValidationSpecification extends js.Object {
  /**
    * An array of AlgorithmValidationProfile objects, each of which specifies a training job and batch transform job that Amazon SageMaker runs to validate your algorithm.
    */
  var ValidationProfiles: AlgorithmValidationProfiles = js.native
  /**
    * The IAM roles that Amazon SageMaker uses to run the training jobs.
    */
  var ValidationRole: RoleArn = js.native
}

object AlgorithmValidationSpecification {
  @scala.inline
  def apply(ValidationProfiles: AlgorithmValidationProfiles, ValidationRole: RoleArn): AlgorithmValidationSpecification = {
    val __obj = js.Dynamic.literal(ValidationProfiles = ValidationProfiles.asInstanceOf[js.Any], ValidationRole = ValidationRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmValidationSpecification]
  }
  @scala.inline
  implicit class AlgorithmValidationSpecificationOps[Self <: AlgorithmValidationSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidationProfiles(value: AlgorithmValidationProfiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationProfiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationRole(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationRole")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

