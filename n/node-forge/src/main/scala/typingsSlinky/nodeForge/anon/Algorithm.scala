package typingsSlinky.nodeForge.anon

import typingsSlinky.nodeForge.mod.Hex
import typingsSlinky.nodeForge.nodeForgeStrings.`3des`
import typingsSlinky.nodeForge.nodeForgeStrings.aes128
import typingsSlinky.nodeForge.nodeForgeStrings.aes192
import typingsSlinky.nodeForge.nodeForgeStrings.aes256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithm extends js.Object {
  var algorithm: js.UndefOr[aes128 | aes192 | aes256 | `3des`] = js.native
  var count: js.UndefOr[Double] = js.native
  var friendlyName: js.UndefOr[String] = js.native
  var generateLocalKeyId: js.UndefOr[Boolean] = js.native
  var localKeyId: js.UndefOr[Hex] = js.native
  var saltSize: js.UndefOr[Double] = js.native
  var useMac: js.UndefOr[Boolean] = js.native
}

object Algorithm {
  @scala.inline
  def apply(): Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithm]
  }
  @scala.inline
  implicit class AlgorithmOps[Self <: Algorithm] (val x: Self) extends AnyVal {
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
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriendlyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateLocalKeyId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateLocalKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateLocalKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateLocalKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalKeyId(value: Hex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localKeyId")(js.undefined)
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
    @scala.inline
    def withUseMac(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMac: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMac")(js.undefined)
        ret
    }
  }
  
}

