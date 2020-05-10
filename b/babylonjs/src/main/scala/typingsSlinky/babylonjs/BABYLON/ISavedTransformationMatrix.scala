package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@js.native
trait ISavedTransformationMatrix extends js.Object {
  var viewProjection: Matrix = js.native
  var world: Matrix = js.native
}

object ISavedTransformationMatrix {
  @scala.inline
  def apply(viewProjection: Matrix, world: Matrix): ISavedTransformationMatrix = {
    val __obj = js.Dynamic.literal(viewProjection = viewProjection.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISavedTransformationMatrix]
  }
  @scala.inline
  implicit class ISavedTransformationMatrixOps[Self <: ISavedTransformationMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViewProjection(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewProjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorld(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("world")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

