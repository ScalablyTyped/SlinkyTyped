package typingsSlinky.picomatch

import typingsSlinky.picomatch.picomatchStrings.SpaceBackslasht
import typingsSlinky.picomatch.picomatchStrings.SpaceBackslashtBackslashrBackslashnBackslashvBackslashf
import typingsSlinky.picomatch.picomatchStrings.`0-9`
import typingsSlinky.picomatch.picomatchStrings.`A-Fa-f0-9`
import typingsSlinky.picomatch.picomatchStrings.`A-Z`
import typingsSlinky.picomatch.picomatchStrings.`A-Za-z0-9_`
import typingsSlinky.picomatch.picomatchStrings.`Backslash-ExclamationmarkQuotationmarkNumbersign$PercentsignAmpersandApostropheLeftparenthesisRightparenthesisBackslashAsteriskPlussignCommaDotSlashColonSemicolonLessthansignEqualssignGreaterthansignQuestionmark@[Backslash]^_GraveaccentLeftcurlybracketVerticallineRightcurlybracketTilde`
import typingsSlinky.picomatch.picomatchStrings.`Backslashx00-Backslashx1FBackslashx7F`
import typingsSlinky.picomatch.picomatchStrings.`Backslashx00-Backslashx7F`
import typingsSlinky.picomatch.picomatchStrings.`Backslashx20-Backslashx7E `
import typingsSlinky.picomatch.picomatchStrings.`Backslashx21-Backslashx7E`
import typingsSlinky.picomatch.picomatchStrings.`a-zA-Z0-9`
import typingsSlinky.picomatch.picomatchStrings.`a-zA-Z`
import typingsSlinky.picomatch.picomatchStrings.`a-z_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlnum extends js.Object {
  var alnum: `a-zA-Z0-9` = js.native
  var alpha: `a-zA-Z` = js.native
  var ascii: `Backslashx00-Backslashx7F` = js.native
  var blank: SpaceBackslasht = js.native
  var cntrl: `Backslashx00-Backslashx1FBackslashx7F` = js.native
  var digit: `0-9` = js.native
  var graph: `Backslashx21-Backslashx7E` = js.native
  var lower: `a-z_` = js.native
  var print: `Backslashx20-Backslashx7E ` = js.native
  var punct: `Backslash-ExclamationmarkQuotationmarkNumbersign$PercentsignAmpersandApostropheLeftparenthesisRightparenthesisBackslashAsteriskPlussignCommaDotSlashColonSemicolonLessthansignEqualssignGreaterthansignQuestionmark@[Backslash]^_GraveaccentLeftcurlybracketVerticallineRightcurlybracketTilde` = js.native
  var space: SpaceBackslashtBackslashrBackslashnBackslashvBackslashf = js.native
  var upper: `A-Z` = js.native
  var word: `A-Za-z0-9_` = js.native
  var xdigit: `A-Fa-f0-9` = js.native
}

object AnonAlnum {
  @scala.inline
  def apply(
    alnum: `a-zA-Z0-9`,
    alpha: `a-zA-Z`,
    ascii: `Backslashx00-Backslashx7F`,
    blank: SpaceBackslasht,
    cntrl: `Backslashx00-Backslashx1FBackslashx7F`,
    digit: `0-9`,
    graph: `Backslashx21-Backslashx7E`,
    lower: `a-z_`,
    print: `Backslashx20-Backslashx7E `,
    punct: `Backslash-ExclamationmarkQuotationmarkNumbersign$PercentsignAmpersandApostropheLeftparenthesisRightparenthesisBackslashAsteriskPlussignCommaDotSlashColonSemicolonLessthansignEqualssignGreaterthansignQuestionmark@[Backslash]^_GraveaccentLeftcurlybracketVerticallineRightcurlybracketTilde`,
    space: SpaceBackslashtBackslashrBackslashnBackslashvBackslashf,
    upper: `A-Z`,
    word: `A-Za-z0-9_`,
    xdigit: `A-Fa-f0-9`
  ): AnonAlnum = {
    val __obj = js.Dynamic.literal(alnum = alnum.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], ascii = ascii.asInstanceOf[js.Any], blank = blank.asInstanceOf[js.Any], cntrl = cntrl.asInstanceOf[js.Any], digit = digit.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], lower = lower.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any], punct = punct.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any], xdigit = xdigit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlnum]
  }
  @scala.inline
  implicit class AnonAlnumOps[Self <: AnonAlnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlnum(value: `a-zA-Z0-9`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alnum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlpha(value: `a-zA-Z`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAscii(value: `Backslashx00-Backslashx7F`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascii")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlank(value: SpaceBackslasht): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCntrl(value: `Backslashx00-Backslashx1FBackslashx7F`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cntrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigit(value: `0-9`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraph(value: `Backslashx21-Backslashx7E`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLower(value: `a-z_`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrint(value: `Backslashx20-Backslashx7E `): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPunct(
      value: `Backslash-ExclamationmarkQuotationmarkNumbersign$PercentsignAmpersandApostropheLeftparenthesisRightparenthesisBackslashAsteriskPlussignCommaDotSlashColonSemicolonLessthansignEqualssignGreaterthansignQuestionmark@[Backslash]^_GraveaccentLeftcurlybracketVerticallineRightcurlybracketTilde`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("punct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpace(value: SpaceBackslashtBackslashrBackslashnBackslashvBackslashf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpper(value: `A-Z`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWord(value: `A-Za-z0-9_`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXdigit(value: `A-Fa-f0-9`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xdigit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

