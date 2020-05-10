package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conversion extends js.Object {
  var childDirectedTreatment: js.UndefOr[Boolean] = js.native
  var customVariables: js.UndefOr[js.Array[CustomFloodlightVariable]] = js.native
  var encryptedUserId: js.UndefOr[String] = js.native
  var encryptedUserIdCandidates: js.UndefOr[js.Array[String]] = js.native
  var floodlightActivityId: js.UndefOr[String] = js.native
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  var gclid: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var limitAdTracking: js.UndefOr[Boolean] = js.native
  var mobileDeviceId: js.UndefOr[String] = js.native
  var nonPersonalizedAd: js.UndefOr[Boolean] = js.native
  var ordinal: js.UndefOr[String] = js.native
  var quantity: js.UndefOr[String] = js.native
  var timestampMicros: js.UndefOr[String] = js.native
  var treatmentForUnderage: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[Double] = js.native
}

object Conversion {
  @scala.inline
  def apply(): Conversion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conversion]
  }
  @scala.inline
  implicit class ConversionOps[Self <: Conversion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildDirectedTreatment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDirectedTreatment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildDirectedTreatment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDirectedTreatment")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomVariables(value: js.Array[CustomFloodlightVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptedUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptedUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptedUserIdCandidates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedUserIdCandidates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptedUserIdCandidates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedUserIdCandidates")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightActivityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityId")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightConfigurationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightConfigurationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigurationId")(js.undefined)
        ret
    }
    @scala.inline
    def withGclid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gclid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGclid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gclid")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitAdTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitAdTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitAdTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitAdTracking")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileDeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileDeviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withNonPersonalizedAd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPersonalizedAd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonPersonalizedAd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPersonalizedAd")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdinal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdinal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampMicros(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampMicros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampMicros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampMicros")(js.undefined)
        ret
    }
    @scala.inline
    def withTreatmentForUnderage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treatmentForUnderage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreatmentForUnderage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treatmentForUnderage")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

