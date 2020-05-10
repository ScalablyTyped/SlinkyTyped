package typingsSlinky.readConfigFile.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.lazyVal.mod.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadConfigRequest extends js.Object {
  var configFilename: String = js.native
  var packageKey: String = js.native
  var packageMetadata: (Lazy[StringDictionary[_] | Null]) | Null = js.native
  var projectDir: String = js.native
}

object ReadConfigRequest {
  @scala.inline
  def apply(configFilename: String, packageKey: String, projectDir: String): ReadConfigRequest = {
    val __obj = js.Dynamic.literal(configFilename = configFilename.asInstanceOf[js.Any], packageKey = packageKey.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadConfigRequest]
  }
  @scala.inline
  implicit class ReadConfigRequestOps[Self <: ReadConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageMetadata(value: Lazy[StringDictionary[_] | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageMetadataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageMetadata")(null)
        ret
    }
  }
  
}

