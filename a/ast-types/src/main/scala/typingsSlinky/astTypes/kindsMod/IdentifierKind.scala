package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter
*/
trait IdentifierKind extends js.Object

object IdentifierKind {
  @scala.inline
  implicit def apply(value: Identifier): IdentifierKind = value.asInstanceOf[IdentifierKind]
  @scala.inline
  implicit def apply(value: JSXIdentifier): IdentifierKind = value.asInstanceOf[IdentifierKind]
  @scala.inline
  implicit def apply(value: TSTypeParameter): IdentifierKind = value.asInstanceOf[IdentifierKind]
}

