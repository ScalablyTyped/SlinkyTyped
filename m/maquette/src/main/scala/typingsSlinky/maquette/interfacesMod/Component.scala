package typingsSlinky.maquette.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends js.Object {
  def renderMaquette(): js.UndefOr[VNode | Null] = js.native
}

object Component {
  @scala.inline
  def apply(renderMaquette: () => js.UndefOr[VNode | Null]): Component = {
    val __obj = js.Dynamic.literal(renderMaquette = js.Any.fromFunction0(renderMaquette))
    __obj.asInstanceOf[Component]
  }
  @scala.inline
  implicit class ComponentOps[Self <: Component] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderMaquette(value: () => js.UndefOr[VNode | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMaquette")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

