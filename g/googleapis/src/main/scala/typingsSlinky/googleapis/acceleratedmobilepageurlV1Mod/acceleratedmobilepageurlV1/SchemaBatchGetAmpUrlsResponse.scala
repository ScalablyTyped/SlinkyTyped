package typingsSlinky.googleapis.acceleratedmobilepageurlV1Mod.acceleratedmobilepageurlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Batch AMP URL response.
  */
@js.native
trait SchemaBatchGetAmpUrlsResponse extends js.Object {
  /**
    * For each URL in BatchAmpUrlsRequest, the URL response. The response might
    * not be in the same order as URLs in the batch request. If
    * BatchAmpUrlsRequest contains duplicate URLs, AmpUrl is generated only
    * once.
    */
  var ampUrls: js.UndefOr[js.Array[SchemaAmpUrl]] = js.native
  /**
    * The errors for requested URLs that have no AMP URL.
    */
  var urlErrors: js.UndefOr[js.Array[SchemaAmpUrlError]] = js.native
}

object SchemaBatchGetAmpUrlsResponse {
  @scala.inline
  def apply(): SchemaBatchGetAmpUrlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetAmpUrlsResponse]
  }
  @scala.inline
  implicit class SchemaBatchGetAmpUrlsResponseOps[Self <: SchemaBatchGetAmpUrlsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmpUrls(value: js.Array[SchemaAmpUrl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmpUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlErrors(value: js.Array[SchemaAmpUrlError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlErrors")(js.undefined)
        ret
    }
  }
  
}

