package typingsSlinky.matchdep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FilterFunction = js.Function2[
    /* pattern */ java.lang.String | js.Array[java.lang.String], 
    /* config */ js.UndefOr[typingsSlinky.matchdep.mod.FilterConfig], 
    js.Array[java.lang.String]
  ]
}
