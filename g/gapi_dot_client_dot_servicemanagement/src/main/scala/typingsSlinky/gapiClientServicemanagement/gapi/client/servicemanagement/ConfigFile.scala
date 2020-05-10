package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigFile extends js.Object {
  /** The bytes that constitute the file. */
  var fileContents: js.UndefOr[String] = js.native
  /** The file name of the configuration file (full or relative path). */
  var filePath: js.UndefOr[String] = js.native
  /** The type of configuration file this represents. */
  var fileType: js.UndefOr[String] = js.native
}

object ConfigFile {
  @scala.inline
  def apply(): ConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigFile]
  }
  @scala.inline
  implicit class ConfigFileOps[Self <: ConfigFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileContents(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileContents")(js.undefined)
        ret
    }
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(js.undefined)
        ret
    }
    @scala.inline
    def withFileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(js.undefined)
        ret
    }
  }
  
}

