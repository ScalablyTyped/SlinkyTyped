package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list of diagnosis relevant to this episode of care
  */
@js.native
trait EpisodeOfCareDiagnosis extends BackboneElement {
  /**
    * Contains extended information for property 'rank'.
    */
  var _rank: js.UndefOr[Element] = js.native
  /**
    * Conditions/problems/diagnoses this episode of care is for
    */
  var condition: Reference = js.native
  /**
    * Ranking of the diagnosis (for each role type)
    */
  var rank: js.UndefOr[positiveInt] = js.native
  /**
    * Role that this diagnosis has within the episode of care (e.g. admission, billing, discharge …)
    */
  var role: js.UndefOr[CodeableConcept] = js.native
}

object EpisodeOfCareDiagnosis {
  @scala.inline
  def apply(condition: Reference): EpisodeOfCareDiagnosis = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeOfCareDiagnosis]
  }
  @scala.inline
  implicit class EpisodeOfCareDiagnosisOps[Self <: EpisodeOfCareDiagnosis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_rank(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_rank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rank")(js.undefined)
        ret
    }
    @scala.inline
    def withRank(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
  }
  
}

