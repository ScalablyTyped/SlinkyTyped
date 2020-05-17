package typingsSlinky.ava

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AssertionError = js.Error
  type CbImplementation[Context] = js.Function1[
    /* t */ typingsSlinky.ava.mod.CbExecutionContext[Context], 
    typingsSlinky.ava.mod.ImplementationResult
  ]
  type CbMacro[Args /* <: js.Array[_] */, Context] = (typingsSlinky.ava.mod.UntitledCbMacro[Args, Context]) with typingsSlinky.ava.anon.Title[Args]
  type Constructor = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]
  type Implementation[Context] = js.Function1[
    /* t */ typingsSlinky.ava.mod.ExecutionContext[Context], 
    typingsSlinky.ava.mod.ImplementationResult
  ]
  type Macro[Args /* <: js.Array[_] */, Context] = (typingsSlinky.ava.mod.UntitledMacro[Args, Context]) with typingsSlinky.ava.anon.Title[Args]
  type TimeoutFn = js.Function1[/* ms */ scala.Double, scala.Unit]
  type TodoDeclaration = js.Function1[/* title */ java.lang.String, scala.Unit]
  type UntitledCbMacro[Args /* <: js.Array[_] */, Context] = js.Function2[
    /* t */ typingsSlinky.ava.mod.CbExecutionContext[Context], 
    /* args */ Args, 
    typingsSlinky.ava.mod.ImplementationResult
  ]
  type UntitledMacro[Args /* <: js.Array[_] */, Context] = js.Function2[
    /* t */ typingsSlinky.ava.mod.ExecutionContext[Context], 
    /* args */ Args, 
    typingsSlinky.ava.mod.ImplementationResult
  ]
}
