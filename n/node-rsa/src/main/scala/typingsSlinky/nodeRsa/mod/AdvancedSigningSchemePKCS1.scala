package typingsSlinky.nodeRsa.mod

import typingsSlinky.nodeRsa.nodeRsaStrings.pkcs1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvancedSigningSchemePKCS1 extends AdvancedSigningScheme {
  var hash: HashingAlgorithm = js.native
  var scheme: pkcs1 = js.native
}

object AdvancedSigningSchemePKCS1 {
  @scala.inline
  def apply(hash: HashingAlgorithm, scheme: pkcs1): AdvancedSigningSchemePKCS1 = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedSigningSchemePKCS1]
  }
  @scala.inline
  implicit class AdvancedSigningSchemePKCS1Ops[Self <: AdvancedSigningSchemePKCS1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: HashingAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
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

