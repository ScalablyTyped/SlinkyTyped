package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.srcUtilMod.Console
import typingsSlinky.angularCompiler.templateAstMod.TemplateAstVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TemplateParser")
@js.native
class TemplateParser protected ()
  extends typingsSlinky.angularCompiler.compilerMod.TemplateParser {
  def this(
    _config: typingsSlinky.angularCompiler.configMod.CompilerConfig,
    _reflector: typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector,
    _exprParser: typingsSlinky.angularCompiler.parserMod.Parser,
    _schemaRegistry: typingsSlinky.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry,
    _htmlParser: typingsSlinky.angularCompiler.htmlParserMod.HtmlParser,
    _console: Null,
    transforms: js.Array[TemplateAstVisitor]
  ) = this()
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
