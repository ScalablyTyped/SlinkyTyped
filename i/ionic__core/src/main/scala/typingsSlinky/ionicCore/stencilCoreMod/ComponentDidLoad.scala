package typingsSlinky.ionicCore.stencilCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentDidLoad extends js.Object {
  /**
    * The component has loaded and has already rendered.
    *
    * Updating data in this method will cause the
    * component to re-render.
    *
    * componentDidLoad will only be called once.
    */
  def componentDidLoad(): Unit = js.native
}

object ComponentDidLoad {
  @scala.inline
  def apply(componentDidLoad: () => Unit): ComponentDidLoad = {
    val __obj = js.Dynamic.literal(componentDidLoad = js.Any.fromFunction0(componentDidLoad))
    __obj.asInstanceOf[ComponentDidLoad]
  }
  @scala.inline
  implicit class ComponentDidLoadOps[Self <: ComponentDidLoad] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentDidLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidLoad")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

