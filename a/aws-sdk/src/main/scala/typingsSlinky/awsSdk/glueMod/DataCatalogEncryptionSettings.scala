package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCatalogEncryptionSettings extends js.Object {
  /**
    * When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption.
    */
  var ConnectionPasswordEncryption: js.UndefOr[typingsSlinky.awsSdk.glueMod.ConnectionPasswordEncryption] = js.native
  /**
    * Specifies the encryption-at-rest configuration for the Data Catalog.
    */
  var EncryptionAtRest: js.UndefOr[typingsSlinky.awsSdk.glueMod.EncryptionAtRest] = js.native
}

object DataCatalogEncryptionSettings {
  @scala.inline
  def apply(): DataCatalogEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCatalogEncryptionSettings]
  }
  @scala.inline
  implicit class DataCatalogEncryptionSettingsOps[Self <: DataCatalogEncryptionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionPasswordEncryption(value: ConnectionPasswordEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionPasswordEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionPasswordEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionPasswordEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionAtRest(value: EncryptionAtRest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionAtRest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionAtRest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionAtRest")(js.undefined)
        ret
    }
  }
  
}

