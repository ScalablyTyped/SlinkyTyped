package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxToken extends js.Object {
  /**
    * The zero-based offset from the beginning of the source text to the first character in the word.
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  /**
    * The zero-based offset from the beginning of the source text to the last character in the word.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  /**
    * Provides the part of speech label and the confidence level that Amazon Comprehend has that the part of speech was correctly identified. For more information, see how-syntax.
    */
  var PartOfSpeech: js.UndefOr[PartOfSpeechTag] = js.native
  /**
    * The word that was recognized in the source text.
    */
  var Text: js.UndefOr[String] = js.native
  /**
    * A unique identifier for a token.
    */
  var TokenId: js.UndefOr[Integer] = js.native
}

object SyntaxToken {
  @scala.inline
  def apply(): SyntaxToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntaxToken]
  }
  @scala.inline
  implicit class SyntaxTokenOps[Self <: SyntaxToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginOffset(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withEndOffset(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPartOfSpeech(value: PartOfSpeechTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartOfSpeech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartOfSpeech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartOfSpeech")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenId(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenId")(js.undefined)
        ret
    }
  }
  
}

