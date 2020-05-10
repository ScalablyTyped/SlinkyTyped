package typingsSlinky.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexiconAttributes extends js.Object {
  /**
    * Phonetic alphabet used in the lexicon. Valid values are ipa and x-sampa.
    */
  var Alphabet: js.UndefOr[typingsSlinky.awsSdk.pollyMod.Alphabet] = js.native
  /**
    * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.pollyMod.LanguageCode] = js.native
  /**
    * Date lexicon was last modified (a timestamp value).
    */
  var LastModified: js.UndefOr[js.Date] = js.native
  /**
    * Number of lexemes in the lexicon.
    */
  var LexemesCount: js.UndefOr[typingsSlinky.awsSdk.pollyMod.LexemesCount] = js.native
  /**
    * Amazon Resource Name (ARN) of the lexicon.
    */
  var LexiconArn: js.UndefOr[typingsSlinky.awsSdk.pollyMod.LexiconArn] = js.native
  /**
    * Total size of the lexicon, in characters.
    */
  var Size: js.UndefOr[typingsSlinky.awsSdk.pollyMod.Size] = js.native
}

object LexiconAttributes {
  @scala.inline
  def apply(): LexiconAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LexiconAttributes]
  }
  @scala.inline
  implicit class LexiconAttributesOps[Self <: LexiconAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphabet(value: Alphabet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alphabet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphabet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alphabet")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: LanguageCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withLexemesCount(value: LexemesCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LexemesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLexemesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LexemesCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLexiconArn(value: LexiconArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LexiconArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLexiconArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LexiconArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(js.undefined)
        ret
    }
  }
  
}

