package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorConfig extends js.Object {
  /** The number of the guest accelerator cards exposed to this instance. */
  var acceleratorCount: js.UndefOr[Double] = js.native
  /** Full or partial URL of the accelerator type resource to expose to this instance. */
  var acceleratorType: js.UndefOr[String] = js.native
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
  }
  
}

