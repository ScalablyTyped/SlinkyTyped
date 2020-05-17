package typingsSlinky.prosemirrorModel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.Node
  - typingsSlinky.prosemirrorModel.mod.DOMOutputSpecArray
*/
trait DOMOutputSpec extends js.Object

object DOMOutputSpec {
  @scala.inline
  implicit def apply(value: DOMOutputSpecArray): DOMOutputSpec = value.asInstanceOf[DOMOutputSpec]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.Node): DOMOutputSpec = value.asInstanceOf[DOMOutputSpec]
  @scala.inline
  implicit def apply(value: String): DOMOutputSpec = value.asInstanceOf[DOMOutputSpec]
}

