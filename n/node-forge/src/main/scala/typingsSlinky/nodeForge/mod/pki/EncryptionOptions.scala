package typingsSlinky.nodeForge.mod.pki

import typingsSlinky.nodeForge.nodeForgeStrings.`3des`
import typingsSlinky.nodeForge.nodeForgeStrings.aes128
import typingsSlinky.nodeForge.nodeForgeStrings.aes192
import typingsSlinky.nodeForge.nodeForgeStrings.aes256
import typingsSlinky.nodeForge.nodeForgeStrings.sha1
import typingsSlinky.nodeForge.nodeForgeStrings.sha224
import typingsSlinky.nodeForge.nodeForgeStrings.sha256
import typingsSlinky.nodeForge.nodeForgeStrings.sha384
import typingsSlinky.nodeForge.nodeForgeStrings.sha512
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionOptions extends js.Object {
  var algorithm: js.UndefOr[aes128 | aes192 | aes256 | `3des`] = js.native
  var count: js.UndefOr[Double] = js.native
  var legacy: js.UndefOr[Boolean] = js.native
  var prfAlgorithm: js.UndefOr[sha1 | sha224 | sha256 | sha384 | sha512] = js.native
  var saltSize: js.UndefOr[Double] = js.native
}

object EncryptionOptions {
  @scala.inline
  def apply(): EncryptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionOptions]
  }
  @scala.inline
  implicit class EncryptionOptionsOps[Self <: EncryptionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: aes128 | aes192 | aes256 | `3des`): Self = {
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
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withLegacy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacy")(js.undefined)
        ret
    }
    @scala.inline
    def withPrfAlgorithm(value: sha1 | sha224 | sha256 | sha384 | sha512): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prfAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrfAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prfAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withSaltSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaltSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltSize")(js.undefined)
        ret
    }
  }
  
}

