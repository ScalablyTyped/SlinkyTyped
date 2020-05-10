package typingsSlinky.nodeDownloaderHelper.mod

import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
   // Custom HTTP Header ex: Authorization, User-Agent
  var fileName: js.UndefOr[String] = js.native
   // Custom filename when saved
  var forceResume: js.UndefOr[Boolean] = js.native
   // Request Method Verb
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
   // if true it will override the file, otherwise will append '(number)' to the end of file
  var httpRequestOptions: js.UndefOr[RequestOptions] = js.native
   // Override the http request options
  var httpsRequestOptions: js.UndefOr[typingsSlinky.node.httpsMod.RequestOptions] = js.native
  var method: js.UndefOr[String] = js.native
   // If the server does not return the "accept-ranges" header, can be force if it does support it
  var `override`: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withForceResume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceResume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceResume")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: OutgoingHttpHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpRequestOptions(value: RequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRequestOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpRequestOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRequestOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpsRequestOptions(value: typingsSlinky.node.httpsMod.RequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsRequestOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpsRequestOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsRequestOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withOverride(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(js.undefined)
        ret
    }
  }
  
}

