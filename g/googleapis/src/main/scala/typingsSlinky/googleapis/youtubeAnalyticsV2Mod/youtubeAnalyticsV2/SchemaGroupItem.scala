package typingsSlinky.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group item.
  */
@js.native
trait SchemaGroupItem extends js.Object {
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  /**
    * The Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the group that contains the
    * item.
    */
  var groupId: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the `channel`, `video`,
    * `playlist`, or `asset` resource that is included in the group. Note that
    * this ID refers specifically to the inclusion of that resource in a
    * particular group and is different than the channel ID, video ID, playlist
    * ID, or asset ID that uniquely identifies the resource itself. The
    * `resource.id` property&#39;s value specifies the unique channel, video,
    * playlist, or asset ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the API resource&#39;s type. The value will be
    * `youtube#groupItem`.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The `resource` object contains information that identifies the item being
    * added to the group.
    */
  var resource: js.UndefOr[SchemaGroupItemResource] = js.native
}

object SchemaGroupItem {
  @scala.inline
  def apply(): SchemaGroupItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupItem]
  }
  @scala.inline
  implicit class SchemaGroupItemOps[Self <: SchemaGroupItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: SchemaErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
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
    def withResource(value: SchemaGroupItemResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
  }
  
}

