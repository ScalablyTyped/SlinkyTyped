package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsListDownloadsForSelfHostedRunnerApplicationResponseItem extends js.Object {
  var architecture: String = js.native
  var download_url: String = js.native
  var filename: String = js.native
  var os: String = js.native
}

object ActionsListDownloadsForSelfHostedRunnerApplicationResponseItem {
  @scala.inline
  def apply(architecture: String, download_url: String, filename: String, os: String): ActionsListDownloadsForSelfHostedRunnerApplicationResponseItem = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], download_url = download_url.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListDownloadsForSelfHostedRunnerApplicationResponseItem]
  }
  @scala.inline
  implicit class ActionsListDownloadsForSelfHostedRunnerApplicationResponseItemOps[Self <: ActionsListDownloadsForSelfHostedRunnerApplicationResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchitecture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownload_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

