package typingsSlinky.rcResizeObserver.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactInstance
  - typingsSlinky.std.HTMLElement
  - scala.Null
*/
trait RefNode extends js.Object

object RefNode {
  @scala.inline
  implicit def apply(value: HTMLElement): RefNode = value.asInstanceOf[RefNode]
  @scala.inline
  implicit def apply(value: Null): RefNode = value.asInstanceOf[RefNode]
  @scala.inline
  implicit def apply(value: ReactInstance): RefNode = value.asInstanceOf[RefNode]
}

