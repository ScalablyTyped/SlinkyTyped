package typingsSlinky.ionicCore.stencilCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentDidUnload extends js.Object {
  /**
    * The component did unload and the element
    * will be destroyed.
    */
  def componentDidUnload(): Unit = js.native
}

object ComponentDidUnload {
  @scala.inline
  def apply(componentDidUnload: () => Unit): ComponentDidUnload = {
    val __obj = js.Dynamic.literal(componentDidUnload = js.Any.fromFunction0(componentDidUnload))
    __obj.asInstanceOf[ComponentDidUnload]
  }
  @scala.inline
  implicit class ComponentDidUnloadOps[Self <: ComponentDidUnload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentDidUnload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidUnload")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

