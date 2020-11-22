package typingsSlinky.meteorMdgValidatedMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Argument[TFunc] = typingsSlinky.meteorMdgValidatedMethod.mod.NoArguments
  
  type GenericMixin = js.Function1[
    /* options */ typingsSlinky.meteorMdgValidatedMethod.mod.ValidatedMethodOptions[java.lang.String, js.Function1[/* repeated */ js.Any, js.Any]], 
    typingsSlinky.meteorMdgValidatedMethod.mod.ValidatedMethodOptions[java.lang.String, js.Function1[/* repeated */ js.Any, js.Any]]
  ]
  
  type Mixin[TName /* <: java.lang.String */, TRun /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Function1[
    /* options */ typingsSlinky.meteorMdgValidatedMethod.mod.ValidatedMethodOptions[TName, TRun], 
    typingsSlinky.meteorMdgValidatedMethod.mod.ValidatedMethodOptions[TName, TRun]
  ]
  
  type NoArguments = js.UndefOr[scala.Nothing]
  
  type Return[TFunc] = js.Any
  
  type ValidatedMethodArg[T] = typingsSlinky.meteorMdgValidatedMethod.mod.Argument[js.Any]
  
  type ValidatedMethodName[T] = js.Any
  
  type ValidatedMethodOptionsArgument[TOptions /* <: typingsSlinky.meteorMdgValidatedMethod.mod.ValidatedMethodOptions[_, _] */] = typingsSlinky.meteorMdgValidatedMethod.mod.Argument[js.Any]
  
  type ValidatedMethodOptionsReturn[TOptions /* <: typingsSlinky.meteorMdgValidatedMethod.mod.ValidatedMethodOptions[_, _] */] = typingsSlinky.meteorMdgValidatedMethod.mod.Return[js.Any]
  
  type ValidatedMethodReturn[T] = typingsSlinky.meteorMdgValidatedMethod.mod.Return[js.Any]
}
