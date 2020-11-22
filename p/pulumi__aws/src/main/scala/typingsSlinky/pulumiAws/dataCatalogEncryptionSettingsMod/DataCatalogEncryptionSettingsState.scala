package typingsSlinky.pulumiAws.dataCatalogEncryptionSettingsMod

import typingsSlinky.pulumiAws.inputMod.glue.DataCatalogEncryptionSettingsDataCatalogEncryptionSettings
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCatalogEncryptionSettingsState extends js.Object {
  
  /**
    * The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
    */
  val catalogId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The security configuration to set. see Data Catalog Encryption Settings.
    */
  val dataCatalogEncryptionSettings: js.UndefOr[Input[DataCatalogEncryptionSettingsDataCatalogEncryptionSettings]] = js.native
}
object DataCatalogEncryptionSettingsState {
  
  @scala.inline
  def apply(): DataCatalogEncryptionSettingsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCatalogEncryptionSettingsState]
  }
  
  @scala.inline
  implicit class DataCatalogEncryptionSettingsStateOps[Self <: DataCatalogEncryptionSettingsState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCatalogId(value: Input[String]): Self = this.set("catalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("catalogId", js.undefined)
    
    @scala.inline
    def setDataCatalogEncryptionSettings(value: Input[DataCatalogEncryptionSettingsDataCatalogEncryptionSettings]): Self = this.set("dataCatalogEncryptionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCatalogEncryptionSettings: Self = this.set("dataCatalogEncryptionSettings", js.undefined)
  }
}
