package typingsSlinky.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultComponents extends js.Object {
  var position: Component[Coordinate, System[_]] = js.native
  var rotation: Component[Coordinate, System[_]] = js.native
  var scale: Component[Coordinate, System[_]] = js.native
}

object DefaultComponents {
  @scala.inline
  def apply(
    position: Component[Coordinate, System[_]],
    rotation: Component[Coordinate, System[_]],
    scale: Component[Coordinate, System[_]]
  ): DefaultComponents = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponents]
  }
  @scala.inline
  implicit class DefaultComponentsOps[Self <: DefaultComponents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: Component[Coordinate, System[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Component[Coordinate, System[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Component[Coordinate, System[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

