package typingsSlinky.pathToRegexp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MatchFunction[P /* <: js.Object */] = js.Function2[
    /* path */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.pathToRegexp.mod.MatchFunctionOptions], 
    typingsSlinky.pathToRegexp.mod.Match_[P]
  ]
  type Path = java.lang.String | js.RegExp | (js.Array[java.lang.String | js.RegExp])
  type PathFunction[P /* <: js.Object */] = js.Function2[
    /* data */ js.UndefOr[P], 
    /* options */ js.UndefOr[typingsSlinky.pathToRegexp.mod.PathFunctionOptions], 
    java.lang.String
  ]
  type Token = java.lang.String | typingsSlinky.pathToRegexp.mod.Key
}
