package typingsSlinky.angular.angularMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angular.Anon_Args
import typingsSlinky.angular.angularMod._Global_.Function
import typingsSlinky.angular.angularStrings.DOLLARanchorScroll
import typingsSlinky.angular.angularStrings.DOLLARcacheFactory
import typingsSlinky.angular.angularStrings.DOLLARcompile
import typingsSlinky.angular.angularStrings.DOLLARcontroller
import typingsSlinky.angular.angularStrings.DOLLARdocument
import typingsSlinky.angular.angularStrings.DOLLARexceptionHandler
import typingsSlinky.angular.angularStrings.DOLLARfilter
import typingsSlinky.angular.angularStrings.DOLLARhttp
import typingsSlinky.angular.angularStrings.DOLLARhttpBackend
import typingsSlinky.angular.angularStrings.DOLLARhttpParamSerializer
import typingsSlinky.angular.angularStrings.DOLLARhttpParamSerializerJQLike
import typingsSlinky.angular.angularStrings.DOLLARinterpolate
import typingsSlinky.angular.angularStrings.DOLLARinterval
import typingsSlinky.angular.angularStrings.DOLLARlocale
import typingsSlinky.angular.angularStrings.DOLLARlocation
import typingsSlinky.angular.angularStrings.DOLLARlog
import typingsSlinky.angular.angularStrings.DOLLARparse
import typingsSlinky.angular.angularStrings.DOLLARq
import typingsSlinky.angular.angularStrings.DOLLARrootElement
import typingsSlinky.angular.angularStrings.DOLLARrootScope
import typingsSlinky.angular.angularStrings.DOLLARsce
import typingsSlinky.angular.angularStrings.DOLLARsceDelegate
import typingsSlinky.angular.angularStrings.DOLLARtemplateCache
import typingsSlinky.angular.angularStrings.DOLLARtemplateRequest
import typingsSlinky.angular.angularStrings.DOLLARtimeout
import typingsSlinky.angular.angularStrings.DOLLARwindow
import typingsSlinky.angular.angularStrings.DOLLARxhrFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// AUTO module (angular.js)
///////////////////////////////////////////////////////////////////////////
@JSImport("angular", "auto")
@js.native
object auto extends js.Object {
  ///////////////////////////////////////////////////////////////////////
  // InjectorService
  // see http://docs.angularjs.org/api/AUTO.$injector
  ///////////////////////////////////////////////////////////////////////
  @js.native
  trait IInjectorService extends js.Object {
    /** An object map of all the modules that have been loaded into the injector. */
    var modules: StringDictionary[IModule] = js.native
    var strictDi: Boolean = js.native
    def annotate(fn: Function): js.Array[String] = js.native
    def annotate(fn: Function, strictDi: Boolean): js.Array[String] = js.native
    def annotate(inlineAnnotatedFunction: js.Array[_]): js.Array[String] = js.native
    def get[T](name: String): T = js.native
    def get[T](name: String, caller: String): T = js.native
    @JSName("get")
    def get_anchorScroll(name: DOLLARanchorScroll): IAnchorScrollService = js.native
    @JSName("get")
    def get_cacheFactory(name: DOLLARcacheFactory): ICacheFactoryService = js.native
    @JSName("get")
    def get_compile(name: DOLLARcompile): ICompileService = js.native
    @JSName("get")
    def get_controller(name: DOLLARcontroller): IControllerService = js.native
    @JSName("get")
    def get_document(name: DOLLARdocument): IDocumentService = js.native
    @JSName("get")
    def get_exceptionHandler(name: DOLLARexceptionHandler): IExceptionHandlerService = js.native
    @JSName("get")
    def get_filter(name: DOLLARfilter): IFilterService = js.native
    @JSName("get")
    def get_http(name: DOLLARhttp): IHttpService = js.native
    @JSName("get")
    def get_httpBackend(name: DOLLARhttpBackend): IHttpBackendService = js.native
    @JSName("get")
    def get_httpParamSerializer(name: DOLLARhttpParamSerializer): IHttpParamSerializer = js.native
    @JSName("get")
    def get_httpParamSerializerJQLike(name: DOLLARhttpParamSerializerJQLike): IHttpParamSerializer = js.native
    @JSName("get")
    def get_interpolate(name: DOLLARinterpolate): IInterpolateService = js.native
    @JSName("get")
    def get_interval(name: DOLLARinterval): IIntervalService = js.native
    @JSName("get")
    def get_locale(name: DOLLARlocale): ILocaleService = js.native
    @JSName("get")
    def get_location(name: DOLLARlocation): ILocationService = js.native
    @JSName("get")
    def get_log(name: DOLLARlog): ILogService = js.native
    @JSName("get")
    def get_parse(name: DOLLARparse): IParseService = js.native
    @JSName("get")
    def get_q(name: DOLLARq): IQService = js.native
    @JSName("get")
    def get_rootElement(name: DOLLARrootElement): IRootElementService = js.native
    @JSName("get")
    def get_rootScope(name: DOLLARrootScope): IRootScopeService = js.native
    @JSName("get")
    def get_sce(name: DOLLARsce): ISCEService = js.native
    @JSName("get")
    def get_sceDelegate(name: DOLLARsceDelegate): ISCEDelegateService = js.native
    @JSName("get")
    def get_templateCache(name: DOLLARtemplateCache): ITemplateCacheService = js.native
    @JSName("get")
    def get_templateRequest(name: DOLLARtemplateRequest): ITemplateRequestService = js.native
    @JSName("get")
    def get_timeout(name: DOLLARtimeout): ITimeoutService = js.native
    @JSName("get")
    def get_window(name: DOLLARwindow): IWindowService = js.native
    @JSName("get")
    def get_xhrFactory[T](name: DOLLARxhrFactory): IXhrFactory[T] = js.native
    def has(name: String): Boolean = js.native
    def instantiate[T](typeConstructor: Anon_Args[T]): T = js.native
    def instantiate[T](typeConstructor: Anon_Args[T], locals: js.Any): T = js.native
    def invoke[T](func: Injectable[Function | (js.Function1[/* repeated */ _, T])]): T = js.native
    def invoke[T](func: Injectable[Function | (js.Function1[/* repeated */ _, T])], context: js.Any): T = js.native
    def invoke[T](func: Injectable[Function | (js.Function1[/* repeated */ _, T])], context: js.Any, locals: js.Any): T = js.native
    /**
      * Add the specified modules to the current injector.
      * This method will add each of the injectables to the injector and execute all of the config and run blocks for each module passed to the method.
      * @param modules A module, module name or annotated injection function.
      */
    def loadNewModules(modules: js.Array[IModule | String | (Injectable[js.Function1[/* repeated */ _, Unit]])]): Unit = js.native
  }
  
