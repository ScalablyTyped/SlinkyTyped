package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.outputAstMod.FnParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "DeclareFunctionStmt")
@js.native
class DeclareFunctionStmt protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.DeclareFunctionStmt {
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement]
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement],
    `type`: typingsSlinky.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement],
    `type`: Null,
    modifiers: js.Array[typingsSlinky.angularCompiler.outputAstMod.StmtModifier]
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement],
    `type`: typingsSlinky.angularCompiler.outputAstMod.Type,
    modifiers: js.Array[typingsSlinky.angularCompiler.outputAstMod.StmtModifier]
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement],
    `type`: Null,
    modifiers: js.Array[typingsSlinky.angularCompiler.outputAstMod.StmtModifier],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement],
    `type`: Null,
    modifiers: Null,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement],
    `type`: typingsSlinky.angularCompiler.outputAstMod.Type,
    modifiers: js.Array[typingsSlinky.angularCompiler.outputAstMod.StmtModifier],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typingsSlinky.angularCompiler.outputAstMod.Statement],
    `type`: typingsSlinky.angularCompiler.outputAstMod.Type,
    modifiers: Null,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

