package typingsSlinky.awsSdkSharedIniFileLoader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedConfigFiles extends js.Object {
  var configFile: ParsedIniData = js.native
  var credentialsFile: ParsedIniData = js.native
}

object SharedConfigFiles {
  @scala.inline
  def apply(configFile: ParsedIniData, credentialsFile: ParsedIniData): SharedConfigFiles = {
    val __obj = js.Dynamic.literal(configFile = configFile.asInstanceOf[js.Any], credentialsFile = credentialsFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedConfigFiles]
  }
  @scala.inline
  implicit class SharedConfigFilesOps[Self <: SharedConfigFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigFile(value: ParsedIniData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentialsFile(value: ParsedIniData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialsFile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

