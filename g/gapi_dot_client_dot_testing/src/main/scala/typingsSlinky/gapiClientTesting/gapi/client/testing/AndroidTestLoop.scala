package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidTestLoop extends js.Object {
  /**
    * The APK for the application under test.
    * Required
    */
  var appApk: js.UndefOr[FileReference] = js.native
  /**
    * The java package for the application under test.
    * Optional, default is determined by examining the application's manifest.
    */
  var appPackageId: js.UndefOr[String] = js.native
  /**
    * The list of scenario labels that should be run during the test.
    * The scenario labels should map to labels defined in the application's
    * manifest. For example, player_experience and
    * com.google.test.loops.player_experience add all of the loops labeled in the
    * manifest with the com.google.test.loops.player_experience name to the
    * execution.
    * Optional. Scenarios can also be specified in the scenarios field.
    */
  var scenarioLabels: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of scenarios that should be run during the test.
    * Optional, default is all test loops, derived from the application's
    * manifest.
    */
  var scenarios: js.UndefOr[js.Array[Double]] = js.native
}

object AndroidTestLoop {
  @scala.inline
  def apply(): AndroidTestLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidTestLoop]
  }
  @scala.inline
  implicit class AndroidTestLoopOps[Self <: AndroidTestLoop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppApk(value: FileReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appApk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppApk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appApk")(js.undefined)
        ret
    }
    @scala.inline
    def withAppPackageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appPackageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppPackageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appPackageId")(js.undefined)
        ret
    }
    @scala.inline
    def withScenarioLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenarioLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScenarioLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenarioLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withScenarios(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenarios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScenarios: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenarios")(js.undefined)
        ret
    }
  }
  
}

