package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeveloperComment extends js.Object {
  /**
    * The last time at which this comment was updated.
    */
  var lastModified: js.UndefOr[SchemaTimestamp] = js.native
  /**
    * The content of the comment, i.e. reply body.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaDeveloperComment {
  @scala.inline
  def apply(): SchemaDeveloperComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeveloperComment]
  }
  @scala.inline
  implicit class SchemaDeveloperCommentOps[Self <: SchemaDeveloperComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModified(value: SchemaTimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

