package typingsSlinky.pulumiCloud.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServeStaticOptions extends js.Object {
  /**
    * The `content-type` to serve the file as.  Only valid when localPath points to a file.  If
    * localPath points to a directory, the content types for all files will be inferred.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * By default API.static will also serve 'index.html' in response to a request on a
    * directory. To disable this set false or to supply a new index pass a string.
    */
  var index: js.UndefOr[Boolean | String] = js.native
}

object ServeStaticOptions {
  @scala.inline
  def apply(): ServeStaticOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServeStaticOptions]
  }
  @scala.inline
  implicit class ServeStaticOptionsOps[Self <: ServeStaticOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

