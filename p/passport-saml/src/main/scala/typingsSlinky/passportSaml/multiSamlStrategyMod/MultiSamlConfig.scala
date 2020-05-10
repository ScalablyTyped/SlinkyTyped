package typingsSlinky.passportSaml.multiSamlStrategyMod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passportSaml.mod.SamlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSamlConfig extends SamlConfig {
  def getSamlOptions(req: Request_[ParamsDictionary, _, _, Query], callback: SamlOptionsCallback): Unit = js.native
}

object MultiSamlConfig {
  @scala.inline
  def apply(getSamlOptions: (Request_[ParamsDictionary, _, _, Query], SamlOptionsCallback) => Unit): MultiSamlConfig = {
    val __obj = js.Dynamic.literal(getSamlOptions = js.Any.fromFunction2(getSamlOptions))
    __obj.asInstanceOf[MultiSamlConfig]
  }
  @scala.inline
  implicit class MultiSamlConfigOps[Self <: MultiSamlConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetSamlOptions(value: (Request_[ParamsDictionary, _, _, Query], SamlOptionsCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSamlOptions")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

