package typingsSlinky.minappEnv.DB

import typingsSlinky.minappEnv.IAPIParam
import typingsSlinky.minappEnv.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM /* <: IAPIParam[_] */, CONTEXT] extends js.Object {
  /**
    * In case of callback-style invocation, this function will be called
    */
  def getCallbackReturn(param: PARAM, context: CONTEXT): CALLBACK_RETURN = js.native
  def getContext(param: PARAM): CONTEXT = js.native
  def getFinalParam[T /* <: PARAM */](param: PARAM, context: CONTEXT): T = js.native
  def run[T /* <: PARAM */](param: T): Promise[PROMISE_RETURN] = js.native
}

object APIBaseContract {
  @scala.inline
  def apply[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT](
    getCallbackReturn: (PARAM, CONTEXT) => CALLBACK_RETURN,
    getContext: PARAM => CONTEXT,
    getFinalParam: (PARAM, CONTEXT) => js.Any,
    run: js.Any => Promise[PROMISE_RETURN]
  ): APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT] = {
    val __obj = js.Dynamic.literal(getCallbackReturn = js.Any.fromFunction2(getCallbackReturn), getContext = js.Any.fromFunction1(getContext), getFinalParam = js.Any.fromFunction2(getFinalParam), run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT]]
  }
  @scala.inline
  implicit class APIBaseContractOps[Self[promise_return, callback_return, param, context] <: APIBaseContract[promise_return, callback_return, param, context], PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT] (val x: Self[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT]) with Other]
    @scala.inline
    def withGetCallbackReturn(value: (PARAM, CONTEXT) => CALLBACK_RETURN): Self[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallbackReturn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetContext(value: PARAM => CONTEXT): Self[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFinalParam(value: (PARAM, CONTEXT) => js.Any): Self[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFinalParam")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRun(value: js.Any => Promise[PROMISE_RETURN]): Self[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

