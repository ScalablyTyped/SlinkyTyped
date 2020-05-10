package typingsSlinky.jupyterlabExtensionmanager.companionsMod

import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.ISpecModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KernelCompanion extends js.Object {
  /**
    * The kernel companion install info.
    */
  var kernelInfo: IKernelInstallInfo = js.native
  /**
    * The kernels that match the install info.
    */
  var kernels: js.Array[ISpecModel] = js.native
}

object KernelCompanion {
  @scala.inline
  def apply(kernelInfo: IKernelInstallInfo, kernels: js.Array[ISpecModel]): KernelCompanion = {
    val __obj = js.Dynamic.literal(kernelInfo = kernelInfo.asInstanceOf[js.Any], kernels = kernels.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelCompanion]
  }
  @scala.inline
  implicit class KernelCompanionOps[Self <: KernelCompanion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKernelInfo(value: IKernelInstallInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernels(value: js.Array[ISpecModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

