package typingsSlinky.atAngularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "BoundEventAst")
@js.native
class BoundEventAst protected ()
  extends typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundEventAst {
  def this(
    name: String,
    target: String,
    phase: String,
    handler: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: String,
    phase: Null,
    handler: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: Null,
    phase: String,
    handler: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: Null,
    phase: Null,
    handler: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/src/compiler", "BoundEventAst")
@js.native
object BoundEventAst extends js.Object {
  def calcFullName(name: String): String = js.native
  def calcFullName(name: String, target: String): String = js.native
  def calcFullName(name: String, target: String, phase: String): String = js.native
  def calcFullName(name: String, target: Null, phase: String): String = js.native
  def fromParsedEvent(event: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedEvent): typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundEventAst = js.native
}

