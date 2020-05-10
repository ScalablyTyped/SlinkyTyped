package typingsSlinky.angularMocks.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// LogService
// see https://docs.angularjs.org/api/ngMock/service/$log
// Augments the original service
///////////////////////////////////////////////////////////////////////////
@js.native
trait ILogService extends js.Object {
  def assertEmpty(): Unit = js.native
  def reset(): Unit = js.native
}

object ILogService {
  @scala.inline
  def apply(assertEmpty: () => Unit, reset: () => Unit): ILogService = {
    val __obj = js.Dynamic.literal(assertEmpty = js.Any.fromFunction0(assertEmpty), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[ILogService]
  }
  @scala.inline
  implicit class ILogServiceOps[Self <: ILogService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssertEmpty(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assertEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

