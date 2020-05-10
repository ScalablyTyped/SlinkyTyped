package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalService extends js.Object {
  /**
    * @returns {IPromise}
    */
  def getPromiseChain(): IPromise[_] = js.native
  /**
    * @param {IModalSettings} options
    * @returns {IModalInstanceService}
    */
  def open(options: IModalSettings): IModalInstanceService = js.native
}

object IModalService {
  @scala.inline
  def apply(getPromiseChain: () => IPromise[_], open: IModalSettings => IModalInstanceService): IModalService = {
    val __obj = js.Dynamic.literal(getPromiseChain = js.Any.fromFunction0(getPromiseChain), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[IModalService]
  }
  @scala.inline
  implicit class IModalServiceOps[Self <: IModalService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPromiseChain(value: () => IPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPromiseChain")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpen(value: IModalSettings => IModalInstanceService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

