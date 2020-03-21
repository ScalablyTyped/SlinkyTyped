package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.srcUtilMod.Console
import typingsSlinky.angularCompiler.templateAstMod.TemplateAstVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TemplateParser")
@js.native
class TemplateParser protected ()
  extends typingsSlinky.angularCompiler.templateParserMod.TemplateParser {
  def this(
    _config: typingsSlinky.angularCompiler.configMod.CompilerConfig,
    _reflector: typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector,
    _exprParser: typingsSlinky.angularCompiler.parserMod.Parser,
    _schemaRegistry: typingsSlinky.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry,
    _htmlParser: typingsSlinky.angularCompiler.htmlParserMod.HtmlParser,
    _console: Console,
    transforms: js.Array[TemplateAstVisitor]
  ) = this()
}

