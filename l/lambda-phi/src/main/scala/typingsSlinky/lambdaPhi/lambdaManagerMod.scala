package typingsSlinky.lambdaPhi

import typingsSlinky.lambdaPhi.apiGatewayMod.ApiGateway
import typingsSlinky.lambdaPhi.lambdaConfigMod.LambdaConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lambdaManagerMod {
  
  @JSImport("lambda-phi/lib/lambda-manager", JSImport.Default)
  @js.native
  class default () extends LambdaManager
  /* static members */
  object default {
    
    @JSImport("lambda-phi/lib/lambda-manager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("lambda-phi/lib/lambda-manager", "default.instance")
    @js.native
    def instance: LambdaManager = js.native
    @scala.inline
    def instance_=(x: LambdaManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LambdaManager extends StObject {
    
    var _apiGateway: js.Any = js.native
    
    var _callback: js.Any = js.native
    
    var _context: js.Any = js.native
    
    var _event: js.Any = js.native
    
    var _lambdaModels: js.Any = js.native
    
    var _lambdas: js.Any = js.native
    
    var _rawHandler: js.Any = js.native
    
    def addCallbackProperty(target: js.Any, property: js.Any): Unit = js.native
    
    def addContextProperty(target: js.Any, property: js.Any): Unit = js.native
    
    def addEventContextProperty(target: js.Any, property: js.Any): Unit = js.native
    
    def addEventProperty(target: js.Any, property: js.Any): Unit = js.native
    
    def addHandlerMethod(target: js.Any, method: js.Any): Unit = js.native
    
    def addPostConstructorMethod(target: js.Any, method: js.Any): Unit = js.native
    
    def addPreLambdaCallbackMethod(target: js.Any, method: String): Unit = js.native
    
    def addPreLambdaTimeoutMethod(target: js.Any, method: String, miliSecondsBeforeTimeout: Double): Unit = js.native
    
    var apiGateway: ApiGateway = js.native
    
    var callback: js.Any = js.native
    
    var context: js.Any = js.native
    
    var event: js.Any = js.native
    
    /* private */ def executeHandler(lambda: js.Any): js.Any = js.native
    
    /* private */ def executePostConstructor(lambda: js.Any): js.Any = js.native
    
    /* private */ def executePreLambdaCallback(lambda: js.Any): js.Any = js.native
    
    /* private */ def getEvent(lambda: js.Any): js.Any = js.native
    
    /* private */ def getEventContext(): js.Any = js.native
    
    def getLambdaByName(name: String): typingsSlinky.lambdaPhi.lambdaModelMod.default = js.native
    
    def processLambdas(): Unit = js.native
    
    var rawHandler: js.Any = js.native
    
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
    implicit class LambdaManagerMutableBuilder[Self <: LambdaManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddCallbackProperty(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "addCallbackProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddContextProperty(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "addContextProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddEventContextProperty(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "addEventContextProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddEventProperty(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "addEventProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddHandlerMethod(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "addHandlerMethod", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddPostConstructorMethod(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "addPostConstructorMethod", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddPreLambdaCallbackMethod(value: (js.Any, String) => Unit): Self = StObject.set(x, "addPreLambdaCallbackMethod", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddPreLambdaTimeoutMethod(value: (js.Any, String, Double) => Unit): Self = StObject.set(x, "addPreLambdaTimeoutMethod", js.Any.fromFunction3(value))
      
      @scala.inline
      def setApiGateway(value: ApiGateway): Self = StObject.set(x, "apiGateway", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallback(value: js.Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecuteHandler(value: js.Any => js.Any): Self = StObject.set(x, "executeHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExecutePostConstructor(value: js.Any => js.Any): Self = StObject.set(x, "executePostConstructor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExecutePreLambdaCallback(value: js.Any => js.Any): Self = StObject.set(x, "executePreLambdaCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetEvent(value: js.Any => js.Any): Self = StObject.set(x, "getEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetEventContext(value: () => js.Any): Self = StObject.set(x, "getEventContext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLambdaByName(value: String => typingsSlinky.lambdaPhi.lambdaModelMod.default): Self = StObject.set(x, "getLambdaByName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcessLambdas(value: () => Unit): Self = StObject.set(x, "processLambdas", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRawHandler(value: js.Any): Self = StObject.set(x, "rawHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetLambda(value: (js.Any, LambdaConfig) => Unit): Self = StObject.set(x, "setLambda", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetLambdaPath(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "setLambdaPath", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetLambdaProperties(value: js.Any => js.Any): Self = StObject.set(x, "setLambdaProperties", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPreLambdaTimeoutMethod(value: js.Any => js.Any): Self = StObject.set(x, "setPreLambdaTimeoutMethod", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpsertLambdaModel(value: js.Any => typingsSlinky.lambdaPhi.lambdaModelMod.default): Self = StObject.set(x, "upsertLambdaModel", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_apiGateway(value: js.Any): Self = StObject.set(x, "_apiGateway", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_callback(value: js.Any): Self = StObject.set(x, "_callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_context(value: js.Any): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_event(value: js.Any): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_lambdaModels(value: js.Any): Self = StObject.set(x, "_lambdaModels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_lambdas(value: js.Any): Self = StObject.set(x, "_lambdas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_rawHandler(value: js.Any): Self = StObject.set(x, "_rawHandler", value.asInstanceOf[js.Any])
    }
  }
}
