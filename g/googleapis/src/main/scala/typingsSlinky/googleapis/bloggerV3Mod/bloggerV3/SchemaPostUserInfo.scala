package typingsSlinky.googleapis.bloggerV3Mod.bloggerV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPostUserInfo extends js.Object {
  /**
    * The kind of this entity. Always blogger#postUserInfo
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The Post resource.
    */
  var post: js.UndefOr[SchemaPost] = js.native
  /**
    * Information about a User for the Post.
    */
  var post_user_info: js.UndefOr[SchemaPostPerUserInfo] = js.native
}

object SchemaPostUserInfo {
  @scala.inline
  def apply(): SchemaPostUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostUserInfo]
  }
  @scala.inline
  implicit class SchemaPostUserInfoOps[Self <: SchemaPostUserInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withPost_user_info(value: SchemaPostPerUserInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_user_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPost_user_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_user_info")(js.undefined)
        ret
    }
  }
  
}

