package typingsSlinky.expoFileSystem.fileSystemTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadPauseState extends js.Object {
  var fileUri: String = js.native
  var options: DownloadOptions = js.native
  var resumeData: js.UndefOr[String] = js.native
  var url: String = js.native
}

object DownloadPauseState {
  @scala.inline
  def apply(fileUri: String, options: DownloadOptions, url: String): DownloadPauseState = {
    val __obj = js.Dynamic.literal(fileUri = fileUri.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadPauseState]
  }
  @scala.inline
  implicit class DownloadPauseStateOps[Self <: DownloadPauseState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: DownloadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResumeData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumeData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeData")(js.undefined)
        ret
    }
  }
  
}

