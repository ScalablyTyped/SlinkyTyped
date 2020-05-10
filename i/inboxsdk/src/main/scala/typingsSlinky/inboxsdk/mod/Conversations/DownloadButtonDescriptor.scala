package typingsSlinky.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadButtonDescriptor extends js.Object {
  var downloadFilename: js.UndefOr[String] = js.native
  var downloadUrl: String = js.native
  var openInNewTab: js.UndefOr[Boolean] = js.native
  def onClick(event: js.Any): Unit = js.native
}

object DownloadButtonDescriptor {
  @scala.inline
  def apply(downloadUrl: String, onClick: js.Any => Unit): DownloadButtonDescriptor = {
    val __obj = js.Dynamic.literal(downloadUrl = downloadUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[DownloadButtonDescriptor]
  }
  @scala.inline
  implicit class DownloadButtonDescriptorOps[Self <: DownloadButtonDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDownloadFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenInNewTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInNewTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenInNewTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInNewTab")(js.undefined)
        ret
    }
  }
  
}

