package typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the status of the Deidentify operation.
  */
@js.native
trait SchemaDeidentifyErrorDetails extends js.Object {
  /**
    * Number of resources failed to process.
    */
  var failureResourceCount: js.UndefOr[String] = js.native
  /**
    * Number of stores failed to process.
    */
  var failureStoreCount: js.UndefOr[String] = js.native
  /**
    * Number of resources successfully processed.
    */
  var successResourceCount: js.UndefOr[String] = js.native
  /**
    * Number of stores successfully processed.
    */
  var successStoreCount: js.UndefOr[String] = js.native
}

object SchemaDeidentifyErrorDetails {
  @scala.inline
  def apply(): SchemaDeidentifyErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifyErrorDetails]
  }
  @scala.inline
  implicit class SchemaDeidentifyErrorDetailsOps[Self <: SchemaDeidentifyErrorDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailureResourceCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureResourceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureResourceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureResourceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureStoreCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureStoreCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureStoreCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureStoreCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessResourceCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successResourceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessResourceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successResourceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessStoreCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successStoreCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessStoreCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successStoreCount")(js.undefined)
        ret
    }
  }
  
}

