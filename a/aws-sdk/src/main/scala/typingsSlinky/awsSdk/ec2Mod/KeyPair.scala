package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPair extends js.Object {
  /**
    * The SHA-1 digest of the DER encoded private key.
    */
  var KeyFingerprint: js.UndefOr[String] = js.native
  /**
    * An unencrypted PEM encoded RSA private key.
    */
  var KeyMaterial: js.UndefOr[SensitiveUserData] = js.native
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.native
  /**
    * The ID of the key pair.
    */
  var KeyPairId: js.UndefOr[String] = js.native
}

object KeyPair {
  @scala.inline
  def apply(): KeyPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPair]
  }
  @scala.inline
  implicit class KeyPairOps[Self <: KeyPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyFingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyMaterial(value: SensitiveUserData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyMaterial")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPairId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPairId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPairId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPairId")(js.undefined)
        ret
    }
  }
  
}

