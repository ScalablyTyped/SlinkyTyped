package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaEncryptionConfiguration extends js.Object {
  /**
    * [Optional] Describes the Cloud KMS encryption key that will be used to
    * protect destination BigQuery table. The BigQuery Service Account
    * associated with your project requires access to this encryption key.
    */
  var kmsKeyName: js.UndefOr[String] = js.native
}

object SchemaEncryptionConfiguration {
  @scala.inline
  def apply(): SchemaEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptionConfiguration]
  }
  @scala.inline
  implicit class SchemaEncryptionConfigurationOps[Self <: SchemaEncryptionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKmsKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyName")(js.undefined)
        ret
    }
  }
  
}

