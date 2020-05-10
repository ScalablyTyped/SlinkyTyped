package typingsSlinky.jupyterlabApputils.vdomMod.VDomRenderer

import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a model to be used with vdom rendering.
  */
@js.native
trait IModel extends IDisposable {
  /**
    * A signal emitted when any model state changes.
    */
  val stateChanged: ISignal[this.type, Unit] = js.native
}

object IModel {
  @scala.inline
  def apply(dispose: () => Unit, isDisposed: Boolean, stateChanged: ISignal[IModel, Unit]): IModel = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModel]
  }
  @scala.inline
  implicit class IModelOps[Self <: IModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateChanged(value: ISignal[IModel, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

