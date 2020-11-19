package typingsSlinky.balancedMatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("balanced-match", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    *
    * For the first non-nested matching pair of a and b in str, return an object with those keys:
    * start the index of the first match of
    * `end` the index of the matching b
    * `pre` the preamble, a and b not included
    * `body` the match, a and b not included
    * `post` the postscript, a and b not included
    * If there's no match, `undefined` will be returned.
    * If the `str` contains more a than b / there are unmatched pairs,
    * the first match that was closed will be used.
    * For example, `{{a}` will match `['{', 'a', '']` and `{a}}` will match `['', 'a', '}']`
    */
  def apply(a: String, b: String, str: String): Output | Unit = js.native
  def apply(a: String, b: js.RegExp, str: String): Output | Unit = js.native
  def apply(a: js.RegExp, b: String, str: String): Output | Unit = js.native
  def apply(a: js.RegExp, b: js.RegExp, str: String): Output | Unit = js.native
}
