package typingsSlinky.angularCommon.anon

import typingsSlinky.angularCommon.angularCommonStrings.arraybuffer
import typingsSlinky.angularCommon.angularCommonStrings.blob
import typingsSlinky.angularCommon.angularCommonStrings.json
import typingsSlinky.angularCommon.angularCommonStrings.text
import typingsSlinky.angularCommon.httpHttpMod.HttpHeaders
import typingsSlinky.angularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  var headers: js.UndefOr[HttpHeaders] = js.native
  var params: js.UndefOr[HttpParams] = js.native
  var reportProgress: js.UndefOr[Boolean] = js.native
  var responseType: js.UndefOr[arraybuffer | blob | json | text] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object Params {
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: HttpHeaders): Self = {
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
    def withParams(value: HttpParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withReportProgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseType(value: arraybuffer | blob | json | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
  }
  
}

