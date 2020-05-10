package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEncryptionConfigResult extends js.Object {
  /**
    * The encryption configuration document.
    */
  var EncryptionConfig: js.UndefOr[typingsSlinky.awsSdk.xrayMod.EncryptionConfig] = js.native
}

object GetEncryptionConfigResult {
  @scala.inline
  def apply(): GetEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEncryptionConfigResult]
  }
  @scala.inline
  implicit class GetEncryptionConfigResultOps[Self <: GetEncryptionConfigResult] (val x: Self) extends AnyVal {
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

