package typingsSlinky.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for FirebaseRulesService.GetReleaseExecutable
  */
@js.native
trait SchemaGetReleaseExecutableResponse extends js.Object {
  /**
    * Executable view of the `Ruleset` referenced by the `Release`.
    */
  var executable: js.UndefOr[String] = js.native
  /**
    * The Rules runtime version of the executable.
    */
  var executableVersion: js.UndefOr[String] = js.native
  /**
    * `Language` used to generate the executable bytes.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * `Ruleset` name associated with the `Release` executable.
    */
  var rulesetName: js.UndefOr[String] = js.native
  /**
    * Optional, indicates the freshness of the result. The response is
    * guaranteed to be the latest within an interval up to the sync_time
    * (inclusive).
    */
  var syncTime: js.UndefOr[String] = js.native
  /**
    * Timestamp for the most recent `Release.update_time`.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaGetReleaseExecutableResponse {
  @scala.inline
  def apply(): SchemaGetReleaseExecutableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetReleaseExecutableResponse]
  }
  @scala.inline
  implicit class SchemaGetReleaseExecutableResponseOps[Self <: SchemaGetReleaseExecutableResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executable")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutableVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executableVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutableVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executableVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withRulesetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRulesetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesetName")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

