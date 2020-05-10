package typingsSlinky.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDerivatives extends js.Object {
  var derivatives: js.UndefOr[js.Array[AnonSource]] = js.native
  var examples: js.UndefOr[js.Array[AnonSource]] = js.native
  var senses: js.UndefOr[js.Array[AnonConjugations]] = js.native
  /** The words with different meanings but not related words, e.g. "go" (game) and "go" (verb). */
  var source: js.UndefOr[AnonAttribution] = js.native
}

object AnonDerivatives {
  @scala.inline
  def apply(): AnonDerivatives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDerivatives]
  }
  @scala.inline
  implicit class AnonDerivativesOps[Self <: AnonDerivatives] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDerivatives(value: js.Array[AnonSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDerivatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivatives")(js.undefined)
        ret
    }
    @scala.inline
    def withExamples(value: js.Array[AnonSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(js.undefined)
        ret
    }
    @scala.inline
    def withSenses(value: js.Array[AnonConjugations]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSenses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senses")(js.undefined)
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
  }
  
}

