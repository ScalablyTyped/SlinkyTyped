package typingsSlinky.ava

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AssertionError = js.Error
  
  type CbImplementation[Context] = js.Function1[
    /* t */ typingsSlinky.ava.mod.CbExecutionContext[Context], 
    typingsSlinky.ava.mod.ImplementationResult
  ]
  
  type CbMacro[Args /* <: js.Array[_] */, Context] = (typingsSlinky.ava.mod.UntitledCbMacro[Args, Context]) with typingsSlinky.ava.anon.Title[Args]
  
  type Constructor = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]
  
  type EitherCbMacro[Args /* <: js.Array[_] */, Context] = (typingsSlinky.ava.mod.CbMacro[Args, Context]) | (typingsSlinky.ava.mod.UntitledCbMacro[Args, Context])
  
  type EitherMacro[Args /* <: js.Array[_] */, Context] = (typingsSlinky.ava.mod.Macro[Args, Context]) | (typingsSlinky.ava.mod.UntitledMacro[Args, Context])
  
  type Implementation[Context] = js.Function1[
    /* t */ typingsSlinky.ava.mod.ExecutionContext[Context], 
    typingsSlinky.ava.mod.ImplementationResult
  ]
  
  type ImplementationResult = js.Thenable[scala.Unit] | typingsSlinky.ava.mod.Subscribable | scala.Unit
  
  type Macro[Args /* <: js.Array[_] */, Context] = (typingsSlinky.ava.mod.UntitledMacro[Args, Context]) with typingsSlinky.ava.anon.Title[Args]
  
  type OneOrMoreCbMacros[Args /* <: js.Array[_] */, Context] = (typingsSlinky.ava.mod.EitherCbMacro[Args, Context]) | (Array[typingsSlinky.ava.mod.EitherCbMacro[Args, Context]])
  
  type OneOrMoreMacros[Args /* <: js.Array[_] */, Context] = (typingsSlinky.ava.mod.EitherMacro[Args, Context]) | (Array[typingsSlinky.ava.mod.EitherMacro[Args, Context]])
  
  type TeardownFn = js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit]
  
  type TimeoutFn = js.Function2[/* ms */ scala.Double, /* message */ js.UndefOr[java.lang.String], scala.Unit]
  
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
