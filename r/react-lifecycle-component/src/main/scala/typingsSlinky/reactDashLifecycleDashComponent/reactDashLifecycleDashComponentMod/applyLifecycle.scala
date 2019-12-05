package typingsSlinky.reactDashLifecycleDashComponent.reactDashLifecycleDashComponentMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-lifecycle-component", "applyLifecycle")
@js.native
object applyLifecycle extends js.Object {
  def apply[P, S](component: ReactComponentClass[P]): ReactComponentClass[P with (LifecycleDispatchProps[P, S])] = js.native
}

