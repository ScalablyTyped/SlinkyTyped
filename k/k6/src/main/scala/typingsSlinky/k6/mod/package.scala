package typingsSlinky.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Checker[VT] = js.Function1[/* val */ VT, scala.Boolean]
  type Checkers[VT] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.k6.mod.Checker[VT]]
  type byte = scala.Double
  type bytes = js.Array[typingsSlinky.k6.mod.byte]
}
