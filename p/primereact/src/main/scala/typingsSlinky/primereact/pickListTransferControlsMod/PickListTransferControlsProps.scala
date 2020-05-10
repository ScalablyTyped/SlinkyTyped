package typingsSlinky.primereact.pickListTransferControlsMod

import typingsSlinky.primereact.AnonTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickListTransferControlsProps extends js.Object {
  var onTransfer: js.UndefOr[js.Function1[/* e */ AnonTarget, Unit]] = js.native
  var source: js.UndefOr[js.Array[_]] = js.native
  var sourceSelection: js.UndefOr[js.Array[_]] = js.native
  var target: js.UndefOr[js.Array[_]] = js.native
  var targetSelection: js.UndefOr[js.Array[_]] = js.native
}

object PickListTransferControlsProps {
  @scala.inline
  def apply(): PickListTransferControlsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickListTransferControlsProps]
  }
  @scala.inline
  implicit class PickListTransferControlsPropsOps[Self <: PickListTransferControlsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnTransfer(value: /* e */ AnonTarget => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransfer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTransfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransfer")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceSelection(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSelection(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSelection")(js.undefined)
        ret
    }
  }
  
}

