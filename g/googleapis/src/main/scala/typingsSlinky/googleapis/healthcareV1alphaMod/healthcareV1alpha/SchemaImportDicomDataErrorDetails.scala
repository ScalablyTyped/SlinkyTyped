package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns the errors encountered during DICOM store import.
  */
@js.native
trait SchemaImportDicomDataErrorDetails extends js.Object {
  /**
    * Contains errors encountered in imports of individual resources (e.g., a
    * Google Cloud Storage object).
    */
  var errors: js.UndefOr[js.Array[SchemaImportError]] = js.native
}

object SchemaImportDicomDataErrorDetails {
  @scala.inline
  def apply(): SchemaImportDicomDataErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportDicomDataErrorDetails]
  }
  @scala.inline
  implicit class SchemaImportDicomDataErrorDetailsOps[Self <: SchemaImportDicomDataErrorDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[SchemaImportError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
  }
  
}

