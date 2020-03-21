package typingsSlinky.minappEnv.DB

import typingsSlinky.minappEnv.IAPIParam
import typingsSlinky.minappEnv.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DB.APIBaseContract")
@js.native
class APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM /* <: IAPIParam[_] */, CONTEXT] () extends js.Object {
  /**
    * In case of callback-style invocation, this function will be called
    */
  def getCallbackReturn(param: PARAM, context: CONTEXT): CALLBACK_RETURN = js.native
  def getContext(param: PARAM): CONTEXT = js.native
  def getFinalParam[T /* <: PARAM */](param: PARAM, context: CONTEXT): T = js.native
  def run[T /* <: PARAM */](param: T): Promise[PROMISE_RETURN] = js.native
}

