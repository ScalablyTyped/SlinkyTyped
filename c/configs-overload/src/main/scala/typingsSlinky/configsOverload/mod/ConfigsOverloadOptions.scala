package typingsSlinky.configsOverload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigsOverloadOptions extends js.Object {
  var defaultEnv: js.UndefOr[String] = js.native
  var env: js.UndefOr[String] = js.native
}

object ConfigsOverloadOptions {
  @scala.inline
  def apply(): ConfigsOverloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigsOverloadOptions]
  }
  @scala.inline
  implicit class ConfigsOverloadOptionsOps[Self <: ConfigsOverloadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEnv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEnv")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
  }
  
}

