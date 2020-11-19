package typingsSlinky.optimism.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("optimism", "wrap")
@js.native
object wrap extends js.Object {
  
  def apply[TArgs /* <: js.Array[_] */, TResult, TKeyArgs /* <: js.Array[_] */](originalFunction: js.Function1[/* args */ TArgs, TResult]): OptimisticWrapperFunction[TArgs, TResult, TKeyArgs] = js.native
  def apply[TArgs /* <: js.Array[_] */, TResult, TKeyArgs /* <: js.Array[_] */](
    originalFunction: js.Function1[/* args */ TArgs, TResult],
    options: OptimisticWrapOptions[TArgs, TKeyArgs]
  ): OptimisticWrapperFunction[TArgs, TResult, TKeyArgs] = js.native
}
