package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.astTypesStrings.`type`
import typingsSlinky.astTypes.astTypesStrings.value
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ImportDefaultSpecifierKind
import typingsSlinky.astTypes.kindsMod.ImportNamespaceSpecifierKind
import typingsSlinky.astTypes.kindsMod.ImportSpecifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait ImportDeclaration extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var importKind: value | `type`
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var source: LiteralKind
  var specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind]
  var `type`: typingsSlinky.astTypes.astTypesStrings.ImportDeclaration
}

object ImportDeclaration {
  @scala.inline
  def apply(
    importKind: value | `type`,
    source: LiteralKind,
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ImportDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ImportDeclaration = {
    val __obj = js.Dynamic.literal(importKind = importKind.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDeclaration]
  }
}

