package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parser results returned by {@link XCharacterClassification.parseAnyToken()} and {@link XCharacterClassification.parsePredefinedToken()} . */
@js.native
trait ParseResult extends js.Object {
  /** Number of code points (not UTF-16 code units) of the parsed token, not including leading whitespace. */
  var CharLen: Double = js.native
  /** {@link KParseTokens} flags of remaining characters of actual token matched. */
  var ContFlags: Double = js.native
  /** If a quoted name or string is encountered the dequoted result goes here. */
  var DequotedNameOrString: String = js.native
  /** UTF-16 code unit index of first unprocessed character. */
  var EndPos: Double = js.native
  /** Count of ignored leading whitespace, in UTF-16 code units, not Unicode code points. */
  var LeadingWhiteSpace: Double = js.native
  /**
    * {@link KParseTokens} flags of first character of actual token matched. If **TokenType** is a {@link KParseType.SINGLE_QUOTE_NAME} or a {@link
    * KParseType.DOUBLE_QUOTE_STRING} the first character is the first character inside the quotes, not the quote itself.
    */
  var StartFlags: Double = js.native
  /** {@link KParseType} token type like {@link KParseType.IDENTNAME} . */
  var TokenType: Double = js.native
  /** Value of token in case of numeric. */
  var Value: Double = js.native
}

object ParseResult {
  @scala.inline
  def apply(
    CharLen: Double,
    ContFlags: Double,
    DequotedNameOrString: String,
    EndPos: Double,
    LeadingWhiteSpace: Double,
    StartFlags: Double,
    TokenType: Double,
    Value: Double
  ): ParseResult = {
    val __obj = js.Dynamic.literal(CharLen = CharLen.asInstanceOf[js.Any], ContFlags = ContFlags.asInstanceOf[js.Any], DequotedNameOrString = DequotedNameOrString.asInstanceOf[js.Any], EndPos = EndPos.asInstanceOf[js.Any], LeadingWhiteSpace = LeadingWhiteSpace.asInstanceOf[js.Any], StartFlags = StartFlags.asInstanceOf[js.Any], TokenType = TokenType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResult]
  }
  @scala.inline
  implicit class ParseResultOps[Self <: ParseResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDequotedNameOrString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DequotedNameOrString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeadingWhiteSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeadingWhiteSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

