package typingsSlinky.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("path-to-regexp", "regexpToFunction")
@js.native
object regexpToFunction extends js.Object {
  
  def apply[P /* <: js.Object */](re: js.RegExp, keys: js.Array[Key]): MatchFunction[P] = js.native
  def apply[P /* <: js.Object */](re: js.RegExp, keys: js.Array[Key], options: RegexpToFunctionOptions): MatchFunction[P] = js.native
}
