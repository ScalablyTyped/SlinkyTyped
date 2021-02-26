package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.esfxAsyncCanceltoken.mod.CancelToken
import typingsSlinky.esfxCancelable.distMod.Cancelable
import typingsSlinky.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Emitter")
@js.native
class Emitter protected () extends StObject {
  def this(options: CompilerOptions) = this()
  
  /* protected */ def afterEmitNode(node: Node2[SyntaxKind]): Unit = js.native
  
  /* protected */ def beforeEmitNode(node: Node2[SyntaxKind]): Unit = js.native
  
  var cancelToken: js.Any = js.native
  
  /* protected */ def createWriter(options: CompilerOptions): StringWriter = js.native
  
  var diagnostics: js.Any = js.native
  
  /** @deprecated since 2.1.0 - `prex.CancellationToken` may no longer be accepted in future releases. Please use a token that implements `@esfx/cancelable.Cancelable` */
  def emit(
    node: SourceFile,
    resolver: Resolver,
    diagnostics: DiagnosticMessages,
    writeFile: js.Function3[
      /* file */ String, 
      /* text */ String, 
      js.UndefOr[(CancellationToken with CancelToken) | CancelToken], 
      js.Thenable[Unit] | Unit
    ]
  ): js.Promise[Unit] = js.native
  def emit(
    node: SourceFile,
    resolver: Resolver,
    diagnostics: DiagnosticMessages,
    writeFile: js.Function3[
      /* file */ String, 
      /* text */ String, 
      js.UndefOr[(CancellationToken with CancelToken) | CancelToken], 
      js.Thenable[Unit] | Unit
    ],
    cancelable: Cancelable
  ): js.Promise[Unit] = js.native
  def emit(
    node: SourceFile,
    resolver: Resolver,
    diagnostics: DiagnosticMessages,
    writeFile: js.Function3[
      /* file */ String, 
      /* text */ String, 
      /* cancelToken */ js.UndefOr[CancellationToken with CancelToken], 
      Unit | js.Thenable[Unit]
    ],
    cancelable: CancellationToken
  ): js.Promise[Unit] = js.native
  
  /* protected */ def emitArgument(node: Argument): Unit = js.native
  
  /* protected */ def emitArgumentList(node: ArgumentList): Unit = js.native
  
  /* protected */ def emitButNotSymbol(node: ButNotSymbol): Unit = js.native
  
  /* protected */ def emitConstraints(node: Constraints): Unit = js.native
  
  /* protected */ def emitEmptyAssertion(node: EmptyAssertion): Unit = js.native
  
  /* protected */ def emitHtmlTrivia(range: TextRange): Unit = js.native
  
  /* protected */ def emitIdentifier(node: Identifier): Unit = js.native
  
  /* protected */ def emitImport(node: Import): Unit = js.native
  
  /* protected */ def emitKeyword(node: Node2[SyntaxKind]): Unit = js.native
  
  /* protected */ def emitLeadingHtmlTriviaOfNode(node: Node2[SyntaxKind]): Unit = js.native
  
  /* protected */ def emitLexicalGoalAssertion(node: LexicalGoalAssertion): Unit = js.native
  
  /* protected */ def emitLookaheadAssertion(node: LookaheadAssertion): Unit = js.native
  
  /* protected */ def emitNoSymbolHereAssertion(node: NoSymbolHereAssertion): Unit = js.native
  
  /* protected */ def emitNode(): Unit = js.native
  /* protected */ def emitNode(node: Node2[SyntaxKind]): Unit = js.native
  
  /* protected */ def emitNonterminal(node: Nonterminal): Unit = js.native
  
  /* protected */ def emitOneOfList(node: OneOfList): Unit = js.native
  
  /* protected */ def emitOneOfSymbol(node: OneOfSymbol): Unit = js.native
  
  /* protected */ def emitParameter(node: Parameter): Unit = js.native
  
  /* protected */ def emitParameterList(node: ParameterList): Unit = js.native
  
  /* protected */ def emitPlaceholder(node: PlaceholderSymbol): Unit = js.native
  
  /* protected */ def emitProduction(node: Production): Unit = js.native
  
  /* protected */ def emitProse(node: Prose): Unit = js.native
  
  /* protected */ def emitProseAssertion(node: ProseAssertion): Unit = js.native
  
  /* protected */ def emitProseFragmentLiteral(node: ProseFragmentLiteral[ProseFragmentLiteralKind]): Unit = js.native
  
  /* protected */ def emitRightHandSide(node: RightHandSide): Unit = js.native
  
  /* protected */ def emitRightHandSideList(node: RightHandSideList): Unit = js.native
  
  /* protected */ def emitSourceFile(node: SourceFile): Unit = js.native
  
  def emitString(node: SourceFile, resolver: Resolver, diagnostics: DiagnosticMessages): String = js.native
  def emitString(node: SourceFile, resolver: Resolver, diagnostics: DiagnosticMessages, cancelable: Cancelable): String = js.native
  def emitString(
    node: SourceFile,
    resolver: Resolver,
    diagnostics: DiagnosticMessages,
    cancelable: CancellationToken
  ): String = js.native
  
  /* protected */ def emitSymbolSet(node: SymbolSet): Unit = js.native
  
  /* protected */ def emitSymbolSpan(node: SymbolSpan): Unit = js.native
  
  /** @deprecated since 2.1.0 - `prex.CancellationToken` may no longer be accepted in future releases. Please use a token that implements `@esfx/cancelable.Cancelable` */
  def emitSync(
    node: SourceFile,
    resolver: Resolver,
    diagnostics: DiagnosticMessages,
    writeFile: js.Function3[
      /* file */ String, 
      /* text */ String, 
      js.UndefOr[(CancellationToken with CancelToken) | CancelToken], 
      Unit
    ]
  ): Unit = js.native
  def emitSync(
    node: SourceFile,
    resolver: Resolver,
    diagnostics: DiagnosticMessages,
    writeFile: js.Function3[
      /* file */ String, 
      /* text */ String, 
      js.UndefOr[(CancellationToken with CancelToken) | CancelToken], 
      Unit
    ],
    cancelable: Cancelable
  ): Unit = js.native
  def emitSync(
    node: SourceFile,
    resolver: Resolver,
    diagnostics: DiagnosticMessages,
    writeFile: js.Function3[
      /* file */ String, 
      /* text */ String, 
      /* cancelToken */ js.UndefOr[CancellationToken with CancelToken], 
      Unit
    ],
    cancelable: CancellationToken
  ): Unit = js.native
  
  /* protected */ def emitTerminal(node: Terminal): Unit = js.native
  
  /* protected */ def emitTextContent(node: TextContent): Unit = js.native
  
  /* protected */ def emitToken(): Unit = js.native
  /* protected */ def emitToken(node: Node2[SyntaxKind]): Unit = js.native
  
  /* protected */ def emitTrailingHtmlTriviaOfNode(node: Node2[SyntaxKind]): Unit = js.native
  
  /* protected */ def emitUnicodeCharacterLiteral(node: UnicodeCharacterLiteral): Unit = js.native
  
  /* protected */ def emitUnicodeCharacterRange(node: UnicodeCharacterRange): Unit = js.native
  
  /* protected */ def encode(text: String): String = js.native
  
  var extension: String = js.native
  
  /* protected */ def getOutputFilename(node: SourceFile): String = js.native
  
  var options: CompilerOptions = js.native
  
  var resolver: Resolver = js.native
  
  var sourceFile: js.Any = js.native
  
  var triviaPos: js.Any = js.native
  
  var writer: StringWriter = js.native
}
