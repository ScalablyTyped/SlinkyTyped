package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subdetail line items
  */
@js.native
trait ClaimResponseItemDetailSubDetail extends BackboneElement {
  /**
    * Contains extended information for property 'noteNumber'.
    */
  var _noteNumber: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[Element] = js.native
  /**
    * Subdetail level adjudication details
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.native
  /**
    * List of note numbers which apply
    */
  var noteNumber: js.UndefOr[js.Array[positiveInt]] = js.native
  /**
    * Service instance
    */
  var sequenceLinkId: positiveInt = js.native
}

object ClaimResponseItemDetailSubDetail {
  @scala.inline
  def apply(sequenceLinkId: positiveInt): ClaimResponseItemDetailSubDetail = {
    val __obj = js.Dynamic.literal(sequenceLinkId = sequenceLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseItemDetailSubDetail]
  }
  @scala.inline
  implicit class ClaimResponseItemDetailSubDetailOps[Self <: ClaimResponseItemDetailSubDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSequenceLinkId(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_noteNumber(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_noteNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_noteNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_noteNumber")(js.undefined)
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
    def withAdjudication(value: js.Array[ClaimResponseItemAdjudication]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjudication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjudication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjudication")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteNumber(value: js.Array[positiveInt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteNumber")(js.undefined)
        ret
    }
  }
  
}

