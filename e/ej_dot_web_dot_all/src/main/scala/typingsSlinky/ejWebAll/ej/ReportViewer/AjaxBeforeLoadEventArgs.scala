package typingsSlinky.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxBeforeLoadEventArgs extends js.Object {
  /** Send the custom data.
    */
  var data: js.UndefOr[String] = js.native
  /** Send the headerReq collection.
    */
  var headerReq: js.UndefOr[js.Any] = js.native
  /** Send the headers collection.
    */
  var headers: js.UndefOr[js.Any] = js.native
  /** returns the reportViewerToken.
    */
  var reportViewerToken: js.UndefOr[String] = js.native
  /** returns the serviceAuthorizationToken.
    */
  var serviceAuthorizationToken: js.UndefOr[String] = js.native
}

object AjaxBeforeLoadEventArgs {
  @scala.inline
  def apply(): AjaxBeforeLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
  }
  @scala.inline
  implicit class AjaxBeforeLoadEventArgsOps[Self <: AjaxBeforeLoadEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderReq(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerReq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderReq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerReq")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
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
    def withReportViewerToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportViewerToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportViewerToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportViewerToken")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAuthorizationToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAuthorizationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAuthorizationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAuthorizationToken")(js.undefined)
        ret
    }
  }
  
}

