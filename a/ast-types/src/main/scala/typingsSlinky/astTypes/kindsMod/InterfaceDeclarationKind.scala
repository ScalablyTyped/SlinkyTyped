package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface
import typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass
*/
trait InterfaceDeclarationKind extends js.Object

object InterfaceDeclarationKind {
  @scala.inline
  implicit def apply(value: DeclareClass): InterfaceDeclarationKind = value.asInstanceOf[InterfaceDeclarationKind]
  @scala.inline
  implicit def apply(value: DeclareInterface): InterfaceDeclarationKind = value.asInstanceOf[InterfaceDeclarationKind]
  @scala.inline
  implicit def apply(value: InterfaceDeclaration): InterfaceDeclarationKind = value.asInstanceOf[InterfaceDeclarationKind]
}

