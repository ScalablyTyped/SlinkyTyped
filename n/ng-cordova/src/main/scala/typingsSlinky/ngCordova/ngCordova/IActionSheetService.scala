package typingsSlinky.ngCordova.ngCordova

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionSheetService extends js.Object {
  def hide(): IPromise[Unit] = js.native
  def show(options: ShowOptions): IPromise[Double] = js.native
}

object IActionSheetService {
  @scala.inline
  def apply(hide: () => IPromise[Unit], show: ShowOptions => IPromise[Double]): IActionSheetService = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[IActionSheetService]
  }
  @scala.inline
  implicit class IActionSheetServiceOps[Self <: IActionSheetService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: () => IPromise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: ShowOptions => IPromise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

