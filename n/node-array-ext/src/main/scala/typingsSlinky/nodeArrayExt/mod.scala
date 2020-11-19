package typingsSlinky.nodeArrayExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-array-ext", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
