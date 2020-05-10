package typingsSlinky.ngtoaster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopParams extends IToast {
  var toasterId: js.UndefOr[Double] = js.native
}

object IPopParams {
  @scala.inline
  def apply(): IPopParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopParams]
  }
  @scala.inline
  implicit class IPopParamsOps[Self <: IPopParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToasterId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toasterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToasterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toasterId")(js.undefined)
        ret
    }
  }
  
}

