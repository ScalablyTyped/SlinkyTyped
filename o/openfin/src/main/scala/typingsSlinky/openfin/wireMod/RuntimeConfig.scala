package typingsSlinky.openfin.wireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuntimeConfig extends js.Object {
  var arguments: js.UndefOr[String] = js.native
  var fallbackVersion: js.UndefOr[String] = js.native
  var rvmDir: js.UndefOr[String] = js.native
  var securityRealm: js.UndefOr[String] = js.native
  var verboseLogging: js.UndefOr[Boolean] = js.native
  var version: String = js.native
}

object RuntimeConfig {
  @scala.inline
  def apply(version: String): RuntimeConfig = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeConfig]
  }
  @scala.inline
  implicit class RuntimeConfigOps[Self <: RuntimeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArguments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRvmDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rvmDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRvmDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rvmDir")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityRealm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRealm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityRealm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRealm")(js.undefined)
        ret
    }
    @scala.inline
    def withVerboseLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verboseLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerboseLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verboseLogging")(js.undefined)
        ret
    }
  }
  
}

