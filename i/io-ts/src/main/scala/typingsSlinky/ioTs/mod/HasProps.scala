package typingsSlinky.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ioTs.mod.HasPropsRefinement
  - typingsSlinky.ioTs.mod.HasPropsReadonly
  - typingsSlinky.ioTs.mod.HasPropsIntersection
  - typingsSlinky.ioTs.mod.InterfaceType[js.Any, js.Any, js.Any, js.Any]
  - typingsSlinky.ioTs.mod.StrictType[js.Any, js.Any, js.Any, js.Any]
  - typingsSlinky.ioTs.mod.PartialType[js.Any, js.Any, js.Any, js.Any]
*/
trait HasProps extends js.Object

object HasProps {
  @scala.inline
  implicit def apply(value: HasPropsIntersection): HasProps = value.asInstanceOf[HasProps]
  @scala.inline
  implicit def apply(value: HasPropsReadonly): HasProps = value.asInstanceOf[HasProps]
  @scala.inline
  implicit def apply(value: HasPropsRefinement): HasProps = value.asInstanceOf[HasProps]
  @scala.inline
  implicit def apply(value: InterfaceType[js.Any, js.Any, js.Any, js.Any]): HasProps = value.asInstanceOf[HasProps]
  @scala.inline
  implicit def apply(value: PartialType[js.Any, js.Any, js.Any, js.Any]): HasProps = value.asInstanceOf[HasProps]
  @scala.inline
  implicit def apply(value: StrictType[js.Any, js.Any, js.Any, js.Any]): HasProps = value.asInstanceOf[HasProps]
}

