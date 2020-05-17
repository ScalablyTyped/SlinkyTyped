package typingsSlinky.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "Expression")
@js.native
abstract class Expression ()
  extends typingsSlinky.angularCompiler.outputAstMod.Expression {
  def this(`type`: typingsSlinky.angularCompiler.outputAstMod.Type) = this()
  def this(`type`: Null, sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(
    `type`: typingsSlinky.angularCompiler.outputAstMod.Type,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

