package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Disk encryption configuration.
  */
@js.native
trait SchemaDiskEncryptionConfiguration extends js.Object {
  /**
    * This is always sql#diskEncryptionConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * KMS key resource name
    */
  var kmsKeyName: js.UndefOr[String] = js.native
}

object SchemaDiskEncryptionConfiguration {
  @scala.inline
  def apply(): SchemaDiskEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskEncryptionConfiguration]
  }
  @scala.inline
  implicit class SchemaDiskEncryptionConfigurationOps[Self <: SchemaDiskEncryptionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

