package typingsSlinky.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConjugations extends js.Object {
  var conjugations: js.UndefOr[js.Array[AnonType]] = js.native
  var definitions: js.UndefOr[js.Array[AnonDefinition]] = js.native
  var partOfSpeech: js.UndefOr[String] = js.native
  var pronunciation: js.UndefOr[String] = js.native
  var pronunciationUrl: js.UndefOr[String] = js.native
  var source: js.UndefOr[AnonAttribution] = js.native
  var syllabification: js.UndefOr[String] = js.native
  var synonyms: js.UndefOr[js.Array[AnonSource]] = js.native
}

object AnonConjugations {
  @scala.inline
  def apply(): AnonConjugations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConjugations]
  }
  @scala.inline
  implicit class AnonConjugationsOps[Self <: AnonConjugations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConjugations(value: js.Array[AnonType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjugations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConjugations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjugations")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinitions(value: js.Array[AnonDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(js.undefined)
        ret
    }
    @scala.inline
    def withPartOfSpeech(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partOfSpeech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartOfSpeech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partOfSpeech")(js.undefined)
        ret
    }
    @scala.inline
    def withPronunciation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pronunciation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPronunciation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pronunciation")(js.undefined)
        ret
    }
    @scala.inline
    def withPronunciationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pronunciationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPronunciationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pronunciationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: AnonAttribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSyllabification(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syllabification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyllabification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syllabification")(js.undefined)
        ret
    }
    @scala.inline
    def withSynonyms(value: js.Array[AnonSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synonyms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynonyms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synonyms")(js.undefined)
        ret
    }
  }
  
}

