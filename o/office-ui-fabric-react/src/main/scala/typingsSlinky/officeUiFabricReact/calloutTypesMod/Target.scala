package typingsSlinky.officeUiFabricReact.calloutTypesMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactRef
import typingsSlinky.uifabricUtilities.ipointMod.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Element
  - java.lang.String
  - typingsSlinky.std.MouseEvent
  - typingsSlinky.uifabricUtilities.ipointMod.IPoint
  - scala.Null
  - typingsSlinky.react.mod.RefObject[typingsSlinky.std.Element]
*/
trait Target extends js.Object

object Target {
  @scala.inline
  implicit def apply(value: Element): Target = value.asInstanceOf[Target]
  @scala.inline
  implicit def apply(value: IPoint): Target = value.asInstanceOf[Target]
  @scala.inline
  implicit def apply(value: MouseEvent): Target = value.asInstanceOf[Target]
  @scala.inline
  implicit def apply(value: Null): Target = value.asInstanceOf[Target]
  @scala.inline
  implicit def apply(value: ReactRef[Element]): Target = value.asInstanceOf[Target]
  @scala.inline
  implicit def apply(value: String): Target = value.asInstanceOf[Target]
}

