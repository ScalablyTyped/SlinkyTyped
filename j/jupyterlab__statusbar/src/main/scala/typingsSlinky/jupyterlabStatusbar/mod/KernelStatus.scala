package typingsSlinky.jupyterlabStatusbar.mod

import typingsSlinky.jupyterlabStatusbar.kernelStatusMod.KernelStatus.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/statusbar", "KernelStatus")
@js.native
class KernelStatus protected ()
  extends typingsSlinky.jupyterlabStatusbar.defaultsMod.KernelStatus {
  /**
    * Construct the kernel status widget.
    */
  def this(opts: IOptions) = this()
}
@JSImport("@jupyterlab/statusbar", "KernelStatus")
@js.native
object KernelStatus extends js.Object {
  
  /**
    * A VDomModel for the kernel status indicator.
    */
  @js.native
  class Model ()
    extends typingsSlinky.jupyterlabStatusbar.kernelStatusMod.KernelStatus.Model
}
