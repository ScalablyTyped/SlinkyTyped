package typingsSlinky.googleCloudKms.mod.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoKeyVersionTemplate extends js.Object {
  var algorithm: CryptoKeyVersionAlgorithm = js.native
  var protectionLevel: ProtectionLevel = js.native
}

object CryptoKeyVersionTemplate {
  @scala.inline
  def apply(algorithm: CryptoKeyVersionAlgorithm, protectionLevel: ProtectionLevel): CryptoKeyVersionTemplate = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyVersionTemplate]
  }
  @scala.inline
  implicit class CryptoKeyVersionTemplateOps[Self <: CryptoKeyVersionTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: CryptoKeyVersionAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtectionLevel(value: ProtectionLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectionLevel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

