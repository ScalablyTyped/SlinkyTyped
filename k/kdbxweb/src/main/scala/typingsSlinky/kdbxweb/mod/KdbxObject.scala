package typingsSlinky.kdbxweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.kdbxweb.mod.Entry
  - typingsSlinky.kdbxweb.mod.Group
*/
trait KdbxObject extends js.Object

object KdbxObject {
  @scala.inline
  implicit def apply(value: Entry): KdbxObject = value.asInstanceOf[KdbxObject]
  @scala.inline
  implicit def apply(value: Group): KdbxObject = value.asInstanceOf[KdbxObject]
}

