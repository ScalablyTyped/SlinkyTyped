package typingsSlinky.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information a client needs to provision and register beacons that broadcast
  * Eddystone-EID format beacon IDs, using Elliptic curve Diffie-Hellman key
  * exchange. See [the Eddystone
  * specification](https://github.com/google/eddystone/tree/master/eddystone-eid)
  * at GitHub.
  */
@js.native
trait SchemaEphemeralIdRegistrationParams extends js.Object {
  /**
    * Indicates the maximum rotation period supported by the service. See
    * EddystoneEidRegistration.rotation_period_exponent
    */
  var maxRotationPeriodExponent: js.UndefOr[Double] = js.native
  /**
    * Indicates the minimum rotation period supported by the service. See
    * EddystoneEidRegistration.rotation_period_exponent
    */
  var minRotationPeriodExponent: js.UndefOr[Double] = js.native
  /**
    * The beacon service&#39;s public key for use by a beacon to derive its
    * Identity Key using Elliptic Curve Diffie-Hellman key exchange.
    */
  var serviceEcdhPublicKey: js.UndefOr[String] = js.native
}

object SchemaEphemeralIdRegistrationParams {
  @scala.inline
  def apply(): SchemaEphemeralIdRegistrationParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEphemeralIdRegistrationParams]
  }
  @scala.inline
  implicit class SchemaEphemeralIdRegistrationParamsOps[Self <: SchemaEphemeralIdRegistrationParams] (val x: Self) extends AnyVal {
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

