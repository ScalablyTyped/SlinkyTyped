package typingsSlinky.nodeJose.mod.JWA

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecryptEncryptOptions extends js.Object {
  var aad: js.UndefOr[Buffer] = js.native
  var adata: js.UndefOr[Buffer] = js.native
   // algorithm to use in ec
  var alg: js.UndefOr[String] = js.native
   // variation of enc, probably oversight in lib code
  var apu: js.UndefOr[Buffer] = js.native
   // agreement party info used in ec
  var apv: js.UndefOr[Buffer] = js.native
   // ephemeral pub key used in ec
  var enc: js.UndefOr[String] = js.native
  var epk: js.UndefOr[Buffer] = js.native
   // Not used in encrypt
  var epu: js.UndefOr[Buffer] = js.native
   // encryption party info
  var epv: js.UndefOr[Buffer] = js.native
  var iv: js.UndefOr[Buffer] = js.native
   // encryption party info
  var kdata: js.UndefOr[Buffer] = js.native
   // Not used in encrypt
  var mac: js.UndefOr[Buffer] = js.native
   // used in pbes
  var p2c: js.UndefOr[Double] = js.native
   // agreement party info used in ec
  var p2s: js.UndefOr[Buffer] = js.native
  var tag: js.UndefOr[Buffer] = js.native
}

object DecryptEncryptOptions {
  @scala.inline
  def apply(): DecryptEncryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecryptEncryptOptions]
  }
  @scala.inline
  implicit class DecryptEncryptOptionsOps[Self <: DecryptEncryptOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAad(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aad")(js.undefined)
        ret
    }
    @scala.inline
    def withAdata(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adata")(js.undefined)
        ret
    }
    @scala.inline
    def withAlg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(js.undefined)
        ret
    }
    @scala.inline
    def withApu(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apu")(js.undefined)
        ret
    }
    @scala.inline
    def withApv(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apv")(js.undefined)
        ret
    }
    @scala.inline
    def withEnc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enc")(js.undefined)
        ret
    }
    @scala.inline
    def withEpk(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epk")(js.undefined)
        ret
    }
    @scala.inline
    def withEpu(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epu")(js.undefined)
        ret
    }
    @scala.inline
    def withEpv(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epv")(js.undefined)
        ret
    }
    @scala.inline
    def withIv(value: Buffer): Self = {
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
    def withKdata(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kdata")(js.undefined)
        ret
    }
    @scala.inline
    def withMac(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMac: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(js.undefined)
        ret
    }
    @scala.inline
    def withP2c(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p2c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP2c: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p2c")(js.undefined)
        ret
    }
    @scala.inline
    def withP2s(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p2s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP2s: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p2s")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

