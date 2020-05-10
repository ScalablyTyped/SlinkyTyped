package typingsSlinky.reactFilepond.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactFilepond.reactFilepondStrings.DELETE
import typingsSlinky.reactFilepond.reactFilepondStrings.GET
import typingsSlinky.reactFilepond.reactFilepondStrings.POST
import typingsSlinky.reactFilepond.reactFilepondStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerUrl extends js.Object {
  var headers: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.native
  var method: js.UndefOr[GET | POST | PUT | DELETE] = js.native
  /**
    * Called with the formdata object right before it is sent,
    * return extended formdata object to make changes
    */
  var ondata: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  /**
    * Called when server error is received, receives the response
    * body, useful to select the relevant error data
    */
  var onerror: js.UndefOr[js.Function1[/* responseBody */ js.Any, _]] = js.native
  /**
    * Called when server response is received, useful for getting
    * the unique file id from the server response
    */
  var onload: js.UndefOr[js.Function0[_]] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var url: String = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object ServerUrl {
  @scala.inline
  def apply(url: String): ServerUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerUrl]
  }
  @scala.inline
  implicit class ServerUrlOps[Self <: ServerUrl] (val x: Self) extends AnyVal {
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
    def withHeaders(value: StringDictionary[String | Boolean | Double]): Self = {
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
    def withMethod(value: GET | POST | PUT | DELETE): Self = {
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
    def withOndata(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOndata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondata")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(value: /* responseBody */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnload(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
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

