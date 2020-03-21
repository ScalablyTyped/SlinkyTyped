package typingsSlinky.pkijs.signedDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyParams extends js.Object {
  var checkChain: js.UndefOr[Boolean] = js.undefined
  var checkDate: js.UndefOr[js.Date] = js.undefined
  var data: js.UndefOr[scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
  var extendedMode: js.UndefOr[Boolean] = js.undefined
  var includeSignerCertificate: js.UndefOr[Boolean] = js.undefined
  var signer: js.UndefOr[Double] = js.undefined
  var trustedCerts: js.UndefOr[js.Array[typingsSlinky.pkijs.certificateMod.default]] = js.undefined
}

object VerifyParams {
  @scala.inline
  def apply(
    checkChain: js.UndefOr[Boolean] = js.undefined,
    checkDate: js.Date = null,
    data: scala.scalajs.js.typedarray.ArrayBuffer = null,
    extendedMode: js.UndefOr[Boolean] = js.undefined,
    includeSignerCertificate: js.UndefOr[Boolean] = js.undefined,
    signer: Int | Double = null,
    trustedCerts: js.Array[typingsSlinky.pkijs.certificateMod.default] = null
  ): VerifyParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkChain)) __obj.updateDynamic("checkChain")(checkChain.asInstanceOf[js.Any])
    if (checkDate != null) __obj.updateDynamic("checkDate")(checkDate.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(extendedMode)) __obj.updateDynamic("extendedMode")(extendedMode.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSignerCertificate)) __obj.updateDynamic("includeSignerCertificate")(includeSignerCertificate.asInstanceOf[js.Any])
    if (signer != null) __obj.updateDynamic("signer")(signer.asInstanceOf[js.Any])
    if (trustedCerts != null) __obj.updateDynamic("trustedCerts")(trustedCerts.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyParams]
  }
}

