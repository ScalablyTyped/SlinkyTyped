package typingsSlinky.ionicons.stencilCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentWillLoad extends js.Object {
  /**
    * The component is about to load and it has not
    * rendered yet.
    *
    * This is the best place to make any data updates
    * before the first render.
    *
    * componentWillLoad will only be called once.
    */
  def componentWillLoad(): js.Promise[Unit] | Unit = js.native
}

object ComponentWillLoad {
  @scala.inline
  def apply(componentWillLoad: () => js.Promise[Unit] | Unit): ComponentWillLoad = {
    val __obj = js.Dynamic.literal(componentWillLoad = js.Any.fromFunction0(componentWillLoad))
    __obj.asInstanceOf[ComponentWillLoad]
  }
  @scala.inline
  implicit class ComponentWillLoadOps[Self <: ComponentWillLoad] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentWillLoad(value: () => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillLoad")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

