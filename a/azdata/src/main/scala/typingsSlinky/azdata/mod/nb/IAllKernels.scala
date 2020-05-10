package typingsSlinky.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAllKernels extends js.Object {
  var defaultKernel: String = js.native
  var kernels: js.Array[IKernelSpec] = js.native
}

object IAllKernels {
  @scala.inline
  def apply(defaultKernel: String, kernels: js.Array[IKernelSpec]): IAllKernels = {
    val __obj = js.Dynamic.literal(defaultKernel = defaultKernel.asInstanceOf[js.Any], kernels = kernels.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAllKernels]
  }
  @scala.inline
  implicit class IAllKernelsOps[Self <: IAllKernels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultKernel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKernel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernels(value: js.Array[IKernelSpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

