package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataCatalogEncryptionSettingsResponse extends js.Object {
  /**
    * The requested security configuration.
    */
  var DataCatalogEncryptionSettings: js.UndefOr[typingsSlinky.awsSdk.glueMod.DataCatalogEncryptionSettings] = js.native
}

object GetDataCatalogEncryptionSettingsResponse {
  @scala.inline
  def apply(): GetDataCatalogEncryptionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataCatalogEncryptionSettingsResponse]
  }
  @scala.inline
  implicit class GetDataCatalogEncryptionSettingsResponseOps[Self <: GetDataCatalogEncryptionSettingsResponse] (val x: Self) extends AnyVal {
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
    def withoutDataCatalogEncryptionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataCatalogEncryptionSettings")(js.undefined)
        ret
    }
  }
  
}

