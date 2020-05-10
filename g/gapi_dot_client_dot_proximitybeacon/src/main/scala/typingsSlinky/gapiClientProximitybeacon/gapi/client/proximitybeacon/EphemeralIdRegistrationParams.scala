package typingsSlinky.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EphemeralIdRegistrationParams extends js.Object {
  /**
    * Indicates the maximum rotation period supported by the service.
    * See EddystoneEidRegistration.rotation_period_exponent
    */
  var maxRotationPeriodExponent: js.UndefOr[Double] = js.native
  /**
    * Indicates the minimum rotation period supported by the service.
    * See EddystoneEidRegistration.rotation_period_exponent
    */
  var minRotationPeriodExponent: js.UndefOr[Double] = js.native
  /**
    * The beacon service's public key for use by a beacon to derive its
    * Identity Key using Elliptic Curve Diffie-Hellman key exchange.
    */
  var serviceEcdhPublicKey: js.UndefOr[String] = js.native
}

object EphemeralIdRegistrationParams {
  @scala.inline
  def apply(): EphemeralIdRegistrationParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EphemeralIdRegistrationParams]
  }
  @scala.inline
  implicit class EphemeralIdRegistrationParamsOps[Self <: EphemeralIdRegistrationParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxRotationPeriodExponent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRotationPeriodExponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRotationPeriodExponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRotationPeriodExponent")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRotationPeriodExponent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRotationPeriodExponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRotationPeriodExponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRotationPeriodExponent")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceEcdhPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceEcdhPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceEcdhPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceEcdhPublicKey")(js.undefined)
        ret
    }
  }
  
}

