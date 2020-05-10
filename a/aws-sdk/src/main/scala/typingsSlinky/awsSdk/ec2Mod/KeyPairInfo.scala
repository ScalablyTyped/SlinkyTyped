package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPairInfo extends js.Object {
  /**
    * If you used CreateKeyPair to create the key pair, this is the SHA-1 digest of the DER encoded private key. If you used ImportKeyPair to provide AWS the public key, this is the MD5 public key fingerprint as specified in section 4 of RFC4716.
    */
  var KeyFingerprint: js.UndefOr[String] = js.native
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.native
  /**
    * The ID of the key pair.
    */
  var KeyPairId: js.UndefOr[String] = js.native
  /**
    * Any tags applied to the key pair.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object KeyPairInfo {
  @scala.inline
  def apply(): KeyPairInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPairInfo]
  }
  @scala.inline
  implicit class KeyPairInfoOps[Self <: KeyPairInfo] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

