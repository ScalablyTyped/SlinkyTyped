package typingsSlinky.babylonjs.sceneComponentMod

import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISceneComponent extends js.Object {
  /**
    * The name of the component. Each component must have a unique name.
    */
  var name: String = js.native
  /**
    * The scene the component belongs to.
    */
  var scene: Scene = js.native
  /**
    * Disposes the component and the associated ressources.
    */
  def dispose(): Unit = js.native
  /**
    * Rebuilds the elements related to this component in case of
    * context lost for instance.
    */
  def rebuild(): Unit = js.native
  /**
    * Register the component to one instance of a scene.
    */
  def register(): Unit = js.native
}

object ISceneComponent {
  @scala.inline
  def apply(dispose: () => Unit, name: String, rebuild: () => Unit, register: () => Unit, scene: Scene): ISceneComponent = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneComponent]
  }
  @scala.inline
  implicit class ISceneComponentOps[Self <: ISceneComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRebuild(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebuild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegister(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

