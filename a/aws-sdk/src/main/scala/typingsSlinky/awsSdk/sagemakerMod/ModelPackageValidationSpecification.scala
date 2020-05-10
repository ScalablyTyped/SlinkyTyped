package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPackageValidationSpecification extends js.Object {
  /**
    * An array of ModelPackageValidationProfile objects, each of which specifies a batch transform job that Amazon SageMaker runs to validate your model package.
    */
  var ValidationProfiles: ModelPackageValidationProfiles = js.native
  /**
    * The IAM roles to be used for the validation of the model package.
    */
  var ValidationRole: RoleArn = js.native
}

object ModelPackageValidationSpecification {
  @scala.inline
  def apply(ValidationProfiles: ModelPackageValidationProfiles, ValidationRole: RoleArn): ModelPackageValidationSpecification = {
    val __obj = js.Dynamic.literal(ValidationProfiles = ValidationProfiles.asInstanceOf[js.Any], ValidationRole = ValidationRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageValidationSpecification]
  }
  @scala.inline
  implicit class ModelPackageValidationSpecificationOps[Self <: ModelPackageValidationSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidationProfiles(value: ModelPackageValidationProfiles): Self = {
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

