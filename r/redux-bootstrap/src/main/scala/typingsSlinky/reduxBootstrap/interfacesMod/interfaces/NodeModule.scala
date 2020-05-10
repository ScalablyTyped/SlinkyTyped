package typingsSlinky.reduxBootstrap.interfacesMod.interfaces

import typingsSlinky.reduxBootstrap.AnonAccept
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeModule extends js.Object {
  var hot: AnonAccept = js.native
}

object NodeModule {
  @scala.inline
  def apply(hot: AnonAccept): NodeModule = {
    val __obj = js.Dynamic.literal(hot = hot.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeModule]
  }
  @scala.inline
  implicit class NodeModuleOps[Self <: NodeModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHot(value: AnonAccept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

