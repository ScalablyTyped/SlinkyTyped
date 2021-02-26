package typingsSlinky.angularCompiler.publicApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "Unary")
@js.native
/**
  * During the deprecation period this constructor is private, to avoid consumers from creating
  * a `Unary` with the fallback properties for `Binary`.
  */
class Unary protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.Unary
/* static members */
object Unary {
  
  /**
    * Creates a unary minus expression "-x", represented as `Binary` using "0 - x".
    */
  @JSImport("@angular/compiler/public_api", "Unary.createMinus")
  @js.native
  def createMinus(
    span: typingsSlinky.angularCompiler.astMod.ParseSpan,
    sourceSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan,
    expr: typingsSlinky.angularCompiler.astMod.AST
  ): typingsSlinky.angularCompiler.astMod.Unary = js.native
  
  /**
    * Creates a unary plus expression "+x", represented as `Binary` using "x - 0".
    */
  @JSImport("@angular/compiler/public_api", "Unary.createPlus")
  @js.native
  def createPlus(
    span: typingsSlinky.angularCompiler.astMod.ParseSpan,
    sourceSpan: typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan,
    expr: typingsSlinky.angularCompiler.astMod.AST
  ): typingsSlinky.angularCompiler.astMod.Unary = js.native
}
