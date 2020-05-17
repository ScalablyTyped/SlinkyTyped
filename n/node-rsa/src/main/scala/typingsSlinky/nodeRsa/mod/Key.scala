package typingsSlinky.nodeRsa.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.nodeRsa.mod.KeyComponentsPrivate
  - typingsSlinky.nodeRsa.mod.KeyComponentsPublic
*/
trait Key extends js.Object

object Key {
  @scala.inline
  implicit def apply(value: Buffer): Key = value.asInstanceOf[Key]
  @scala.inline
  implicit def apply(value: KeyComponentsPrivate): Key = value.asInstanceOf[Key]
  @scala.inline
  implicit def apply(value: KeyComponentsPublic): Key = value.asInstanceOf[Key]
  @scala.inline
  implicit def apply(value: String): Key = value.asInstanceOf[Key]
}

