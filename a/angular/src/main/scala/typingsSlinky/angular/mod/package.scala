package typingsSlinky.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FilterFactory = js.Function1[/* repeated */ js.Any, typingsSlinky.angular.mod.IFilterFunction]
  type HttpHeaderType = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | (js.Function1[/* config */ typingsSlinky.angular.mod.IRequestConfig, java.lang.String])
  ]
  type IAsyncModelValidators = org.scalablytyped.runtime.StringDictionary[
    js.Function2[
      /* modelValue */ js.Any, 
      /* viewValue */ js.Any, 
      typingsSlinky.angular.mod.IPromise[js.Any]
    ]
  ]
  type IAugmentedJQuery = typingsSlinky.angular.JQLite
  /**
    * These interfaces are kept for compatibility with older versions of these type definitions.
    * Actually, Angular doesn't create a special subclass of jQuery objects. It extends jQuery.prototype
    * like jQuery plugins do, that's why all jQuery objects have these Angular-specific methods, not
    * only those returned from angular.element.
    * See: http://docs.angularjs.org/api/angular.element
    */
  type IAugmentedJQueryStatic = typingsSlinky.angular.JQueryStatic
  type ICloneAttachFunction = js.Function2[
    /* clonedElement */ js.UndefOr[typingsSlinky.angular.JQLite], 
    /* scope */ js.UndefOr[typingsSlinky.angular.mod.IScope], 
    js.Any
  ]
  ///////////////////////////////////////////////////////////////////////////
  // CompileService
  // see http://docs.angularjs.org/api/ng.$compile
  // see http://docs.angularjs.org/api/ng.$compileProvider
  ///////////////////////////////////////////////////////////////////////////
  type ICompileService = js.Function3[
    /* element */ java.lang.String | org.scalajs.dom.raw.Element | typingsSlinky.angular.JQuery, 
    /* transclude */ js.UndefOr[typingsSlinky.angular.mod.ITranscludeFunction], 
    /* maxPriority */ js.UndefOr[scala.Double], 
    typingsSlinky.angular.mod.ITemplateLinkingFunction
  ]
  /**
    * Same as IController. Keeping it for compatibility with older versions of these type definitions.
    */
  type IComponentController = typingsSlinky.angular.mod.IController
  type IControllerConstructor = (org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, typingsSlinky.angular.mod.IController]) | (js.Function1[/* repeated */ js.Any, scala.Unit | typingsSlinky.angular.mod.IController])
  type IDirectiveCompileFn[TScope /* <: typingsSlinky.angular.mod.IScope */, TElement /* <: typingsSlinky.angular.JQLite */, TAttributes /* <: typingsSlinky.angular.mod.IAttributes */, TController /* <: typingsSlinky.angular.mod.IDirectiveController */] = js.Function3[
    /* templateElement */ TElement, 
    /* templateAttributes */ TAttributes, 
    /* transclude */ typingsSlinky.angular.mod.ITranscludeFunction, 
    scala.Unit | (typingsSlinky.angular.mod.IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (typingsSlinky.angular.mod.IDirectivePrePost[TScope, TElement, TAttributes, TController])
  ]
  ///////////////////////////////////////////////////////////////////////////
  // Directive
  // see http://docs.angularjs.org/api/ng.$compileProvider#directive
  // and http://docs.angularjs.org/guide/directive
  ///////////////////////////////////////////////////////////////////////////
  type IDirectiveController = typingsSlinky.angular.mod.IController | js.Array[typingsSlinky.angular.mod.IController] | org.scalablytyped.runtime.StringDictionary[typingsSlinky.angular.mod.IController]
  type IDirectiveFactory[TScope /* <: typingsSlinky.angular.mod.IScope */, TElement /* <: typingsSlinky.angular.JQLite */, TAttributes /* <: typingsSlinky.angular.mod.IAttributes */, TController /* <: typingsSlinky.angular.mod.IDirectiveController */] = js.Function1[
    /* repeated */ js.Any, 
    (typingsSlinky.angular.mod.IDirective[TScope, TElement, TAttributes, TController]) | (typingsSlinky.angular.mod.IDirectiveLinkFn[TScope, TElement, TAttributes, TController])
  ]
  type IDirectiveLinkFn[TScope /* <: typingsSlinky.angular.mod.IScope */, TElement /* <: typingsSlinky.angular.JQLite */, TAttributes /* <: typingsSlinky.angular.mod.IAttributes */, TController /* <: typingsSlinky.angular.mod.IDirectiveController */] = js.Function5[
    /* scope */ TScope, 
    /* instanceElement */ TElement, 
    /* instanceAttributes */ TAttributes, 
    /* controller */ js.UndefOr[TController], 
    /* transclude */ js.UndefOr[typingsSlinky.angular.mod.ITranscludeFunction], 
    scala.Unit
  ]
  ///////////////////////////////////////////////////////////////////////////
  // ExceptionHandlerService
  // see http://docs.angularjs.org/api/ng.$exceptionHandler
  ///////////////////////////////////////////////////////////////////////////
  type IExceptionHandlerService = js.Function2[/* exception */ js.Error, /* cause */ js.UndefOr[java.lang.String], scala.Unit]
  type IFilterCurrency = js.Function3[
    /* amount */ scala.Double, 
    /* symbol */ js.UndefOr[java.lang.String], 
    /* fractionSize */ js.UndefOr[scala.Double], 
    java.lang.String
  ]
  type IFilterDate = js.Function3[
    /* date */ js.Date | scala.Double | java.lang.String, 
    /* format */ js.UndefOr[java.lang.String], 
    /* timezone */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type IFilterFilter = js.Function3[
    /* array */ js.Array[js.Any], 
    /* expression */ java.lang.String | typingsSlinky.angular.mod.IFilterFilterPatternObject | typingsSlinky.angular.mod.IFilterFilterPredicateFunc[js.Any], 
    /* comparator */ js.UndefOr[typingsSlinky.angular.mod.IFilterFilterComparatorFunc[js.Any] | scala.Boolean], 
    js.Array[js.Any]
  ]
  type IFilterFilterComparatorFunc[T] = js.Function2[/* actual */ T, /* expected */ T, scala.Boolean]
  type IFilterFilterPatternObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type IFilterFilterPredicateFunc[T] = js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]
  type IFilterJson = js.Function2[/* object */ js.Any, /* spacing */ js.UndefOr[scala.Double], java.lang.String]
  type IFilterLowercase = js.Function1[/* value */ java.lang.String, java.lang.String]
  type IFilterNumber = js.Function2[
    /* value */ scala.Double | java.lang.String, 
    /* fractionSize */ js.UndefOr[scala.Double | java.lang.String], 
    java.lang.String
  ]
  type IFilterOrderBy = js.Function4[
    /* array */ js.Array[js.Any], 
    /* expression */ java.lang.String | (js.Function1[/* value */ js.Any, js.Any]) | (js.Array[(js.Function1[/* value */ js.Any, js.Any]) | java.lang.String]), 
    /* reverse */ js.UndefOr[scala.Boolean], 
    /* comparator */ js.UndefOr[typingsSlinky.angular.mod.IFilterOrderByComparatorFunc], 
    js.Array[js.Any]
  ]
  type IFilterOrderByComparatorFunc = js.Function2[
    /* left */ typingsSlinky.angular.mod.IFilterOrderByItem, 
    /* right */ typingsSlinky.angular.mod.IFilterOrderByItem, 
    typingsSlinky.angular.angularNumbers.`-1` | typingsSlinky.angular.angularNumbers.`0` | typingsSlinky.angular.angularNumbers.`1`
  ]
  type IFilterUppercase = js.Function1[/* value */ java.lang.String, java.lang.String]
  ///////////////////////////////////////////////////////////////////////////
  // HttpBackendService
  // see http://docs.angularjs.org/api/ng.$httpBackend
  // You should never need to use this service directly.
  ///////////////////////////////////////////////////////////////////////////
  type IHttpBackendService = js.Function7[
    /* method */ java.lang.String, 
    /* url */ java.lang.String, 
    /* post */ js.UndefOr[js.Any], 
    /* callback */ js.UndefOr[typingsSlinky.angular.mod._Global_.Function], 
    /* headers */ js.UndefOr[js.Any], 
    /* timeout */ js.UndefOr[scala.Double], 
    /* withCredentials */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type IHttpInterceptorFactory = js.Function1[/* repeated */ js.Any, typingsSlinky.angular.mod.IHttpInterceptor]
  /**
    * $http params serializer that converts objects to strings
    * see https://docs.angularjs.org/api/ng/service/$httpParamSerializer
    */
  type IHttpParamSerializer = js.Function1[/* obj */ js.Object, java.lang.String]
  type IHttpPromise[T] = typingsSlinky.angular.mod.IPromise[typingsSlinky.angular.mod.IHttpResponse[T]]
  type IHttpPromiseCallback[T] = js.Function4[
    /* data */ T, 
    /* status */ scala.Double, 
    /* headers */ typingsSlinky.angular.mod.IHttpHeadersGetter, 
    /* config */ typingsSlinky.angular.mod.IRequestConfig, 
    scala.Unit
  ]
  /** @deprecated The old name of IHttpResponse. Kept for compatibility. */
  type IHttpPromiseCallbackArg[T] = typingsSlinky.angular.mod.IHttpResponse[T]
  // See the jsdoc for transformData() at https://github.com/angular/angular.js/blob/master/src/ng/http.js#L228
  type IHttpRequestTransformer = js.Function2[
    /* data */ js.Any, 
    /* headersGetter */ typingsSlinky.angular.mod.IHttpHeadersGetter, 
    js.Any
  ]
  // The definition of fields are the same as IHttpResponse
  type IHttpResponseTransformer = js.Function3[
    /* data */ js.Any, 
    /* headersGetter */ typingsSlinky.angular.mod.IHttpHeadersGetter, 
    /* status */ scala.Double, 
    js.Any
  ]
  type IInterpolationFunction = js.Function1[/* context */ js.Any, java.lang.String]
  // We define this as separate interface so we can reopen it later for
  // the ngMock module.
  type ILogCall = js.Function1[/* repeated */ js.Any, scala.Unit]
  type IModelFormatter = js.Function1[/* value */ js.Any, js.Any]
  type IModelParser = js.Function1[/* value */ js.Any, js.Any]
  type IModelValidators = /**
    * viewValue is any because it can be an object that is called in the view like $viewValue.name:$viewValue.subName
    */
  org.scalablytyped.runtime.StringDictionary[js.Function2[/* modelValue */ js.Any, /* viewValue */ js.Any, scala.Boolean]]
  type IModelViewChangeListener = js.Function0[scala.Unit]
  type IOnChangesObject = org.scalablytyped.runtime.StringDictionary[typingsSlinky.angular.mod.IChangesObject[js.Any]]
  ///////////////////////////////////////////////////////////////////////////
  // ParseService
  // see http://docs.angularjs.org/api/ng.$parse
  // see http://docs.angularjs.org/api/ng.$parseProvider
  ///////////////////////////////////////////////////////////////////////////
  type IParseService = js.Function3[
    /* expression */ java.lang.String, 
    /* interceptorFn */ js.UndefOr[
      js.Function3[
        /* value */ js.Any, 
        /* scope */ typingsSlinky.angular.mod.IScope, 
        /* locals */ js.Any, 
        js.Any
      ]
    ], 
    /* expensiveChecks */ js.UndefOr[scala.Boolean], 
    typingsSlinky.angular.mod.ICompiledExpression
  ]
  ///////////////////////////////////////////////////////////////////////////
  // RootElementService
  // see http://docs.angularjs.org/api/ng.$rootElement
  ///////////////////////////////////////////////////////////////////////////
  type IRootElementService = typingsSlinky.angular.JQLite
  type IScope = typingsSlinky.angular.mod.IRootScopeService
  type IServiceProviderFactory = js.Function1[/* repeated */ js.Any, typingsSlinky.angular.mod.IServiceProvider]
  ///////////////////////////////////////////////////////////////////////////
  // TemplateCacheService
  // see http://docs.angularjs.org/api/ng.$templateCache
  ///////////////////////////////////////////////////////////////////////////
  type ITemplateCacheService = typingsSlinky.angular.mod.ICacheObject
  // This corresponds to the "publicLinkFn" returned by $compile.
  type ITemplateLinkingFunction = js.Function3[
    /* scope */ typingsSlinky.angular.mod.IScope, 
    /* cloneAttachFn */ js.UndefOr[typingsSlinky.angular.mod.ICloneAttachFunction], 
    /* options */ js.UndefOr[typingsSlinky.angular.mod.ITemplateLinkingFunctionOptions], 
    typingsSlinky.angular.JQLite
  ]
  /**
    * xhrFactory
    * Replace or decorate this service to create your own custom XMLHttpRequest objects.
    * see https://docs.angularjs.org/api/ng/service/$xhrFactory
    */
  type IXhrFactory[T] = js.Function2[/* method */ java.lang.String, /* url */ java.lang.String, T]
  type Injectable[T /* <: typingsSlinky.angular.mod._Global_.Function */] = T | (js.Array[java.lang.String | T])
}
