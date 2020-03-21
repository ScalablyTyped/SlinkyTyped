package typingsSlinky.reactRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Omit[T, K /* <: java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[java.lang.String, K]]
  type WithRouterProps[C /* <: slinky.core.ReactComponentClass[_] */] = js.Object | typingsSlinky.reactRouter.AnonWrappedComponentRef[C]
}
