package typingsSlinky.fetchMock

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.fetchMock.anon.FallbackToNetwork
import typingsSlinky.fetchMock.fetchMockBooleans.`false`
import typingsSlinky.fetchMock.fetchMockBooleans.`true`
import typingsSlinky.fetchMock.fetchMockStrings.DELETE
import typingsSlinky.fetchMock.fetchMockStrings.GET
import typingsSlinky.fetchMock.fetchMockStrings.HEAD
import typingsSlinky.fetchMock.fetchMockStrings.POST
import typingsSlinky.fetchMock.fetchMockStrings.PUT
import typingsSlinky.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("fetch-mock", JSImport.Namespace)
  @js.native
  val ^ : FetchMockStatic = js.native
  
  @js.native
  trait FetchMockSandbox extends FetchMockStatic {
    
    /**
      * Also callable as fetch(). Use `typeof fetch` in your code to define
      * a field that accepts both `fetch()` and a fetch-mock sandbox.
      */
    def apply(): js.Promise[Response] = js.native
    def apply(input: js.UndefOr[scala.Nothing], init: RequestInit): js.Promise[Response] = js.native
    def apply(input: String): js.Promise[Response] = js.native
    def apply(input: String, init: RequestInit): js.Promise[Response] = js.native
    def apply(input: Request): js.Promise[Response] = js.native
    def apply(input: Request, init: RequestInit): js.Promise[Response] = js.native
  }
  
  @js.native
  trait FetchMockStatic extends StObject {
    
    var MATCHED: `true` = js.native
    
    var UNMATCHED: `false` = js.native
    
    /**
      * Returns a Boolean indicating whether any calls to fetch matched the
      * given filter.
      * @param [filter] Allows filtering of calls to fetch based on various
      * criteria
      * @param [options] Either an object compatible with the mocking api or
      * a string specifying a http method to filter by. This will be used to
      * filter the list of calls further.
      */
    def called(): Boolean = js.native
    def called(filter: js.UndefOr[InspectionFilter], options: InspectionOptions): Boolean = js.native
    def called(filter: InspectionFilter): Boolean = js.native
    
    /**
      * Returns an array of all calls to fetch matching the given filters.
      * Each call is returned as a [url, options] array. If fetch was called
      * using a Request instance, this will be available as a request
      * property on this array.
      * @param [filter] Allows filtering of calls to fetch based on various
      * criteria
      * @param [options] Either an object compatible with the mocking api or
      * a string specifying a http method to filter by. This will be used to
      * filter the list of calls further.
      */
    def calls(): js.Array[MockCall] = js.native
    def calls(filter: js.UndefOr[InspectionFilter], options: InspectionOptions): js.Array[MockCall] = js.native
    def calls(filter: InspectionFilter): js.Array[MockCall] = js.native
    
    /**
      * Chainable method that defines how to respond to calls to fetch that
      * don't match any of the defined mocks. It accepts the same types of
      * response as a normal call to .mock(matcher, response). It can also
      * take an arbitrary function to completely customise behaviour of
      * unmatched calls. If .catch() is called without any parameters then
      * every unmatched call will receive a 200 response.
      * @param [response] Configures the http response returned by the mock
      */
    def `catch`(): this.type = js.native
    def `catch`(response: MockResponse): this.type = js.native
    def `catch`(response: MockResponseFunction): this.type = js.native
    
    var config: FallbackToNetwork = js.native
    
    /**
      * Replaces fetch() with a stub which records its calls, grouped by
      * route, and optionally returns a mocked Response object or passes the
      *  call through to fetch(). Shorthand for mock() restricted to the
      *  DELETE method. Calls to .delete() can be chained.
      * @param matcher Condition for selecting which requests to mock
      * @param response Configures the http response returned by the mock
      * @param [options] Additional properties defining the route to mock
      */
    def delete(matcher: MockMatcher, response: MockResponse): this.type = js.native
    def delete(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
    def delete(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodDelete): this.type = js.native
    def delete(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodDelete): this.type = js.native
    
    /**
      * Replaces fetch() with a stub which records its calls, grouped by
      * route, and optionally returns a mocked Response object or passes the
      *  call through to fetch(). Shorthand for mock() restricted to the
      *  DELETE method and limited to being called one time only. Calls to
      *  .deleteOnce() can be chained.
      * @param matcher Condition for selecting which requests to mock
      * @param response Configures the http response returned by the mock
      * @param [options] Additional properties defining the route to mock
      */
    def deleteOnce(matcher: MockMatcher, response: MockResponse): this.type = js.native
    def deleteOnce(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
    def deleteOnce(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodDelete): this.type = js.native
    def deleteOnce(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodDelete): this.type = js.native
    
    /**
      * Returns a Boolean indicating whether fetch was called the expected
      * number of times (or has been called at least once if repeat is
      * undefined for the route).
      * @param [filter] Rule for matching calls to fetch.
      */
    def done(): Boolean = js.native
    def done(filter: InspectionFilter): Boolean = js.native
    
    /**
      * Returns a promise that resolves once all fetches handled by fetch-mock
      * have resolved.
      * @param [waitForBody] Wait for all body parsing methods(res.json(),
      * res.text(), etc.) to resolve too.
      */
    def flush(): js.Promise[js.Array[MockResponse]] = js.native
    def flush(waitForBody: Boolean): js.Promise[js.Array[MockResponse]] = js.native
    
    /**
      * Replaces fetch() with a stub which records its calls, grouped by
      * route, and optionally returns a mocked Response object or passes the
      *  call through to fetch(). Shorthand for mock() restricted to the GET
      *  method. Calls to .get() can be chained.
      * @param matcher Condition for selecting which requests to mock
      * @param response Configures the http response returned by the mock
      * @param [options] Additional properties defining the route to mock
      */
    def get(matcher: MockMatcher, response: MockResponse): this.type = js.native
    def get(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
    def get(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodGet): this.type = js.native
    def get(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodGet): this.type = js.native
    
    /**
      * Replaces fetch() with a stub which records its calls, grouped by
      * route, and optionally returns a mocked Response object or passes the
      *  call through to fetch(). Shorthand for mock() restricted to the GET
      *  method and limited to being called one time only. Calls to .getOnce()
      *  can be chained.
      * @param matcher Condition for selecting which requests to mock
      * @param response Configures the http response returned by the mock
      * @param [options] Additional properties defining the route to mock
      */
    def getOnce(matcher: MockMatcher, response: MockResponse): this.type = js.native
    def getOnce(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
    def getOnce(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodGet): this.type = js.native
    def getOnce(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodGet): this.type = js.native
    
    /**
      * Replaces fetch() with a stub which records its calls, grouped by
      * route, and optionally returns a mocked Response object or passes the
      *  call through to fetch(). Shorthand for mock() restricted to the HEAD
      *  method. Calls to .head() can be chained.
      * @param matcher Condition for selecting which requests to mock
      * @param response Configures the http response returned by the mock
      * @param [options] Additional properties defining the route to mock
      */
    def head(matcher: MockMatcher, response: MockResponse): this.type = js.native
    def head(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
    def head(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodHead): this.type = js.native
    def head(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodHead): this.type = js.native
    
    /**
      * Replaces fetch() with a stub which records its calls, grouped by
      * route, and optionally returns a mocked Response object or passes the
      *  call through to fetch(). Shorthand for mock() restricted to the HEAD
      *  method and limited to being called one time only. Calls to .headOnce()
      *  can be chained.
      * @param matcher Condition for selecting which requests to mock
      * @param response Configures the http response returned by the mock
      * @param [options] Additional properties defining the route to mock
      */
    def headOnce(matcher: MockMatcher, response: MockResponse): this.type = js.native
    def headOnce(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
    def headOnce(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodHead): this.type = js.native
    def headOnce(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodHead): this.type = js.native
    
    /**
      * Returns the arguments for the last call to fetch matching the given
      * filter.
      * @param [filter] Allows filtering of calls to fetch based on various
      * criteria
      * @param [options] Either an object compatible with the mocking api or
      * a string specifying a http method to filter by. This will be used to
      * filter the list of calls further.
      */
    def lastCall(): js.UndefOr[MockCall] = js.native
    def lastCall(filter: js.UndefOr[InspectionFilter], options: InspectionOptions): js.UndefOr[MockCall] = js.native
    def lastCall(filter: InspectionFilter): js.UndefOr[MockCall] = js.native
    
    /**
      * Returns the options for the call to fetch matching the given filter.
      * If fetch was last called using a Request instance, a set of options
      * inferred from the Request will be returned.
      * @param [filter] Allows filtering of calls to fetch based on various
      * criteria
      * @param [options] Either an object compatible with the mocking api or
      * a string specifying a http method to filter by. This will be used to
      * filter the list of calls further.
      */
    def lastOptions(): js.UndefOr[MockOptions] = js.native
    def lastOptions(filter: js.UndefOr[InspectionFilter], options: InspectionOptions): js.UndefOr[MockOptions] = js.native
    def lastOptions(filter: InspectionFilter): js.UndefOr[MockOptions] = js.native
    
    /**
      * Returns the url for the last call to fetch matching the given
      * filter. If fetch was last called using a Request instance, the url
      * will be extracted from this.
      * @param [filter] Allows filtering of calls to fetch based on various
      * criteria
      * @param [options] Either an object compatible with the mocking api or
      * a string specifying a http method to filter by. This will be used to
      * filter the list of calls further.
      */
    def lastUrl(): js.UndefOr[String] = js.native
    def lastUrl(filter: js.UndefOr[InspectionFilter], options: InspectionOptions): js.UndefOr[String] = js.native
    def lastUrl(filter: InspectionFilter): js.UndefOr[String] = js.native
    
    /**
      * Replaces fetch() with a stub which records its calls, grouped by
      * route, and optionally returns a mocked Response object or passes the
      *  call through to fetch(). Calls to .mock() can be chained.
      * @param matcher Condition for selecting which requests to mock
      * @param response Configures the http response returned by the mock
      * @param [options] Additional properties defining the route to mock
      */
    def mock(matcher: MockMatcher, response: MockResponse): this.type = js.native
    def mock(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
    def mock(matcher: MockMatcher, response: MockResponseFunction, options: MockOptions): this.type = js.native
    def mock(matcher: MockMatcher, response: MockResponse, options: MockOptions): this.type = js.native
    /**
      * Replaces fetch() with a stub which records its calls, grouped by
      * route, and optionally returns a mocked Response object or passes the
      *  call through to fetch(). Calls to .mock() can be chained.
      * @param options The route to mock
      */
    def mock(options: MockOptions): this.type = js.native
    
    /**
      * Replaces fetch() with a stub which records its calls, grouped by
      * route, and optionally returns a mocked Response object or passes the
      *  call through to fetch(). Shorthand for mock() limited to being
      *  called one time only. Calls to .once() can be chained.
      * @param matcher Condition for selecting which requests to mock
      * @param response Configures the http response returned by the mock
      * @param [options] Optional additional properties defining the route to mock
      */
    def once(matcher: MockMatcher, response: MockResponse): this.type = js.native
    def once(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
    def once(matcher: MockMatcher, response: MockResponseFunction, options: MockOptions): this.type = js.native
    def once(matcher: MockMatcher, response: MockResponse, options: MockOptions): this.type = js.native
    
    /**
      * Replaces fetch() with a stub which records its calls, grouped by
      * route, and optionally returns a mocked Response object or passes the
      *  call through to fetch(). Shorthand for mock() restricted to the PATCH
      *  method. Calls to .patch() can be chained.
      * @param matcher Condition for selecting which requests to mock
      * @param response Configures the http response returned by the mock
      * @param [options] Additional properties defining the route to mock
      */
    def patch(matcher: MockMatcher, response: MockResponse): this.type = js.native
    def patch(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
    def patch(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodHead): this.type = js.native
    def patch(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodHead): this.type = js.native
    
    /**
      * Replaces fetch() with a stub which records its calls, grouped by
      * route, and optionally returns a mocked Response object or passes the
      *  call through to fetch(). Shorthand for mock() restricted to the PATCH
      *  method and limited to being called one time only. Calls to .patchOnce()
      *  can be chained.
      * @param matcher Condition for selecting which requests to mock
      * @param response Configures the http response returned by the mock
      * @param [options] Additional properties defining the route to mock
      */
    def patchOnce(matcher: MockMatcher, response: MockResponse): this.type = js.native
    def patchOnce(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
    def patchOnce(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodHead): this.type = js.native
    def patchOnce(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodHead): this.type = js.native
    
    /**
      * Replaces fetch() with a stub which records its calls, grouped by
      * route, and optionally returns a mocked Response object or passes the
      *  call through to fetch(). Shorthand for mock() restricted to the POST
      *  method. Calls to .post() can be chained.
      * @param matcher Condition for selecting which requests to mock
      * @param response Configures the http response returned by the mock
      * @param [options] Additional properties defining the route to mock
      */
    def post(matcher: MockMatcher, response: MockResponse): this.type = js.native
    def post(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
    def post(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodPost): this.type = js.native
    def post(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodPost): this.type = js.native
    
    /**
      * Replaces fetch() with a stub which records its calls, grouped by
      * route, and optionally returns a mocked Response object or passes the
      *  call through to fetch(). Shorthand for mock() restricted to the POST
      *  method and limited to being called one time only. Calls to .postOnce()
      *  can be chained.
      * @param matcher Condition for selecting which requests to mock
      * @param response Configures the http response returned by the mock
      * @param [options] Additional properties defining the route to mock
      */
    def postOnce(matcher: MockMatcher, response: MockResponse): this.type = js.native
    def postOnce(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
    def postOnce(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodPost): this.type = js.native
    def postOnce(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodPost): this.type = js.native
    
    /**
      * Replaces fetch() with a stub which records its calls, grouped by
      * route, and optionally returns a mocked Response object or passes the
      *  call through to fetch(). Shorthand for mock() restricted to the PUT
      *  method. Calls to .put() can be chained.
      * @param matcher Condition for selecting which requests to mock
      * @param response Configures the http response returned by the mock
      * @param [options] Additional properties defining the route to mock
      */
    def put(matcher: MockMatcher, response: MockResponse): this.type = js.native
    def put(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
    def put(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodPut): this.type = js.native
    def put(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodPut): this.type = js.native
    
    /**
      * Replaces fetch() with a stub which records its calls, grouped by
      * route, and optionally returns a mocked Response object or passes the
      *  call through to fetch(). Shorthand for mock() restricted to the PUT
      *  method and limited to being called one time only. Calls to .putOnce()
      *  can be chained.
      * @param matcher Condition for selecting which requests to mock
      * @param response Configures the http response returned by the mock
      * @param [options] Additional properties defining the route to mock
      */
    def putOnce(matcher: MockMatcher, response: MockResponse): this.type = js.native
    def putOnce(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
    def putOnce(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodPut): this.type = js.native
    def putOnce(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodPut): this.type = js.native
    
    /**
      * Restores fetch() to its unstubbed state and clears all data recorded
      * for its calls. reset() is an alias for restore().
      */
    def reset(): this.type = js.native
    
    /**
      * Removes mocking behaviour without resetting call history.
      */
    def resetBehavior(): this.type = js.native
    
    /**
      * Clears all data recorded for fetch()’s calls. It will not restore
      * fetch to its default implementation.
      */
    def resetHistory(): this.type = js.native
    
    /**
      * Restores fetch() to its unstubbed state and clears all data recorded
      * for its calls. reset() is an alias for restore().
      */
    def restore(): this.type = js.native
    
    /**
      * Returns a drop-in mock for fetch which can be passed to other mocking
      * libraries. It implements the full fetch-mock api and maintains its
      * own state independent of other instances, so tests can be run in
      * parallel.
      */
    def sandbox(): FetchMockSandbox = js.native
    
    /**
      * Chainable method that records the call history of unmatched calls,
      * but instead of responding with a stubbed response, the request is
      * passed through to native fetch() and is allowed to communicate
      * over the network. Similar to catch().
      */
    def spy(): this.type = js.native
    def spy(response: MockResponse): this.type = js.native
    def spy(response: MockResponseFunction): this.type = js.native
  }
  
  /**
    * Inspection filter. Can be one of the following:
    * boolean:
    *   * true retrieves all calls matched by fetch.
    *     fetchMock.MATCHED is an alias for true and may be used to make tests
    *     more readable.
    *   * false retrieves all calls not matched by fetch (i.e. those handled
    *     by catch() or spy(). fetchMock.UNMATCHED is an alias for false and
    *     may be used to make tests more readable.
    * MockMatcher (routeIdentifier):
    *   All routes have an identifier:
    *    * If it’s a named route, the identifier is the route’s name
    *    * If the route is unnamed, the identifier is the matcher passed in to
    *      .mock()
    *   All calls that were handled by the route with the given identifier
    *   will be retrieved
    * MockMatcher (matcher):
    *   Any matcher compatible with the mocking api can be passed in to filter
    *   the calls arbitrarily.
    */
  type InspectionFilter = MockMatcher | Boolean
  
  /**
    * Either an object compatible with the mocking api or a string specifying
    * a http method to filter by. This will be used to filter the list of
    * calls further.
    */
  type InspectionOptions = MockOptions | String
  
  @js.native
  trait MockCall
    extends Array[js.UndefOr[String | RequestInit]] {
    
    var `0`: String = js.native
    
    var `1`: js.UndefOr[RequestInit] = js.native
    
    var identifier: String = js.native
    
    var isUnmatched: js.UndefOr[Boolean] = js.native
    
    var request: js.UndefOr[Request] = js.native
  }
  
  /**
    * Mock matcher. Can be one of following:
    * string: Either
    *   * an exact url to match e.g. 'http://www.site.com/page.html'
    *   * if the string begins with a `^`, the string following the `^` must
    *     begin the url e.g. '^http://www.site.com' would match
    *      'http://www.site.com' or 'http://www.site.com/page.html'
    *    * '*' to match any url
    * RegExp: A regular expression to test the url against
    * Function(url, opts): A function (returning a Boolean) that is passed the
    *  url and opts fetch() is called with (or, if fetch() was called with one,
    *  the Request instance)
    */
  type MockMatcher = String | js.RegExp | MockMatcherFunction
  
  /**
    * Mock matcher function
    */
  type MockMatcherFunction = js.Function2[/* url */ String, /* opts */ MockRequest, Boolean]
  
  /**
    * Mock options object
    */
  @js.native
  trait MockOptions extends StObject {
    
    /**
      * body to match
      */
    var body: js.UndefOr[String | js.Object] = js.native
    
    /**
      * A function for arbitrary matching
      */
    var functionMatcher: js.UndefOr[MockMatcherFunction] = js.native
    
    /**
      * key/value map of headers to match
      */
    var headers: js.UndefOr[StringDictionary[String | Double]] = js.native
    
    /**
      * Automatically sets a content-length header on each response.
      * @default true
      */
    var includeContentLength: js.UndefOr[Boolean] = js.native
    
    /**
      * as specified above
      */
    var matcher: js.UndefOr[MockMatcher] = js.native
    
    /**
      * http method to match
      */
    var method: js.UndefOr[String] = js.native
    
    /**
      * A unique string naming the route. Used to subsequently retrieve
      * references to the calls, grouped by name.
      * @default matcher.toString()
      *
      * Note: If a non-unique name is provided no error will be thrown
      *  (because names are optional, auto-generated ones may legitimately
      *  clash)
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * This option allows for existing routes in a mock to be overwritten.
      * It’s also possible to define multiple routes with ‘the same’ matcher.
      * Default behaviour is to error
      */
    var overwriteRoutes: js.UndefOr[Boolean] = js.native
    
    /**
      * key/value map of express style path params to match
      */
    var params: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * key/value map of query strings to match, in any order
      */
    var query: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * integer, n, limiting the number of times the matcher can be used.
      * If the route has already been called n times the route will be
      * ignored and the call to fetch() will fall through to be handled by
      * any other routes defined (which may eventually result in an error
      * if nothing matches it).
      */
    var repeat: js.UndefOr[Double] = js.native
    
    /**
      * as specified above
      */
    var response: js.UndefOr[MockResponse | MockResponseFunction] = js.native
    
    /**
      * Convert objects into JSON before delivering as stub responses. Can
      * be useful to set to false globally if e.g. dealing with a lot of
      * array buffers. If true, will also add content-type: application/json
      * header.
      * @default true
      */
    var sendAsJson: js.UndefOr[Boolean] = js.native
  }
  object MockOptions {
    
    @scala.inline
    def apply(): MockOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockOptions]
    }
    
    @scala.inline
    implicit class MockOptionsMutableBuilder[Self <: MockOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setFunctionMatcher(value: (/* url */ String, /* opts */ MockRequest) => Boolean): Self = StObject.set(x, "functionMatcher", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFunctionMatcherUndefined: Self = StObject.set(x, "functionMatcher", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String | Double]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIncludeContentLength(value: Boolean): Self = StObject.set(x, "includeContentLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeContentLengthUndefined: Self = StObject.set(x, "includeContentLength", js.undefined)
      
      @scala.inline
      def setMatcher(value: MockMatcher): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatcherFunction2(value: (/* url */ String, /* opts */ MockRequest) => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMatcherRegExp(value: js.RegExp): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOverwriteRoutes(value: Boolean): Self = StObject.set(x, "overwriteRoutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteRoutesUndefined: Self = StObject.set(x, "overwriteRoutes", js.undefined)
      
      @scala.inline
      def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setQuery(value: StringDictionary[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setResponse(value: MockResponse | MockResponseFunction): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseFunction2(value: (/* url */ String, /* opts */ MockRequest) => MockResponse): Self = StObject.set(x, "response", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResponseResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      @scala.inline
      def setSendAsJson(value: Boolean): Self = StObject.set(x, "sendAsJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendAsJsonUndefined: Self = StObject.set(x, "sendAsJson", js.undefined)
    }
  }
  
  @js.native
  trait MockOptionsMethodDelete extends MockOptions {
    
    @JSName("method")
    var method_MockOptionsMethodDelete: js.UndefOr[DELETE] = js.native
  }
  object MockOptionsMethodDelete {
    
    @scala.inline
    def apply(): MockOptionsMethodDelete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockOptionsMethodDelete]
    }
    
    @scala.inline
    implicit class MockOptionsMethodDeleteMutableBuilder[Self <: MockOptionsMethodDelete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  @js.native
  trait MockOptionsMethodGet extends MockOptions {
    
    @JSName("method")
    var method_MockOptionsMethodGet: js.UndefOr[GET] = js.native
  }
  object MockOptionsMethodGet {
    
    @scala.inline
    def apply(): MockOptionsMethodGet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockOptionsMethodGet]
    }
    
    @scala.inline
    implicit class MockOptionsMethodGetMutableBuilder[Self <: MockOptionsMethodGet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  @js.native
  trait MockOptionsMethodHead extends MockOptions {
    
    @JSName("method")
    var method_MockOptionsMethodHead: js.UndefOr[HEAD] = js.native
  }
  object MockOptionsMethodHead {
    
    @scala.inline
    def apply(): MockOptionsMethodHead = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockOptionsMethodHead]
    }
    
    @scala.inline
    implicit class MockOptionsMethodHeadMutableBuilder[Self <: MockOptionsMethodHead] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: HEAD): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  @js.native
  trait MockOptionsMethodPost extends MockOptions {
    
    @JSName("method")
    var method_MockOptionsMethodPost: js.UndefOr[POST] = js.native
  }
  object MockOptionsMethodPost {
    
    @scala.inline
    def apply(): MockOptionsMethodPost = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockOptionsMethodPost]
    }
    
    @scala.inline
    implicit class MockOptionsMethodPostMutableBuilder[Self <: MockOptionsMethodPost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  @js.native
  trait MockOptionsMethodPut extends MockOptions {
    
    @JSName("method")
    var method_MockOptionsMethodPut: js.UndefOr[PUT] = js.native
  }
  object MockOptionsMethodPut {
    
    @scala.inline
    def apply(): MockOptionsMethodPut = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockOptionsMethodPut]
    }
    
    @scala.inline
    implicit class MockOptionsMethodPutMutableBuilder[Self <: MockOptionsMethodPut] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  type MockRequest = Request | RequestInit
  
  /**
    * Response: A Response instance - will be used unaltered
    * number: Creates a response with this status
    * string: Creates a 200 response with the string as the response body
    * object: As long as the object is not a MockResponseObject it is
    *  converted into a json string and returned as the body of a 200 response
    * If MockResponseObject was given then it's used to configure response
    * Function(url, opts): A function that is passed the url and opts fetch()
    *  is called with and that returns any of the responses listed above
    */
  type MockResponse = Response | (js.Promise[Double | MockResponseObject | js.Object | Response | String]) | Double | String | js.Object | MockResponseObject
  
  /**
    * Mock response function
    */
  type MockResponseFunction = js.Function2[/* url */ String, /* opts */ MockRequest, MockResponse]
  
  /**
    * Mock response object
    */
  @js.native
  trait MockResponseObject extends StObject {
    
    /**
      * Set the response body
      */
    var body: js.UndefOr[String | js.Object] = js.native
    
    /**
      * Set the response headers.
      */
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * The URL the response should be from (to imitate followed redirects
      *  - will set redirected: true on the response)
      */
    var redirectUrl: js.UndefOr[String] = js.native
    
    /**
      * Set the response status
      * @default 200
      */
    var status: js.UndefOr[Double] = js.native
    
    /**
      * If this property is present then a Promise rejected with the value
      * of throws is returned
      */
    var throws: js.UndefOr[js.Error] = js.native
  }
  object MockResponseObject {
    
    @scala.inline
    def apply(): MockResponseObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockResponseObject]
    }
    
    @scala.inline
    implicit class MockResponseObjectMutableBuilder[Self <: MockResponseObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setThrows(value: js.Error): Self = StObject.set(x, "throws", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowsUndefined: Self = StObject.set(x, "throws", js.undefined)
    }
  }
  
  type _To = FetchMockStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FetchMockStatic = ^
}
