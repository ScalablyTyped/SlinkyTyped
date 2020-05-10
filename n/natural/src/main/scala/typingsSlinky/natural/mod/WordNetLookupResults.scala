package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordNetLookupResults extends js.Object {
  var gloss: String = js.native
  var lemma: String = js.native
  var pos: String = js.native
  var synonyms: js.Array[String] = js.native
  var synsetOffset: Double = js.native
}

object WordNetLookupResults {
  @scala.inline
  def apply(gloss: String, lemma: String, pos: String, synonyms: js.Array[String], synsetOffset: Double): WordNetLookupResults = {
    val __obj = js.Dynamic.literal(gloss = gloss.asInstanceOf[js.Any], lemma = lemma.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], synonyms = synonyms.asInstanceOf[js.Any], synsetOffset = synsetOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordNetLookupResults]
  }
  @scala.inline
  implicit class WordNetLookupResultsOps[Self <: WordNetLookupResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGloss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gloss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLemma(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lemma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSynonyms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synonyms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSynsetOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synsetOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

