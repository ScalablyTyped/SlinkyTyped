package typingsSlinky.reduxPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] extends js.Object {
  var onFailure: js.UndefOr[
    js.Function2[/* error */ TErrorPayload, /* getState */ GetState[TFullState], Unit]
  ] = js.native
  var onFinish: js.UndefOr[js.Function2[/* resolved */ Boolean, /* getState */ GetState[TFullState], Unit]] = js.native
  var onStart: js.UndefOr[
    js.Function2[/* payload */ TStartPayload, /* getState */ GetState[TFullState], Unit]
  ] = js.native
  var onSuccess: js.UndefOr[
    js.Function2[/* response */ TSuccessPayload, /* getState */ GetState[TFullState], Unit]
  ] = js.native
  @JSName("redux-pack/LIFECYCLE")
  var `redux-packSlashLIFECYCLE`: js.UndefOr[LIFECYCLEValues] = js.native
  @JSName("redux-pack/TRANSACTION")
  var `redux-packSlashTRANSACTION`: js.UndefOr[String] = js.native
  var startPayload: js.UndefOr[TStartPayload] = js.native
}

object ActionMeta {
  @scala.inline
  def apply[TFullState, TSuccessPayload, TErrorPayload, TStartPayload](): ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]]
  }
  @scala.inline
  implicit class ActionMetaOps[Self[tfullstate, tsuccesspayload, terrorpayload, tstartpayload] <: ActionMeta[tfullstate, tsuccesspayload, terrorpayload, tstartpayload], TFullState, TSuccessPayload, TErrorPayload, TStartPayload] (val x: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]) with Other]
    @scala.inline
    def withOnFailure(value: (/* error */ TErrorPayload, /* getState */ GetState[TFullState]) => Unit): Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFailure: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFinish(value: (/* resolved */ Boolean, /* getState */ GetState[TFullState]) => Unit): Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinish")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFinish: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinish")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: (/* payload */ TStartPayload, /* getState */ GetState[TFullState]) => Unit): Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: (/* response */ TSuccessPayload, /* getState */ GetState[TFullState]) => Unit): Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def `withRedux-packSlashLIFECYCLE`(value: LIFECYCLEValues): Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redux-pack/LIFECYCLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRedux-packSlashLIFECYCLE`: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redux-pack/LIFECYCLE")(js.undefined)
        ret
    }
    @scala.inline
    def `withRedux-packSlashTRANSACTION`(value: String): Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redux-pack/TRANSACTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRedux-packSlashTRANSACTION`: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redux-pack/TRANSACTION")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPayload(value: TStartPayload): Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPayload: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPayload")(js.undefined)
        ret
    }
  }
  
}

