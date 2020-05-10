package typingsSlinky.pulumiAws.inputMod.sagemaker

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointConfigurationProductionVariant extends js.Object {
  var acceleratorType: js.UndefOr[Input[String]] = js.native
  var initialInstanceCount: Input[Double] = js.native
  var initialVariantWeight: js.UndefOr[Input[Double]] = js.native
  var instanceType: Input[String] = js.native
  var modelName: Input[String] = js.native
  var variantName: js.UndefOr[Input[String]] = js.native
}

object EndpointConfigurationProductionVariant {
  @scala.inline
  def apply(initialInstanceCount: Input[Double], instanceType: Input[String], modelName: Input[String]): EndpointConfigurationProductionVariant = {
    val __obj = js.Dynamic.literal(initialInstanceCount = initialInstanceCount.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConfigurationProductionVariant]
  }
  @scala.inline
  implicit class EndpointConfigurationProductionVariantOps[Self <: EndpointConfigurationProductionVariant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialInstanceCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceleratorType(value: Input[String]): Self = {
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
    def withInitialVariantWeight(value: Input[Double]): Self = {
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
    @scala.inline
    def withVariantName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariantName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantName")(js.undefined)
        ret
    }
  }
  
}

