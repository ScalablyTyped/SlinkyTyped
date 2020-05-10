package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaComment extends js.Object {
  /**
    * A comment from a developer.
    */
  var developerComment: js.UndefOr[SchemaDeveloperComment] = js.native
  /**
    * A comment from a user.
    */
  var userComment: js.UndefOr[SchemaUserComment] = js.native
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
    def withDeveloperComment(value: SchemaDeveloperComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerComment")(js.undefined)
        ret
    }
    @scala.inline
    def withUserComment(value: SchemaUserComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userComment")(js.undefined)
        ret
    }
  }
  
}

