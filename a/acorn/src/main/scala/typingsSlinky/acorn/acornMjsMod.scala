package typingsSlinky.acorn

import typingsSlinky.acorn.anon.Call
import typingsSlinky.acorn.anon.TypeofParser
import typingsSlinky.acorn.mod.Options
import typingsSlinky.acorn.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("acorn/dist/acorn.mjs", JSImport.Namespace)
@js.native
object acornMjsMod extends js.Object {
  
  val defaultOptions: Options = js.native
  
  def getLineInfo(input: String, offset: Double): Position = js.native
  
  def isIdentifierChar(code: Double): Boolean = js.native
  def isIdentifierChar(code: Double, astral: Boolean): Boolean = js.native
  
  def isIdentifierStart(code: Double): Boolean = js.native
  def isIdentifierStart(code: Double, astral: Boolean): Boolean = js.native
  
  def isNewLine(code: Double): Boolean = js.native
  
  val lineBreak: js.RegExp = js.native
  
  val lineBreakG: js.RegExp = js.native
  
  def parse(input: String): typingsSlinky.acorn.mod.Node = js.native
  def parse(input: String, options: Options): typingsSlinky.acorn.mod.Node = js.native
  
  def parseExpressionAt(input: String): typingsSlinky.acorn.mod.Node = js.native
  def parseExpressionAt(input: String, pos: js.UndefOr[scala.Nothing], options: Options): typingsSlinky.acorn.mod.Node = js.native
  def parseExpressionAt(input: String, pos: Double): typingsSlinky.acorn.mod.Node = js.native
  def parseExpressionAt(input: String, pos: Double, options: Options): typingsSlinky.acorn.mod.Node = js.native
  
  def tokenizer(input: String): Call = js.native
  def tokenizer(input: String, options: Options): Call = js.native
  
  val version: String = js.native
  
  @js.native
  class Node protected ()
    extends typingsSlinky.acorn.mod.Node {
    def this(parser: typingsSlinky.acorn.mod.Parser, pos: Double) = this()
    def this(parser: typingsSlinky.acorn.mod.Parser, pos: Double, loc: typingsSlinky.acorn.mod.SourceLocation) = this()
  }
  
  @js.native
  class Parser protected ()
    extends typingsSlinky.acorn.mod.Parser {
    def this(options: Options, input: String) = this()
    def this(options: Options, input: String, startPos: Double) = this()
  }
  /* static members */
  @js.native
  object Parser extends js.Object {
    
    def extend(plugins: (js.Function1[/* BaseParser */ TypeofParser, TypeofParser])*): TypeofParser = js.native
    
    def parse(input: String): typingsSlinky.acorn.mod.Node = js.native
    def parse(input: String, options: Options): typingsSlinky.acorn.mod.Node = js.native
    
    def parseExpressionAt(input: String, pos: Double): typingsSlinky.acorn.mod.Node = js.native
    def parseExpressionAt(input: String, pos: Double, options: Options): typingsSlinky.acorn.mod.Node = js.native
    
    def tokenizer(input: String): Call = js.native
    def tokenizer(input: String, options: Options): Call = js.native
  }
  
  @js.native
  class SourceLocation protected ()
    extends typingsSlinky.acorn.mod.SourceLocation {
    def this(p: typingsSlinky.acorn.mod.Parser, start: Position, end: Position) = this()
  }
  
  @js.native
  class TokContext protected ()
    extends typingsSlinky.acorn.mod.TokContext {
    def this(token: String, isExpr: Boolean, preserveSpace: Boolean) = this()
    def this(
      token: String,
      isExpr: Boolean,
      preserveSpace: Boolean,
      `override`: js.Function1[/* p */ typingsSlinky.acorn.mod.Parser, Unit]
    ) = this()
  }
  
  @js.native
  class Token protected ()
    extends typingsSlinky.acorn.mod.Token {
    def this(p: typingsSlinky.acorn.mod.Parser) = this()
  }
  
  @js.native
  class TokenType protected ()
    extends typingsSlinky.acorn.mod.TokenType {
    def this(label: String) = this()
    def this(label: String, conf: js.Any) = this()
  }
  
  @js.native
  object tokContexts extends js.Object {
    
