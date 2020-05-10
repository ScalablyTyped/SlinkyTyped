package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conversion extends js.Object {
  /** Whether the conversion was directed toward children. */
  var childDirectedTreatment: js.UndefOr[Boolean] = js.native
  /** Custom floodlight variables. */
  var customVariables: js.UndefOr[js.Array[CustomFloodlightVariable]] = js.native
  /**
    * The alphanumeric encrypted user ID. When set, encryptionInfo should also be specified. This field is mutually exclusive with
    * encryptedUserIdCandidates[], mobileDeviceId and gclid. This or encryptedUserIdCandidates[] or mobileDeviceId or gclid is a required field.
    */
  var encryptedUserId: js.UndefOr[String] = js.native
  /**
    * A list of the alphanumeric encrypted user IDs. Any user ID with exposure prior to the conversion timestamp will be used in the inserted conversion. If
    * no such user ID is found then the conversion will be rejected with NO_COOKIE_MATCH_FOUND error. When set, encryptionInfo should also be specified. This
    * field may only be used when calling batchinsert; it is not supported by batchupdate. This field is mutually exclusive with encryptedUserId,
    * mobileDeviceId and gclid. This or encryptedUserId or mobileDeviceId or gclid is a required field.
    */
  var encryptedUserIdCandidates: js.UndefOr[js.Array[String]] = js.native
  /** Floodlight Activity ID of this conversion. This is a required field. */
  var floodlightActivityId: js.UndefOr[String] = js.native
  /** Floodlight Configuration ID of this conversion. This is a required field. */
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  /**
    * The Google click ID. This field is mutually exclusive with encryptedUserId, encryptedUserIdCandidates[] and mobileDeviceId. This or encryptedUserId or
    * encryptedUserIdCandidates[] or mobileDeviceId is a required field.
    */
  var gclid: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversion". */
  var kind: js.UndefOr[String] = js.native
  /** Whether Limit Ad Tracking is enabled. When set to true, the conversion will be used for reporting but not targeting. This will prevent remarketing. */
  var limitAdTracking: js.UndefOr[Boolean] = js.native
  /**
    * The mobile device ID. This field is mutually exclusive with encryptedUserId, encryptedUserIdCandidates[] and gclid. This or encryptedUserId or
    * encryptedUserIdCandidates[] or gclid is a required field.
    */
  var mobileDeviceId: js.UndefOr[String] = js.native
  /** The ordinal of the conversion. Use this field to control how conversions of the same user and day are de-duplicated. This is a required field. */
  var ordinal: js.UndefOr[String] = js.native
  /** The quantity of the conversion. */
  var quantity: js.UndefOr[String] = js.native
  /** The timestamp of conversion, in Unix epoch micros. This is a required field. */
  var timestampMicros: js.UndefOr[String] = js.native
  /** The value of the conversion. */
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

