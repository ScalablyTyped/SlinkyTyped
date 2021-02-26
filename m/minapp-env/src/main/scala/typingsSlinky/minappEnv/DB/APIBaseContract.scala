package typingsSlinky.minappEnv.DB

import typingsSlinky.minappEnv.IAPIParam
import typingsSlinky.minappEnv.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM /* <: IAPIParam[_] */, CONTEXT] extends StObject {
  
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
  def apply[PROMISE_RETURN, CALLBACK_RETURN, PARAM /* <: IAPIParam[_] */, CONTEXT](
    getCallbackReturn: (PARAM, CONTEXT) => CALLBACK_RETURN,
    getContext: PARAM => CONTEXT,
    getFinalParam: (PARAM, CONTEXT) => js.Any,
    run: js.Any => Promise[PROMISE_RETURN]
  ): APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT] = {
    val __obj = js.Dynamic.literal(getCallbackReturn = js.Any.fromFunction2(getCallbackReturn), getContext = js.Any.fromFunction1(getContext), getFinalParam = js.Any.fromFunction2(getFinalParam), run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT]]
  }
  
  @scala.inline
  implicit class APIBaseContractMutableBuilder[Self <: APIBaseContract[_, _, _, _], PROMISE_RETURN, CALLBACK_RETURN, PARAM /* <: IAPIParam[_] */, CONTEXT] (val x: Self with (APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT])) extends AnyVal {
    
    @scala.inline
    def setGetCallbackReturn(value: (PARAM, CONTEXT) => CALLBACK_RETURN): Self = StObject.set(x, "getCallbackReturn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetContext(value: PARAM => CONTEXT): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFinalParam(value: (PARAM, CONTEXT) => js.Any): Self = StObject.set(x, "getFinalParam", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRun(value: js.Any => Promise[PROMISE_RETURN]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
