package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListPerfSamplesResponse extends js.Object {
  /**
    * Optional, returned if result size exceeds the page size specified in the
    * request (or the default page size, 500, if unspecified). It indicates the
    * last sample timestamp to be used as page_token in subsequent request
    */
  var nextPageToken: js.UndefOr[String] = js.native
  var perfSamples: js.UndefOr[js.Array[SchemaPerfSample]] = js.native
}

object SchemaListPerfSamplesResponse {
  @scala.inline
  def apply(): SchemaListPerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPerfSamplesResponse]
  }
  @scala.inline
  implicit class SchemaListPerfSamplesResponseOps[Self <: SchemaListPerfSamplesResponse] (val x: Self) extends AnyVal {
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
    def withPerfSamples(value: js.Array[SchemaPerfSample]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfSamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerfSamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfSamples")(js.undefined)
        ret
    }
  }
  
}

