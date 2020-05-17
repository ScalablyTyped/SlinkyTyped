package typingsSlinky.netlifyIdentityWidget.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiURL extends js.Object {
  var _sameOrigin: js.UndefOr[Boolean] = js.native
  var apiURL: String = js.native
  var defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]] = js.native
}

object ApiURL {
  @scala.inline
  def apply(apiURL: String, defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]]): ApiURL = {
    val __obj = js.Dynamic.literal(apiURL = apiURL.asInstanceOf[js.Any], defaultHeaders = defaultHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiURL]
  }
  @scala.inline
  implicit class ApiURLOps[Self <: ApiURL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultHeaders(value: StringDictionary[js.UndefOr[String | js.Array[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sameOrigin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sameOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_sameOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sameOrigin")(js.undefined)
        ret
    }
  }
  
}

