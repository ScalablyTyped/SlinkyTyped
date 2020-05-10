package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDataCatalogEncryptionSettingsRequest extends js.Object {
  /**
    * The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The security configuration to set.
    */
  var DataCatalogEncryptionSettings: typingsSlinky.awsSdk.glueMod.DataCatalogEncryptionSettings = js.native
}

object PutDataCatalogEncryptionSettingsRequest {
  @scala.inline
  def apply(DataCatalogEncryptionSettings: DataCatalogEncryptionSettings): PutDataCatalogEncryptionSettingsRequest = {
    val __obj = js.Dynamic.literal(DataCatalogEncryptionSettings = DataCatalogEncryptionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDataCatalogEncryptionSettingsRequest]
  }
  @scala.inline
  implicit class PutDataCatalogEncryptionSettingsRequestOps[Self <: PutDataCatalogEncryptionSettingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataCatalogEncryptionSettings(value: DataCatalogEncryptionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataCatalogEncryptionSettings")(value.asInstanceOf[js.Any])
        ret
    }
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

