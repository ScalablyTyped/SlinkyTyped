package typingsSlinky.reactDashRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRouterMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.reactDashRouter.Anon_WrappedComponentRef
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type WithRouterProps[C /* <: ReactComponentClass[_] */] = js.Object | Anon_WrappedComponentRef[C]
}
