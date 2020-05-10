package typingsSlinky.keystonejsFileAdapters.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudinaryFileAdapterConfig extends js.Object {
  var apiKey: String = js.native
  var apiSecret: String = js.native
  var cloudName: String = js.native
  var folder: js.UndefOr[String] = js.native
}

object CloudinaryFileAdapterConfig {
  @scala.inline
  def apply(apiKey: String, apiSecret: String, cloudName: String): CloudinaryFileAdapterConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], apiSecret = apiSecret.asInstanceOf[js.Any], cloudName = cloudName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudinaryFileAdapterConfig]
  }
  @scala.inline
  implicit class CloudinaryFileAdapterConfigOps[Self <: CloudinaryFileAdapterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloudName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(js.undefined)
        ret
    }
  }
  
}

