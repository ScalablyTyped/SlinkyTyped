package typingsSlinky.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.rcFieldForm.interfaceMod.InternalNamePath
*/
trait NamePath extends js.Object

object NamePath {
  @scala.inline
  implicit def apply(value: Double): NamePath = value.asInstanceOf[NamePath]
  @scala.inline
  implicit def apply(value: InternalNamePath): NamePath = value.asInstanceOf[NamePath]
  @scala.inline
  implicit def apply(value: String): NamePath = value.asInstanceOf[NamePath]
}

