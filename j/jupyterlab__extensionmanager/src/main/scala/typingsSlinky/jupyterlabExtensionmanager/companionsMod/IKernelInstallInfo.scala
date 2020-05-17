package typingsSlinky.jupyterlabExtensionmanager.companionsMod

import typingsSlinky.jupyterlabExtensionmanager.anon.Displayname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKernelInstallInfo extends IInstallInfo {
  /**
    * A specification of which kernels the current install info applies to.
    */
  var kernel_spec: Displayname = js.native
}

object IKernelInstallInfo {
  @scala.inline
  def apply(base: IInstallInfoEntry, kernel_spec: Displayname, managers: js.Array[String]): IKernelInstallInfo = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], kernel_spec = kernel_spec.asInstanceOf[js.Any], managers = managers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelInstallInfo]
  }
  @scala.inline
  implicit class IKernelInstallInfoOps[Self <: IKernelInstallInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKernel_spec(value: Displayname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel_spec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

