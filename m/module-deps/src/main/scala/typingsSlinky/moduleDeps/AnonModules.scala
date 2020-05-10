package typingsSlinky.moduleDeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonModules extends js.Object {
  var modules: js.Any = js.native
}

object AnonModules {
  @scala.inline
  def apply(modules: js.Any): AnonModules = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModules]
  }
  @scala.inline
  implicit class AnonModulesOps[Self <: AnonModules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModules(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

