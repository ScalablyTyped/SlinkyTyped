package typingsSlinky.reactFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[
    /* component */ typingsSlinky.reactFns.typesMod.CompositeComponent[TMergedProps], 
    slinky.core.ReactComponentClass[TOwnProps]
  ]
  type CompositeComponent[P] = slinky.core.ReactComponentClass[P] | slinky.core.ReactComponentClass[P]
  type InferableComponentDecorator[TOwnProps] = js.Function1[
    /* component */ typingsSlinky.reactFns.typesMod.CompositeComponent[TOwnProps], 
    typingsSlinky.reactFns.typesMod.CompositeComponent[TOwnProps]
  ]
}
