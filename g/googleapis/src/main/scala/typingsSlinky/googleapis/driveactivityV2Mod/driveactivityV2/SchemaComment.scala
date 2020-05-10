package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A change about comments on an object.
  */
@js.native
trait SchemaComment extends js.Object {
  /**
    * A change on an assignment.
    */
  var assignment: js.UndefOr[SchemaAssignment] = js.native
  /**
    * Users who are mentioned in this comment.
    */
  var mentionedUsers: js.UndefOr[js.Array[SchemaUser]] = js.native
  /**
    * A change on a regular posted comment.
    */
  var post: js.UndefOr[SchemaPost] = js.native
  /**
    * A change on a suggestion.
    */
  var suggestion: js.UndefOr[SchemaSuggestion] = js.native
}

object SchemaComment {
  @scala.inline
  def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  @scala.inline
  implicit class SchemaCommentOps[Self <: SchemaComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignment(value: SchemaAssignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignment")(js.undefined)
        ret
    }
    @scala.inline
    def withMentionedUsers(value: js.Array[SchemaUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentionedUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMentionedUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentionedUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withPost(value: SchemaPost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestion(value: SchemaSuggestion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestion")(js.undefined)
        ret
    }
  }
  
}

