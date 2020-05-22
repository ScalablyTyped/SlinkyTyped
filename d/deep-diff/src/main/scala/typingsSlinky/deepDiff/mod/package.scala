package typingsSlinky.deepDiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Filter[LHS, RHS] = js.Function3[
    /* target */ LHS, 
    /* source */ RHS, 
    /* change */ typingsSlinky.deepDiff.mod.Diff_[LHS, RHS], 
    scala.Boolean
  ]
  type Observer[LHS, RHS] = js.Function1[/* diff */ typingsSlinky.deepDiff.mod.Diff_[LHS, RHS], scala.Unit]
  type PreFilter[LHS, RHS] = typingsSlinky.deepDiff.mod.PreFilterFunction | (typingsSlinky.deepDiff.mod.PreFilterObject[LHS, RHS])
  type PreFilterFunction = js.Function2[/* path */ js.Array[js.Any], /* key */ js.Any, scala.Boolean]
}
