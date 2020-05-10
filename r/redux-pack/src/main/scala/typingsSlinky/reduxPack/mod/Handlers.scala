package typingsSlinky.reduxPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] extends js.Object {
  var always: js.UndefOr[handlerReducer[S, typingsSlinky.redux.mod.Action[_]]] = js.native
  var failure: js.UndefOr[handlerReducer[S, PackActionPayload[TErrorPayload, TMetaPayload]]] = js.native
  var finish: js.UndefOr[handlerReducer[S, typingsSlinky.redux.mod.Action[_]]] = js.native
  var start: js.UndefOr[handlerReducer[S, PackActionPayload[TStartPayload, TMetaPayload]]] = js.native
  var success: js.UndefOr[handlerReducer[S, PackActionPayload[TSuccessPayload, TMetaPayload]]] = js.native
}

object Handlers {
  @scala.inline
  def apply[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](): Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handlers[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]]
  }
  @scala.inline
  implicit class HandlersOps[Self[s, tsuccesspayload, terrorpayload, tstartpayload, tmetapayload] <: Handlers[s, tsuccesspayload, terrorpayload, tstartpayload, tmetapayload], S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] (val x: Self[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]) with Other]
    @scala.inline
    def withAlways(value: (S, typingsSlinky.redux.mod.Action[_]) => S): Self[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAlways: Self[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(js.undefined)
        ret
    }
    @scala.inline
    def withFailure(value: (S, PackActionPayload[TErrorPayload, TMetaPayload]) => S): Self[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFailure: Self[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.undefined)
        ret
    }
    @scala.inline
    def withFinish(value: (S, typingsSlinky.redux.mod.Action[_]) => S): Self[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFinish: Self[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: (S, PackActionPayload[TStartPayload, TMetaPayload]) => S): Self[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStart: Self[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: (S, PackActionPayload[TSuccessPayload, TMetaPayload]) => S): Self[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self[S, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

