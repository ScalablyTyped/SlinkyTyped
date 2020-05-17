package typingsSlinky.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]]
  - js.Tuple2[
typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any])]
  - js.Tuple3[
typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any])]
  - js.Tuple4[
typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any])]
  - js.Tuple5[
typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any])]
*/
trait TaggedIntersectionArgument[Tag /* <: String */] extends js.Object

object TaggedIntersectionArgument {
  @scala.inline
  implicit def apply[Tag](value: js.Array[Tagged[Tag, js.Any, js.Any]]): TaggedIntersectionArgument[Tag] = value.asInstanceOf[TaggedIntersectionArgument[Tag]]
  @scala.inline
  implicit def apply[Tag](value: js.Tuple2[Mixed_ | (Tagged[Tag, js.Any, js.Any]), Mixed_ | (Tagged[Tag, js.Any, js.Any])]): TaggedIntersectionArgument[Tag] = value.asInstanceOf[TaggedIntersectionArgument[Tag]]
  @scala.inline
  implicit def apply[Tag](
    value: js.Tuple3[
      Mixed_ | (Tagged[Tag, js.Any, js.Any]), 
      Mixed_ | (Tagged[Tag, js.Any, js.Any]), 
      Mixed_ | (Tagged[Tag, js.Any, js.Any])
    ]
  ): TaggedIntersectionArgument[Tag] = value.asInstanceOf[TaggedIntersectionArgument[Tag]]
  @scala.inline
  implicit def apply[Tag](
    value: js.Tuple4[
      Mixed_ | (Tagged[Tag, js.Any, js.Any]), 
      Mixed_ | (Tagged[Tag, js.Any, js.Any]), 
      Mixed_ | (Tagged[Tag, js.Any, js.Any]), 
      Mixed_ | (Tagged[Tag, js.Any, js.Any])
    ]
  ): TaggedIntersectionArgument[Tag] = value.asInstanceOf[TaggedIntersectionArgument[Tag]]
  @scala.inline
  implicit def apply[Tag](
    value: js.Tuple5[
      Mixed_ | (Tagged[Tag, js.Any, js.Any]), 
      Mixed_ | (Tagged[Tag, js.Any, js.Any]), 
      Mixed_ | (Tagged[Tag, js.Any, js.Any]), 
      Mixed_ | (Tagged[Tag, js.Any, js.Any]), 
      Mixed_ | (Tagged[Tag, js.Any, js.Any])
    ]
  ): TaggedIntersectionArgument[Tag] = value.asInstanceOf[TaggedIntersectionArgument[Tag]]
}

