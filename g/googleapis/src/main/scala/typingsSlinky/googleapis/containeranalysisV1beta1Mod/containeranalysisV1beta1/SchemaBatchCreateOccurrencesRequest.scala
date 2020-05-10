package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create occurrences in batch.
  */
@js.native
trait SchemaBatchCreateOccurrencesRequest extends js.Object {
  /**
    * The occurrences to create. Max allowed length is 1000.
    */
  var occurrences: js.UndefOr[js.Array[SchemaOccurrence]] = js.native
}

object SchemaBatchCreateOccurrencesRequest {
  @scala.inline
  def apply(): SchemaBatchCreateOccurrencesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateOccurrencesRequest]
  }
  @scala.inline
  implicit class SchemaBatchCreateOccurrencesRequestOps[Self <: SchemaBatchCreateOccurrencesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOccurrences(value: js.Array[SchemaOccurrence]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrences")(js.undefined)
        ret
    }
  }
  
}