    var b_expr: typingsSlinky.acorn.mod.TokContext = js.native
    
    var b_stat: typingsSlinky.acorn.mod.TokContext = js.native
    
    var b_tmpl: typingsSlinky.acorn.mod.TokContext = js.native
    
    var f_expr: typingsSlinky.acorn.mod.TokContext = js.native
    
    var p_expr: typingsSlinky.acorn.mod.TokContext = js.native
    
    var p_stat: typingsSlinky.acorn.mod.TokContext = js.native
    
    var q_tmpl: typingsSlinky.acorn.mod.TokContext = js.native
  }
  
  @js.native
  object tokTypes extends js.Object {
    
    var _break: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _case: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _catch: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _class: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _const: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _continue: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _debugger: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _default: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _delete: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _do: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _else: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _export: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _extends: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _false: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _finally: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _for: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _function: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _if: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _import: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _in: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _instanceof: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _new: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _null: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _return: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _super: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _switch: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _this: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _throw: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _true: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _try: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _typeof: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _var: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _void: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _while: typingsSlinky.acorn.mod.TokenType = js.native
    
    var _with: typingsSlinky.acorn.mod.TokenType = js.native
    
    var arrow: typingsSlinky.acorn.mod.TokenType = js.native
    
    var assign: typingsSlinky.acorn.mod.TokenType = js.native
    
    var backQuote: typingsSlinky.acorn.mod.TokenType = js.native
    
    var bitShift: typingsSlinky.acorn.mod.TokenType = js.native
    
    var bitwiseAND: typingsSlinky.acorn.mod.TokenType = js.native
    
    var bitwiseOR: typingsSlinky.acorn.mod.TokenType = js.native
    
    var bitwiseXOR: typingsSlinky.acorn.mod.TokenType = js.native
    
    var braceL: typingsSlinky.acorn.mod.TokenType = js.native
    
    var braceR: typingsSlinky.acorn.mod.TokenType = js.native
    
    var bracketL: typingsSlinky.acorn.mod.TokenType = js.native
    
    var bracketR: typingsSlinky.acorn.mod.TokenType = js.native
    
    var colon: typingsSlinky.acorn.mod.TokenType = js.native
    
    var comma: typingsSlinky.acorn.mod.TokenType = js.native
    
    var dollarBraceL: typingsSlinky.acorn.mod.TokenType = js.native
    
    var dot: typingsSlinky.acorn.mod.TokenType = js.native
    
    var ellipsis: typingsSlinky.acorn.mod.TokenType = js.native
    
    var eof: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSName("eq")
    var eq_FtokTypes: typingsSlinky.acorn.mod.TokenType = js.native
    
    var equality: typingsSlinky.acorn.mod.TokenType = js.native
    
    var incDec: typingsSlinky.acorn.mod.TokenType = js.native
    
    var logicalAND: typingsSlinky.acorn.mod.TokenType = js.native
    
    var logicalOR: typingsSlinky.acorn.mod.TokenType = js.native
    
    var modulo: typingsSlinky.acorn.mod.TokenType = js.native
    
    var name: typingsSlinky.acorn.mod.TokenType = js.native
    
    var num: typingsSlinky.acorn.mod.TokenType = js.native
    
    var parenL: typingsSlinky.acorn.mod.TokenType = js.native
    
    var parenR: typingsSlinky.acorn.mod.TokenType = js.native
    
    var plusMin: typingsSlinky.acorn.mod.TokenType = js.native
    
    var prefix: typingsSlinky.acorn.mod.TokenType = js.native
    
    var question: typingsSlinky.acorn.mod.TokenType = js.native
    
    var regexp: typingsSlinky.acorn.mod.TokenType = js.native
    
    var relational: typingsSlinky.acorn.mod.TokenType = js.native
    
    var semi: typingsSlinky.acorn.mod.TokenType = js.native
    
    var slash: typingsSlinky.acorn.mod.TokenType = js.native
    
    var star: typingsSlinky.acorn.mod.TokenType = js.native
    
    var starstar: typingsSlinky.acorn.mod.TokenType = js.native
    
    var string: typingsSlinky.acorn.mod.TokenType = js.native
    
    var template: typingsSlinky.acorn.mod.TokenType = js.native
  }
}
