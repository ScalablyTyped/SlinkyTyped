package typingsSlinky.astTypes

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

trait AnonImportKind extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var importKind: js.UndefOr[value | `type`] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var source: LiteralKind
  var specifiers: js.UndefOr[
    js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind]
  ] = js.undefined
}

object AnonImportKind {
  @scala.inline
  def apply(
    source: LiteralKind,
    comments: js.Array[CommentKind] = null,
    importKind: value | `type` = null,
    loc: SourceLocationKind = null,
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind] = null
  ): AnonImportKind = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (importKind != null) __obj.updateDynamic("importKind")(importKind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (specifiers != null) __obj.updateDynamic("specifiers")(specifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImportKind]
  }
}

