package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeEnvironmentsMessage extends js.Object {
  /**
    * The name of the application to which the specified source bundles belong.
    */
  var ApplicationName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  /**
    * The name of the group to which the target environments belong. Specify a group name only if the environment name defined in each target environment's manifest ends with a + (plus) character. See Environment Manifest (env.yaml) for details.
    */
  var GroupName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.GroupName] = js.native
  /**
    * A list of version labels, specifying one or more application source bundles that belong to the target application. Each source bundle must include an environment manifest that specifies the name of the environment and the name of the solution stack to use, and optionally can specify environment links to create.
    */
  var VersionLabels: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.VersionLabels] = js.native
}

object ComposeEnvironmentsMessage {
  @scala.inline
  def apply(): ComposeEnvironmentsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposeEnvironmentsMessage]
  }
  @scala.inline
  implicit class ComposeEnvironmentsMessageOps[Self <: ComposeEnvironmentsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: GroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionLabels(value: VersionLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLabels")(js.undefined)
        ret
    }
  }
  
}

