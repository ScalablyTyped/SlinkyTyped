package typingsSlinky.grammarkdown

import typingsSlinky.grammarkdown.nodesMod.Argument
import typingsSlinky.grammarkdown.nodesMod.ArgumentList
import typingsSlinky.grammarkdown.nodesMod.ButNotSymbol
import typingsSlinky.grammarkdown.nodesMod.Constraints
import typingsSlinky.grammarkdown.nodesMod.Define
import typingsSlinky.grammarkdown.nodesMod.EmptyAssertion
import typingsSlinky.grammarkdown.nodesMod.Identifier
import typingsSlinky.grammarkdown.nodesMod.Import
import typingsSlinky.grammarkdown.nodesMod.InvalidAssertion
import typingsSlinky.grammarkdown.nodesMod.InvalidSymbol
import typingsSlinky.grammarkdown.nodesMod.LexicalGoalAssertion
import typingsSlinky.grammarkdown.nodesMod.Line
import typingsSlinky.grammarkdown.nodesMod.LinkReference
import typingsSlinky.grammarkdown.nodesMod.LookaheadAssertion
import typingsSlinky.grammarkdown.nodesMod.NoSymbolHereAssertion
import typingsSlinky.grammarkdown.nodesMod.Node
import typingsSlinky.grammarkdown.nodesMod.Nonterminal
import typingsSlinky.grammarkdown.nodesMod.NumberLiteral
import typingsSlinky.grammarkdown.nodesMod.OneOfList
import typingsSlinky.grammarkdown.nodesMod.OneOfSymbol
import typingsSlinky.grammarkdown.nodesMod.Parameter
import typingsSlinky.grammarkdown.nodesMod.ParameterList
import typingsSlinky.grammarkdown.nodesMod.PlaceholderSymbol
import typingsSlinky.grammarkdown.nodesMod.Production
import typingsSlinky.grammarkdown.nodesMod.Prose
import typingsSlinky.grammarkdown.nodesMod.ProseAssertion
import typingsSlinky.grammarkdown.nodesMod.ProseFragmentLiteral
import typingsSlinky.grammarkdown.nodesMod.RightHandSide
import typingsSlinky.grammarkdown.nodesMod.RightHandSideList
import typingsSlinky.grammarkdown.nodesMod.SourceFile
import typingsSlinky.grammarkdown.nodesMod.StringLiteral
import typingsSlinky.grammarkdown.nodesMod.SymbolSet
import typingsSlinky.grammarkdown.nodesMod.SymbolSpan
import typingsSlinky.grammarkdown.nodesMod.Terminal
import typingsSlinky.grammarkdown.nodesMod.Token
import typingsSlinky.grammarkdown.nodesMod.UnicodeCharacterLiteral
import typingsSlinky.grammarkdown.nodesMod.UnicodeCharacterRange
import typingsSlinky.grammarkdown.tokensMod.ProseFragmentLiteralKind
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind
import typingsSlinky.grammarkdown.tokensMod.TokenKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/visitor", JSImport.Namespace)
@js.native
object visitorMod extends js.Object {
  
  @js.native
  abstract class NodeVisitor () extends js.Object {
    
    def visit[T /* <: Node[SyntaxKind] */](): js.UndefOr[T] = js.native
    def visit[T /* <: Node[SyntaxKind] */](node: T): js.UndefOr[T] = js.native
    
    def visitArgument(node: Argument): Argument = js.native
    
    def visitArgumentList(node: ArgumentList): ArgumentList = js.native
    
    def visitButNotSymbol(node: ButNotSymbol): ButNotSymbol = js.native
    
    def visitConstraints(node: Constraints): Constraints = js.native
    
    def visitDefine(node: Define): Define = js.native
    
    def visitEach[T /* <: Node[SyntaxKind] */](): js.UndefOr[js.Array[T]] = js.native
    def visitEach[T /* <: Node[SyntaxKind] */](nodes: js.Array[T]): js.Array[T] = js.native
    @JSName("visitEach")
    def visitEach_T_NodeSyntaxKind_Union[T /* <: Node[SyntaxKind] */](nodes: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
    
    def visitEmptyAssertion(node: EmptyAssertion): EmptyAssertion = js.native
    
    def visitExtension[T /* <: Node[SyntaxKind] */](node: T): T = js.native
    
    def visitIdentifier(node: Identifier): Identifier = js.native
    
    def visitImport(node: Import): Import = js.native
    
    def visitInvalidAssertion(node: InvalidAssertion): InvalidAssertion = js.native
    
    def visitInvalidSymbol(node: InvalidSymbol): InvalidSymbol = js.native
    
    def visitLexicalGoalAssertion(node: LexicalGoalAssertion): LexicalGoalAssertion = js.native
    
    def visitLine(node: Line): Line = js.native
    
    def visitLinkReference(node: LinkReference): LinkReference = js.native
    
    def visitLookaheadAssertion(node: LookaheadAssertion): LookaheadAssertion = js.native
    
    def visitNoSymbolHereAssertion(node: NoSymbolHereAssertion): NoSymbolHereAssertion = js.native
    
    def visitNonterminal(node: Nonterminal): Nonterminal = js.native
    
    def visitNumberLiteral(node: NumberLiteral): NumberLiteral = js.native
    
    def visitOneOfList(node: OneOfList): OneOfList = js.native
    
    def visitOneOfSymbol(node: OneOfSymbol): OneOfSymbol = js.native
    
    def visitParameter(node: Parameter): Parameter = js.native
    
    def visitParameterList(node: ParameterList): ParameterList = js.native
    
    def visitPlaceholderSymbol(node: PlaceholderSymbol): PlaceholderSymbol = js.native
    
    def visitProduction(node: Production): Production = js.native
    
    def visitProse(node: Prose): Prose = js.native
    
    def visitProseAssertion(node: ProseAssertion): ProseAssertion = js.native
    
    def visitProseFragmentLiteral(node: ProseFragmentLiteral[ProseFragmentLiteralKind]): ProseFragmentLiteral[ProseFragmentLiteralKind] = js.native
    
    def visitRightHandSide(node: RightHandSide): RightHandSide = js.native
    
    def visitRightHandSideList(node: RightHandSideList): RightHandSideList = js.native
    
    def visitSourceFile(node: SourceFile): SourceFile = js.native
    
    def visitStringLiteral(node: StringLiteral): StringLiteral = js.native
    
    def visitSymbolSet(node: SymbolSet): SymbolSet = js.native
    
    def visitSymbolSpan(node: SymbolSpan): SymbolSpan = js.native
    
    def visitTerminal(node: Terminal): Terminal = js.native
    
    def visitToken[TKind /* <: TokenKind */](node: Token[TKind]): Token[TKind] = js.native
    
    def visitUnicodeCharacterLiteral(node: UnicodeCharacterLiteral): UnicodeCharacterLiteral = js.native
    
    def visitUnicodeCharacterRange(node: UnicodeCharacterRange): UnicodeCharacterRange = js.native
    
    @JSName("visit")
    def visit_T_NodeSyntaxKind_T[T /* <: Node[SyntaxKind] */](node: T): T = js.native
  }
}
