package typingsSlinky.googleapis.cloudprofilerV2Mod.cloudprofilerV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Profile resource.
  */
@js.native
trait SchemaProfile extends js.Object {
  /**
    * Deployment this profile corresponds to.
    */
  var deployment: js.UndefOr[SchemaDeployment] = js.native
  /**
    * Duration of the profiling session. Input (for the offline mode) or output
    * (for the online mode). The field represents requested profiling duration.
    * It may slightly differ from the effective profiling duration, which is
    * recorded in the profile data, in case the profiling can&#39;t be stopped
    * immediately (e.g. in case stopping the profiling is handled
    * asynchronously).
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * Input only. Labels associated to this specific profile. These labels will
    * get merged with the deployment labels for the final data set.  See
    * documentation on deployment labels for validation rules and limits.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. Opaque, server-assigned, unique ID for this profile.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Input only. Profile bytes, as a gzip compressed serialized proto, the
    * format is
    * https://github.com/google/pprof/blob/master/proto/profile.proto.
    */
  var profileBytes: js.UndefOr[String] = js.native
  /**
    * Type of profile. For offline mode, this must be specified when creating
    * the profile. For online mode it is assigned and returned by the server.
    */
  var profileType: js.UndefOr[String] = js.native
}

object SchemaProfile {
  @scala.inline
  def apply(): SchemaProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfile]
  }
  @scala.inline
  implicit class SchemaProfileOps[Self <: SchemaProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeployment(value: SchemaDeployment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
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
    def withProfileBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileType")(js.undefined)
        ret
    }
  }
  
}

