package typingsSlinky.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuiltinMethod extends StObject
@JSImport("@angular/compiler/src/output/output_ast", "BuiltinMethod")
@js.native
object BuiltinMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltinMethod with Double] = js.native
  
  @js.native
  sealed trait Bind extends BuiltinMethod
  /* 2 */ val Bind: typingsSlinky.angularCompiler.outputAstMod.BuiltinMethod.Bind with Double = js.native
  
  @js.native
  sealed trait ConcatArray extends BuiltinMethod
  /* 0 */ val ConcatArray: typingsSlinky.angularCompiler.outputAstMod.BuiltinMethod.ConcatArray with Double = js.native
  
  @js.native
  sealed trait SubscribeObservable extends BuiltinMethod
  /* 1 */ val SubscribeObservable: typingsSlinky.angularCompiler.outputAstMod.BuiltinMethod.SubscribeObservable with Double = js.native
}
