package typingsSlinky.fetchMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - typingsSlinky.fetchMock.mod.MockMatcherFunction
*/
trait MockMatcher extends InspectionFilter

object MockMatcher {
  @scala.inline
  implicit def apply(value: MockMatcherFunction): MockMatcher = value.asInstanceOf[MockMatcher]
  @scala.inline
  implicit def apply(value: js.RegExp): MockMatcher = value.asInstanceOf[MockMatcher]
  @scala.inline
  implicit def apply(value: String): MockMatcher = value.asInstanceOf[MockMatcher]
}

