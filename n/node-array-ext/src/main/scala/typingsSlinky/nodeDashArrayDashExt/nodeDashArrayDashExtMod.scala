package typingsSlinky.nodeDashArrayDashExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-array-ext", JSImport.Namespace)
@js.native
object nodeDashArrayDashExtMod extends js.Object {
  def asyncEach[T](
    array: js.Array[T],
    each: js.Function3[
      /* i */ Double, 
      /* element */ T, 
      /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
      Unit
    ],
    finish: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def awaitEach[T](
    array: js.Array[T],
    each: js.Function3[
      /* i */ Double, 
      /* element */ T, 
      /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
      Unit
    ],
    finish: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
}

