package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.InterfaceExtendsKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extends extends js.Object {
  var body: ObjectTypeAnnotationKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var `extends`: js.UndefOr[js.Array[InterfaceExtendsKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Extends {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotationKind,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    `extends`: js.UndefOr[Null | js.Array[InterfaceExtendsKind]] = js.undefined,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined
  ): Extends = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(`extends`)) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extends]
  }
}

