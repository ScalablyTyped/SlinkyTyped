package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A shielded Instance identity entry.
  */
@js.native
trait SchemaShieldedInstanceIdentity extends js.Object {
  /**
    * An Endorsement Key (EK) issued to the Shielded Instance&#39;s vTPM.
    */
  var encryptionKey: js.UndefOr[SchemaShieldedInstanceIdentityEntry] = js.native
  /**
    * [Output Only] Type of the resource. Always
    * compute#shieldedInstanceIdentity for shielded Instance identity entry.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * An Attestation Key (AK) issued to the Shielded Instance&#39;s vTPM.
    */
  var signingKey: js.UndefOr[SchemaShieldedInstanceIdentityEntry] = js.native
}

object SchemaShieldedInstanceIdentity {
  @scala.inline
  def apply(): SchemaShieldedInstanceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedInstanceIdentity]
  }
  @scala.inline
  implicit class SchemaShieldedInstanceIdentityOps[Self <: SchemaShieldedInstanceIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionKey(value: SchemaShieldedInstanceIdentityEntry): Self = {
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
    def withSigningKey(value: SchemaShieldedInstanceIdentityEntry): Self = {
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

