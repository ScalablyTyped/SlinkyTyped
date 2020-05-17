package typingsSlinky.phosphorVirtualdom.mod.h

import typingsSlinky.phosphorVirtualdom.mod.VirtualNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the supported child argument types.
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.phosphorVirtualdom.mod.VirtualNode
  - scala.Null
  - js.Array[java.lang.String | typingsSlinky.phosphorVirtualdom.mod.VirtualNode | scala.Null]
*/
trait Child extends js.Object

object Child {
  @scala.inline
  implicit def apply(value: js.Array[String | VirtualNode | Null]): Child = value.asInstanceOf[Child]
  @scala.inline
  implicit def apply(value: Null): Child = value.asInstanceOf[Child]
  @scala.inline
  implicit def apply(value: String): Child = value.asInstanceOf[Child]
  @scala.inline
  implicit def apply(value: VirtualNode): Child = value.asInstanceOf[Child]
}

