package typingsSlinky.ractive.mod

import typingsSlinky.ractive.AnonInstantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginArgsBase extends js.Object {
  var Ractive: AnonInstantiable = js.native
}

object PluginArgsBase {
  @scala.inline
  def apply(Ractive: AnonInstantiable): PluginArgsBase = {
    val __obj = js.Dynamic.literal(Ractive = Ractive.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginArgsBase]
  }
  @scala.inline
  implicit class PluginArgsBaseOps[Self <: PluginArgsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRactive(value: AnonInstantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ractive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

