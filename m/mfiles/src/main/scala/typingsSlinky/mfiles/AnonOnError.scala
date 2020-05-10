package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnError extends js.Object {
  var Finally: js.UndefOr[js.Function0[Unit]] = js.native
  var OnError: js.UndefOr[
    js.Function3[/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String, Unit]
  ] = js.native
  var OnSuccess: js.UndefOr[js.Function0[Unit]] = js.native
}

object AnonOnError {
  @scala.inline
  def apply(): AnonOnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOnError]
  }
  @scala.inline
  implicit class AnonOnErrorOps[Self <: AnonOnError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinally(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Finally")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFinally: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Finally")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: (/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnError")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSuccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSuccess")(js.undefined)
        ret
    }
  }
  
}

