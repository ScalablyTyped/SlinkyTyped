package typingsSlinky.asana.mod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionInfo extends js.Object {
  var language: String = js.native
  var language_version: String = js.native
  var os: String = js.native
  var os_version: String = js.native
  var version: String = js.native
}

object VersionInfo {
  @scala.inline
  def apply(language: String, language_version: String, os: String, os_version: String, version: String): VersionInfo = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], language_version = language_version.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], os_version = os_version.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionInfo]
  }
  @scala.inline
  implicit class VersionInfoOps[Self <: VersionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

