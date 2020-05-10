package typingsSlinky.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDense extends js.Object {
  var dense: js.UndefOr[Boolean] = js.native
}

object AnonDense {
  @scala.inline
  def apply(): AnonDense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDense]
  }
  @scala.inline
  implicit class AnonDenseOps[Self <: AnonDense] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDense(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dense")(js.undefined)
        ret
    }
  }
  
}

