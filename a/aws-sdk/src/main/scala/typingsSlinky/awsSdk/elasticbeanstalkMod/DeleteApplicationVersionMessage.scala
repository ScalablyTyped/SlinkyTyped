package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationVersionMessage extends js.Object {
  /**
    * The name of the application to which the version belongs.
    */
  var ApplicationName: typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * Set to true to delete the source bundle from your storage bucket. Otherwise, the application version is deleted only from Elastic Beanstalk and the source bundle remains in Amazon S3.
    */
  var DeleteSourceBundle: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.DeleteSourceBundle] = js.native
  /**
    * The label of the version to delete.
    */
  var VersionLabel: typingsSlinky.awsSdk.elasticbeanstalkMod.VersionLabel = js.native
}

object DeleteApplicationVersionMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, VersionLabel: VersionLabel): DeleteApplicationVersionMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], VersionLabel = VersionLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationVersionMessage]
  }
  @scala.inline
  implicit class DeleteApplicationVersionMessageOps[Self <: DeleteApplicationVersionMessage] (val x: Self) extends AnyVal {
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
    def withDeleteSourceBundle(value: DeleteSourceBundle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteSourceBundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteSourceBundle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteSourceBundle")(js.undefined)
        ret
    }
  }
  
}

