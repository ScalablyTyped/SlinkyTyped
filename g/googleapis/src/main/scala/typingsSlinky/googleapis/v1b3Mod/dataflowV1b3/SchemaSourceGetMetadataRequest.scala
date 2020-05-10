package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to compute the SourceMetadata of a Source.
  */
@js.native
trait SchemaSourceGetMetadataRequest extends js.Object {
  /**
    * Specification of the source whose metadata should be computed.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaSourceGetMetadataRequest {
  @scala.inline
  def apply(): SchemaSourceGetMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceGetMetadataRequest]
  }
  @scala.inline
  implicit class SchemaSourceGetMetadataRequestOps[Self <: SchemaSourceGetMetadataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: SchemaSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

