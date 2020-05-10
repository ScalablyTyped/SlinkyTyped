package typingsSlinky.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Folder in an Organization&#39;s resource hierarchy, used to organize that
  * Organization&#39;s resources.
  */
@js.native
trait SchemaFolder extends js.Object {
  /**
    * Output only. Timestamp when the Folder was created. Assigned by the
    * server.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The folder’s display name. A folder’s display name must be unique amongst
    * its siblings, e.g. no two folders with the same parent can share the same
    * display name. The display name must start and end with a letter or digit,
    * may contain letters, digits, spaces, hyphens and underscores and can be
    * no longer than 30 characters. This is captured by the regular expression:
    * [\p{L}\p{N}]([\p{L}\p{N}_- ]{0,28}[\p{L}\p{N}])?.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Output only.  The lifecycle state of the folder. Updates to the
    * lifecycle_state must be performed via DeleteFolder and UndeleteFolder.
    */
  var lifecycleState: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name of the Folder. Its format is
    * `folders/{folder_id}`, for example: &quot;folders/1234&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The Folder’s parent&#39;s resource name. Updates to the folder&#39;s
    * parent must be performed via MoveFolder.
    */
  var parent: js.UndefOr[String] = js.native
}

object SchemaFolder {
  @scala.inline
  def apply(): SchemaFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFolder]
  }
  @scala.inline
  implicit class SchemaFolderOps[Self <: SchemaFolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycleState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleState")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
  }
  
}

