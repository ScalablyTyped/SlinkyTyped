package typingsSlinky.reactDashFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import slinky.core.ReactComponentClass

  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[/* component */ CompositeComponent[TMergedProps], ReactComponentClass[TOwnProps]]
  type CompositeComponent[P] = ReactComponentClass[P] | ReactComponentClass[P]
  type InferableComponentDecorator[TOwnProps] = js.Function1[/* component */ CompositeComponent[TOwnProps], CompositeComponent[TOwnProps]]
}
