package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebXRMotionControllerComponentChangesValues[T] extends js.Object {
  /**
    * current (this frame) value
    */
  var current: T = js.native
  /**
    * previous (last change) value
    */
  var previous: T = js.native
}

object IWebXRMotionControllerComponentChangesValues {
  @scala.inline
  def apply[T](current: T, previous: T): IWebXRMotionControllerComponentChangesValues[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRMotionControllerComponentChangesValues[T]]
  }
  @scala.inline
  implicit class IWebXRMotionControllerComponentChangesValuesOps[Self[t] <: IWebXRMotionControllerComponentChangesValues[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCurrent(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

