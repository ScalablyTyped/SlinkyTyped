package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StringLiteralKind
import typingsSlinky.astTypes.kindsMod.TSModuleBlockKind
import typingsSlinky.astTypes.kindsMod.TSModuleDeclarationKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlobal extends js.Object {
  var body: js.UndefOr[TSModuleBlockKind | TSModuleDeclarationKind | Null] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var declare: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonGlobal {
  @scala.inline
  def apply(
    id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind,
    body: TSModuleBlockKind | TSModuleDeclarationKind = null,
    comments: js.Array[CommentKind] = null,
    declare: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    loc: SourceLocationKind = null
  ): AnonGlobal = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlobal]
  }
}

