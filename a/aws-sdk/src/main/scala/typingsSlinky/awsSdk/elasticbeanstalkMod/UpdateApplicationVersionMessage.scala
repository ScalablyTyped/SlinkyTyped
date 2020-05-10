package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationVersionMessage extends js.Object {
  /**
    * The name of the application associated with this version.  If no application is found with this name, UpdateApplication returns an InvalidParameterValue error.
    */
  var ApplicationName: typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * A new description for this version.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * The name of the version to update. If no application version is found with this label, UpdateApplication returns an InvalidParameterValue error. 
    */
  var VersionLabel: typingsSlinky.awsSdk.elasticbeanstalkMod.VersionLabel = js.native
}

object UpdateApplicationVersionMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, VersionLabel: VersionLabel): UpdateApplicationVersionMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], VersionLabel = VersionLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationVersionMessage]
  }
  @scala.inline
  implicit class UpdateApplicationVersionMessageOps[Self <: UpdateApplicationVersionMessage] (val x: Self) extends AnyVal {
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
    def withVersionLabel(value: VersionLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
  }
  
}

