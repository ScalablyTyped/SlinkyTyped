package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
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
trait Method[T] extends js.Object {
  var body: js.UndefOr[T | Null] = js.native
  var headers: js.UndefOr[HttpHeaders] = js.native
  var method: js.UndefOr[String] = js.native
  var params: js.UndefOr[HttpParams] = js.native
  var reportProgress: js.UndefOr[Boolean] = js.native
  var responseType: js.UndefOr[arraybuffer | blob | json | text] = js.native
  var setHeaders: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  var setParams: js.UndefOr[StringDictionary[String]] = js.native
  var url: js.UndefOr[String] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object Method {
  @scala.inline
  def apply[T](): Method[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Method[T]]
  }
  @scala.inline
  implicit class MethodOps[Self[t] <: Method[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBody(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(null)
        ret
    }
    @scala.inline
    def withHeaders(value: HttpHeaders): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: HttpParams): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withReportProgress(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportProgress: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseType(value: arraybuffer | blob | json | text): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeaders(value: StringDictionary[String | js.Array[String]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetHeaders: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withSetParams(value: StringDictionary[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetParams: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParams")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
  }
  
}

