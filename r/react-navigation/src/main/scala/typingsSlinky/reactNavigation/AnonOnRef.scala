package typingsSlinky.reactNavigation

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnRef[T /* <: ReactComponentClass[P] */] extends js.Object {
  var onRef: js.UndefOr[Ref[InstanceType[T]]] = js.undefined
}

object AnonOnRef {
  @scala.inline
  def apply[T /* <: ReactComponentClass[P] */](onRef: Ref[InstanceType[T]] = null): AnonOnRef[T] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnRef[T]]
  }
}

