package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test of an android application that explores the application on a virtual
  * or physical Android Device, finding culprits and crashes as it goes.
  */
@js.native
trait SchemaAndroidRoboTest extends js.Object {
  /**
    * The APK for the application under test.
    */
  var appApk: js.UndefOr[SchemaFileReference] = js.native
  /**
    * A multi-apk app bundle for the application under test.
    */
  var appBundle: js.UndefOr[SchemaAppBundle] = js.native
  /**
    * The initial activity that should be used to start the app.
    */
  var appInitialActivity: js.UndefOr[String] = js.native
  /**
    * The java package for the application under test. The default value is
    * determined by examining the application&#39;s manifest.
    */
  var appPackageId: js.UndefOr[String] = js.native
  /**
    * The max depth of the traversal stack Robo can explore. Needs to be at
    * least 2 to make Robo explore the app beyond the first activity. Default
    * is 50.
    */
  var maxDepth: js.UndefOr[Double] = js.native
  /**
    * The max number of steps Robo can execute. Default is no limit.
    */
  var maxSteps: js.UndefOr[Double] = js.native
  /**
    * A set of directives Robo should apply during the crawl. This allows users
    * to customize the crawl. For example, the username and password for a test
    * account can be provided.
    */
  var roboDirectives: js.UndefOr[js.Array[SchemaRoboDirective]] = js.native
  /**
    * A JSON file with a sequence of actions Robo should perform as a prologue
    * for the crawl.
    */
  var roboScript: js.UndefOr[SchemaFileReference] = js.native
  /**
    * The intents used to launch the app for the crawl. If none are provided,
    * then the main launcher activity is launched. If some are provided, then
    * only those provided are launched (the main launcher activity must be
    * provided explicitly).
    */
  var startingIntents: js.UndefOr[js.Array[SchemaRoboStartingIntent]] = js.native
}

object SchemaAndroidRoboTest {
  @scala.inline
  def apply(): SchemaAndroidRoboTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidRoboTest]
  }
  @scala.inline
  implicit class SchemaAndroidRoboTestOps[Self <: SchemaAndroidRoboTest] (val x: Self) extends AnyVal {
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
    def withAppInitialActivity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appInitialActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppInitialActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appInitialActivity")(js.undefined)
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
    def withMaxDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withRoboDirectives(value: js.Array[SchemaRoboDirective]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roboDirectives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoboDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roboDirectives")(js.undefined)
        ret
    }
    @scala.inline
    def withRoboScript(value: SchemaFileReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roboScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoboScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roboScript")(js.undefined)
        ret
    }
    @scala.inline
    def withStartingIntents(value: js.Array[SchemaRoboStartingIntent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingIntents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingIntents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingIntents")(js.undefined)
        ret
    }
  }
  
}

