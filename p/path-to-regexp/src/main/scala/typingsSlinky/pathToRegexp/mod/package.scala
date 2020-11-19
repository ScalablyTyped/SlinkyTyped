package typingsSlinky.pathToRegexp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type MatchFunction[P /* <: js.Object */] = js.Function1[/* path */ java.lang.String, typingsSlinky.pathToRegexp.mod.Match_[P]]
  
  type Path = java.lang.String | js.RegExp | (js.Array[java.lang.String | js.RegExp])
  
  type PathFunction[P /* <: js.Object */] = js.Function1[/* data */ js.UndefOr[P], java.lang.String]
  
  type Token = java.lang.String | typingsSlinky.pathToRegexp.mod.Key
}
