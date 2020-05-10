package typingsSlinky.netlifyIdentityWidget

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApiURL extends js.Object {
  var _sameOrigin: js.UndefOr[Boolean] = js.native
  var apiURL: String = js.native
  var defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]] = js.native
}

object AnonApiURL {
  @scala.inline
  def apply(apiURL: String, defaultHeaders: StringDictionary[js.UndefOr[String | js.Array[String]]]): AnonApiURL = {
    val __obj = js.Dynamic.literal(apiURL = apiURL.asInstanceOf[js.Any], defaultHeaders = defaultHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApiURL]
  }
  @scala.inline
  implicit class AnonApiURLOps[Self <: AnonApiURL] (val x: Self) extends AnyVal {
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

