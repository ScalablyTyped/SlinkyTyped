package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEnvironmentConfigurationMessage extends js.Object {
  /**
    * The name of the application the environment is associated with.
    */
  var ApplicationName: typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * The name of the environment to delete the draft configuration from.
    */
  var EnvironmentName: typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName = js.native
}

object DeleteEnvironmentConfigurationMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, EnvironmentName: EnvironmentName): DeleteEnvironmentConfigurationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], EnvironmentName = EnvironmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentConfigurationMessage]
  }
  @scala.inline
  implicit class DeleteEnvironmentConfigurationMessageOps[Self <: DeleteEnvironmentConfigurationMessage] (val x: Self) extends AnyVal {
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
    def withEnvironmentName(value: EnvironmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

