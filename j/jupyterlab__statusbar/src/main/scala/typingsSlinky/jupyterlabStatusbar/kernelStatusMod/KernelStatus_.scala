package typingsSlinky.jupyterlabStatusbar.kernelStatusMod

import typingsSlinky.jupyterlabApputils.vdomMod.VDomRenderer
import typingsSlinky.jupyterlabStatusbar.kernelStatusMod.KernelStatus.IOptions
import typingsSlinky.jupyterlabStatusbar.kernelStatusMod.KernelStatus.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar/lib/defaults/kernelStatus", "KernelStatus")
@js.native
class KernelStatus_ protected () extends VDomRenderer[Model] {
  /**
    * Construct the kernel status widget.
    */
  def this(opts: IOptions) = this()
  var _handleClick: js.Any = js.native
}

