package typingsSlinky.maquette.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaquetteComponent extends js.Object {
  /**
    * A function that returns the DOM representation of the component.
    */
  def render(): js.UndefOr[VNode | Null] = js.native
}

object MaquetteComponent {
  @scala.inline
  def apply(render: () => js.UndefOr[VNode | Null]): MaquetteComponent = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[MaquetteComponent]
  }
  @scala.inline
  implicit class MaquetteComponentOps[Self <: MaquetteComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRender(value: () => js.UndefOr[VNode | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

