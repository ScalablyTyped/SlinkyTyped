package typingsSlinky.atAngularCompiler.srcCompilerMod

import typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAstVisitor
import typingsSlinky.atAngularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TemplateParser")
@js.native
class TemplateParser protected ()
  extends typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreParserMod.TemplateParser {
  def this(
    _config: typingsSlinky.atAngularCompiler.srcConfigMod.CompilerConfig,
    _reflector: typingsSlinky.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector,
    _exprParser: typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserParserMod.Parser,
    _schemaRegistry: typingsSlinky.atAngularCompiler.srcSchemaElementUnderscoreSchemaUnderscoreRegistryMod.ElementSchemaRegistry,
    _htmlParser: typingsSlinky.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser,
    _console: Console,
    transforms: js.Array[TemplateAstVisitor]
  ) = this()
}

