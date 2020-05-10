package typingsSlinky.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeURLOptions extends js.Object {
  var download: js.UndefOr[Boolean] = js.native
  var downloadHack: js.UndefOr[Boolean] = js.native
  var long: js.UndefOr[Boolean] = js.native
  var longUrl: js.UndefOr[Boolean] = js.native
}

object MakeURLOptions {
  @scala.inline
  def apply(): MakeURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeURLOptions]
  }
  @scala.inline
  implicit class MakeURLOptionsOps[Self <: MakeURLOptions] (val x: Self) extends AnyVal {
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
    def withoutDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadHack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadHack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadHack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadHack")(js.undefined)
        ret
    }
    @scala.inline
    def withLong(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(js.undefined)
        ret
    }
    @scala.inline
    def withLongUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longUrl")(js.undefined)
        ret
    }
  }
  
}

