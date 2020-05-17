package typingsSlinky.ethers.typesMod

import typingsSlinky.ethers.anon.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptOptions extends js.Object {
  var client: js.UndefOr[String] = js.native
  var entropy: js.UndefOr[Arrayish] = js.native
  var iv: js.UndefOr[Arrayish] = js.native
  var mnemonic: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var salt: js.UndefOr[Arrayish] = js.native
  var scrypt: js.UndefOr[N] = js.native
  var uuid: js.UndefOr[String] = js.native
}

object EncryptOptions {
  @scala.inline
  def apply(): EncryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptOptions]
  }
  @scala.inline
  implicit class EncryptOptionsOps[Self <: EncryptOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withEntropy(value: Arrayish): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entropy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntropy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entropy")(js.undefined)
        ret
    }
    @scala.inline
    def withIv(value: Arrayish): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv")(js.undefined)
        ret
    }
    @scala.inline
    def withMnemonic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mnemonic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMnemonic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mnemonic")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSalt(value: Arrayish): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(js.undefined)
        ret
    }
    @scala.inline
    def withScrypt(value: N): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrypt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrypt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrypt")(js.undefined)
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
  }
  
}

