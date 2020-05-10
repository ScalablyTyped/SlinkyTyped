package typingsSlinky.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mapboxGl.mapboxGlStrings.GET
import typingsSlinky.mapboxGl.mapboxGlStrings.POST
import typingsSlinky.mapboxGl.mapboxGlStrings.PUT
import typingsSlinky.mapboxGl.mapboxGlStrings.`same-origin`
import typingsSlinky.mapboxGl.mapboxGlStrings.include
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestParameters extends js.Object {
  var collectResourceTiming: js.UndefOr[Boolean] = js.native
  /**
    * Use `'include'` to send cookies with cross-origin requests.
    */
  var credentials: js.UndefOr[`same-origin` | include] = js.native
  /**
    * The headers to be sent with the request.
    */
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
  var method: js.UndefOr[GET | POST | PUT] = js.native
  /**
    * The URL to be requested.
    */
  var url: String = js.native
}

object RequestParameters {
  @scala.inline
  def apply(url: String): RequestParameters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParameters]
  }
  @scala.inline
  implicit class RequestParametersOps[Self <: RequestParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollectResourceTiming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectResourceTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectResourceTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectResourceTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: `same-origin` | include): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[js.Any]): Self = {
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
    def withMethod(value: GET | POST | PUT): Self = {
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
  }
  
}

