package typingsSlinky.acorn

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.acorn.anon.Call
import typingsSlinky.acorn.anon.TypeofParser
import typingsSlinky.acorn.mod.Options
import typingsSlinky.acorn.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acornMjsMod {
  
  @JSImport("acorn/dist/acorn.mjs", "Node")
  @js.native
  class Node protected ()
    extends typingsSlinky.acorn.mod.Node {
    def this(parser: typingsSlinky.acorn.mod.Parser, pos: Double) = this()
    def this(parser: typingsSlinky.acorn.mod.Parser, pos: Double, loc: typingsSlinky.acorn.mod.SourceLocation) = this()
  }
  
  @JSImport("acorn/dist/acorn.mjs", "Parser")
  @js.native
  class Parser protected ()
    extends typingsSlinky.acorn.mod.Parser {
    def this(options: Options, input: String) = this()
    def this(options: Options, input: String, startPos: Double) = this()
  }
  object Parser {
    
    /* static member */
    @JSImport("acorn/dist/acorn.mjs", "Parser.extend")
    @js.native
    def extend(
      plugins: (js.Function1[
          /* BaseParser */ TypeofParser with (Instantiable3[
            /* options */ Options, 
            /* input */ String, 
            /* startPos */ js.UndefOr[Double], 
            typingsSlinky.acorn.mod.Parser
          ]), 
          TypeofParser with (Instantiable3[
            /* options */ Options, 
            /* input */ String, 
            /* startPos */ js.UndefOr[Double], 
            typingsSlinky.acorn.mod.Parser
          ])
        ])*
    ): TypeofParser with (Instantiable3[
        /* options */ Options, 
        /* input */ String, 
        /* startPos */ js.UndefOr[Double], 
        typingsSlinky.acorn.mod.Parser
      ]) = js.native
    
    /* static member */
    @JSImport("acorn/dist/acorn.mjs", "Parser.parse")
    @js.native
    def parse(input: String): typingsSlinky.acorn.mod.Node = js.native
    @JSImport("acorn/dist/acorn.mjs", "Parser.parse")
    @js.native
    def parse(input: String, options: Options): typingsSlinky.acorn.mod.Node = js.native
    
    /* static member */
    @JSImport("acorn/dist/acorn.mjs", "Parser.parseExpressionAt")
    @js.native
    def parseExpressionAt(input: String, pos: Double): typingsSlinky.acorn.mod.Node = js.native
    @JSImport("acorn/dist/acorn.mjs", "Parser.parseExpressionAt")
    @js.native
    def parseExpressionAt(input: String, pos: Double, options: Options): typingsSlinky.acorn.mod.Node = js.native
    
    /* static member */
    @JSImport("acorn/dist/acorn.mjs", "Parser.tokenizer")
    @js.native
    def tokenizer(input: String): Call = js.native
    @JSImport("acorn/dist/acorn.mjs", "Parser.tokenizer")
    @js.native
    def tokenizer(input: String, options: Options): Call = js.native
  }
  
  @JSImport("acorn/dist/acorn.mjs", "SourceLocation")
  @js.native
  class SourceLocation protected ()
    extends typingsSlinky.acorn.mod.SourceLocation {
    def this(p: typingsSlinky.acorn.mod.Parser, start: Position, end: Position) = this()
  }
  
  @JSImport("acorn/dist/acorn.mjs", "TokContext")
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
  
  @JSImport("acorn/dist/acorn.mjs", "Token")
  @js.native
  class Token protected ()
    extends typingsSlinky.acorn.mod.Token {
    def this(p: typingsSlinky.acorn.mod.Parser) = this()
  }
  
  @JSImport("acorn/dist/acorn.mjs", "TokenType")
  @js.native
  class TokenType protected ()
    extends typingsSlinky.acorn.mod.TokenType {
    def this(label: String) = this()
    def this(label: String, conf: js.Any) = this()
  }
  
  @JSImport("acorn/dist/acorn.mjs", "defaultOptions")
  @js.native
  val defaultOptions: Options = js.native
  
  @JSImport("acorn/dist/acorn.mjs", "getLineInfo")
  @js.native
  def getLineInfo(input: String, offset: Double): Position = js.native
  
  @JSImport("acorn/dist/acorn.mjs", "isIdentifierChar")
  @js.native
  def isIdentifierChar(code: Double): Boolean = js.native
  @JSImport("acorn/dist/acorn.mjs", "isIdentifierChar")
  @js.native
  def isIdentifierChar(code: Double, astral: Boolean): Boolean = js.native
  
  @JSImport("acorn/dist/acorn.mjs", "isIdentifierStart")
  @js.native
  def isIdentifierStart(code: Double): Boolean = js.native
  @JSImport("acorn/dist/acorn.mjs", "isIdentifierStart")
  @js.native
  def isIdentifierStart(code: Double, astral: Boolean): Boolean = js.native
  
  @JSImport("acorn/dist/acorn.mjs", "isNewLine")
  @js.native
  def isNewLine(code: Double): Boolean = js.native
  
  @JSImport("acorn/dist/acorn.mjs", "lineBreak")
  @js.native
  val lineBreak: js.RegExp = js.native
  
  @JSImport("acorn/dist/acorn.mjs", "lineBreakG")
  @js.native
  val lineBreakG: js.RegExp = js.native
  
  @JSImport("acorn/dist/acorn.mjs", "parse")
  @js.native
  def parse(input: String): typingsSlinky.acorn.mod.Node = js.native
  @JSImport("acorn/dist/acorn.mjs", "parse")
  @js.native
  def parse(input: String, options: Options): typingsSlinky.acorn.mod.Node = js.native
  
  @JSImport("acorn/dist/acorn.mjs", "parseExpressionAt")
  @js.native
  def parseExpressionAt(input: String): typingsSlinky.acorn.mod.Node = js.native
  @JSImport("acorn/dist/acorn.mjs", "parseExpressionAt")
  @js.native
  def parseExpressionAt(input: String, pos: js.UndefOr[scala.Nothing], options: Options): typingsSlinky.acorn.mod.Node = js.native
  @JSImport("acorn/dist/acorn.mjs", "parseExpressionAt")
  @js.native
  def parseExpressionAt(input: String, pos: Double): typingsSlinky.acorn.mod.Node = js.native
  @JSImport("acorn/dist/acorn.mjs", "parseExpressionAt")
  @js.native
  def parseExpressionAt(input: String, pos: Double, options: Options): typingsSlinky.acorn.mod.Node = js.native
  
  object tokContexts {
    
    @JSImport("acorn/dist/acorn.mjs", "tokContexts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokContexts.b_expr")
    @js.native
    def bExpr: typingsSlinky.acorn.mod.TokContext = js.native
    
    @scala.inline
    def bExpr_=(x: typingsSlinky.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b_expr")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokContexts.b_stat")
    @js.native
    def bStat: typingsSlinky.acorn.mod.TokContext = js.native
    
    @scala.inline
    def bStat_=(x: typingsSlinky.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b_stat")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokContexts.b_tmpl")
    @js.native
    def bTmpl: typingsSlinky.acorn.mod.TokContext = js.native
    
    @scala.inline
    def bTmpl_=(x: typingsSlinky.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b_tmpl")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokContexts.f_expr")
    @js.native
    def fExpr: typingsSlinky.acorn.mod.TokContext = js.native
    
    @scala.inline
    def fExpr_=(x: typingsSlinky.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f_expr")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokContexts.p_expr")
    @js.native
    def pExpr: typingsSlinky.acorn.mod.TokContext = js.native
    
    @scala.inline
    def pExpr_=(x: typingsSlinky.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("p_expr")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokContexts.p_stat")
    @js.native
    def pStat: typingsSlinky.acorn.mod.TokContext = js.native
    
    @scala.inline
    def pStat_=(x: typingsSlinky.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("p_stat")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokContexts.q_tmpl")
    @js.native
    def qTmpl: typingsSlinky.acorn.mod.TokContext = js.native
    
    @scala.inline
    def qTmpl_=(x: typingsSlinky.acorn.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("q_tmpl")(x.asInstanceOf[js.Any])
  }
  
  object tokTypes {
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._default")
    @js.native
    def default: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.arrow")
    @js.native
    def arrow: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def arrow_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrow")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.assign")
    @js.native
    def assign: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def assign_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("assign")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.backQuote")
    @js.native
    def backQuote: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def backQuote_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backQuote")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.bitShift")
    @js.native
    def bitShift: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def bitShift_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitShift")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.bitwiseAND")
    @js.native
    def bitwiseAND: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def bitwiseAND_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseAND")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.bitwiseOR")
    @js.native
    def bitwiseOR: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def bitwiseOR_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseOR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.bitwiseXOR")
    @js.native
    def bitwiseXOR: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def bitwiseXOR_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseXOR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.braceL")
    @js.native
    def braceL: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def braceL_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("braceL")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.braceR")
    @js.native
    def braceR: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def braceR_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("braceR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.bracketL")
    @js.native
    def bracketL: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def bracketL_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracketL")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.bracketR")
    @js.native
    def bracketR: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def bracketR_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracketR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._break")
    @js.native
    def break: typingsSlinky.acorn.mod.TokenType = js.native
    
    @scala.inline
    def break_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_break")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.colon")
    @js.native
    def colon: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def colon_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colon")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.comma")
    @js.native
    def comma: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def comma_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comma")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._const")
    @js.native
    def const: typingsSlinky.acorn.mod.TokenType = js.native
    
    @scala.inline
    def const_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_const")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._continue")
    @js.native
    def continue: typingsSlinky.acorn.mod.TokenType = js.native
    
    @scala.inline
    def continue_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_continue")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._debugger")
    @js.native
    def debugger: typingsSlinky.acorn.mod.TokenType = js.native
    
    @scala.inline
    def debugger_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_debugger")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def default_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_default")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._delete")
    @js.native
    def delete: typingsSlinky.acorn.mod.TokenType = js.native
    
    @scala.inline
    def delete_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_delete")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.dollarBraceL")
    @js.native
    def dollarBraceL: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def dollarBraceL_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dollarBraceL")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.dot")
    @js.native
    def dot: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def dot_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dot")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.ellipsis")
    @js.native
    def ellipsis: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def ellipsis_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.eof")
    @js.native
    def eof: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def eof_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eof")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.eq")
    @js.native
    def eq_ : typingsSlinky.acorn.mod.TokenType = js.native
    
    @scala.inline
    def eq__=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eq")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.equality")
    @js.native
    def equality: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def equality_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("equality")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._export")
    @js.native
    def export: typingsSlinky.acorn.mod.TokenType = js.native
    
    @scala.inline
    def export_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_export")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._function")
    @js.native
    def function: typingsSlinky.acorn.mod.TokenType = js.native
    
    @scala.inline
    def function_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_function")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._in")
    @js.native
    def in: typingsSlinky.acorn.mod.TokenType = js.native
    
    @scala.inline
    def in_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_in")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.incDec")
    @js.native
    def incDec: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def incDec_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("incDec")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._instanceof")
    @js.native
    def instanceof: typingsSlinky.acorn.mod.TokenType = js.native
    
    @scala.inline
    def instanceof_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instanceof")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.logicalAND")
    @js.native
    def logicalAND: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def logicalAND_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logicalAND")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.logicalOR")
    @js.native
    def logicalOR: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def logicalOR_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logicalOR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.modulo")
    @js.native
    def modulo: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def modulo_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modulo")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.name")
    @js.native
    def name: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def name_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.num")
    @js.native
    def num: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def num_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("num")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.parenL")
    @js.native
    def parenL: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def parenL_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parenL")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.parenR")
    @js.native
    def parenR: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def parenR_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parenR")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.plusMin")
    @js.native
    def plusMin: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def plusMin_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plusMin")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.prefix")
    @js.native
    def prefix: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def prefix_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefix")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.question")
    @js.native
    def question: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def question_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("question")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.regexp")
    @js.native
    def regexp: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def regexp_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.relational")
    @js.native
    def relational: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def relational_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relational")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.semi")
    @js.native
    def semi: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def semi_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("semi")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.slash")
    @js.native
    def slash: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def slash_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slash")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.star")
    @js.native
    def star: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def star_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("star")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.starstar")
    @js.native
    def starstar: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def starstar_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("starstar")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.string")
    @js.native
    def string: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def string_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._switch")
    @js.native
    def switch: typingsSlinky.acorn.mod.TokenType = js.native
    
    @scala.inline
    def switch_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_switch")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes.template")
    @js.native
    def template: typingsSlinky.acorn.mod.TokenType = js.native
    @scala.inline
    def template_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._typeof")
    @js.native
    def typeof: typingsSlinky.acorn.mod.TokenType = js.native
    
    @scala.inline
    def typeof_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_typeof")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._void")
    @js.native
    def void: typingsSlinky.acorn.mod.TokenType = js.native
    
    @scala.inline
    def void_=(x: typingsSlinky.acorn.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_void")(x.asInstanceOf[js.Any])
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._case")
    @js.native
    val `case`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._catch")
    @js.native
    val `catch`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._class")
    @js.native
    val `class`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._do")
    @js.native
    val `do`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._else")
    @js.native
    val `else`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._extends")
    @js.native
    val `extends`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._false")
    @js.native
    val `false`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._finally")
    @js.native
    val `finally`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._for")
    @js.native
    val `for`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._if")
    @js.native
    val `if`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._import")
    @js.native
    val `import`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._new")
    @js.native
    val `new`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._null")
    @js.native
    val `null`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._return")
    @js.native
    val `return`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._super")
    @js.native
    val `super`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._this")
    @js.native
    val `this`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._throw")
    @js.native
    val `throw`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._true")
    @js.native
    val `true`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._try")
    @js.native
    val `try`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._var")
    @js.native
    val `var`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._while")
    @js.native
    val `while`: typingsSlinky.acorn.mod.TokenType = js.native
    
    @JSImport("acorn/dist/acorn.mjs", "tokTypes._with")
    @js.native
    val `with`: typingsSlinky.acorn.mod.TokenType = js.native
  }
  
  @JSImport("acorn/dist/acorn.mjs", "tokenizer")
  @js.native
  def tokenizer(input: String): Call = js.native
  @JSImport("acorn/dist/acorn.mjs", "tokenizer")
  @js.native
  def tokenizer(input: String, options: Options): Call = js.native
  
  @JSImport("acorn/dist/acorn.mjs", "version")
  @js.native
  val version: String = js.native
}
