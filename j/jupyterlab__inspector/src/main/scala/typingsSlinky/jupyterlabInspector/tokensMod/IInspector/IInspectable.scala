package typingsSlinky.jupyterlabInspector.tokensMod.IInspector

import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The definition of an inspectable source.
  */
@js.native
trait IInspectable extends js.Object {
  /**
    * A signal emitted when the inspector should clear all items.
    */
  var cleared: ISignal[_, Unit] = js.native
  /**
    * A signal emitted when the inspectable is disposed.
    */
  var disposed: ISignal[_, Unit] = js.native
  /**
    * A signal emitted when an inspector value is generated.
    */
  var inspected: ISignal[_, IInspectorUpdate] = js.native
  /**
    * Test whether the inspectable has been disposed.
    */
  var isDisposed: Boolean = js.native
  /**
    * Indicates whether the inspectable source emits signals.
    *
    * #### Notes
    * The use case for this attribute is to limit the API traffic when no
    * inspector is visible. It can be modified by the consumer of the source.
    */
  var standby: Boolean = js.native
}

object IInspectable {
  @scala.inline
  def apply(
    cleared: ISignal[_, Unit],
    disposed: ISignal[_, Unit],
    inspected: ISignal[_, IInspectorUpdate],
    isDisposed: Boolean,
    standby: Boolean
  ): IInspectable = {
    val __obj = js.Dynamic.literal(cleared = cleared.asInstanceOf[js.Any], disposed = disposed.asInstanceOf[js.Any], inspected = inspected.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], standby = standby.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectable]
  }
  @scala.inline
  implicit class IInspectableOps[Self <: IInspectable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleared(value: ISignal[_, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisposed(value: ISignal[_, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInspected(value: ISignal[_, IInspectorUpdate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDisposed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisposed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandby(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standby")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

