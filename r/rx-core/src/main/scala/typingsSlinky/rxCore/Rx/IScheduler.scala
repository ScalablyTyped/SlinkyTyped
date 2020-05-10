package typingsSlinky.rxCore.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScheduler extends js.Object {
  def `catch`(handler: js.Function1[/* exception */ js.Any, Boolean]): IScheduler = js.native
  def catchException(handler: js.Function1[/* exception */ js.Any, Boolean]): IScheduler = js.native
}

object IScheduler {
  @scala.inline
  def apply(
    `catch`: js.Function1[/* exception */ js.Any, Boolean] => IScheduler,
    catchException: js.Function1[/* exception */ js.Any, Boolean] => IScheduler
  ): IScheduler = {
    val __obj = js.Dynamic.literal(catchException = js.Any.fromFunction1(catchException))
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.asInstanceOf[IScheduler]
  }
  @scala.inline
  implicit class ISchedulerOps[Self <: IScheduler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatch(value: js.Function1[/* exception */ js.Any, Boolean] => IScheduler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCatchException(value: js.Function1[/* exception */ js.Any, Boolean] => IScheduler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catchException")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

