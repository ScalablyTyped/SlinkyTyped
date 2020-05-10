package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataCatalogEncryptionSettingsRequest extends js.Object {
  /**
    * The ID of the Data Catalog to retrieve the security configuration for. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
}

object GetDataCatalogEncryptionSettingsRequest {
  @scala.inline
  def apply(): GetDataCatalogEncryptionSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataCatalogEncryptionSettingsRequest]
  }
  @scala.inline
  implicit class GetDataCatalogEncryptionSettingsRequestOps[Self <: GetDataCatalogEncryptionSettingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatalogId(value: CatalogIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalogId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(js.undefined)
        ret
    }
  }
  
}

