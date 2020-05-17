package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
*/
trait ClassPropertyKind extends js.Object

object ClassPropertyKind {
  @scala.inline
  implicit def apply(value: ClassPrivateProperty): ClassPropertyKind = value.asInstanceOf[ClassPropertyKind]
  @scala.inline
  implicit def apply(value: ClassProperty): ClassPropertyKind = value.asInstanceOf[ClassPropertyKind]
}

