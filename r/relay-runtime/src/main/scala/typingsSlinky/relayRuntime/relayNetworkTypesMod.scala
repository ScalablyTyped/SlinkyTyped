package typingsSlinky.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsSlinky.relayRuntime.anon.Column
import typingsSlinky.relayRuntime.relayConcreteNodeMod.RequestParameters
import typingsSlinky.relayRuntime.relayObservableMod.ObservableFromValue
import typingsSlinky.relayRuntime.relayObservableMod.RelayObservable
import typingsSlinky.relayRuntime.relayRuntimeStrings.CRITICAL
import typingsSlinky.relayRuntime.relayRuntimeStrings.ERROR
import typingsSlinky.relayRuntime.relayRuntimeStrings.WARNING
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayNetworkTypesMod {
  
  type ExecuteFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* uploadables */ js.UndefOr[UploadableMap | Null], 
    RelayObservable[GraphQLResponse]
  ]
  
  type FetchFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* uploadables */ js.UndefOr[UploadableMap | Null], 
    ObservableFromValue[GraphQLResponse]
  ]
  
  type GraphQLResponse = GraphQLSingularResponse | js.Array[GraphQLSingularResponse]
  
  @js.native
  trait GraphQLResponseWithData extends GraphQLSingularResponse {
    
    var data: PayloadData = js.native
    
    var errors: js.UndefOr[js.Array[PayloadError]] = js.native
    
    var extensions: js.UndefOr[PayloadExtensions] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[js.Array[Double | String]] = js.native
  }
  object GraphQLResponseWithData {
    
    @scala.inline
    def apply(data: PayloadData): GraphQLResponseWithData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLResponseWithData]
    }
    
    @scala.inline
    implicit class GraphQLResponseWithDataMutableBuilder[Self <: GraphQLResponseWithData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: PayloadData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: js.Array[PayloadError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setErrorsVarargs(value: PayloadError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setExtensions(value: PayloadExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setPath(value: js.Array[Double | String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: (Double | String)*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GraphQLResponseWithExtensionsOnly extends GraphQLSingularResponse {
    
    // Per https://spec.graphql.org/June2018/#sec-Errors
    // > If the data entry in the response is not present, the errors entry
    // > in the response must not be empty. It must contain at least one error
    // This means a payload has to have either a data key or an errors key:
    // but the spec leaves room for the combination of data: null plus extensions
    // since `data: null` is a *required* output if there was an error during
    // execution, but the inverse is not described in the sepc: `data: null`
    // does not necessarily indicate that there was an error.
    var data: Null = js.native
    
    var extensions: PayloadExtensions = js.native
  }
  object GraphQLResponseWithExtensionsOnly {
    
    @scala.inline
    def apply(data: Null, extensions: PayloadExtensions): GraphQLResponseWithExtensionsOnly = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLResponseWithExtensionsOnly]
    }
    
    @scala.inline
    implicit class GraphQLResponseWithExtensionsOnlyMutableBuilder[Self <: GraphQLResponseWithExtensionsOnly] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Null): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensions(value: PayloadExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GraphQLResponseWithoutData extends GraphQLSingularResponse {
    
    var data: js.UndefOr[PayloadData] = js.native
    
    var errors: js.Array[PayloadError] = js.native
    
    var extensions: js.UndefOr[PayloadExtensions] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[js.Array[String | Double]] = js.native
  }
  object GraphQLResponseWithoutData {
    
    @scala.inline
    def apply(errors: js.Array[PayloadError]): GraphQLResponseWithoutData = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLResponseWithoutData]
    }
    
    @scala.inline
    implicit class GraphQLResponseWithoutDataMutableBuilder[Self <: GraphQLResponseWithoutData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: PayloadData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setErrors(value: js.Array[PayloadError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: PayloadError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setExtensions(value: PayloadExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithData
    - typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithExtensionsOnly
    - typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithoutData
  */
  trait GraphQLSingularResponse extends StObject
  object GraphQLSingularResponse {
    
    @scala.inline
    def GraphQLResponseWithData(data: PayloadData): typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithData]
    }
    
    @scala.inline
    def GraphQLResponseWithExtensionsOnly(data: Null, extensions: PayloadExtensions): typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithExtensionsOnly = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithExtensionsOnly]
    }
    
    @scala.inline
    def GraphQLResponseWithoutData(errors: js.Array[PayloadError]): typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithoutData = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithoutData]
    }
  }
  
  @js.native
  trait LegacyObserver[T] extends StObject {
    
    var onCompleted: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
    
    var onNext: js.UndefOr[js.Function1[/* data */ T, Unit]] = js.native
  }
  object LegacyObserver {
    
    @scala.inline
    def apply[T](): LegacyObserver[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegacyObserver[T]]
    }
    
    @scala.inline
    implicit class LegacyObserverMutableBuilder[Self <: LegacyObserver[_], T] (val x: Self with LegacyObserver[T]) extends AnyVal {
      
      @scala.inline
      def setOnCompleted(value: () => Unit): Self = StObject.set(x, "onCompleted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCompletedUndefined: Self = StObject.set(x, "onCompleted", js.undefined)
      
      @scala.inline
      def setOnError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnNext(value: /* data */ T => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
    }
  }
  
  type LogRequestInfoFunction = js.Function1[/* arg */ js.Any, Unit]
  
  @js.native
  trait Network extends StObject {
    
    def execute(request: RequestParameters, variables: Variables, cacheConfig: CacheConfig): RelayObservable[GraphQLResponse] = js.native
    def execute(
      request: RequestParameters,
      variables: Variables,
      cacheConfig: CacheConfig,
      uploadables: UploadableMap
    ): RelayObservable[GraphQLResponse] = js.native
    @JSName("execute")
    var execute_Original: ExecuteFunction = js.native
  }
  
  type PayloadData = StringDictionary[js.Any]
  
  @js.native
  trait PayloadError extends StObject {
    
    var locations: js.UndefOr[js.Array[Column]] = js.native
    
    var message: String = js.native
    
    var severity: js.UndefOr[CRITICAL | ERROR | WARNING] = js.native
  }
  object PayloadError {
    
    @scala.inline
    def apply(message: String): PayloadError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayloadError]
    }
    
    @scala.inline
    implicit class PayloadErrorMutableBuilder[Self <: PayloadError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocations(value: js.Array[Column]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      @scala.inline
      def setLocationsVarargs(value: Column*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverity(value: CRITICAL | ERROR | WARNING): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    }
  }
  
  type PayloadExtensions = StringDictionary[js.Any]
  
  type SubscribeFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* observer */ js.UndefOr[LegacyObserver[GraphQLResponse]], 
    RelayObservable[GraphQLResponse] | Disposable
  ]
  
  type Uploadable = File | Blob
  
  type UploadableMap = StringDictionary[Uploadable]
}
