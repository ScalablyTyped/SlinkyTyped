package typingsSlinky.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes one specific error.
  */
@js.native
trait SchemaErrorProto extends js.Object {
  /**
    * Error arguments, to be used when building user-friendly error messages
    * given the error domain and code.  Different error codes require different
    * arguments.
    */
  var argument: js.UndefOr[js.Array[String]] = js.native
  /**
    * Error code in the error domain. This should correspond to a value of the
    * enum type whose name is in domain. See the core error domain in
    * error_domain.proto.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Debugging information, which should not be shared externally.
    */
  var debugInfo: js.UndefOr[String] = js.native
  /**
    * Error domain. RoSy services can define their own domain and error codes.
    * This should normally be the name of an enum type, such as:
    * gdata.CoreErrorDomain
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * A short explanation for the error, which can be shared outside Google.
    * Please set domain, code and arguments whenever possible instead of this
    * error message so that external APIs can build safe error messages
    * themselves.  External messages built in a RoSy interface will most likely
    * refer to information and concepts that are not available externally and
    * should not be exposed. It is safer if external APIs can understand the
    * errors and decide what the error message should look like.
    */
  var externalErrorMessage: js.UndefOr[String] = js.native
  /**
    * Location of the error, as specified by the location type.  If
    * location_type is PATH, this should be a path to a field that&#39;s
    * relative to the request, using FieldPath notation
    * (net/proto2/util/public/field_path.h).  Examples:
    * authenticated_user.gaia_id   resource.address[2].country
    */
  var location: js.UndefOr[String] = js.native
  var locationType: js.UndefOr[String] = js.native
}

object SchemaErrorProto {
  @scala.inline
  def apply(): SchemaErrorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorProto]
  }
  @scala.inline
  implicit class SchemaErrorProtoOps[Self <: SchemaErrorProto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgument(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationType")(js.undefined)
        ret
    }
  }
  
}

