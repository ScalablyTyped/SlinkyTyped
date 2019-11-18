package typingsSlinky.reactDashNavigation

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnRef[T /* <: ReactComponentClass[P] */] extends js.Object {
  var onRef: js.UndefOr[Ref[InstanceType[T]]] = js.undefined
}

object Anon_OnRef {
  @scala.inline
  def apply[T /* <: ReactComponentClass[P] */](onRef: Ref[InstanceType[T]] = null): Anon_OnRef[T] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnRef[T]]
  }
}

