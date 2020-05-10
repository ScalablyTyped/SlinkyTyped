package typingsSlinky.ngCordova.ngCordova

import typingsSlinky.cordovaPluginFileTransfer.FileDownloadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileDownloadOptions extends FileDownloadOptions {
  var encodeURI: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object IFileDownloadOptions {
  @scala.inline
  def apply(): IFileDownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileDownloadOptions]
  }
  @scala.inline
  implicit class IFileDownloadOptionsOps[Self <: IFileDownloadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncodeURI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodeURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeURI")(js.undefined)
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
  }
  
}

