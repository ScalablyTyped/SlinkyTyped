package typingsSlinky.compareFunction

import typingsSlinky.compareFunction.compareFunctionNumbers.`-1`
import typingsSlinky.compareFunction.compareFunctionNumbers.`0`
import typingsSlinky.compareFunction.compareFunctionNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("compare-function", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[T](fn: js.Function1[/* item */ T, _]): js.Function2[/* a */ T, /* b */ T, `-1` | `0` | `1`] = js.native
  def apply[T](sign: Double, fn: js.Function1[/* item */ T, _]): js.Function2[/* a */ T, /* b */ T, `-1` | `0` | `1`] = js.native
}

