package typingsSlinky.pkijs.signedDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyParams extends js.Object {
  var checkChain: js.UndefOr[Boolean] = js.native
  var checkDate: js.UndefOr[js.Date] = js.native
  var data: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  var extendedMode: js.UndefOr[Boolean] = js.native
  var includeSignerCertificate: js.UndefOr[Boolean] = js.native
  var signer: js.UndefOr[Double] = js.native
  var trustedCerts: js.UndefOr[js.Array[typingsSlinky.pkijs.certificateMod.default]] = js.native
}

object VerifyParams {
  @scala.inline
  def apply(): VerifyParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyParams]
  }
  @scala.inline
  implicit class VerifyParamsOps[Self <: VerifyParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckChain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckChain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkChain")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkDate")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSignerCertificate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSignerCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSignerCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSignerCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withSigner(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustedCerts(value: js.Array[typingsSlinky.pkijs.certificateMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustedCerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustedCerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustedCerts")(js.undefined)
        ret
    }
  }
  
}

