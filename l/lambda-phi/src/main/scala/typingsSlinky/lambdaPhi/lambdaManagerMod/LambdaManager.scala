package typingsSlinky.lambdaPhi.lambdaManagerMod

import typingsSlinky.lambdaPhi.apiGatewayMod.ApiGateway
import typingsSlinky.lambdaPhi.lambdaConfigMod.LambdaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaManager extends js.Object {
  var _apiGateway: js.Any = js.native
  var _callback: js.Any = js.native
  var _context: js.Any = js.native
  var _event: js.Any = js.native
  var _lambdaModels: js.Any = js.native
  var _lambdas: js.Any = js.native
  var _rawHandler: js.Any = js.native
  var apiGateway: ApiGateway = js.native
  var callback: js.Any = js.native
  var context: js.Any = js.native
  var event: js.Any = js.native
  var rawHandler: js.Any = js.native
  def addCallbackProperty(target: js.Any, property: js.Any): Unit = js.native
  def addContextProperty(target: js.Any, property: js.Any): Unit = js.native
  def addEventContextProperty(target: js.Any, property: js.Any): Unit = js.native
  def addEventProperty(target: js.Any, property: js.Any): Unit = js.native
  def addHandlerMethod(target: js.Any, method: js.Any): Unit = js.native
  def addPostConstructorMethod(target: js.Any, method: js.Any): Unit = js.native
  def addPreLambdaCallbackMethod(target: js.Any, method: String): Unit = js.native
  def addPreLambdaTimeoutMethod(target: js.Any, method: String, miliSecondsBeforeTimeout: Double): Unit = js.native
  /* private */ def executeHandler(lambda: js.Any): js.Any = js.native
  /* private */ def executePostConstructor(lambda: js.Any): js.Any = js.native
  /* private */ def executePreLambdaCallback(lambda: js.Any): js.Any = js.native
  /* private */ def getEvent(lambda: js.Any): js.Any = js.native
  /* private */ def getEventContext(): js.Any = js.native
  def getLambdaByName(name: String): typingsSlinky.lambdaPhi.lambdaModelMod.default = js.native
  def processLambdas(): Unit = js.native
  def setLambda(target: js.Any, lambdaConfig: LambdaConfig): Unit = js.native
  def setLambdaPath(target: js.Any, path: js.Any): Unit = js.native
  /* private */ def setLambdaProperties(lambda: js.Any): js.Any = js.native
  /* private */ def setPreLambdaTimeoutMethod(lambda: js.Any): js.Any = js.native
  def upsertLambdaModel(target: js.Any): typingsSlinky.lambdaPhi.lambdaModelMod.default = js.native
}

