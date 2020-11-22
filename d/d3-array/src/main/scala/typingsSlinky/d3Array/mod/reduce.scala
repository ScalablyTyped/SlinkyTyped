package typingsSlinky.d3Array.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "reduce")
@js.native
object reduce extends js.Object {
  
  def apply[T](
    iterable: js.Iterable[T],
    reducer: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* iterable */ js.Iterable[T], 
      T
    ]
  ): T = js.native
  def apply[T](
    iterable: js.Iterable[T],
    reducer: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* iterable */ js.Iterable[T], 
      T
    ],
    initialValue: T
  ): T = js.native
}
