package typingsSlinky.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ioTs.mod.InterfaceType[typingsSlinky.ioTs.mod.TaggedProps[Tag], A, O, js.Any]
  - typingsSlinky.ioTs.mod.StrictType[typingsSlinky.ioTs.mod.TaggedProps[Tag], A, O, js.Any]
  - typingsSlinky.ioTs.mod.TaggedRefinement[Tag, A, O]
  - typingsSlinky.ioTs.mod.TaggedUnion_[Tag, A, O]
  - typingsSlinky.ioTs.mod.TaggedIntersection[Tag, A, O]
  - typingsSlinky.ioTs.mod.TaggedExact[Tag, A, O]
  - typingsSlinky.ioTs.mod.RecursiveType[js.Any, A, O, js.Any]
*/
trait Tagged[Tag /* <: String */, A, O] extends js.Object

object Tagged {
  @scala.inline
  implicit def apply[Tag, A, O](value: InterfaceType[TaggedProps[Tag], A, O, js.Any]): Tagged[Tag, A, O] = value.asInstanceOf[Tagged[Tag, A, O]]
  @scala.inline
  implicit def apply[Tag, A, O](value: RecursiveType[js.Any, A, O, js.Any]): Tagged[Tag, A, O] = value.asInstanceOf[Tagged[Tag, A, O]]
  @scala.inline
  implicit def apply[Tag, A, O](value: StrictType[TaggedProps[Tag], A, O, js.Any]): Tagged[Tag, A, O] = value.asInstanceOf[Tagged[Tag, A, O]]
  @scala.inline
  implicit def apply[Tag, A, O](value: TaggedExact[Tag, A, O]): Tagged[Tag, A, O] = value.asInstanceOf[Tagged[Tag, A, O]]
  @scala.inline
  implicit def apply[Tag, A, O](value: TaggedIntersection[Tag, A, O]): Tagged[Tag, A, O] = value.asInstanceOf[Tagged[Tag, A, O]]
  @scala.inline
  implicit def apply[Tag, A, O](value: TaggedRefinement[Tag, A, O]): Tagged[Tag, A, O] = value.asInstanceOf[Tagged[Tag, A, O]]
  @scala.inline
  implicit def apply[Tag, A, O](value: TaggedUnion_[Tag, A, O]): Tagged[Tag, A, O] = value.asInstanceOf[Tagged[Tag, A, O]]
}

