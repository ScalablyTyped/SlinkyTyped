package typingsSlinky.colorHash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ColorValueArray = js.Tuple3[scala.Double, scala.Double, scala.Double]
  type HashFunction = js.Function1[/* input */ java.lang.String, scala.Double]
}
