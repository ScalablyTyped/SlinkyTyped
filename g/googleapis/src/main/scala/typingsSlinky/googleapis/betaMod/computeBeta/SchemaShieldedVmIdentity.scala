package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A shielded VM identity entry.
  */
@js.native
trait SchemaShieldedVmIdentity extends js.Object {
  /**
    * An Endorsement Key (EK) issued to the Shielded VM&#39;s vTPM.
    */
  var encryptionKey: js.UndefOr[SchemaShieldedVmIdentityEntry] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#shieldedVmIdentity for
    * shielded VM identity entry.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * An Attestation Key (AK) issued to the Shielded VM&#39;s vTPM.
    */
  var signingKey: js.UndefOr[SchemaShieldedVmIdentityEntry] = js.native
}

object SchemaShieldedVmIdentity {
  @scala.inline
  def apply(): SchemaShieldedVmIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedVmIdentity]
  }
  @scala.inline
  implicit class SchemaShieldedVmIdentityOps[Self <: SchemaShieldedVmIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionKey(value: SchemaShieldedVmIdentityEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(js.undefined)
        ret
    }
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
    def withSigningKey(value: SchemaShieldedVmIdentityEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingKey")(js.undefined)
        ret
    }
  }
  
}

