package typingsSlinky.loremIpsum.generatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeneratorOptions extends js.Object {
  var random: js.UndefOr[IPrng] = js.native
  var seed: js.UndefOr[String] = js.native
  var sentencesPerParagraph: js.UndefOr[IBounds] = js.native
  var words: js.UndefOr[js.Array[String]] = js.native
  var wordsPerSentence: js.UndefOr[IBounds] = js.native
}

object IGeneratorOptions {
  @scala.inline
  def apply(): IGeneratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeneratorOptions]
  }
  @scala.inline
  implicit class IGeneratorOptionsOps[Self <: IGeneratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.undefined)
        ret
    }
    @scala.inline
    def withSentencesPerParagraph(value: IBounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentencesPerParagraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentencesPerParagraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentencesPerParagraph")(js.undefined)
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
    @scala.inline
    def withWordsPerSentence(value: IBounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordsPerSentence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordsPerSentence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordsPerSentence")(js.undefined)
        ret
    }
  }
  
}

