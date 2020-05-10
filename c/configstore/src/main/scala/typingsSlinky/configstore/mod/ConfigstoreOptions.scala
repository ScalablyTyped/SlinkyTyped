package typingsSlinky.configstore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigstoreOptions extends js.Object {
  var configPath: js.UndefOr[String] = js.native
  var globalConfigPath: js.UndefOr[Boolean] = js.native
}

object ConfigstoreOptions {
  @scala.inline
  def apply(): ConfigstoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigstoreOptions]
  }
  @scala.inline
  implicit class ConfigstoreOptionsOps[Self <: ConfigstoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configPath")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalConfigPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalConfigPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalConfigPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalConfigPath")(js.undefined)
        ret
    }
  }
  
}

