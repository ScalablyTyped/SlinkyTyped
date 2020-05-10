package typingsSlinky.cryptojs.CryptoJS.algo

import typingsSlinky.cryptojs.CryptoJS.lib.Hasher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEvpKDFCfg extends js.Object {
  //default 128/32
  var hasher: js.UndefOr[Hasher] = js.native
  //default MD5, or SHA1 with PBKDF2
  var iterations: js.UndefOr[Double] = js.native
  var keySize: js.UndefOr[Double] = js.native
}

object IEvpKDFCfg {
  @scala.inline
  def apply(): IEvpKDFCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEvpKDFCfg]
  }
  @scala.inline
  implicit class IEvpKDFCfgOps[Self <: IEvpKDFCfg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasher(value: Hasher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasher")(js.undefined)
        ret
    }
    @scala.inline
    def withIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(js.undefined)
        ret
    }
    @scala.inline
    def withKeySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySize")(js.undefined)
        ret
    }
  }
  
}

