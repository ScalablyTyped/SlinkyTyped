package typingsSlinky.jsrsasign

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.cms.SignerInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDigalg extends js.Object {
  var digalg: String = js.native
  var obj: SignerInfo = js.native
  var sattrs: String = js.native
  var si: String = js.native
  var sigalg: String = js.native
  var sigval: String = js.native
  var version: String = js.native
}

object AnonDigalg {
  @scala.inline
  def apply(
    digalg: String,
    obj: SignerInfo,
    sattrs: String,
    si: String,
    sigalg: String,
    sigval: String,
    version: String
  ): AnonDigalg = {
    val __obj = js.Dynamic.literal(digalg = digalg.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], sattrs = sattrs.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], sigval = sigval.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDigalg]
  }
  @scala.inline
  implicit class AnonDigalgOps[Self <: AnonDigalg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDigalg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digalg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObj(value: SignerInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSattrs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sattrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("si")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigalg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigalg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

