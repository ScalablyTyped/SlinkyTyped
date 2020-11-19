package typingsSlinky.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("path-to-regexp", "match")
@js.native
object `match` extends js.Object {
  
  def apply[P /* <: js.Object */](str: Path): MatchFunction[P] = js.native
  def apply[P /* <: js.Object */](str: Path, options: ParseOptions with TokensToRegexpOptions with RegexpToFunctionOptions): MatchFunction[P] = js.native
}