  ///////////////////////////////////////////////////////////////////////
  // ProvideService
  // see http://docs.angularjs.org/api/AUTO.$provide
  ///////////////////////////////////////////////////////////////////////
  @js.native
  trait IProvideService extends js.Object {
    // Documentation says it returns the registered instance, but actual
    // implementation does not return anything.
    // constant(name: string, value: any): any;
    /**
      * Register a constant service, such as a string, a number, an array, an object or a function, with the $injector. Unlike value it can be injected into a module configuration function (see config) and it cannot be overridden by an Angular decorator.
      *
      * @param name The name of the constant.
      * @param value The constant value.
      */
    def constant(name: String, value: js.Any): Unit = js.native
    /**
      * Register a service decorator with the $injector. A service decorator intercepts the creation of a service, allowing it to override or modify the behaviour of the service. The object returned by the decorator may be the original service, or a new service object which replaces or wraps and delegates to the original service.
      *
      * @param name The name of the service to decorate.
      * @param decorator This function will be invoked when the service needs to be instantiated and should return the decorated service instance. The function is called using the injector.invoke method and is therefore fully injectable. Local injection arguments:
      *
      * $delegate - The original service instance, which can be monkey patched, configured, decorated or delegated to.
      */
    def decorator(name: String, decorator: Function): Unit = js.native
    /**
      * Register a service decorator with the $injector. A service decorator intercepts the creation of a service, allowing it to override or modify the behaviour of the service. The object returned by the decorator may be the original service, or a new service object which replaces or wraps and delegates to the original service.
      *
      * @param name The name of the service to decorate.
      * @param inlineAnnotatedFunction This function will be invoked when the service needs to be instantiated and should return the decorated service instance. The function is called using the injector.invoke method and is therefore fully injectable. Local injection arguments:
      *
      * $delegate - The original service instance, which can be monkey patched, configured, decorated or delegated to.
      */
    def decorator(name: String, inlineAnnotatedFunction: js.Array[_]): Unit = js.native
    def factory(name: String, inlineAnnotatedFunction: js.Array[_]): IServiceProvider = js.native
    def factory(name: String, serviceFactoryFunction: Function): IServiceProvider = js.native
    def provider(name: String, provider: IServiceProvider): IServiceProvider = js.native
    def provider(name: String, serviceProviderConstructor: Function): IServiceProvider = js.native
    def service(name: String, constructor: Function): IServiceProvider = js.native
    def service(name: String, inlineAnnotatedFunction: js.Array[_]): IServiceProvider = js.native
    def value(name: String, value: js.Any): IServiceProvider = js.native
  }
  
}

