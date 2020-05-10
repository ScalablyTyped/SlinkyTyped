package typingsSlinky.jupyterlabApputils.vdomMod

import typingsSlinky.jupyterlabApputils.vdomMod.VDomRenderer.IModel
import typingsSlinky.phosphorSignaling.mod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/vdom", "VDomModel")
@js.native
class VDomModel () extends IModel {
  var _isDisposed: js.Any = js.native
  /**
    * A signal emitted when any model state changes.
    */
  @JSName("stateChanged")
  val stateChanged_VDomModel: Signal[this.type, Unit] = js.native
}

