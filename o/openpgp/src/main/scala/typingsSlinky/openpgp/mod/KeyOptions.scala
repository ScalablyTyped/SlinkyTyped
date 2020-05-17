package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.anon.Passphrase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyOptions extends js.Object {
  /**
    * (optional) elliptic curve for ECC keys: elliptic curve for ECC keys:
    *                                         curve25519, p256, p384, p521, secp256k1,
    *                                         brainpoolP256r1, brainpoolP384r1, or brainpoolP512r1.
    */
  var curve: js.UndefOr[String] = js.native
  /**
    * (optional) override the creation date of the key and the key signatures
    */
  var date: js.UndefOr[js.Date] = js.native
  /**
    * (optional) The number of seconds after the key creation time that the key expires
    */
  var keyExpirationTime: js.UndefOr[Double] = js.native
  /**
    * (optional) number of bits for RSA keys: 2048 or 4096.
    */
  var numBits: js.UndefOr[Double] = js.native
  /**
    * (optional) The passphrase used to encrypt the resulting private key
    */
  var passphrase: js.UndefOr[String] = js.native
  /**
    * (optional) options for each subkey, default to main key options. e.g. [ {sign: true, passphrase: '123'}]
    *            sign parameter defaults to false, and indicates whether the subkey should sign rather than encrypt
    */
  var subkeys: js.UndefOr[js.Array[Passphrase]] = js.native
  /**
    * array of user IDs e.g. [ { name:'Phil Zimmermann', email:'phil@openpgp.org' }]
    */
  var userIds: js.Array[UserID] = js.native
}

object KeyOptions {
  @scala.inline
  def apply(userIds: js.Array[UserID]): KeyOptions = {
    val __obj = js.Dynamic.literal(userIds = userIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyOptions]
  }
  @scala.inline
  implicit class KeyOptionsOps[Self <: KeyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserIds(value: js.Array[UserID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurve(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyExpirationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyExpirationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpirationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNumBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numBits")(js.undefined)
        ret
    }
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(js.undefined)
        ret
    }
    @scala.inline
    def withSubkeys(value: js.Array[Passphrase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subkeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubkeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subkeys")(js.undefined)
        ret
    }
  }
  
}

