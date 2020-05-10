package typingsSlinky.jupyterlabApputils.vdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUseSignalState[SENDER, ARGS] extends js.Object {
  var value: js.Tuple2[js.UndefOr[SENDER], js.UndefOr[ARGS]] = js.native
}

object IUseSignalState {
  @scala.inline
  def apply[SENDER, ARGS](value: js.Tuple2[js.UndefOr[SENDER], js.UndefOr[ARGS]]): IUseSignalState[SENDER, ARGS] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUseSignalState[SENDER, ARGS]]
  }
  @scala.inline
  implicit class IUseSignalStateOps[Self[sender, args] <: IUseSignalState[sender, args], SENDER, ARGS] (val x: Self[SENDER, ARGS]) extends AnyVal {
    @scala.inline
    def duplicate: Self[SENDER, ARGS] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[SENDER, ARGS]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[SENDER, ARGS]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[SENDER, ARGS]) with Other]
    @scala.inline
    def withValue(value: js.Tuple2[js.UndefOr[SENDER], js.UndefOr[ARGS]]): Self[SENDER, ARGS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

