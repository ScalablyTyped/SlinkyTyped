package typingsSlinky.reactRouter

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrappedComponentRef[C /* <: ReactComponentClass[_] */] extends js.Object {
  var wrappedComponentRef: js.UndefOr[Ref[InstanceType[C]]] = js.undefined
}

object AnonWrappedComponentRef {
  @scala.inline
  def apply[C /* <: ReactComponentClass[_] */](wrappedComponentRef: Ref[InstanceType[C]] = null): AnonWrappedComponentRef[C] = {
    val __obj = js.Dynamic.literal()
    if (wrappedComponentRef != null) __obj.updateDynamic("wrappedComponentRef")(wrappedComponentRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWrappedComponentRef[C]]
  }
}

