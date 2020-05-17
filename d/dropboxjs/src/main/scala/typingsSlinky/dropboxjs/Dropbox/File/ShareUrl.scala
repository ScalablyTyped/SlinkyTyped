package typingsSlinky.dropboxjs.Dropbox.File

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareUrl extends js.Object {
  var expiresAt: js.Date = js.native
  var isDirect: Boolean = js.native
  var isPreview: Boolean = js.native
  var url: String = js.native
  def toJSON(): js.Object = js.native
}

object ShareUrl {
  @scala.inline
  def apply(expiresAt: js.Date, isDirect: Boolean, isPreview: Boolean, toJSON: () => js.Object, url: String): ShareUrl = {
    val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], isDirect = isDirect.asInstanceOf[js.Any], isPreview = isPreview.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareUrl]
  }
  @scala.inline
  implicit class ShareUrlOps[Self <: ShareUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiresAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDirect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

