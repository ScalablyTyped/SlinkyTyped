package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantConstraints extends js.Object {
  /**
    * A list of key-value pairs that must match the encryption context in the cryptographic operation request. The grant allows the operation only when the encryption context in the request is the same as the encryption context specified in this constraint.
    */
  var EncryptionContextEquals: js.UndefOr[EncryptionContextType] = js.native
  /**
    * A list of key-value pairs that must be included in the encryption context of the cryptographic operation request. The grant allows the cryptographic operation only when the encryption context in the request includes the key-value pairs specified in this constraint, although it can include additional key-value pairs.
    */
  var EncryptionContextSubset: js.UndefOr[EncryptionContextType] = js.native
}

object GrantConstraints {
  @scala.inline
  def apply(): GrantConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantConstraints]
  }
  @scala.inline
  implicit class GrantConstraintsOps[Self <: GrantConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionContextEquals(value: EncryptionContextType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionContextEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionContextEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionContextEquals")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionContextSubset(value: EncryptionContextType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionContextSubset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionContextSubset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionContextSubset")(js.undefined)
        ret
    }
  }
  
}

