package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.ISceneComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component[T /* <: js.Function */] extends js.Object {
  var action: T = js.native
  var component: ISceneComponent = js.native
  var index: Double = js.native
}

object Component {
  @scala.inline
  def apply[T](action: T, component: ISceneComponent, index: Double): Component[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[T]]
  }
  @scala.inline
  implicit class ComponentOps[Self[t] <: Component[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAction(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: ISceneComponent): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

