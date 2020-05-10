package typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Response of auto-complete query.
  */
@js.native
trait SchemaCompleteQueryResponse extends js.Object {
  /**
    * Results of the matching job/company candidates.
    */
  var completionResults: js.UndefOr[js.Array[SchemaCompletionResult]] = js.native
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.native
}

object SchemaCompleteQueryResponse {
  @scala.inline
  def apply(): SchemaCompleteQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompleteQueryResponse]
  }
  @scala.inline
  implicit class SchemaCompleteQueryResponseOps[Self <: SchemaCompleteQueryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletionResults(value: js.Array[SchemaCompletionResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: SchemaResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
  }
  
}

