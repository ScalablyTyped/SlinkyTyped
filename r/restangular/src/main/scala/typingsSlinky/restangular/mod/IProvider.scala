package typingsSlinky.restangular.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angular.mod.IDeferred
import typingsSlinky.angular.mod.IRequestShortcutConfig
import typingsSlinky.restangular.anon.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProvider extends js.Object {
  
  def addElementTransformer(route: String, isCollection: Boolean, transformer: js.Function): IProvider = js.native
  def addElementTransformer(route: String, transformer: js.Function): IProvider = js.native
  
  def addFullRequestInterceptor(
    requestInterceptor: js.Function7[
      /* element */ js.Any, 
      /* operation */ String, 
      /* what */ String, 
      /* url */ String, 
      /* headers */ js.Any, 
      /* params */ js.Any, 
      /* httpConfig */ IRequestShortcutConfig, 
      Element
    ]
  ): IProvider = js.native
  
  def addRequestInterceptor(
    requestInterceptor: js.Function4[/* element */ js.Any, /* operation */ String, /* what */ String, /* url */ String, _]
  ): IProvider = js.native
  
  def addResponseInterceptor(
    responseInterceptor: js.Function6[
      /* data */ js.Any, 
      /* operation */ String, 
      /* what */ String, 
      /* url */ String, 
      /* response */ IResponse, 
      /* deferred */ IDeferred[_], 
      _
    ]
  ): IProvider = js.native
  
  def extendCollection(route: String, extender: js.Function1[/* collection */ ICollection, _]): IProvider = js.native
  
  def extendModel(route: String, extender: js.Function1[/* model */ IElement, _]): IProvider = js.native
  
  def setBaseUrl(baseUrl: String): IProvider = js.native
  
  def setDefaultHeaders(headers: js.Any): IProvider = js.native
  
  def setDefaultHttpFields(httpFields: js.Any): IProvider = js.native
  
  def setDefaultRequestParams(method: String, params: js.Any): IProvider = js.native
  def setDefaultRequestParams(methods: js.Array[String], params: js.Any): IProvider = js.native
  def setDefaultRequestParams(params: js.Any): IProvider = js.native
  
  def setEncodeIds(encode: Boolean): IProvider = js.native
  
  def setErrorInterceptor(
    errorInterceptor: js.Function3[
      /* response */ IResponse, 
      /* deferred */ IDeferred[_], 
      /* responseHandler */ js.Function1[/* response */ IResponse, _], 
      _
    ]
  ): IProvider = js.native
  
  def setExtraFields(fields: js.Array[String]): IProvider = js.native
  
  def setFullRequestInterceptor(
    fullRequestInterceptor: js.Function7[
      /* element */ js.Any, 
      /* operation */ String, 
      /* what */ String, 
      /* url */ String, 
      /* headers */ js.Any, 
      /* params */ js.Any, 
      /* httpConfig */ IRequestShortcutConfig, 
      Element
    ]
  ): IProvider = js.native
  
  def setFullResponse(fullResponse: Boolean): IProvider = js.native
  
  def setJsonp(jsonp: Boolean): IProvider = js.native
  
  def setMethodOverriders(overriders: js.Array[String]): IProvider = js.native
  
  def setOnElemRestangularized(
    callback: js.Function4[
      /* elem */ js.Any, 
      /* isCollection */ Boolean, 
      /* what */ String, 
      /* restangular */ IService, 
      _
    ]
  ): IProvider = js.native
  
  def setParentless(parentless: Boolean, routes: js.Array[String]): IProvider = js.native
  def setParentless(value: js.Any): IProvider = js.native
  
  def setPlainByDefault(isPlain: Boolean): IProvider = js.native
  
  def setRequestInterceptor(
    requestInterceptor: js.Function4[/* element */ js.Any, /* operation */ String, /* what */ String, /* url */ String, _]
  ): IProvider = js.native
  
  def setRequestSuffix(suffix: String): IProvider = js.native
  
  def setResponseExtractor(
    responseInterceptor: js.Function6[
      /* data */ js.Any, 
      /* operation */ String, 
      /* what */ String, 
      /* url */ String, 
      /* response */ IResponse, 
      /* deferred */ IDeferred[_], 
      _
    ]
  ): IProvider = js.native
  
  def setResponseInterceptor(
    responseInterceptor: js.Function6[
      /* data */ js.Any, 
      /* operation */ String, 
      /* what */ String, 
      /* url */ String, 
      /* response */ IResponse, 
      /* deferred */ IDeferred[_], 
      _
    ]
  ): IProvider = js.native
  
  def setRestangularFields(fields: StringDictionary[String]): IProvider = js.native
  
  def setSelfLinkAbsoluteUrl(value: Boolean): IProvider = js.native
  
  def setTransformOnlyServerElements(active: Boolean): IProvider = js.native
  
  def setUseCannonicalId(useCannonicalId: Boolean): IProvider = js.native
}
