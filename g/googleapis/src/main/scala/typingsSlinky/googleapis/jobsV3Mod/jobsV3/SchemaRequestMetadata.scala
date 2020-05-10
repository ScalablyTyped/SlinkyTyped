package typingsSlinky.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Meta information related to the job searcher or entity
  * conducting the job search. This information is used to improve the
  * performance of the service.
  */
@js.native
trait SchemaRequestMetadata extends js.Object {
  /**
    * Optional.  The type of device used by the job seeker at the time of the
    * call to the service.
    */
  var deviceInfo: js.UndefOr[SchemaDeviceInfo] = js.native
  /**
    * Required.  The client-defined scope or source of the service call, which
    * typically is the domain on which the service has been implemented and is
    * currently being run.  For example, if the service is being run by client
    * &lt;em&gt;Foo, Inc.&lt;/em&gt;, on job board www.foo.com and career site
    * www.bar.com, then this field is set to &quot;foo.com&quot; for use on the
    * job board, and &quot;bar.com&quot; for use on the career site.  If this
    * field isn&#39;t available for some reason, send &quot;UNKNOWN&quot;. Any
    * improvements to the model for a particular tenant site rely on this field
    * being set correctly to a domain.  The maximum number of allowed
    * characters is 255.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * Required.  A unique session identification string. A session is defined
    * as the duration of an end user&#39;s interaction with the service over a
    * certain period. Obfuscate this field for privacy concerns before
    * providing it to the service.  If this field is not available for some
    * reason, send &quot;UNKNOWN&quot;. Note that any improvements to the model
    * for a particular tenant site, rely on this field being set correctly to
    * some unique session_id.  The maximum number of allowed characters is 255.
    */
  var sessionId: js.UndefOr[String] = js.native
  /**
    * Required.  A unique user identification string, as determined by the
    * client. To have the strongest positive impact on search quality make sure
    * the client-level is unique. Obfuscate this field for privacy concerns
    * before providing it to the service.  If this field is not available for
    * some reason, send &quot;UNKNOWN&quot;. Note that any improvements to the
    * model for a particular tenant site, rely on this field being set
    * correctly to a unique user_id.  The maximum number of allowed characters
    * is 255.
    */
  var userId: js.UndefOr[String] = js.native
}

object SchemaRequestMetadata {
  @scala.inline
  def apply(): SchemaRequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestMetadata]
  }
  @scala.inline
  implicit class SchemaRequestMetadataOps[Self <: SchemaRequestMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceInfo(value: SchemaDeviceInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceInfo")(js.undefined)
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
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

