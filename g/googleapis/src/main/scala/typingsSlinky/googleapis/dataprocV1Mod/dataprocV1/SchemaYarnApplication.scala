package typingsSlinky.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A YARN application created by a job. Application information is a subset of
  * &lt;code&gt;org.apache.hadoop.yarn.proto.YarnProtos.ApplicationReportProto&lt;/code&gt;.Beta
  * Feature: This report is available for testing purposes only. It may be
  * changed before final release.
  */
@js.native
trait SchemaYarnApplication extends js.Object {
  /**
    * Required. The application name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required. The numerical progress of the application, from 1 to 100.
    */
  var progress: js.UndefOr[Double] = js.native
  /**
    * Required. The application state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or
    * TimelineServer that provides application-specific information. The URL
    * uses the internal hostname, and requires a proxy server for resolution
    * and, possibly, access.
    */
  var trackingUrl: js.UndefOr[String] = js.native
}

object SchemaYarnApplication {
  @scala.inline
  def apply(): SchemaYarnApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaYarnApplication]
  }
  @scala.inline
  implicit class SchemaYarnApplicationOps[Self <: SchemaYarnApplication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingUrl")(js.undefined)
        ret
    }
  }
  
}

