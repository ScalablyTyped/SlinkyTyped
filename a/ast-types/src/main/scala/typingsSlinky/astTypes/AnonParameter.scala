package typingsSlinky.astTypes

import typingsSlinky.astTypes.astTypesStrings.`private`
import typingsSlinky.astTypes.astTypesStrings.`protected`
import typingsSlinky.astTypes.astTypesStrings.public
import typingsSlinky.astTypes.kindsMod.AssignmentPatternKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParameter extends js.Object {
  var accessibility: js.UndefOr[public | `private` | `protected`] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var parameter: IdentifierKind | AssignmentPatternKind
  var readonly: js.UndefOr[Boolean] = js.undefined
}

object AnonParameter {
  @scala.inline
  def apply(
    parameter: IdentifierKind | AssignmentPatternKind,
    accessibility: public | `private` | `protected` = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    readonly: js.UndefOr[Boolean] = js.undefined
  ): AnonParameter = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParameter]
  }
}

