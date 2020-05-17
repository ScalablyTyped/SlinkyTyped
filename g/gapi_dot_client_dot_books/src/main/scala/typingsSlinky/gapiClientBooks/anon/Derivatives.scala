package typingsSlinky.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Derivatives extends js.Object {
  var derivatives: js.UndefOr[js.Array[Source]] = js.native
  var examples: js.UndefOr[js.Array[Source]] = js.native
  var senses: js.UndefOr[js.Array[Conjugations]] = js.native
  /** The words with different meanings but not related words, e.g. "go" (game) and "go" (verb). */
  var source: js.UndefOr[Attribution] = js.native
}

object Derivatives {
  @scala.inline
  def apply(): Derivatives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Derivatives]
  }
  @scala.inline
  implicit class DerivativesOps[Self <: Derivatives] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDerivatives(value: js.Array[Source]): Self = {
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
    def withExamples(value: js.Array[Source]): Self = {
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
    def withSenses(value: js.Array[Conjugations]): Self = {
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
    def withSource(value: Attribution): Self = {
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

