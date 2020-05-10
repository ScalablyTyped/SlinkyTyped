package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CigarUnit extends js.Object {
  var operation: js.UndefOr[String] = js.native
  /** The number of genomic bases that the operation runs for. Required. */
  var operationLength: js.UndefOr[String] = js.native
  /**
    * `referenceSequence` is only used at mismatches
    * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
    * Filling this field replaces SAM's MD tag. If the relevant information is
    * not available, this field is unset.
    */
  var referenceSequence: js.UndefOr[String] = js.native
}

object CigarUnit {
  @scala.inline
  def apply(): CigarUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CigarUnit]
  }
  @scala.inline
  implicit class CigarUnitOps[Self <: CigarUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationLength")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceSequence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSequence")(js.undefined)
        ret
    }
  }
  
}

