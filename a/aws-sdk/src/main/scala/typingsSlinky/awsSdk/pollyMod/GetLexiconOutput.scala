package typingsSlinky.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLexiconOutput extends js.Object {
  /**
    * Lexicon object that provides name and the string content of the lexicon. 
    */
  var Lexicon: js.UndefOr[typingsSlinky.awsSdk.pollyMod.Lexicon] = js.native
  /**
    * Metadata of the lexicon, including phonetic alphabetic used, language code, lexicon ARN, number of lexemes defined in the lexicon, and size of lexicon in bytes.
    */
  var LexiconAttributes: js.UndefOr[typingsSlinky.awsSdk.pollyMod.LexiconAttributes] = js.native
}

object GetLexiconOutput {
  @scala.inline
  def apply(): GetLexiconOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLexiconOutput]
  }
  @scala.inline
  implicit class GetLexiconOutputOps[Self <: GetLexiconOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLexicon(value: Lexicon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lexicon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLexicon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lexicon")(js.undefined)
        ret
    }
    @scala.inline
    def withLexiconAttributes(value: LexiconAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LexiconAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLexiconAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LexiconAttributes")(js.undefined)
        ret
    }
  }
  
}

