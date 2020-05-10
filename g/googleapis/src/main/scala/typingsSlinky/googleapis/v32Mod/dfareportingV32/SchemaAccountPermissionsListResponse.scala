package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Account Permission List Response
  */
@js.native
trait SchemaAccountPermissionsListResponse extends js.Object {
  /**
    * Account permission collection.
    */
  var accountPermissions: js.UndefOr[js.Array[SchemaAccountPermission]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountPermissionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAccountPermissionsListResponse {
  @scala.inline
  def apply(): SchemaAccountPermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountPermissionsListResponse]
  }
  @scala.inline
  implicit class SchemaAccountPermissionsListResponseOps[Self <: SchemaAccountPermissionsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountPermissions(value: js.Array[SchemaAccountPermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountPermissions")(js.undefined)
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

