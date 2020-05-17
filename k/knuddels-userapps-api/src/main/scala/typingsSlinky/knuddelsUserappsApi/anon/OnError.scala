package typingsSlinky.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnError extends js.Object {
  var onError: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  var onSuccess: js.UndefOr[js.Function0[Unit]] = js.native
  var transferReason: js.UndefOr[String] = js.native
}

object OnError {
  @scala.inline
  def apply(): OnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnError]
  }
  @scala.inline
  implicit class OnErrorOps[Self <: OnError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnError(value: /* message */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferReason")(js.undefined)
        ret
    }
  }
  
}

