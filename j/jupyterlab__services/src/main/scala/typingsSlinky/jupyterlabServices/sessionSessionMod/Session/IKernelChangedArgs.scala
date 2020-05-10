package typingsSlinky.jupyterlabServices.sessionSessionMod.Session

import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IKernelConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the kernel changed signal.
  */
@js.native
trait IKernelChangedArgs extends js.Object {
  /**
    * The new kernel.
    */
  var newValue: IKernelConnection | Null = js.native
  /**
    * The old kernel.
    */
  var oldValue: IKernelConnection | Null = js.native
}

object IKernelChangedArgs {
  @scala.inline
  def apply(): IKernelChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKernelChangedArgs]
  }
  @scala.inline
  implicit class IKernelChangedArgsOps[Self <: IKernelChangedArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewValue(value: IKernelConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(null)
        ret
    }
    @scala.inline
    def withOldValue(value: IKernelConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(null)
        ret
    }
  }
  
}

