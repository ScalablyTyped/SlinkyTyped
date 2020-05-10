package typingsSlinky.pulumiAws.inputMod.athena

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseEncryptionConfiguration extends js.Object {
  var encryptionOption: Input[String] = js.native
  var kmsKey: js.UndefOr[Input[String]] = js.native
}

object DatabaseEncryptionConfiguration {
  @scala.inline
  def apply(encryptionOption: Input[String]): DatabaseEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(encryptionOption = encryptionOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseEncryptionConfiguration]
  }
  @scala.inline
  implicit class DatabaseEncryptionConfigurationOps[Self <: DatabaseEncryptionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionOption(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmsKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKey")(js.undefined)
        ret
    }
  }
  
}

