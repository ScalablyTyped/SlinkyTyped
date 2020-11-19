package typingsSlinky.angularCompiler.parserMod

import typingsSlinky.angularCompiler.astMod.AST
import typingsSlinky.angularCompiler.astMod.AbsoluteSourceSpan
import typingsSlinky.angularCompiler.astMod.BindingPipe
import typingsSlinky.angularCompiler.astMod.LiteralMap
import typingsSlinky.angularCompiler.astMod.ParseSpan
import typingsSlinky.angularCompiler.astMod.ParserError
import typingsSlinky.angularCompiler.astMod.TemplateBindingIdentifier
import typingsSlinky.angularCompiler.lexerMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/parser", "_ParseAST")
@js.native
class ParseAST protected () extends js.Object {
  def this(
    input: String,
    location: js.Any,
    absoluteOffset: Double,
    tokens: js.Array[Token],
    inputLength: Double,
    parseAction: Boolean,
    errors: js.Array[ParserError],
    offset: Double
  ) = this()
  
  var absoluteOffset: Double = js.native
  
  def advance(): Unit = js.native
  
  /** Whether all the parser input has been processed. */
  def atEOF: Boolean = js.native
  
  def consumeOptionalCharacter(code: Double): Boolean = js.native
  
  def consumeOptionalOperator(op: String): Boolean = js.native
  
  /**
    * Consume the optional statement terminator: semicolon or comma.
    */
  var consumeStatementTerminator: js.Any = js.native
  
  /**
    * Returns the absolute offset of the start of the current token.
    */
  def currentAbsoluteOffset: Double = js.native
  
  /**
    * End index of the last processed token, or the start of the first token if none have been
    * processed.
    */
  def currentEndIndex: Double = js.native
  
  def error(message: String): Unit = js.native
  def error(message: String, index: Double): Unit = js.native
  
  var errors: js.Any = js.native
  
  def expectCharacter(code: Double): Unit = js.native
  
  def expectIdentifierOrKeyword(): String = js.native
  
  def expectIdentifierOrKeywordOrString(): String = js.native
  
  def expectOperator(operator: String): Unit = js.native
  
  /**
    * Parses an identifier, a keyword, a string with an optional `-` in between,
    * and returns the string along with its absolute source span.
    */
  def expectTemplateBindingKey(): TemplateBindingIdentifier = js.native
  
  /**
    * Return the expression AST for the bound target of a directive keyword
    * binding. For example,
    * ```
    *   *ngIf="condition | pipe"
    *          ^^^^^^^^^^^^^^^^ bound target for "ngIf"
    *   *ngFor="let item of items"
    *                       ^^^^^ bound target for "ngForOf"
    * ```
    */
  var getDirectiveBoundTarget: js.Any = js.native
  
  var index: Double = js.native
  
  var input: String = js.native
  
  /**
    * Index of the next token to be processed, or the end of the last token if all have been
    * processed.
    */
  def inputIndex: Double = js.native
  
  var inputLength: Double = js.native
  
  var location: js.Any = js.native
  
  var locationText: js.Any = js.native
  
  def next: Token = js.native
  
  var offset: js.Any = js.native
  
  def parseAccessMemberOrMethodCall(receiver: AST): AST = js.native
  def parseAccessMemberOrMethodCall(receiver: AST, isSafe: Boolean): AST = js.native
  
  var parseAction: Boolean = js.native
  
  def parseAdditive(): AST = js.native
  
  /**
    * Return the binding for a variable declared using `as`. Note that the order
    * of the key-value pair in this declaration is reversed. For example,
    * ```
    *   *ngFor="let item of items; index as i"
    *                              ^^^^^    ^
    *                              value    key
    * ```
    *
    * @param value name of the value in the declaration, "ngIf" in the example
    * above, along with its absolute span.
    */
  var parseAsBinding: js.Any = js.native
  
  def parseCallArguments(): js.Array[BindingPipe] = js.native
  
  def parseCallChain(): AST = js.native
  
  def parseChain(): AST = js.native
  
  def parseConditional(): AST = js.native
  
  /**
    * Parse a directive keyword, followed by a mandatory expression.
    * For example, "of items", "trackBy: func".
    * The bindings are: ngForOf -> items, ngForTrackBy -> func
    * There could be an optional "as" binding that follows the expression.
    * For example,
    * ```
    *   *ngFor="let item of items | slice:0:1 as collection".
    *                    ^^ ^^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^
    *               keyword    bound target   optional 'as' binding
    * ```
    *
    * @param key binding key, for example, ngFor, ngIf, ngForOf, along with its
    * absolute span.
    */
  var parseDirectiveKeywordBindings: js.Any = js.native
  
  def parseEquality(): AST = js.native
  
  def parseExpression(): AST = js.native
  
  def parseExpressionList(terminator: Double): js.Array[AST] = js.native
  
  /**
    * Return the binding for a variable declared using `let`. For example,
    * ```
    *   *ngFor="let item of items; let i=index;"
    *           ^^^^^^^^           ^^^^^^^^^^^
    * ```
    * In the first binding, `item` is bound to `NgForOfContext.$implicit`.
    * In the second binding, `i` is bound to `NgForOfContext.index`.
    */
  var parseLetBinding: js.Any = js.native
  
  def parseLiteralMap(): LiteralMap = js.native
  
  def parseLogicalAnd(): AST = js.native
  
  def parseLogicalOr(): AST = js.native
  
  def parseMultiplicative(): AST = js.native
  
  def parsePipe(): AST = js.native
  
  def parsePrefix(): AST = js.native
  
  def parsePrimary(): AST = js.native
  
  def parseRelational(): AST = js.native
  
  /**
    * Parse microsyntax template expression and return a list of bindings or
    * parsing errors in case the given expression is invalid.
    *
    * For example,
    * ```
    *   <div *ngFor="let item of items; index as i; trackBy: func">
    * ```
    * contains five bindings:
    * 1. ngFor -> null
    * 2. item -> NgForOfContext.$implicit
    * 3. ngForOf -> items
    * 4. i -> NgForOfContext.index
    * 5. ngForTrackBy -> func
    *
    * For a full description of the microsyntax grammar, see
    * https://gist.github.com/mhevery/d3530294cff2e4a1b3fe15ff75d08855
    *
    * @param templateKey name of the microsyntax directive, like ngIf, ngFor,
    * without the *, along with its absolute span.
    */
  def parseTemplateBindings(templateKey: TemplateBindingIdentifier): TemplateBindingParseResult = js.native
  
  def peek(offset: Double): Token = js.native
  
  def peekKeywordAs(): Boolean = js.native
  
  def peekKeywordLet(): Boolean = js.native
  
  var rbracesExpected: js.Any = js.native
  
  var rbracketsExpected: js.Any = js.native
  
  var rparensExpected: js.Any = js.native
  
  var skip: js.Any = js.native
  
  def sourceSpan(start: Double): AbsoluteSourceSpan = js.native
  
  var sourceSpanCache: js.Any = js.native
  
  def span(start: Double): ParseSpan = js.native
  
  var tokens: js.Array[Token] = js.native
}
