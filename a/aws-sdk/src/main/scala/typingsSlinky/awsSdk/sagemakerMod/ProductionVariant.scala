package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductionVariant extends js.Object {
  /**
    * The size of the Elastic Inference (EI) instance to use for the production variant. EI instances provide on-demand GPU computing for inference. For more information, see Using Elastic Inference in Amazon SageMaker.
    */
  var AcceleratorType: js.UndefOr[ProductionVariantAcceleratorType] = js.native
  /**
    * Number of instances to launch initially.
    */
  var InitialInstanceCount: TaskCount = js.native
  /**
    * Determines initial traffic distribution among all of the models that you specify in the endpoint configuration. The traffic to a production variant is determined by the ratio of the VariantWeight to the sum of all VariantWeight values across all ProductionVariants. If unspecified, it defaults to 1.0. 
    */
  var InitialVariantWeight: js.UndefOr[VariantWeight] = js.native
  /**
    * The ML compute instance type.
    */
  var InstanceType: ProductionVariantInstanceType = js.native
  /**
    * The name of the model that you want to host. This is the name that you specified when creating the model.
    */
  var ModelName: typingsSlinky.awsSdk.sagemakerMod.ModelName = js.native
  /**
    * The name of the production variant.
    */
  var VariantName: typingsSlinky.awsSdk.sagemakerMod.VariantName = js.native
}

object ProductionVariant {
  @scala.inline
  def apply(
    InitialInstanceCount: TaskCount,
    InstanceType: ProductionVariantInstanceType,
    ModelName: ModelName,
    VariantName: VariantName
  ): ProductionVariant = {
    val __obj = js.Dynamic.literal(InitialInstanceCount = InitialInstanceCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any], VariantName = VariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionVariant]
  }
  @scala.inline
  implicit class ProductionVariantOps[Self <: ProductionVariant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialInstanceCount(value: TaskCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceType(value: ProductionVariantInstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelName(value: ModelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariantName(value: VariantName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariantName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceleratorType(value: ProductionVariantAcceleratorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceleratorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceleratorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceleratorType")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialVariantWeight(value: VariantWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialVariantWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialVariantWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialVariantWeight")(js.undefined)
        ret
    }
  }
  
}

