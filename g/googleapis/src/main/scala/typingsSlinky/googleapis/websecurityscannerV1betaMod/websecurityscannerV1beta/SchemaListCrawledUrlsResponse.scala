package typingsSlinky.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListCrawledUrls` method.
  */
@js.native
trait SchemaListCrawledUrlsResponse extends js.Object {
  /**
    * The list of CrawledUrls returned.
    */
  var crawledUrls: js.UndefOr[js.Array[SchemaCrawledUrl]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListCrawledUrlsResponse {
  @scala.inline
  def apply(): SchemaListCrawledUrlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCrawledUrlsResponse]
  }
  @scala.inline
  implicit class SchemaListCrawledUrlsResponseOps[Self <: SchemaListCrawledUrlsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrawledUrls(value: js.Array[SchemaCrawledUrl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crawledUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawledUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crawledUrls")(js.undefined)
        ret
    }
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
  }
  
}

