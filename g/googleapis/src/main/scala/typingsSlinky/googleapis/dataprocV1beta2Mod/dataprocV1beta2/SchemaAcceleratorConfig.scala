package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the type and number of accelerator cards attached to the
  * instances of an instance group (see GPUs on Compute Engine).
  */
@js.native
trait SchemaAcceleratorConfig extends js.Object {
  /**
    * The number of the accelerator cards of this type exposed to this
    * instance.
    */
  var acceleratorCount: js.UndefOr[Double] = js.native
  /**
    * Full URL, partial URI, or short name of the accelerator type resource to
    * expose to this instance. See Compute Engine AcceleratorTypesExamples *
    * https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80
    * *
    * projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80
    * * nvidia-tesla-k80Auto Zone Exception: If you are using the Cloud
    * Dataproc Auto Zone Placement feature, you must use the short name of the
    * accelerator type resource, for example, nvidia-tesla-k80.
    */
  var acceleratorTypeUri: js.UndefOr[String] = js.native
}

object SchemaAcceleratorConfig {
  @scala.inline
  def apply(): SchemaAcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorConfig]
  }
  @scala.inline
  implicit class SchemaAcceleratorConfigOps[Self <: SchemaAcceleratorConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceleratorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceleratorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorCount")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceleratorTypeUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorTypeUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceleratorTypeUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorTypeUri")(js.undefined)
        ret
    }
  }
  
}

