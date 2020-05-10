package typingsSlinky.googleapis.acceleratedmobilepageurlV1Mod.acceleratedmobilepageurlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AMP URL request for a batch of URLs.
  */
@js.native
trait SchemaBatchGetAmpUrlsRequest extends js.Object {
  /**
    * The lookup_strategy being requested.
    */
  var lookupStrategy: js.UndefOr[String] = js.native
  /**
    * List of URLs to look up for the paired AMP URLs. The URLs are
    * case-sensitive. Up to 50 URLs per lookup (see [Usage
    * Limits](/amp/cache/reference/limits)).
    */
  var urls: js.UndefOr[js.Array[String]] = js.native
}

object SchemaBatchGetAmpUrlsRequest {
  @scala.inline
  def apply(): SchemaBatchGetAmpUrlsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetAmpUrlsRequest]
  }
  @scala.inline
  implicit class SchemaBatchGetAmpUrlsRequestOps[Self <: SchemaBatchGetAmpUrlsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLookupStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(js.undefined)
        ret
    }
  }
  
}

