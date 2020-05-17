package typingsSlinky.jupyterlabCoreutils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Download extends js.Object {
  var download: Boolean = js.native
  var format: String = js.native
  var path: String = js.native
}

object Download {
  @scala.inline
  def apply(download: Boolean, format: String, path: String): Download = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Download]
  }
  @scala.inline
  implicit class DownloadOps[Self <: Download] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

