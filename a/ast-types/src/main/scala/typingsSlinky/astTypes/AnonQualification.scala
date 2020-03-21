package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.QualifiedTypeIdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQualification extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var qualification: IdentifierKind | QualifiedTypeIdentifierKind
}

object AnonQualification {
  @scala.inline
  def apply(
    id: IdentifierKind,
    qualification: IdentifierKind | QualifiedTypeIdentifierKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonQualification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQualification]
  }
}

