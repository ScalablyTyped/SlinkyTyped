package typingsSlinky.googleapis.cloudtraceV1Mod.cloudtraceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for the `ListTraces` method.
  */
@js.native
trait SchemaListTracesResponse extends js.Object {
  /**
    * If defined, indicates that there are more traces that match the request
    * and that this value should be passed to the next request to continue
    * retrieving additional traces.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of trace records as specified by the view parameter.
    */
  var traces: js.UndefOr[js.Array[SchemaTrace]] = js.native
}

object SchemaListTracesResponse {
  @scala.inline
  def apply(): SchemaListTracesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTracesResponse]
  }
  @scala.inline
  implicit class SchemaListTracesResponseOps[Self <: SchemaListTracesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTraces(value: js.Array[SchemaTrace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traces")(js.undefined)
        ret
    }
  }
  
}