object LambdaManager {
  @scala.inline
  def apply(
    _apiGateway: js.Any,
    _callback: js.Any,
    _context: js.Any,
    _event: js.Any,
    _lambdaModels: js.Any,
    _lambdas: js.Any,
    _rawHandler: js.Any,
    addCallbackProperty: (js.Any, js.Any) => Unit,
    addContextProperty: (js.Any, js.Any) => Unit,
    addEventContextProperty: (js.Any, js.Any) => Unit,
    addEventProperty: (js.Any, js.Any) => Unit,
    addHandlerMethod: (js.Any, js.Any) => Unit,
    addPostConstructorMethod: (js.Any, js.Any) => Unit,
    addPreLambdaCallbackMethod: (js.Any, String) => Unit,
    addPreLambdaTimeoutMethod: (js.Any, String, Double) => Unit,
    apiGateway: ApiGateway,
    callback: js.Any,
    context: js.Any,
    event: js.Any,
    executeHandler: js.Any => js.Any,
    executePostConstructor: js.Any => js.Any,
    executePreLambdaCallback: js.Any => js.Any,
    getEvent: js.Any => js.Any,
    getEventContext: () => js.Any,
    getLambdaByName: String => typingsSlinky.lambdaPhi.lambdaModelMod.default,
    processLambdas: () => Unit,
    rawHandler: js.Any,
    setLambda: (js.Any, LambdaConfig) => Unit,
    setLambdaPath: (js.Any, js.Any) => Unit,
    setLambdaProperties: js.Any => js.Any,
    setPreLambdaTimeoutMethod: js.Any => js.Any,
    upsertLambdaModel: js.Any => typingsSlinky.lambdaPhi.lambdaModelMod.default
  ): LambdaManager = {
    val __obj = js.Dynamic.literal(_apiGateway = _apiGateway.asInstanceOf[js.Any], _callback = _callback.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _event = _event.asInstanceOf[js.Any], _lambdaModels = _lambdaModels.asInstanceOf[js.Any], _lambdas = _lambdas.asInstanceOf[js.Any], _rawHandler = _rawHandler.asInstanceOf[js.Any], addCallbackProperty = js.Any.fromFunction2(addCallbackProperty), addContextProperty = js.Any.fromFunction2(addContextProperty), addEventContextProperty = js.Any.fromFunction2(addEventContextProperty), addEventProperty = js.Any.fromFunction2(addEventProperty), addHandlerMethod = js.Any.fromFunction2(addHandlerMethod), addPostConstructorMethod = js.Any.fromFunction2(addPostConstructorMethod), addPreLambdaCallbackMethod = js.Any.fromFunction2(addPreLambdaCallbackMethod), addPreLambdaTimeoutMethod = js.Any.fromFunction3(addPreLambdaTimeoutMethod), apiGateway = apiGateway.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], executeHandler = js.Any.fromFunction1(executeHandler), executePostConstructor = js.Any.fromFunction1(executePostConstructor), executePreLambdaCallback = js.Any.fromFunction1(executePreLambdaCallback), getEvent = js.Any.fromFunction1(getEvent), getEventContext = js.Any.fromFunction0(getEventContext), getLambdaByName = js.Any.fromFunction1(getLambdaByName), processLambdas = js.Any.fromFunction0(processLambdas), rawHandler = rawHandler.asInstanceOf[js.Any], setLambda = js.Any.fromFunction2(setLambda), setLambdaPath = js.Any.fromFunction2(setLambdaPath), setLambdaProperties = js.Any.fromFunction1(setLambdaProperties), setPreLambdaTimeoutMethod = js.Any.fromFunction1(setPreLambdaTimeoutMethod), upsertLambdaModel = js.Any.fromFunction1(upsertLambdaModel))
    __obj.asInstanceOf[LambdaManager]
  }
  @scala.inline
  implicit class LambdaManagerOps[Self <: LambdaManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_apiGateway(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_apiGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_callback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_context(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_event(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_lambdaModels(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lambdaModels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_lambdas(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lambdas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_rawHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rawHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddCallbackProperty(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCallbackProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddContextProperty(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addContextProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddEventContextProperty(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventContextProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddEventProperty(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddHandlerMethod(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHandlerMethod")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddPostConstructorMethod(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPostConstructorMethod")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddPreLambdaCallbackMethod(value: (js.Any, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPreLambdaCallbackMethod")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddPreLambdaTimeoutMethod(value: (js.Any, String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPreLambdaTimeoutMethod")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withApiGateway(value: ApiGateway): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecuteHandler(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExecutePostConstructor(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executePostConstructor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExecutePreLambdaCallback(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executePreLambdaCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetEvent(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetEventContext(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEventContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLambdaByName(value: String => typingsSlinky.lambdaPhi.lambdaModelMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLambdaByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProcessLambdas(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processLambdas")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRawHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetLambda(value: (js.Any, LambdaConfig) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLambda")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetLambdaPath(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLambdaPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetLambdaProperties(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLambdaProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPreLambdaTimeoutMethod(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreLambdaTimeoutMethod")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpsertLambdaModel(value: js.Any => typingsSlinky.lambdaPhi.lambdaModelMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsertLambdaModel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

