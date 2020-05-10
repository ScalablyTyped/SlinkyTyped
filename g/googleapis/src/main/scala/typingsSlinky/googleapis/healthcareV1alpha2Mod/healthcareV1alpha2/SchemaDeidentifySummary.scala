package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a detailed summary of the Deidentify operation.
  */
@js.native
trait SchemaDeidentifySummary extends js.Object {
  /**
    * Number of resources successfully processed.
    */
  var successResourceCount: js.UndefOr[String] = js.native
  /**
    * Number of stores successfully processed.
    */
  var successStoreCount: js.UndefOr[String] = js.native
}

object SchemaDeidentifySummary {
  @scala.inline
  def apply(): SchemaDeidentifySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifySummary]
  }
  @scala.inline
  implicit class SchemaDeidentifySummaryOps[Self <: SchemaDeidentifySummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

