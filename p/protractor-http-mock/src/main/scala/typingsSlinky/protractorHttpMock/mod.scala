package typingsSlinky.protractorHttpMock

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.protractorHttpMock.anon.Data
import typingsSlinky.protractorHttpMock.anon.Headers
import typingsSlinky.protractorHttpMock.anon.MethodPath
import typingsSlinky.protractorHttpMock.anon.MethodPathRegex
import typingsSlinky.protractorHttpMock.anon.Mocks
import typingsSlinky.protractorHttpMock.anon.Path
import typingsSlinky.protractorHttpMock.anon.PathRegex
import typingsSlinky.protractorHttpMock.anon.PathString
import typingsSlinky.protractorHttpMock.anon.Regex
import typingsSlinky.protractorHttpMock.mod.requests.AllRequests
import typingsSlinky.protractorHttpMock.mod.requests.Delete
import typingsSlinky.protractorHttpMock.mod.requests.Get
import typingsSlinky.protractorHttpMock.mod.requests.Head
import typingsSlinky.protractorHttpMock.mod.requests.Jsonp
import typingsSlinky.protractorHttpMock.mod.requests.Method
import typingsSlinky.protractorHttpMock.mod.requests.Patch
import typingsSlinky.protractorHttpMock.mod.requests.Post
import typingsSlinky.protractorHttpMock.mod.requests.PostData
import typingsSlinky.protractorHttpMock.mod.requests.Put
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("protractor-http-mock", JSImport.Namespace)
  @js.native
  val ^ : ProtractorHttpMock = js.native
  
  /**
    * Plugin for custom matching logic with 1 generic type.
    */
  @js.native
  trait Plugin1[T1] extends StObject {
    
    def `match`[O /* <: Delete[T1] */](mockRequest: O, requestConfig: O): Boolean = js.native
    /**
      * Match function.
      * Return a truthy value to indicate successfull match.
      *
      * @param mockRequest The mock to compare request with.
      * @param requestConfig The request object to compare mock with.
      */
    @JSName("match")
    def match_O_GetT1[O /* <: Get[T1] */](mockRequest: O, requestConfig: O): Boolean = js.native
    @JSName("match")
    def match_O_HeadT1[O /* <: Head[T1] */](mockRequest: O, requestConfig: O): Boolean = js.native
    @JSName("match")
    def match_O_JsonpT1[O /* <: Jsonp[T1] */](mockRequest: O, requestConfig: O): Boolean = js.native
    @JSName("match")
    def match_O_PatchT1[O /* <: Patch[T1] */](mockRequest: O, requestConfig: O): Boolean = js.native
    @JSName("match")
    def match_O_PostT1[O /* <: Post[T1] */](mockRequest: O, requestConfig: O): Boolean = js.native
    @JSName("match")
    def match_O_PutT1[O /* <: Put[T1] */](mockRequest: O, requestConfig: O): Boolean = js.native
  }
  
  /**
    * Plugin for custom matching logic with 2 generic types.
    */
  @js.native
  trait Plugin2[T1, T2] extends StObject {
    
    /**
      * Match function.
      * Return a truthy value to indicate successfull match.
      *
      * @param mockRequest The mock to compare request with.
      * @param requestConfig The request object to compare mock with.
      */
    def `match`[O /* <: PostData[T1, T2] */](mockRequest: O, requestConfig: O): Boolean = js.native
  }
  object Plugin2 {
    
    @scala.inline
    def apply[T1, T2](`match`: (js.Any, js.Any) => Boolean): Plugin2[T1, T2] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
      __obj.asInstanceOf[Plugin2[T1, T2]]
    }
    
    @scala.inline
    implicit class Plugin2MutableBuilder[Self <: Plugin2[_, _], T1, T2] (val x: Self with (Plugin2[T1, T2])) extends AnyVal {
      
      @scala.inline
      def setMatch(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ProtractorHttpMock extends StObject {
    
    /**
      * Instantiate mock module. This must be done before the browser connects.
      *
      * @param mocks An array of either mock modules or module names relative to the rootDirectory configuration to load into the application.
      * @param plugins An array of either Plugin objects or NPM modules as strings.
      * @param skipDefaults Set true to skip loading of default mocks.
      */
    def apply(): ProtractorHttpMock = js.native
    def apply(mocks: js.UndefOr[scala.Nothing], plugins: js.UndefOr[scala.Nothing], skipDefaults: Boolean): ProtractorHttpMock = js.native
    def apply(mocks: js.UndefOr[scala.Nothing], plugins: js.Array[Plugin1[_] | (Plugin2[_, _]) | String]): ProtractorHttpMock = js.native
    def apply(
      mocks: js.UndefOr[scala.Nothing],
      plugins: js.Array[Plugin1[_] | (Plugin2[_, _]) | String],
      skipDefaults: Boolean
    ): ProtractorHttpMock = js.native
    def apply(mocks: js.Array[AllRequests | String]): ProtractorHttpMock = js.native
    def apply(mocks: js.Array[AllRequests | String], plugins: js.UndefOr[scala.Nothing], skipDefaults: Boolean): ProtractorHttpMock = js.native
    def apply(mocks: js.Array[AllRequests | String], plugins: js.Array[Plugin1[_] | (Plugin2[_, _]) | String]): ProtractorHttpMock = js.native
    def apply(
      mocks: js.Array[AllRequests | String],
      plugins: js.Array[Plugin1[_] | (Plugin2[_, _]) | String],
      skipDefaults: Boolean
    ): ProtractorHttpMock = js.native
    
    /**
      * Add mocks during test execution.
      * Returns a promise that will be resolved with a true boolean
      * when mocks are added.
      *
      * @param mocks An array of mock modules to load into the application.
      */
    def add(mocks: js.Array[AllRequests]): js.Promise[Boolean] = js.native
    
    /**
      * Returns a promise that will be resolved with a true boolean
      * when all matched HTTP requests are cleared.
      */
    def clearRequests(): js.Promise[Boolean] = js.native
    
    /**
      * Module configuration to setup
      */
    var config: Mocks = js.native
    
    /**
      * Remove mocks during test execution.
      * Returns a promise that will be resolved with a true boolean
      * when the supplied mocks are removed.
      *
      * @param mocks An array of mock modules to remove from the application.
      */
    def remove(mocks: js.Array[AllRequests]): js.Promise[Boolean] = js.native
    
    /**
      * Returns a promise that will be resolved with an array of
      * all matched HTTP requests.
      */
    def requestsMade(): js.Promise[js.Array[ReceivedRequest]] = js.native
    
    /**
      * Clean up.
      * Typically done in the afterEach call to ensure the teardown
      * is executed regardless of what happens in the test execution.
      */
    def teardown(): Unit = js.native
  }
  
  /**
    * Matched request.
    */
  @js.native
  trait ReceivedRequest extends StObject {
    
    var method: Method = js.native
    
    var url: String = js.native
  }
  object ReceivedRequest {
    
    @scala.inline
    def apply(method: Method, url: String): ReceivedRequest = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceivedRequest]
    }
    
    @scala.inline
    implicit class ReceivedRequestMutableBuilder[Self <: ReceivedRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ProtractorHttpMock
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ProtractorHttpMock = ^
  
  object requests {
    
    /**
      * All available request types.
      */
    type AllRequests = Get[js.Any] | (PostData[js.Any, js.Any]) | Post[js.Any] | Head[js.Any] | Delete[js.Any] | Put[js.Any] | Patch[js.Any] | Jsonp[js.Any]
    
    /**
      * HTTP Delete request mock.
      */
    @js.native
    trait Delete[TResponse] extends StObject {
      
      var request: MethodPath = js.native
      
      var response: Data[TResponse] = js.native
    }
    object Delete {
      
      @scala.inline
      def apply[TResponse](request: MethodPath, response: Data[TResponse]): Delete[TResponse] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[Delete[TResponse]]
      }
      
      @scala.inline
      implicit class DeleteMutableBuilder[Self <: Delete[_], TResponse] (val x: Self with Delete[TResponse]) extends AnyVal {
        
        @scala.inline
        def setRequest(value: MethodPath): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponse(value: Data[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * GET request mock.
      */
    @js.native
    trait Get[TResponse] extends StObject {
      
      var request: Headers = js.native
      
      var response: Data[TResponse] = js.native
    }
    object Get {
      
      @scala.inline
      def apply[TResponse](request: Headers, response: Data[TResponse]): Get[TResponse] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[Get[TResponse]]
      }
      
      @scala.inline
      implicit class GetMutableBuilder[Self <: Get[_], TResponse] (val x: Self with Get[TResponse]) extends AnyVal {
        
        @scala.inline
        def setRequest(value: Headers): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponse(value: Data[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * HEAD request mock.
      */
    @js.native
    trait Head[TResponse] extends StObject {
      
      var request: Regex = js.native
      
      var response: Data[TResponse] = js.native
    }
    object Head {
      
      @scala.inline
      def apply[TResponse](request: Regex, response: Data[TResponse]): Head[TResponse] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[Head[TResponse]]
      }
      
      @scala.inline
      implicit class HeadMutableBuilder[Self <: Head[_], TResponse] (val x: Self with Head[TResponse]) extends AnyVal {
        
        @scala.inline
        def setRequest(value: Regex): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponse(value: Data[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * JSONP request mock.
      */
    @js.native
    trait Jsonp[TResponse] extends StObject {
      
      var request: PathString = js.native
      
      var response: Data[TResponse] = js.native
    }
    object Jsonp {
      
      @scala.inline
      def apply[TResponse](request: PathString, response: Data[TResponse]): Jsonp[TResponse] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[Jsonp[TResponse]]
      }
      
      @scala.inline
      implicit class JsonpMutableBuilder[Self <: Jsonp[_], TResponse] (val x: Self with Jsonp[TResponse]) extends AnyVal {
        
        @scala.inline
        def setRequest(value: PathString): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponse(value: Data[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Request methods type
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.protractorHttpMock.protractorHttpMockStrings.GET
      - typingsSlinky.protractorHttpMock.protractorHttpMockStrings.POST
      - typingsSlinky.protractorHttpMock.protractorHttpMockStrings.DELETE
      - typingsSlinky.protractorHttpMock.protractorHttpMockStrings.PUT
      - typingsSlinky.protractorHttpMock.protractorHttpMockStrings.HEAD
      - typingsSlinky.protractorHttpMock.protractorHttpMockStrings.PATCH
      - typingsSlinky.protractorHttpMock.protractorHttpMockStrings.JSONP
    */
    trait Method extends StObject
    object Method {
      
      @scala.inline
      def DELETE: typingsSlinky.protractorHttpMock.protractorHttpMockStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.protractorHttpMock.protractorHttpMockStrings.DELETE]
      
      @scala.inline
      def GET: typingsSlinky.protractorHttpMock.protractorHttpMockStrings.GET = "GET".asInstanceOf[typingsSlinky.protractorHttpMock.protractorHttpMockStrings.GET]
      
      @scala.inline
      def HEAD: typingsSlinky.protractorHttpMock.protractorHttpMockStrings.HEAD = "HEAD".asInstanceOf[typingsSlinky.protractorHttpMock.protractorHttpMockStrings.HEAD]
      
      @scala.inline
      def JSONP: typingsSlinky.protractorHttpMock.protractorHttpMockStrings.JSONP = "JSONP".asInstanceOf[typingsSlinky.protractorHttpMock.protractorHttpMockStrings.JSONP]
      
      @scala.inline
      def PATCH: typingsSlinky.protractorHttpMock.protractorHttpMockStrings.PATCH = "PATCH".asInstanceOf[typingsSlinky.protractorHttpMock.protractorHttpMockStrings.PATCH]
      
      @scala.inline
      def POST: typingsSlinky.protractorHttpMock.protractorHttpMockStrings.POST = "POST".asInstanceOf[typingsSlinky.protractorHttpMock.protractorHttpMockStrings.POST]
      
      @scala.inline
      def PUT: typingsSlinky.protractorHttpMock.protractorHttpMockStrings.PUT = "PUT".asInstanceOf[typingsSlinky.protractorHttpMock.protractorHttpMockStrings.PUT]
    }
    
    /**
      * PATCH request mock.
      */
    @js.native
    trait Patch[TResponse] extends StObject {
      
      var request: MethodPathRegex = js.native
      
      var response: Data[TResponse] = js.native
    }
    object Patch {
      
      @scala.inline
      def apply[TResponse](request: MethodPathRegex, response: Data[TResponse]): Patch[TResponse] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[Patch[TResponse]]
      }
      
      @scala.inline
      implicit class PatchMutableBuilder[Self <: Patch[_], TResponse] (val x: Self with Patch[TResponse]) extends AnyVal {
        
        @scala.inline
        def setRequest(value: MethodPathRegex): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponse(value: Data[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * POST request mock.
      */
    @js.native
    trait Post[TResponse] extends StObject {
      
      var request: Path = js.native
      
      var response: Data[TResponse] = js.native
    }
    object Post {
      
      @scala.inline
      def apply[TResponse](request: Path, response: Data[TResponse]): Post[TResponse] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[Post[TResponse]]
      }
      
      @scala.inline
      implicit class PostMutableBuilder[Self <: Post[_], TResponse] (val x: Self with Post[TResponse]) extends AnyVal {
        
        @scala.inline
        def setRequest(value: Path): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponse(value: Data[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * POST request mock with payload.
      */
    @js.native
    trait PostData[TResponse, TPayload] extends StObject {
      
      var request: typingsSlinky.protractorHttpMock.anon.Method[TPayload] = js.native
      
      var response: Data[TResponse] = js.native
    }
    object PostData {
      
      @scala.inline
      def apply[TResponse, TPayload](request: typingsSlinky.protractorHttpMock.anon.Method[TPayload], response: Data[TResponse]): PostData[TResponse, TPayload] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[PostData[TResponse, TPayload]]
      }
      
      @scala.inline
      implicit class PostDataMutableBuilder[Self <: PostData[_, _], TResponse, TPayload] (val x: Self with (PostData[TResponse, TPayload])) extends AnyVal {
        
        @scala.inline
        def setRequest(value: typingsSlinky.protractorHttpMock.anon.Method[TPayload]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponse(value: Data[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * PUT request mock.
      */
    @js.native
    trait Put[TResponse] extends StObject {
      
      var request: PathRegex = js.native
      
      var response: Data[TResponse] = js.native
    }
    object Put {
      
      @scala.inline
      def apply[TResponse](request: PathRegex, response: Data[TResponse]): Put[TResponse] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[Put[TResponse]]
      }
      
      @scala.inline
      implicit class PutMutableBuilder[Self <: Put[_], TResponse] (val x: Self with Put[TResponse]) extends AnyVal {
        
        @scala.inline
        def setRequest(value: PathRegex): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponse(value: Data[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
  }
}
