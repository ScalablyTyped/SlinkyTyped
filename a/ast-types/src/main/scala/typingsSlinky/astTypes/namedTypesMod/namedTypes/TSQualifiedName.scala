package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
trait TSQualifiedName
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var left: IdentifierKind | TSQualifiedNameKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var right: IdentifierKind | TSQualifiedNameKind
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSQualifiedName
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSQualifiedName")
@js.native
object TSQualifiedName extends TopLevel[Type[TSQualifiedName]]

