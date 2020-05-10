package typingsSlinky.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An ID for a user or group as seen in Permission items.
  */
@js.native
trait SchemaPermissionId extends js.Object {
  /**
    * The permission ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * This is always drive#permissionId.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaPermissionId {
  @scala.inline
  def apply(): SchemaPermissionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionId]
  }
  @scala.inline
  implicit class SchemaPermissionIdOps[Self <: SchemaPermissionId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

