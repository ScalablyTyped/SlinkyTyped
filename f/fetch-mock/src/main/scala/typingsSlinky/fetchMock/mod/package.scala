package typingsSlinky.fetchMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
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
  type InspectionFilter = typingsSlinky.fetchMock.mod.MockMatcher | scala.Boolean
  
  /**
    * Either an object compatible with the mocking api or a string specifying
    * a http method to filter by. This will be used to filter the list of
    * calls further.
    */
  type InspectionOptions = typingsSlinky.fetchMock.mod.MockOptions | java.lang.String
  
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
  type MockMatcher = java.lang.String | js.RegExp | typingsSlinky.fetchMock.mod.MockMatcherFunction
  
  /**
    * Mock matcher function
    */
  type MockMatcherFunction = js.Function2[
    /* url */ java.lang.String, 
    /* opts */ typingsSlinky.fetchMock.mod.MockRequest, 
    scala.Boolean
  ]
  
  type MockRequest = org.scalajs.dom.experimental.Request | org.scalajs.dom.experimental.RequestInit
  
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
  type MockResponse = org.scalajs.dom.experimental.Response | (js.Promise[
    scala.Double | typingsSlinky.fetchMock.mod.MockResponseObject | js.Object | org.scalajs.dom.experimental.Response | java.lang.String
  ]) | scala.Double | java.lang.String | js.Object | typingsSlinky.fetchMock.mod.MockResponseObject
  
  /**
    * Mock response function
    */
  type MockResponseFunction = js.Function2[
    /* url */ java.lang.String, 
    /* opts */ typingsSlinky.fetchMock.mod.MockRequest, 
    typingsSlinky.fetchMock.mod.MockResponse
  ]
}
