package typingsSlinky.reduxBootstrap.interfacesMod.interfaces

import typingsSlinky.reduxBootstrap.anon.Accept
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeModule extends js.Object {
  var hot: Accept = js.native
}

object NodeModule {
  @scala.inline
  def apply(hot: Accept): NodeModule = {
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
    def withHot(value: Accept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

