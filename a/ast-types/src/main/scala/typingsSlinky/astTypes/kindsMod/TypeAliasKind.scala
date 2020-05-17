package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
*/
trait TypeAliasKind extends js.Object

object TypeAliasKind {
  @scala.inline
  implicit def apply(value: DeclareOpaqueType): TypeAliasKind = value.asInstanceOf[TypeAliasKind]
  @scala.inline
  implicit def apply(value: DeclareTypeAlias): TypeAliasKind = value.asInstanceOf[TypeAliasKind]
  @scala.inline
  implicit def apply(value: TypeAlias): TypeAliasKind = value.asInstanceOf[TypeAliasKind]
}

