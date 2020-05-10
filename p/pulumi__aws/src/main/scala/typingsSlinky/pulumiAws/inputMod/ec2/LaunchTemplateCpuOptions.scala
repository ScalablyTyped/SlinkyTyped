package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCpuOptions extends js.Object {
  var coreCount: js.UndefOr[Input[Double]] = js.native
  var threadsPerCore: js.UndefOr[Input[Double]] = js.native
}

object LaunchTemplateCpuOptions {
  @scala.inline
  def apply(): LaunchTemplateCpuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateCpuOptions]
  }
  @scala.inline
  implicit class LaunchTemplateCpuOptionsOps[Self <: LaunchTemplateCpuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoreCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoreCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreCount")(js.undefined)
        ret
    }
    @scala.inline
    def withThreadsPerCore(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadsPerCore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreadsPerCore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadsPerCore")(js.undefined)
        ret
    }
  }
  
}

