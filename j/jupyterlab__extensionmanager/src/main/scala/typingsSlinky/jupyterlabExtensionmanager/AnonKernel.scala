package typingsSlinky.jupyterlabExtensionmanager

import typingsSlinky.jupyterlabExtensionmanager.companionsMod.IInstallInfo
import typingsSlinky.jupyterlabExtensionmanager.companionsMod.IKernelInstallInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKernel extends js.Object {
  /**
    * Information about any kernel companions.
    */
  var kernel: js.UndefOr[js.Array[IKernelInstallInfo]] = js.native
  /**
    * Information about any server extension companions.
    */
  var server: js.UndefOr[IInstallInfo] = js.native
}

object AnonKernel {
  @scala.inline
  def apply(): AnonKernel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonKernel]
  }
  @scala.inline
  implicit class AnonKernelOps[Self <: AnonKernel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKernel(value: js.Array[IKernelInstallInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: IInstallInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
  }
  
}

