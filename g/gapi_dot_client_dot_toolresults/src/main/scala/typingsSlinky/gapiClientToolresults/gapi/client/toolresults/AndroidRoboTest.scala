package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidRoboTest extends js.Object {
  /** The initial activity that should be used to start the app. Optional */
  var appInitialActivity: js.UndefOr[String] = js.native
  /** The java package for the bootstrap. Optional */
  var bootstrapPackageId: js.UndefOr[String] = js.native
  /** The runner class for the bootstrap. Optional */
  var bootstrapRunnerClass: js.UndefOr[String] = js.native
  /** The max depth of the traversal stack Robo can explore. Optional */
  var maxDepth: js.UndefOr[Double] = js.native
  /** The max number of steps/actions Robo can execute. Default is no limit (0). Optional */
  var maxSteps: js.UndefOr[Double] = js.native
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
    def withBootstrapPackageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapPackageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapPackageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapPackageId")(js.undefined)
        ret
    }
    @scala.inline
    def withBootstrapRunnerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapRunnerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapRunnerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapRunnerClass")(js.undefined)
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
  }
  
}

