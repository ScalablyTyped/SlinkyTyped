package typingsSlinky.elliptic.mod.ec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenKeyPairOptions extends js.Object {
  var entropy: js.Any = js.native
  var entropyEnc: js.UndefOr[String] = js.native
  var pers: js.UndefOr[js.Any] = js.native
  var persEnc: js.UndefOr[String] = js.native
}

object GenKeyPairOptions {
  @scala.inline
  def apply(entropy: js.Any): GenKeyPairOptions = {
    val __obj = js.Dynamic.literal(entropy = entropy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenKeyPairOptions]
  }
  @scala.inline
  implicit class GenKeyPairOptionsOps[Self <: GenKeyPairOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntropy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entropy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntropyEnc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entropyEnc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntropyEnc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entropyEnc")(js.undefined)
        ret
    }
    @scala.inline
    def withPers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pers")(js.undefined)
        ret
    }
    @scala.inline
    def withPersEnc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persEnc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersEnc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persEnc")(js.undefined)
        ret
    }
  }
  
}

