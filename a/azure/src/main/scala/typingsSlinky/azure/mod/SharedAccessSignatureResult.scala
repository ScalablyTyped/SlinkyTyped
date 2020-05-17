package typingsSlinky.azure.mod

import typingsSlinky.azure.anon.Se
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedAccessSignatureResult extends js.Object {
  var baseUrl: String = js.native
  var path: String = js.native
  var queryString: Se = js.native
  def url(): String = js.native
}

object SharedAccessSignatureResult {
  @scala.inline
  def apply(baseUrl: String, path: String, queryString: Se, url: () => String): SharedAccessSignatureResult = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[SharedAccessSignatureResult]
  }
  @scala.inline
  implicit class SharedAccessSignatureResultOps[Self <: SharedAccessSignatureResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryString(value: Se): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

