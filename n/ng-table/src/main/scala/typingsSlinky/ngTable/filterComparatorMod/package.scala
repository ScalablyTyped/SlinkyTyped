package typingsSlinky.ngTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object filterComparatorMod {
  type IFilterComparatorFunc[T] = js.Function2[/* actual */ T, /* expected */ T, scala.Boolean]
}
