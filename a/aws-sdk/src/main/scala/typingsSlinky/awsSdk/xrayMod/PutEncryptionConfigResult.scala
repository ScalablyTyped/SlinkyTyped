package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEncryptionConfigResult extends js.Object {
  /**
    * The new encryption configuration.
    */
  var EncryptionConfig: js.UndefOr[typingsSlinky.awsSdk.xrayMod.EncryptionConfig] = js.native
}

object PutEncryptionConfigResult {
  @scala.inline
  def apply(): PutEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEncryptionConfigResult]
  }
  @scala.inline
  implicit class PutEncryptionConfigResultOps[Self <: PutEncryptionConfigResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionConfig(value: EncryptionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionConfig")(js.undefined)
        ret
    }
  }
  
}

