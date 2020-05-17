package typingsSlinky.reactDnd.connectorsMod

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.RefObject[js.Any]
  - typingsSlinky.react.mod.ReactElement
  - typingsSlinky.std.Element
  - scala.Null
*/
trait ConnectableElement extends js.Object

object ConnectableElement {
  @scala.inline
  implicit def apply(value: Element): ConnectableElement = value.asInstanceOf[ConnectableElement]
  @scala.inline
  implicit def apply(value: Null): ConnectableElement = value.asInstanceOf[ConnectableElement]
  @scala.inline
  implicit def apply(value: ReactElement): ConnectableElement = value.asInstanceOf[ConnectableElement]
  @scala.inline
  implicit def apply(value: ReactRef[js.Any]): ConnectableElement = value.asInstanceOf[ConnectableElement]
}

