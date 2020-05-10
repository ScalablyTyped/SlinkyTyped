package typingsSlinky.graphql.tokenKindMod

import typingsSlinky.graphql.graphqlStrings.$
import typingsSlinky.graphql.graphqlStrings.Ampersand
import typingsSlinky.graphql.graphqlStrings.BlockString
import typingsSlinky.graphql.graphqlStrings.Colon
import typingsSlinky.graphql.graphqlStrings.Comment
import typingsSlinky.graphql.graphqlStrings.DotDotDot
import typingsSlinky.graphql.graphqlStrings.Equalssign
import typingsSlinky.graphql.graphqlStrings.Exclamationmark
import typingsSlinky.graphql.graphqlStrings.Float
import typingsSlinky.graphql.graphqlStrings.Int
import typingsSlinky.graphql.graphqlStrings.Leftcurlybracket
import typingsSlinky.graphql.graphqlStrings.Leftparenthesis
import typingsSlinky.graphql.graphqlStrings.LessthansignEOFGreaterthansign
import typingsSlinky.graphql.graphqlStrings.LessthansignSOFGreaterthansign
import typingsSlinky.graphql.graphqlStrings.Name
import typingsSlinky.graphql.graphqlStrings.Rightcurlybracket
import typingsSlinky.graphql.graphqlStrings.Rightparenthesis
import typingsSlinky.graphql.graphqlStrings.String
import typingsSlinky.graphql.graphqlStrings.Verticalline
import typingsSlinky.graphql.graphqlStrings.`@`
import typingsSlinky.graphql.graphqlStrings.`[`
import typingsSlinky.graphql.graphqlStrings.`]`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _TokenKind extends js.Object {
  var AMP: Ampersand = js.native
  var AT: `@` = js.native
  var BANG: Exclamationmark = js.native
  var BLOCK_STRING: BlockString = js.native
  var BRACE_L: Leftcurlybracket = js.native
  var BRACE_R: Rightcurlybracket = js.native
  var BRACKET_L: `[` = js.native
  var BRACKET_R: `]` = js.native
  var COLON: Colon = js.native
  var COMMENT: Comment = js.native
  var DOLLAR: $ = js.native
  var EOF: LessthansignEOFGreaterthansign = js.native
  var EQUALS: Equalssign = js.native
  var FLOAT: Float = js.native
  var INT: Int = js.native
  var NAME: Name = js.native
  var PAREN_L: Leftparenthesis = js.native
  var PAREN_R: Rightparenthesis = js.native
  var PIPE: Verticalline = js.native
  var SOF: LessthansignSOFGreaterthansign = js.native
  var SPREAD: DotDotDot = js.native
  var STRING: String = js.native
}

object _TokenKind {
  @scala.inline
  def apply(
    AMP: Ampersand,
    AT: `@`,
    BANG: Exclamationmark,
    BLOCK_STRING: BlockString,
    BRACE_L: Leftcurlybracket,
    BRACE_R: Rightcurlybracket,
    BRACKET_L: `[`,
    BRACKET_R: `]`,
    COLON: Colon,
    COMMENT: Comment,
    DOLLAR: $,
    EOF: LessthansignEOFGreaterthansign,
    EQUALS: Equalssign,
    FLOAT: Float,
    INT: Int,
    NAME: Name,
    PAREN_L: Leftparenthesis,
    PAREN_R: Rightparenthesis,
    PIPE: Verticalline,
    SOF: LessthansignSOFGreaterthansign,
    SPREAD: DotDotDot,
    STRING: String
  ): _TokenKind = {
    val __obj = js.Dynamic.literal(AMP = AMP.asInstanceOf[js.Any], AT = AT.asInstanceOf[js.Any], BANG = BANG.asInstanceOf[js.Any], BLOCK_STRING = BLOCK_STRING.asInstanceOf[js.Any], BRACE_L = BRACE_L.asInstanceOf[js.Any], BRACE_R = BRACE_R.asInstanceOf[js.Any], BRACKET_L = BRACKET_L.asInstanceOf[js.Any], BRACKET_R = BRACKET_R.asInstanceOf[js.Any], COLON = COLON.asInstanceOf[js.Any], COMMENT = COMMENT.asInstanceOf[js.Any], DOLLAR = DOLLAR.asInstanceOf[js.Any], EOF = EOF.asInstanceOf[js.Any], EQUALS = EQUALS.asInstanceOf[js.Any], FLOAT = FLOAT.asInstanceOf[js.Any], INT = INT.asInstanceOf[js.Any], NAME = NAME.asInstanceOf[js.Any], PAREN_L = PAREN_L.asInstanceOf[js.Any], PAREN_R = PAREN_R.asInstanceOf[js.Any], PIPE = PIPE.asInstanceOf[js.Any], SOF = SOF.asInstanceOf[js.Any], SPREAD = SPREAD.asInstanceOf[js.Any], STRING = STRING.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TokenKind]
  }
  @scala.inline
  implicit class _TokenKindOps[Self <: _TokenKind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAMP(value: Ampersand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AMP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAT(value: `@`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBANG(value: Exclamationmark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BANG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBLOCK_STRING(value: BlockString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BLOCK_STRING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBRACE_L(value: Leftcurlybracket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BRACE_L")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBRACE_R(value: Rightcurlybracket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BRACE_R")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBRACKET_L(value: `[`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BRACKET_L")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBRACKET_R(value: `]`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BRACKET_R")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCOLON(value: Colon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COLON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCOMMENT(value: Comment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMMENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOLLAR(value: $): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOLLAR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEOF(value: LessthansignEOFGreaterthansign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EOF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEQUALS(value: Equalssign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EQUALS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFLOAT(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FLOAT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINT(value: Int): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNAME(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPAREN_L(value: Leftparenthesis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAREN_L")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPAREN_R(value: Rightparenthesis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAREN_R")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPIPE(value: Verticalline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PIPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSOF(value: LessthansignSOFGreaterthansign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SOF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSPREAD(value: DotDotDot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SPREAD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTRING(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STRING")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

