package typingsSlinky.chance.anon

import typingsSlinky.chance.chanceStrings.Colon
import typingsSlinky.chance.chanceStrings.Dot
import typingsSlinky.chance.chanceStrings.Exclamationmark
import typingsSlinky.chance.chanceStrings.Questionmark
import typingsSlinky.chance.chanceStrings.Semicolon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chance.Chance.SentenceOptions> */
@js.native
trait PartialSentenceOptions extends js.Object {
  var punctuation: js.UndefOr[Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean] = js.native
  var words: js.UndefOr[Double] = js.native
}

object PartialSentenceOptions {
  @scala.inline
  def apply(): PartialSentenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSentenceOptions]
  }
  @scala.inline
  implicit class PartialSentenceOptionsOps[Self <: PartialSentenceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPunctuation(value: Dot | Questionmark | Semicolon | Exclamationmark | Colon | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("punctuation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPunctuation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("punctuation")(js.undefined)
        ret
    }
    @scala.inline
    def withWords(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(js.undefined)
        ret
    }
  }
  
}

