package typingsSlinky.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "Unary")
@js.native
/**
  * During the deprecation period this constructor is private, to avoid consumers from creating
  * a `Unary` with the fallback properties for `Binary`.
  */
class Unary protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.Unary
/* static members */
@JSImport("@angular/compiler/compiler", "Unary")
@js.native
object Unary extends js.Object {
  
  /**
    * Creates a unary minus expression "-x", represented as `Binary` using "0 - x".
    */
  def createMinus(
    span: typingsSlinky.angularCompiler.astMod.ParseSpan,
    sourceSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan,
    expr: typingsSlinky.angularCompiler.astMod.AST
  ): typingsSlinky.angularCompiler.astMod.Unary = js.native
  
  /**
    * Creates a unary plus expression "+x", represented as `Binary` using "x - 0".
    */
  def createPlus(
    span: typingsSlinky.angularCompiler.astMod.ParseSpan,
    sourceSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan,
    expr: typingsSlinky.angularCompiler.astMod.AST
  ): typingsSlinky.angularCompiler.astMod.Unary = js.native
}
