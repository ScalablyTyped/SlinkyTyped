package typingsSlinky.ethLightwallet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VaultOptions extends js.Object {
  var hdPathString: String = js.native
  var password: String = js.native
  var salt: js.UndefOr[String] = js.native
  var seedPhrase: String = js.native
}

object VaultOptions {
  @scala.inline
  def apply(hdPathString: String, password: String, seedPhrase: String): VaultOptions = {
    val __obj = js.Dynamic.literal(hdPathString = hdPathString.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], seedPhrase = seedPhrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultOptions]
  }
  @scala.inline
  implicit class VaultOptionsOps[Self <: VaultOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHdPathString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hdPathString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeedPhrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedPhrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSalt(value: String): Self = {
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
  }
  
}

