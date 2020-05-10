package typingsSlinky.openfin.nixLaunchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OsConfig extends js.Object {
  var executablePath: String = js.native
  var manifestLocation: String = js.native
  var namedPipeName: String = js.native
  var urlPath: String = js.native
}

object OsConfig {
  @scala.inline
  def apply(executablePath: String, manifestLocation: String, namedPipeName: String, urlPath: String): OsConfig = {
    val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any], manifestLocation = manifestLocation.asInstanceOf[js.Any], namedPipeName = namedPipeName.asInstanceOf[js.Any], urlPath = urlPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OsConfig]
  }
  @scala.inline
  implicit class OsConfigOps[Self <: OsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutablePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executablePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifestLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamedPipeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedPipeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

