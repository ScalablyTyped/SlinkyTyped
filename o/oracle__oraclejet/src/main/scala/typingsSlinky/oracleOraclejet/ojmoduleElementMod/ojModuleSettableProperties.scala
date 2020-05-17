package typingsSlinky.oracleOraclejet.ojmoduleElementMod

import typingsSlinky.oracleOraclejet.anon.CleanupMode
import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojModuleSettableProperties extends JetSettableProperties {
  var animation: js.Object = js.native
  var config: CleanupMode = js.native
}

object ojModuleSettableProperties {
  @scala.inline
  def apply(animation: js.Object, config: CleanupMode): ojModuleSettableProperties = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojModuleSettableProperties]
  }
  @scala.inline
  implicit class ojModuleSettablePropertiesOps[Self <: ojModuleSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: CleanupMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

