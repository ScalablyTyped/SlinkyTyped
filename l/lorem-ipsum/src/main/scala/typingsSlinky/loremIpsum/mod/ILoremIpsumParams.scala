package typingsSlinky.loremIpsum.mod

import typingsSlinky.loremIpsum.generatorMod.IPrng
import typingsSlinky.loremIpsum.loremIpsumStrings.html
import typingsSlinky.loremIpsum.loremIpsumStrings.paragraph
import typingsSlinky.loremIpsum.loremIpsumStrings.paragraphs
import typingsSlinky.loremIpsum.loremIpsumStrings.plain
import typingsSlinky.loremIpsum.loremIpsumStrings.sentence
import typingsSlinky.loremIpsum.loremIpsumStrings.sentences
import typingsSlinky.loremIpsum.loremIpsumStrings.word
import typingsSlinky.loremIpsum.loremIpsumStrings.words
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoremIpsumParams extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var format: js.UndefOr[plain | html] = js.native
  var paragraphLowerBound: js.UndefOr[Double] = js.native
  var paragraphUpperBound: js.UndefOr[Double] = js.native
  var random: js.UndefOr[IPrng] = js.native
  var sentenceLowerBound: js.UndefOr[Double] = js.native
  var sentenceUpperBound: js.UndefOr[Double] = js.native
  var suffix: js.UndefOr[String] = js.native
  var units: js.UndefOr[words | word | sentences | sentence | paragraphs | paragraph] = js.native
  var words: js.UndefOr[js.Array[String]] = js.native
}

object ILoremIpsumParams {
  @scala.inline
  def apply(): ILoremIpsumParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILoremIpsumParams]
  }
  @scala.inline
  implicit class ILoremIpsumParamsOps[Self <: ILoremIpsumParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: plain | html): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraphLowerBound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphLowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphLowerBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphLowerBound")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraphUpperBound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphUpperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphUpperBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphUpperBound")(js.undefined)
        ret
    }
    @scala.inline
    def withRandom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRandom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(js.undefined)
        ret
    }
    @scala.inline
    def withSentenceLowerBound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentenceLowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentenceLowerBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentenceLowerBound")(js.undefined)
        ret
    }
    @scala.inline
    def withSentenceUpperBound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentenceUpperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentenceUpperBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentenceUpperBound")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: words | word | sentences | sentence | paragraphs | paragraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
    @scala.inline
    def withWords(value: js.Array[String]): Self = {
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

