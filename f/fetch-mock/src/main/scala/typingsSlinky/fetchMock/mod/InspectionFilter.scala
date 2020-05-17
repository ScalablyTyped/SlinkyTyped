package typingsSlinky.fetchMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fetchMock.mod.MockMatcher
  - scala.Boolean
*/
trait InspectionFilter extends js.Object

object InspectionFilter {
  @scala.inline
  implicit def apply(value: Boolean): InspectionFilter = value.asInstanceOf[InspectionFilter]
  @scala.inline
  implicit def apply(value: MockMatcher): InspectionFilter = value.asInstanceOf[InspectionFilter]
}

