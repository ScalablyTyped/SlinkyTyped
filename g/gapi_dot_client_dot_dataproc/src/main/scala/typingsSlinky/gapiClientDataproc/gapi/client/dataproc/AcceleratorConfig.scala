package typingsSlinky.gapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorConfig extends js.Object {
  /** The number of the accelerator cards of this type exposed to this instance. */
  var acceleratorCount: js.UndefOr[Double] = js.native
  /**
    * Full URL, partial URI, or short name of the accelerator type resource to expose to this instance. See Google Compute Engine AcceleratorTypes(
    * /compute/docs/reference/beta/acceleratorTypes)Examples &#42;
    * https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80 &#42;
    * projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80 &#42; nvidia-tesla-k80
    */
  var acceleratorTypeUri: js.UndefOr[String] = js.native
}

object AcceleratorConfig {
  @scala.inline
  def apply(): AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorConfig]
  }
  @scala.inline
  implicit class AcceleratorConfigOps[Self <: AcceleratorConfig] (val x: Self) extends AnyVal {
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

