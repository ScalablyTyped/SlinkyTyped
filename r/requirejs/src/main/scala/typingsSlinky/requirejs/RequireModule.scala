package typingsSlinky.requirejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// todo: not sure what to do with this guy
@js.native
trait RequireModule extends js.Object {
  /**
  	*
  	**/
  def config(): js.Object = js.native
}

object RequireModule {
  @scala.inline
  def apply(config: () => js.Object): RequireModule = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction0(config))
    __obj.asInstanceOf[RequireModule]
  }
  @scala.inline
  implicit class RequireModuleOps[Self <: RequireModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

