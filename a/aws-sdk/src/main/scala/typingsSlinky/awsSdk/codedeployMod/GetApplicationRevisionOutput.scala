package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationRevisionOutput extends js.Object {
  /**
    * The name of the application that corresponds to the revision.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  /**
    * Additional information about the revision, including type and location.
    */
  var revision: js.UndefOr[RevisionLocation] = js.native
  /**
    * General information about the revision.
    */
  var revisionInfo: js.UndefOr[GenericRevisionInfo] = js.native
}

object GetApplicationRevisionOutput {
  @scala.inline
  def apply(): GetApplicationRevisionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationRevisionOutput]
  }
  @scala.inline
  implicit class GetApplicationRevisionOutputOps[Self <: GetApplicationRevisionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withRevision(value: RevisionLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionInfo(value: GenericRevisionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionInfo")(js.undefined)
        ret
    }
  }
  
}

