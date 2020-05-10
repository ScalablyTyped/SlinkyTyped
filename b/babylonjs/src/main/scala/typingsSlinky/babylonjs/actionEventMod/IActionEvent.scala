package typingsSlinky.babylonjs.actionEventMod

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionEvent extends js.Object {
  /** additional data for the event */
  var additionalData: js.UndefOr[js.Any] = js.native
  /** The mesh that is currently pointed at (can be null) */
  var meshUnderPointer: Nullable[AbstractMesh] = js.native
  /** The X mouse cursor position at the time of the event */
  var pointerX: Double = js.native
  /** The Y mouse cursor position at the time of the event */
  var pointerY: Double = js.native
  /** The mesh or sprite that triggered the action */
  var source: js.Any = js.native
  /** the original (browser) event that triggered the ActionEvent */
  var sourceEvent: js.UndefOr[js.Any] = js.native
}

object IActionEvent {
  @scala.inline
  def apply(pointerX: Double, pointerY: Double, source: js.Any): IActionEvent = {
    val __obj = js.Dynamic.literal(pointerX = pointerX.asInstanceOf[js.Any], pointerY = pointerY.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionEvent]
  }
  @scala.inline
  implicit class IActionEventOps[Self <: IActionEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPointerX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalData")(js.undefined)
        ret
    }
    @scala.inline
    def withMeshUnderPointer(value: Nullable[AbstractMesh]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meshUnderPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeshUnderPointerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meshUnderPointer")(null)
        ret
    }
    @scala.inline
    def withSourceEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceEvent")(js.undefined)
        ret
    }
  }
  
}

