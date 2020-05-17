package typingsSlinky.babylonjs.babylonjsIndexMod.babylonjsSceneAugmentingMod

import typingsSlinky.babylonjs.meshSimplificationMod.SimplificationQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scene extends js.Object {
  /** @hidden (Backing field) */
  var _simplificationQueue: SimplificationQueue = js.native
  /**
    * Gets or sets the simplification queue attached to the scene
    * @see http://doc.babylonjs.com/how_to/in-browser_mesh_simplification
    */
  var simplificationQueue: SimplificationQueue = js.native
}

object Scene {
  @scala.inline
  def apply(_simplificationQueue: SimplificationQueue, simplificationQueue: SimplificationQueue): Scene = {
    val __obj = js.Dynamic.literal(_simplificationQueue = _simplificationQueue.asInstanceOf[js.Any], simplificationQueue = simplificationQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_simplificationQueue(value: SimplificationQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_simplificationQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSimplificationQueue(value: SimplificationQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplificationQueue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

