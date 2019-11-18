package typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuiltinMethod extends js.Object

@JSImport("@angular/compiler/src/output/output_ast", "BuiltinMethod")
@js.native
object BuiltinMethod extends js.Object {
  @js.native
  sealed trait Bind extends BuiltinMethod
  
  @js.native
  sealed trait ConcatArray extends BuiltinMethod
  
  @js.native
  sealed trait SubscribeObservable extends BuiltinMethod
  
  /* 2 */ val Bind: typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinMethod.Bind with Double = js.native
  /* 0 */ val ConcatArray: typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinMethod.ConcatArray with Double = js.native
  /* 1 */ val SubscribeObservable: typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinMethod.SubscribeObservable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltinMethod with Double] = js.native
}

