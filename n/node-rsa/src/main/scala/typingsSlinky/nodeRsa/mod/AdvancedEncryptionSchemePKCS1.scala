package typingsSlinky.nodeRsa.mod

import typingsSlinky.nodeRsa.nodeRsaStrings.pkcs1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvancedEncryptionSchemePKCS1 extends AdvancedEncryptionScheme {
  var padding: Double = js.native
  var scheme: pkcs1 = js.native
}

object AdvancedEncryptionSchemePKCS1 {
  @scala.inline
  def apply(padding: Double, scheme: pkcs1): AdvancedEncryptionSchemePKCS1 = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedEncryptionSchemePKCS1]
  }
  @scala.inline
  implicit class AdvancedEncryptionSchemePKCS1Ops[Self <: AdvancedEncryptionSchemePKCS1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme(value: pkcs1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

