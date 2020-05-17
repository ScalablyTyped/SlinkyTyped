package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerInfoPre extends PointerInfoBase {
  /**
    * Defines the local position of the pointer on the canvas.
    */
  var localPosition: Vector2 = js.native
  /**
    * Ray from a pointer if availible (eg. 6dof controller)
    */
  var ray: Nullable[Ray] = js.native
  /**
    * Defines whether the engine should skip the next OnPointerObservable associated to this pre.
    */
  var skipOnPointerObservable: Boolean = js.native
}

object PointerInfoPre {
  @scala.inline
  def apply(
    event: PointerEvent | WheelEvent,
    localPosition: Vector2,
    skipOnPointerObservable: Boolean,
    `type`: Double
  ): PointerInfoPre = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], localPosition = localPosition.asInstanceOf[js.Any], skipOnPointerObservable = skipOnPointerObservable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerInfoPre]
  }
  @scala.inline
  implicit class PointerInfoPreOps[Self <: PointerInfoPre] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalPosition(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipOnPointerObservable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOnPointerObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRay(value: Nullable[Ray]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ray")(null)
        ret
    }
  }
  
}

