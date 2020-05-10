package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test of an Android Application with a Test Loop. The intent
  * \&lt;intent-name\&gt; will be implicitly added, since Games is the only
  * user of this api, for the time being.
  */
@js.native
trait SchemaAndroidTestLoop extends js.Object {
  /**
    * The APK for the application under test.
    */
  var appApk: js.UndefOr[SchemaFileReference] = js.native
  /**
    * A multi-apk app bundle for the application under test.
    */
  var appBundle: js.UndefOr[SchemaAppBundle] = js.native
  /**
    * The java package for the application under test. The default is
    * determined by examining the application&#39;s manifest.
    */
  var appPackageId: js.UndefOr[String] = js.native
  /**
    * The list of scenario labels that should be run during the test. The
    * scenario labels should map to labels defined in the application&#39;s
    * manifest. For example, player_experience and
    * com.google.test.loops.player_experience add all of the loops labeled in
    * the manifest with the com.google.test.loops.player_experience name to the
    * execution. Scenarios can also be specified in the scenarios field.
    */
  var scenarioLabels: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of scenarios that should be run during the test. The default is
    * all test loops, derived from the application&#39;s manifest.
    */
  var scenarios: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaAndroidTestLoop {
  @scala.inline
  def apply(): SchemaAndroidTestLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidTestLoop]
  }
  @scala.inline
  implicit class SchemaAndroidTestLoopOps[Self <: SchemaAndroidTestLoop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppApk(value: SchemaFileReference): Self = {
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
    def withAppBundle(value: SchemaAppBundle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppBundle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBundle")(js.undefined)
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

