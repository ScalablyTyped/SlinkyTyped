package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Processing errors
  */
@js.native
trait ClaimResponseError extends BackboneElement {
  /**
    * Contains extended information for property 'detailSequenceLinkId'.
    */
  var _detailSequenceLinkId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'subdetailSequenceLinkId'.
    */
  var _subdetailSequenceLinkId: js.UndefOr[Element] = js.native
  /**
    * Error code detailing processing issues
    */
  var code: CodeableConcept = js.native
  /**
    * Detail sequence number
    */
  var detailSequenceLinkId: js.UndefOr[positiveInt] = js.native
  /**
    * Item sequence number
    */
  var sequenceLinkId: js.UndefOr[positiveInt] = js.native
  /**
    * Subdetail sequence number
    */
  var subdetailSequenceLinkId: js.UndefOr[positiveInt] = js.native
}

object ClaimResponseError {
  @scala.inline
  def apply(code: CodeableConcept): ClaimResponseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseError]
  }
  @scala.inline
  implicit class ClaimResponseErrorOps[Self <: ClaimResponseError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_detailSequenceLinkId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_detailSequenceLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_detailSequenceLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_detailSequenceLinkId")(js.undefined)
        ret
    }
    @scala.inline
    def with_sequenceLinkId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sequenceLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_sequenceLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sequenceLinkId")(js.undefined)
        ret
    }
    @scala.inline
    def with_subdetailSequenceLinkId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subdetailSequenceLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_subdetailSequenceLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_subdetailSequenceLinkId")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailSequenceLinkId(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailSequenceLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailSequenceLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailSequenceLinkId")(js.undefined)
        ret
    }
    @scala.inline
    def withSequenceLinkId(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequenceLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceLinkId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubdetailSequenceLinkId(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdetailSequenceLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdetailSequenceLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdetailSequenceLinkId")(js.undefined)
        ret
    }
  }
  
}

