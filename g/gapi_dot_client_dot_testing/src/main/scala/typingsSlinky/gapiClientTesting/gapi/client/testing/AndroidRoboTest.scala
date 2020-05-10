package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidRoboTest extends js.Object {
  /**
    * The APK for the application under test.
    * Required
    */
  var appApk: js.UndefOr[FileReference] = js.native
  /**
    * The initial activity that should be used to start the app.
    * Optional
    */
  var appInitialActivity: js.UndefOr[String] = js.native
  /**
    * The java package for the application under test.
    * Optional, default is determined by examining the application's manifest.
    */
  var appPackageId: js.UndefOr[String] = js.native
  /**
    * The max depth of the traversal stack Robo can explore. Needs to be at least
    * 2 to make Robo explore the app beyond the first activity.
    * Default is 50.
    * Optional
    */
  var maxDepth: js.UndefOr[Double] = js.native
  /**
    * The max number of steps Robo can execute.
    * Default is no limit.
    * Optional
    */
  var maxSteps: js.UndefOr[Double] = js.native
  /**
    * A set of directives Robo should apply during the crawl.
    * This allows users to customize the crawl. For example, the username and
    * password for a test account can be provided.
    * Optional
    */
  var roboDirectives: js.UndefOr[js.Array[RoboDirective]] = js.native
}

object AndroidRoboTest {
  @scala.inline
  def apply(): AndroidRoboTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidRoboTest]
  }
  @scala.inline
  implicit class AndroidRoboTestOps[Self <: AndroidRoboTest] (val x: Self) extends AnyVal {
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
    def withRoboDirectives(value: js.Array[RoboDirective]): Self = {
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
  }
  
}

