package typingsSlinky.cosmiconfig

import typingsSlinky.cosmiconfig.typesMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfig extends js.Object {
  var config: Config = js.native
  var filepath: String = js.native
  var isEmpty: js.UndefOr[Boolean] = js.native
}

object AnonConfig {
  @scala.inline
  def apply(config: Config, filepath: String): AnonConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfig]
  }
  @scala.inline
  implicit class AnonConfigOps[Self <: AnonConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilepath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filepath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.undefined)
        ret
    }
  }
  
}

