package typingsSlinky.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CrawledUrl resource represents a URL that was crawled during a ScanRun.
  * Web Security Scanner Service crawls the web applications, following all
  * links within the scope of sites, to find the URLs to test against.
  */
@js.native
trait SchemaCrawledUrl extends js.Object {
  /**
    * Output only. The body of the request that was used to visit the URL.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * Output only. The http method of the request that was used to visit the
    * URL, in uppercase.
    */
  var httpMethod: js.UndefOr[String] = js.native
  /**
    * Output only. The URL that was crawled.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaCrawledUrl {
  @scala.inline
  def apply(): SchemaCrawledUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCrawledUrl]
  }
  @scala.inline
  implicit class SchemaCrawledUrlOps[Self <: SchemaCrawledUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

