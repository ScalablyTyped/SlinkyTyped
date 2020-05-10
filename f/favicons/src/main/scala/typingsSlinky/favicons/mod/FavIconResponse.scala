package typingsSlinky.favicons.mod

import typingsSlinky.favicons.AnonContents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FavIconResponse extends js.Object {
  var files: js.Array[AnonContents] = js.native
  var html: js.Array[String] = js.native
  var images: js.Array[AnonContents] = js.native
}

object FavIconResponse {
  @scala.inline
  def apply(files: js.Array[AnonContents], html: js.Array[String], images: js.Array[AnonContents]): FavIconResponse = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[FavIconResponse]
  }
  @scala.inline
  implicit class FavIconResponseOps[Self <: FavIconResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[AnonContents]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: js.Array[AnonContents]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

