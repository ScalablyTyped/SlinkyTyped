package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionAtRest extends js.Object {
  /**
    * The encryption-at-rest mode for encrypting Data Catalog data.
    */
  var CatalogEncryptionMode: typingsSlinky.awsSdk.glueMod.CatalogEncryptionMode = js.native
  /**
    * The ID of the AWS KMS key to use for encryption at rest.
    */
  var SseAwsKmsKeyId: js.UndefOr[NameString] = js.native
}

object EncryptionAtRest {
  @scala.inline
  def apply(CatalogEncryptionMode: CatalogEncryptionMode): EncryptionAtRest = {
    val __obj = js.Dynamic.literal(CatalogEncryptionMode = CatalogEncryptionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionAtRest]
  }
  @scala.inline
  implicit class EncryptionAtRestOps[Self <: EncryptionAtRest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatalogEncryptionMode(value: CatalogEncryptionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogEncryptionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSseAwsKmsKeyId(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SseAwsKmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSseAwsKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SseAwsKmsKeyId")(js.undefined)
        ret
    }
  }
  
}

