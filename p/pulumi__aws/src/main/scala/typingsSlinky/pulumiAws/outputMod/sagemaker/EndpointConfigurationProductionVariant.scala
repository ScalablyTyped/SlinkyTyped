package typingsSlinky.pulumiAws.outputMod.sagemaker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointConfigurationProductionVariant extends js.Object {
  var acceleratorType: js.UndefOr[String] = js.native
  var initialInstanceCount: Double = js.native
  var initialVariantWeight: js.UndefOr[Double] = js.native
  var instanceType: String = js.native
  var modelName: String = js.native
  var variantName: String = js.native
}

object EndpointConfigurationProductionVariant {
  @scala.inline
  def apply(initialInstanceCount: Double, instanceType: String, modelName: String, variantName: String): EndpointConfigurationProductionVariant = {
    val __obj = js.Dynamic.literal(initialInstanceCount = initialInstanceCount.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], variantName = variantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConfigurationProductionVariant]
  }
  @scala.inline
  implicit class EndpointConfigurationProductionVariantOps[Self <: EndpointConfigurationProductionVariant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialInstanceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariantName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceleratorType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceleratorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorType")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialVariantWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialVariantWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialVariantWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialVariantWeight")(js.undefined)
        ret
    }
  }
  
}

