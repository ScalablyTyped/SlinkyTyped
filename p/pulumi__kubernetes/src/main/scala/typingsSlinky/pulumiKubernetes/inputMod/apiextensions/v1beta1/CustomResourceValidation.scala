package typingsSlinky.pulumiKubernetes.inputMod.apiextensions.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceValidation is a list of validation methods for CustomResources.
  */
@js.native
trait CustomResourceValidation extends js.Object {
  /**
    * openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
    */
  var openAPIV3Schema: js.UndefOr[Input[JSONSchemaProps]] = js.native
}

object CustomResourceValidation {
  @scala.inline
  def apply(): CustomResourceValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomResourceValidation]
  }
  @scala.inline
  implicit class CustomResourceValidationOps[Self <: CustomResourceValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenAPIV3Schema(value: Input[JSONSchemaProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAPIV3Schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenAPIV3Schema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAPIV3Schema")(js.undefined)
        ret
    }
  }
  
}

