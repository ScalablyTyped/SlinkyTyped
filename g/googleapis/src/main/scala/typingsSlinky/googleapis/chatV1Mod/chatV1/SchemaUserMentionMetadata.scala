package typingsSlinky.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Annotation metadata for user mentions (@).
  */
@js.native
trait SchemaUserMentionMetadata extends js.Object {
  /**
    * The type of user mention.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The user mentioned.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}

object SchemaUserMentionMetadata {
  @scala.inline
  def apply(): SchemaUserMentionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserMentionMetadata]
  }
  @scala.inline
  implicit class SchemaUserMentionMetadataOps[Self <: SchemaUserMentionMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: SchemaUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

