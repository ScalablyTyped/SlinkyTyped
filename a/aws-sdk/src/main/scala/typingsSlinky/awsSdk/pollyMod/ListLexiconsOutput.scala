package typingsSlinky.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLexiconsOutput extends js.Object {
  /**
    * A list of lexicon names and attributes.
    */
  var Lexicons: js.UndefOr[LexiconDescriptionList] = js.native
  /**
    * The pagination token to use in the next request to continue the listing of lexicons. NextToken is returned only if the response is truncated.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.pollyMod.NextToken] = js.native
}

object ListLexiconsOutput {
  @scala.inline
  def apply(): ListLexiconsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLexiconsOutput]
  }
  @scala.inline
  implicit class ListLexiconsOutputOps[Self <: ListLexiconsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLexicons(value: LexiconDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lexicons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLexicons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lexicons")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

