package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductionVariantSummary extends js.Object {
  /**
    * The number of instances associated with the variant.
    */
  var CurrentInstanceCount: js.UndefOr[TaskCount] = js.native
  /**
    * The weight associated with the variant.
    */
  var CurrentWeight: js.UndefOr[VariantWeight] = js.native
  /**
    * An array of DeployedImage objects that specify the Amazon EC2 Container Registry paths of the inference images deployed on instances of this ProductionVariant.
    */
  var DeployedImages: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DeployedImages] = js.native
  /**
    * The number of instances requested in the UpdateEndpointWeightsAndCapacities request. 
    */
  var DesiredInstanceCount: js.UndefOr[TaskCount] = js.native
  /**
    * The requested weight, as specified in the UpdateEndpointWeightsAndCapacities request. 
    */
  var DesiredWeight: js.UndefOr[VariantWeight] = js.native
  /**
    * The name of the variant.
    */
  var VariantName: typingsSlinky.awsSdk.sagemakerMod.VariantName = js.native
}

object ProductionVariantSummary {
  @scala.inline
  def apply(VariantName: VariantName): ProductionVariantSummary = {
    val __obj = js.Dynamic.literal(VariantName = VariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionVariantSummary]
  }
  @scala.inline
  implicit class ProductionVariantSummaryOps[Self <: ProductionVariantSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVariantName(value: VariantName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariantName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentInstanceCount(value: TaskCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentInstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentWeight(value: VariantWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDeployedImages(value: DeployedImages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeployedImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployedImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeployedImages")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredInstanceCount(value: TaskCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredInstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredWeight(value: VariantWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredWeight")(js.undefined)
        ret
    }
  }
  
}

