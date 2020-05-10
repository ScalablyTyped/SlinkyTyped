package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClinicalCondition extends js.Object {
  /**
    * The MedGen concept id associated with this gene.
    * Search for these IDs at http://www.ncbi.nlm.nih.gov/medgen/
    */
  var conceptId: js.UndefOr[String] = js.native
  /** The set of external IDs for this condition. */
  var externalIds: js.UndefOr[js.Array[ExternalId]] = js.native
  /** A set of names for the condition. */
  var names: js.UndefOr[js.Array[String]] = js.native
  /**
    * The OMIM id for this condition.
    * Search for these IDs at http://omim.org/
    */
  var omimId: js.UndefOr[String] = js.native
}

object ClinicalCondition {
  @scala.inline
  def apply(): ClinicalCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClinicalCondition]
  }
  @scala.inline
  implicit class ClinicalConditionOps[Self <: ClinicalCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConceptId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conceptId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConceptId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conceptId")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalIds(value: js.Array[ExternalId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalIds")(js.undefined)
        ret
    }
    @scala.inline
    def withNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(js.undefined)
        ret
    }
    @scala.inline
    def withOmimId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omimId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmimId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omimId")(js.undefined)
        ret
    }
  }
  
}

