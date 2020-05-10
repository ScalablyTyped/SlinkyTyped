package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Use SearchJobsRequest.histogram_facets instead to make a single
  * call with both search and histogram.  Output only.  The response of the
  * GetHistogram method.
  */
@js.native
trait SchemaGetHistogramResponse extends js.Object {
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.native
  /**
    * The Histogram results.
    */
  var results: js.UndefOr[js.Array[SchemaHistogramResult]] = js.native
}

object SchemaGetHistogramResponse {
  @scala.inline
  def apply(): SchemaGetHistogramResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetHistogramResponse]
  }
  @scala.inline
  implicit class SchemaGetHistogramResponseOps[Self <: SchemaGetHistogramResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withResults(value: js.Array[SchemaHistogramResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
  }
  
}

