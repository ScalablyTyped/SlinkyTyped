package typingsSlinky.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyntaxKind extends StObject
@JSImport("grammarkdown/dist/grammarkdown", "SyntaxKind")
@js.native
object SyntaxKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind with Double] = js.native
  
  @js.native
  sealed trait Argument extends SyntaxKind
  /* 60 */ val Argument: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.Argument with Double = js.native
  
  @js.native
  sealed trait ArgumentList extends SyntaxKind
  /* 61 */ val ArgumentList: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ArgumentList with Double = js.native
  
  @js.native
  sealed trait AtToken
    extends PunctuationKind
       with SyntaxKind
  /* 6 */ val AtToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.AtToken with Double = js.native
  
  @js.native
  sealed trait ButKeyword
    extends KeywordKind
       with SyntaxKind
  /* 30 */ val ButKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ButKeyword with Double = js.native
  
  @js.native
  sealed trait ButNotSymbol extends SyntaxKind
  /* 69 */ val ButNotSymbol: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ButNotSymbol with Double = js.native
  
  @js.native
  sealed trait CloseBraceToken
    extends PunctuationKind
       with SyntaxKind
  /* 8 */ val CloseBraceToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.CloseBraceToken with Double = js.native
  
  @js.native
  sealed trait CloseBracketToken
    extends PunctuationKind
       with SyntaxKind
  /* 11 */ val CloseBracketToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.CloseBracketToken with Double = js.native
  
  @js.native
  sealed trait CloseParenToken
    extends PunctuationKind
       with SyntaxKind
  /* 14 */ val CloseParenToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.CloseParenToken with Double = js.native
  
  @js.native
  sealed trait ColonColonColonToken
    extends PunctuationKind
       with SyntaxKind
       with ProductionSeperatorKind
  /* 17 */ val ColonColonColonToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ColonColonColonToken with Double = js.native
  
  @js.native
  sealed trait ColonColonToken
    extends PunctuationKind
       with SyntaxKind
       with ProductionSeperatorKind
  /* 16 */ val ColonColonToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ColonColonToken with Double = js.native
  
  @js.native
  sealed trait ColonToken
    extends PunctuationKind
       with SyntaxKind
       with ProductionSeperatorKind
  /* 15 */ val ColonToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ColonToken with Double = js.native
  
  @js.native
  sealed trait CommaToken
    extends PunctuationKind
       with SyntaxKind
  /* 18 */ val CommaToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.CommaToken with Double = js.native
  
  @js.native
  sealed trait Constraints extends SyntaxKind
  /* 66 */ val Constraints: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.Constraints with Double = js.native
  
  @js.native
  sealed trait Define extends SyntaxKind
  /* 56 */ val Define: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.Define with Double = js.native
  
  @js.native
  sealed trait DefineKeyword
    extends KeywordKind
       with SyntaxKind
  /* 31 */ val DefineKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.DefineKeyword with Double = js.native
  
  @js.native
  sealed trait ElementOfToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 28 */ val ElementOfToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ElementOfToken with Double = js.native
  
  @js.native
  sealed trait EmptyAssertion extends SyntaxKind
  /* 75 */ val EmptyAssertion: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.EmptyAssertion with Double = js.native
  
  @js.native
  sealed trait EmptyKeyword
    extends KeywordKind
       with SyntaxKind
  /* 32 */ val EmptyKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.EmptyKeyword with Double = js.native
  
  @js.native
  sealed trait EndOfFileToken
    extends SyntaxKind
       with TokenKind
  /* 5 */ val EndOfFileToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.EndOfFileToken with Double = js.native
  
  @js.native
  sealed trait EqualsEqualsToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 23 */ val EqualsEqualsToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.EqualsEqualsToken with Double = js.native
  
  @js.native
  sealed trait EqualsToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 22 */ val EqualsToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.EqualsToken with Double = js.native
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 24 */ val ExclamationEqualsToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ExclamationEqualsToken with Double = js.native
  
  @js.native
  sealed trait FalseKeyword
    extends KeywordKind
       with SyntaxKind
       with BooleanKind
  /* 33 */ val FalseKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.FalseKeyword with Double = js.native
  
  @js.native
  sealed trait FirstCommentTrivia extends SyntaxKind
  /* 1 */ val FirstCommentTrivia: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.FirstCommentTrivia with Double = js.native
  
  @js.native
  sealed trait FirstErrorNode extends SyntaxKind
  /* 80 */ val FirstErrorNode: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.FirstErrorNode with Double = js.native
  
  @js.native
  sealed trait FirstHtmlTrivia extends SyntaxKind
  /* 3 */ val FirstHtmlTrivia: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.FirstHtmlTrivia with Double = js.native
  
  @js.native
  sealed trait FirstKeyword extends SyntaxKind
  /* 30 */ val FirstKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.FirstKeyword with Double = js.native
  
  @js.native
  sealed trait FirstLiteral extends SyntaxKind
  /* 46 */ val FirstLiteral: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.FirstLiteral with Double = js.native
  
  @js.native
  sealed trait FirstProseFragmentLiteral extends SyntaxKind
  /* 49 */ val FirstProseFragmentLiteral: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.FirstProseFragmentLiteral with Double = js.native
  
  @js.native
  sealed trait FirstPunctuation extends SyntaxKind
  /* 6 */ val FirstPunctuation: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.FirstPunctuation with Double = js.native
  
  @js.native
  sealed trait FirstTextContent extends SyntaxKind
  /* 46 */ val FirstTextContent: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.FirstTextContent with Double = js.native
  
  @js.native
  sealed trait FirstToken extends SyntaxKind
  /* 5 */ val FirstToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.FirstToken with Double = js.native
  
  @js.native
  sealed trait FirstTrivia extends SyntaxKind
  /* 1 */ val FirstTrivia: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.FirstTrivia with Double = js.native
  
  @js.native
  sealed trait GoalKeyword
    extends KeywordKind
       with SyntaxKind
  /* 34 */ val GoalKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.GoalKeyword with Double = js.native
  
  @js.native
  sealed trait GreaterThanToken
    extends PunctuationKind
       with SyntaxKind
  /* 12 */ val GreaterThanToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.GreaterThanToken with Double = js.native
  
  @js.native
  sealed trait HereKeyword
    extends KeywordKind
       with SyntaxKind
  /* 35 */ val HereKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.HereKeyword with Double = js.native
  
  @js.native
  sealed trait HtmlCloseTagTrivia
    extends HtmlTriviaKind
       with SyntaxKind
  /* 4 */ val HtmlCloseTagTrivia: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.HtmlCloseTagTrivia with Double = js.native
  
  @js.native
  sealed trait HtmlOpenTagTrivia
    extends HtmlTriviaKind
       with SyntaxKind
  /* 3 */ val HtmlOpenTagTrivia: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.HtmlOpenTagTrivia with Double = js.native
  
  @js.native
  sealed trait Identifier
    extends SyntaxKind
       with TextContentKind
  /* 53 */ val Identifier: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.Identifier with Double = js.native
  
  @js.native
  sealed trait Import extends SyntaxKind
  /* 55 */ val Import: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.Import with Double = js.native
  
  @js.native
  sealed trait ImportKeyword
    extends KeywordKind
       with SyntaxKind
  /* 36 */ val ImportKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ImportKeyword with Double = js.native
  
  @js.native
  sealed trait InvalidAssertion extends SyntaxKind
  /* 81 */ val InvalidAssertion: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.InvalidAssertion with Double = js.native
  
  @js.native
  sealed trait InvalidSymbol extends SyntaxKind
  /* 80 */ val InvalidSymbol: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.InvalidSymbol with Double = js.native
  
  @js.native
  sealed trait LastCommentTrivia extends SyntaxKind
  /* 2 */ val LastCommentTrivia: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LastCommentTrivia with Double = js.native
  
  @js.native
  sealed trait LastErrorNode extends SyntaxKind
  /* 81 */ val LastErrorNode: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LastErrorNode with Double = js.native
  
  @js.native
  sealed trait LastHtmlTrivia extends SyntaxKind
  /* 4 */ val LastHtmlTrivia: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LastHtmlTrivia with Double = js.native
  
  @js.native
  sealed trait LastKeyword extends SyntaxKind
  /* 45 */ val LastKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LastKeyword with Double = js.native
  
  @js.native
  sealed trait LastLiteral extends SyntaxKind
  /* 48 */ val LastLiteral: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LastLiteral with Double = js.native
  
  @js.native
  sealed trait LastProseFragmentLiteral extends SyntaxKind
  /* 52 */ val LastProseFragmentLiteral: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LastProseFragmentLiteral with Double = js.native
  
  @js.native
  sealed trait LastPunctuation extends SyntaxKind
  /* 29 */ val LastPunctuation: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LastPunctuation with Double = js.native
  
  @js.native
  sealed trait LastTextContent extends SyntaxKind
  /* 52 */ val LastTextContent: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LastTextContent with Double = js.native
  
  @js.native
  sealed trait LastToken extends SyntaxKind
  /* 45 */ val LastToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LastToken with Double = js.native
  
  @js.native
  sealed trait LastTrivia extends SyntaxKind
  /* 4 */ val LastTrivia: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LastTrivia with Double = js.native
  
  @js.native
  sealed trait LessThanExclamationToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 25 */ val LessThanExclamationToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LessThanExclamationToken with Double = js.native
  
  @js.native
  sealed trait LessThanMinusToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 26 */ val LessThanMinusToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LessThanMinusToken with Double = js.native
  
  @js.native
  sealed trait LexicalGoalAssertion extends SyntaxKind
  /* 77 */ val LexicalGoalAssertion: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LexicalGoalAssertion with Double = js.native
  
  @js.native
  sealed trait LexicalKeyword
    extends KeywordKind
       with SyntaxKind
  /* 37 */ val LexicalKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LexicalKeyword with Double = js.native
  
  @js.native
  sealed trait LinkReference extends SyntaxKind
  /* 62 */ val LinkReference: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LinkReference with Double = js.native
  
  @js.native
  sealed trait LookaheadAssertion extends SyntaxKind
  /* 76 */ val LookaheadAssertion: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LookaheadAssertion with Double = js.native
  
  @js.native
  sealed trait LookaheadKeyword
    extends KeywordKind
       with SyntaxKind
  /* 38 */ val LookaheadKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.LookaheadKeyword with Double = js.native
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends CommentTriviaKind
       with SyntaxKind
  /* 2 */ val MultiLineCommentTrivia: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.MultiLineCommentTrivia with Double = js.native
  
  @js.native
  sealed trait NoKeyword
    extends KeywordKind
       with SyntaxKind
  /* 39 */ val NoKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.NoKeyword with Double = js.native
  
  @js.native
  sealed trait NoSymbolHereAssertion extends SyntaxKind
  /* 78 */ val NoSymbolHereAssertion: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.NoSymbolHereAssertion with Double = js.native
  
  @js.native
  sealed trait Nonterminal extends SyntaxKind
  /* 73 */ val Nonterminal: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.Nonterminal with Double = js.native
  
  @js.native
  sealed trait NotAnElementOfToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 29 */ val NotAnElementOfToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.NotAnElementOfToken with Double = js.native
  
  @js.native
  sealed trait NotEqualToToken
    extends PunctuationKind
       with SyntaxKind
       with LookaheadOperatorKind
  /* 27 */ val NotEqualToToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.NotEqualToToken with Double = js.native
  
  @js.native
  sealed trait NotKeyword
    extends KeywordKind
       with SyntaxKind
  /* 40 */ val NotKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.NotKeyword with Double = js.native
  
  @js.native
  sealed trait OfKeyword
    extends KeywordKind
       with SyntaxKind
  /* 41 */ val OfKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.OfKeyword with Double = js.native
  
  @js.native
  sealed trait OneKeyword
    extends KeywordKind
       with SyntaxKind
  /* 42 */ val OneKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.OneKeyword with Double = js.native
  
  @js.native
  sealed trait OneOfList extends SyntaxKind
  /* 63 */ val OneOfList: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.OneOfList with Double = js.native
  
  @js.native
  sealed trait OneOfSymbol extends SyntaxKind
  /* 71 */ val OneOfSymbol: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.OneOfSymbol with Double = js.native
  
  @js.native
  sealed trait OpenBraceToken
    extends PunctuationKind
       with SyntaxKind
  /* 7 */ val OpenBraceToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.OpenBraceToken with Double = js.native
  
  @js.native
  sealed trait OpenBracketGreaterThanToken
    extends PunctuationKind
       with SyntaxKind
  /* 10 */ val OpenBracketGreaterThanToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.OpenBracketGreaterThanToken with Double = js.native
  
  @js.native
  sealed trait OpenBracketToken
    extends PunctuationKind
       with SyntaxKind
  /* 9 */ val OpenBracketToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.OpenBracketToken with Double = js.native
  
  @js.native
  sealed trait OpenParenToken
    extends PunctuationKind
       with SyntaxKind
  /* 13 */ val OpenParenToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.OpenParenToken with Double = js.native
  
  @js.native
  sealed trait OrKeyword
    extends KeywordKind
       with SyntaxKind
  /* 43 */ val OrKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.OrKeyword with Double = js.native
  
  @js.native
  sealed trait Parameter extends SyntaxKind
  /* 58 */ val Parameter: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.Parameter with Double = js.native
  
  @js.native
  sealed trait ParameterList extends SyntaxKind
  /* 59 */ val ParameterList: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ParameterList with Double = js.native
  
  @js.native
  sealed trait PlaceholderSymbol extends SyntaxKind
  /* 72 */ val PlaceholderSymbol: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.PlaceholderSymbol with Double = js.native
  
  @js.native
  sealed trait PlusToken
    extends PunctuationKind
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
  /* 19 */ val PlusToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.PlusToken with Double = js.native
  
  @js.native
  sealed trait Production extends SyntaxKind
  /* 57 */ val Production: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.Production with Double = js.native
  
  @js.native
  sealed trait Prose extends SyntaxKind
  /* 74 */ val Prose: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.Prose with Double = js.native
  
  @js.native
  sealed trait ProseAssertion extends SyntaxKind
  /* 79 */ val ProseAssertion: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ProseAssertion with Double = js.native
  
  @js.native
  sealed trait ProseFull
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 52 */ val ProseFull: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ProseFull with Double = js.native
  
  @js.native
  sealed trait ProseHead
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 49 */ val ProseHead: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ProseHead with Double = js.native
  
  @js.native
  sealed trait ProseMiddle
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 50 */ val ProseMiddle: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ProseMiddle with Double = js.native
  
  @js.native
  sealed trait ProseTail
    extends ProseFragmentLiteralKind
       with SyntaxKind
  /* 51 */ val ProseTail: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ProseTail with Double = js.native
  
  @js.native
  sealed trait QuestionToken
    extends PunctuationKind
       with SyntaxKind
       with ArgumentOperatorKind
  /* 21 */ val QuestionToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.QuestionToken with Double = js.native
  
  @js.native
  sealed trait RightHandSide extends SyntaxKind
  /* 65 */ val RightHandSide: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.RightHandSide with Double = js.native
  
  @js.native
  sealed trait RightHandSideList extends SyntaxKind
  /* 64 */ val RightHandSideList: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.RightHandSideList with Double = js.native
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends CommentTriviaKind
       with SyntaxKind
  /* 1 */ val SingleLineCommentTrivia: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.SingleLineCommentTrivia with Double = js.native
  
  @js.native
  sealed trait SourceFile extends SyntaxKind
  /* 54 */ val SourceFile: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.SourceFile with Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends SyntaxKind
       with TextContentKind
  /* 46 */ val StringLiteral: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.StringLiteral with Double = js.native
  
  @js.native
  sealed trait SymbolSet extends SyntaxKind
  /* 68 */ val SymbolSet: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.SymbolSet with Double = js.native
  
  @js.native
  sealed trait SymbolSpan extends SyntaxKind
  /* 67 */ val SymbolSpan: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.SymbolSpan with Double = js.native
  
  @js.native
  sealed trait Terminal
    extends SyntaxKind
       with TextContentKind
  /* 47 */ val Terminal: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.Terminal with Double = js.native
  
  @js.native
  sealed trait ThroughKeyword
    extends KeywordKind
       with SyntaxKind
  /* 44 */ val ThroughKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ThroughKeyword with Double = js.native
  
  @js.native
  sealed trait TildeToken
    extends PunctuationKind
       with SyntaxKind
       with ArgumentOperatorKind
       with ParameterOperatorKind
  /* 20 */ val TildeToken: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.TildeToken with Double = js.native
  
  @js.native
  sealed trait TrueKeyword
    extends KeywordKind
       with SyntaxKind
       with BooleanKind
  /* 45 */ val TrueKeyword: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.TrueKeyword with Double = js.native
  
  @js.native
  sealed trait UnicodeCharacterLiteral
    extends SyntaxKind
       with TextContentKind
  /* 48 */ val UnicodeCharacterLiteral: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.UnicodeCharacterLiteral with Double = js.native
  
  @js.native
  sealed trait UnicodeCharacterRange extends SyntaxKind
  /* 70 */ val UnicodeCharacterRange: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.UnicodeCharacterRange with Double = js.native
  
  @js.native
  sealed trait Unknown extends SyntaxKind
  /* 0 */ val Unknown: typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.Unknown with Double = js.native
}
