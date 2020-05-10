package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaServiceAccountKeysListResponse extends js.Object {
  /**
    * The service account credentials.
    */
  var serviceAccountKey: js.UndefOr[js.Array[SchemaServiceAccountKey]] = js.native
}

object SchemaServiceAccountKeysListResponse {
  @scala.inline
  def apply(): SchemaServiceAccountKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountKeysListResponse]
  }
  @scala.inline
  implicit class SchemaServiceAccountKeysListResponseOps[Self <: SchemaServiceAccountKeysListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceAccountKey(value: js.Array[SchemaServiceAccountKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountKey")(js.undefined)
        ret
    }
  }
  
}

