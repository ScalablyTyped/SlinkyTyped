package typingsSlinky.ava

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /** Call to declare a test, or chain to declare hooks or test modifiers */
  @scala.inline
  def default: typingsSlinky.ava.mod.TestInterface[js.Any] = typingsSlinky.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[typingsSlinky.ava.mod.TestInterface[js.Any]]
  
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
  
  @scala.inline
  def after: typingsSlinky.ava.mod.AfterInterface[js.Any] = typingsSlinky.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("after").asInstanceOf[typingsSlinky.ava.mod.AfterInterface[js.Any]]
  
  @scala.inline
  def afterEach: typingsSlinky.ava.mod.AfterInterface[js.Any] = typingsSlinky.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("afterEach").asInstanceOf[typingsSlinky.ava.mod.AfterInterface[js.Any]]
  
  @scala.inline
  def before: typingsSlinky.ava.mod.BeforeInterface[js.Any] = typingsSlinky.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("before").asInstanceOf[typingsSlinky.ava.mod.BeforeInterface[js.Any]]
  
  @scala.inline
  def beforeEach: typingsSlinky.ava.mod.BeforeInterface[js.Any] = typingsSlinky.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("beforeEach").asInstanceOf[typingsSlinky.ava.mod.BeforeInterface[js.Any]]
  
  @scala.inline
  def cb: typingsSlinky.ava.mod.CbInterface[js.Any] = typingsSlinky.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("cb").asInstanceOf[typingsSlinky.ava.mod.CbInterface[js.Any]]
  
  @scala.inline
  def failing: typingsSlinky.ava.mod.FailingInterface[js.Any] = typingsSlinky.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("failing").asInstanceOf[typingsSlinky.ava.mod.FailingInterface[js.Any]]
  
  @scala.inline
  def meta: typingsSlinky.ava.mod.MetaInterface = typingsSlinky.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("meta").asInstanceOf[typingsSlinky.ava.mod.MetaInterface]
  
  @scala.inline
  def only: typingsSlinky.ava.mod.OnlyInterface[js.Any] = typingsSlinky.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("only").asInstanceOf[typingsSlinky.ava.mod.OnlyInterface[js.Any]]
  
  @scala.inline
  def serial: typingsSlinky.ava.mod.SerialInterface[js.Any] = typingsSlinky.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("serial").asInstanceOf[typingsSlinky.ava.mod.SerialInterface[js.Any]]
  
  @scala.inline
  def skip: typingsSlinky.ava.mod.SkipInterface[js.Any] = typingsSlinky.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("skip").asInstanceOf[typingsSlinky.ava.mod.SkipInterface[js.Any]]
  
  @scala.inline
  def todo: typingsSlinky.ava.mod.TodoDeclaration = typingsSlinky.ava.mod.^.asInstanceOf[js.Dynamic].selectDynamic("todo").asInstanceOf[typingsSlinky.ava.mod.TodoDeclaration]
}
