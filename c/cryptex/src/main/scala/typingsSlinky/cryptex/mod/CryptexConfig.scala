package typingsSlinky.cryptex.mod

import typingsSlinky.cryptex.AnonDataKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptexConfig extends js.Object {
  var algorithm: js.UndefOr[String] = js.native
  var keySource: String = js.native
  var keySourceOpts: js.UndefOr[AnonDataKey] = js.native
  var secretEncoding: js.UndefOr[String] = js.native
  var secrets: js.Object = js.native
}

object CryptexConfig {
  @scala.inline
  def apply(keySource: String, secrets: js.Object): CryptexConfig = {
    val __obj = js.Dynamic.literal(keySource = keySource.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptexConfig]
  }
  @scala.inline
  implicit class CryptexConfigOps[Self <: CryptexConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeySource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecrets(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secrets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withKeySourceOpts(value: AnonDataKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySourceOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeySourceOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySourceOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretEncoding")(js.undefined)
        ret
    }
  }
  
}

