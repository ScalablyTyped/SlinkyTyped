package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCommon.angularCommonStrings.response
import typingsSlinky.angularCommon.angularCommonStrings.text
import typingsSlinky.angularCommon.httpHttpMod.HttpHeaders
import typingsSlinky.angularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseTypeWithCredentials extends js.Object {
  var body: js.UndefOr[js.Any] = js.native
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.native
  var observe: response = js.native
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.native
  var reportProgress: js.UndefOr[Boolean] = js.native
  var responseType: text = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object ResponseTypeWithCredentials {
  @scala.inline
  def apply(observe: response, responseType: text): ResponseTypeWithCredentials = {
    val __obj = js.Dynamic.literal(observe = observe.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseTypeWithCredentials]
  }
  @scala.inline
  implicit class ResponseTypeWithCredentialsOps[Self <: ResponseTypeWithCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObserve(value: response): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseType(value: text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: js.Any): Self = {
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
    def withHeaders(value: HttpHeaders | (StringDictionary[String | js.Array[String]])): Self = {
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
    def withParams(value: HttpParams | (StringDictionary[String | js.Array[String]])): Self = {
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

