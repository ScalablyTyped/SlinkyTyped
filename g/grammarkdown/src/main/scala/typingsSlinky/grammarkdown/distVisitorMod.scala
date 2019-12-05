package typingsSlinky.grammarkdown

import typingsSlinky.grammarkdown.distNodesMod.Argument
import typingsSlinky.grammarkdown.distNodesMod.ArgumentList
import typingsSlinky.grammarkdown.distNodesMod.ButNotSymbol
import typingsSlinky.grammarkdown.distNodesMod.Constraints
import typingsSlinky.grammarkdown.distNodesMod.Define
import typingsSlinky.grammarkdown.distNodesMod.EmptyAssertion
import typingsSlinky.grammarkdown.distNodesMod.Identifier
import typingsSlinky.grammarkdown.distNodesMod.Import
import typingsSlinky.grammarkdown.distNodesMod.InvalidAssertion
import typingsSlinky.grammarkdown.distNodesMod.InvalidSymbol
import typingsSlinky.grammarkdown.distNodesMod.LexicalGoalAssertion
import typingsSlinky.grammarkdown.distNodesMod.LinkReference
import typingsSlinky.grammarkdown.distNodesMod.LookaheadAssertion
import typingsSlinky.grammarkdown.distNodesMod.NoSymbolHereAssertion
import typingsSlinky.grammarkdown.distNodesMod.Node
import typingsSlinky.grammarkdown.distNodesMod.Nonterminal
import typingsSlinky.grammarkdown.distNodesMod.OneOfList
import typingsSlinky.grammarkdown.distNodesMod.OneOfSymbol
import typingsSlinky.grammarkdown.distNodesMod.Parameter
import typingsSlinky.grammarkdown.distNodesMod.ParameterList
import typingsSlinky.grammarkdown.distNodesMod.PlaceholderSymbol
import typingsSlinky.grammarkdown.distNodesMod.Production
import typingsSlinky.grammarkdown.distNodesMod.Prose
import typingsSlinky.grammarkdown.distNodesMod.ProseAssertion
import typingsSlinky.grammarkdown.distNodesMod.ProseFragmentLiteral
import typingsSlinky.grammarkdown.distNodesMod.RightHandSide
import typingsSlinky.grammarkdown.distNodesMod.RightHandSideList
import typingsSlinky.grammarkdown.distNodesMod.SourceFile
import typingsSlinky.grammarkdown.distNodesMod.StringLiteral
import typingsSlinky.grammarkdown.distNodesMod.SymbolSet
import typingsSlinky.grammarkdown.distNodesMod.SymbolSpan
import typingsSlinky.grammarkdown.distNodesMod.Terminal
import typingsSlinky.grammarkdown.distNodesMod.Token
import typingsSlinky.grammarkdown.distNodesMod.UnicodeCharacterLiteral
import typingsSlinky.grammarkdown.distNodesMod.UnicodeCharacterRange
import typingsSlinky.grammarkdown.distTokensMod.ProseFragmentLiteralKind
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind
import typingsSlinky.grammarkdown.distTokensMod.TokenKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/visitor", JSImport.Namespace)
@js.native
object distVisitorMod extends js.Object {
  @js.native
  abstract class NodeVisitor () extends js.Object {
    def visit[T /* <: Node[SyntaxKind] */](): js.UndefOr[T] = js.native
    def visit[T /* <: Node[SyntaxKind] */](node: T): T = js.native
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
    def visitLinkReference(node: LinkReference): LinkReference = js.native
    def visitLookaheadAssertion(node: LookaheadAssertion): LookaheadAssertion = js.native
    def visitNoSymbolHereAssertion(node: NoSymbolHereAssertion): NoSymbolHereAssertion = js.native
    def visitNonterminal(node: Nonterminal): Nonterminal = js.native
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
    def visit_T_NodeSyntaxKind_Union[T /* <: Node[SyntaxKind] */](node: T): js.UndefOr[T] = js.native
  }
  
}

