package typingsSlinky.reduxPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]
  extends typingsSlinky.redux.mod.Action[js.Any] {
  // add optional error key to conform to FSA design: https://github.com/redux-utilities/flux-standard-action
  // note that users of this middleware (using our types) must conform to FSA shaped actions or code will not compile
  var error: js.UndefOr[Boolean | Null] = js.native
  var meta: js.UndefOr[
    (ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]) with TMetaPayload
  ] = js.native
  var payload: js.UndefOr[TSuccessPayload | TErrorPayload | TStartPayload] = js.native
  var promise: js.UndefOr[js.Promise[TSuccessPayload]] = js.native
}

object Action {
  @scala.inline
  def apply[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload](`type`: js.Any): Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]]
  }
  @scala.inline
  implicit class ActionOps[Self[tfullstate, tsuccesspayload, terrorpayload, tstartpayload, tmetapayload] <: Action[tfullstate, tsuccesspayload, terrorpayload, tstartpayload, tmetapayload], TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] (val x: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload]) with Other]
    @scala.inline
    def withError(value: Boolean): Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorNull: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(null)
        ret
    }
    @scala.inline
    def withMeta(value: (ActionMeta[TFullState, TSuccessPayload, TErrorPayload, TStartPayload]) with TMetaPayload): Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: TSuccessPayload | TErrorPayload | TStartPayload): Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withPromise(value: js.Promise[TSuccessPayload]): Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self[TFullState, TSuccessPayload, TErrorPayload, TStartPayload, TMetaPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(js.undefined)
        ret
    }
  }
  
}

