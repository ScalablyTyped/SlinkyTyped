package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationRevisionInput extends js.Object {
  /**
    * The name of the application that corresponds to the revision.
    */
  var applicationName: ApplicationName = js.native
  /**
    * Information about the application revision to get, including type and location.
    */
  var revision: RevisionLocation = js.native
}

object GetApplicationRevisionInput {
  @scala.inline
  def apply(applicationName: ApplicationName, revision: RevisionLocation): GetApplicationRevisionInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationRevisionInput]
  }
  @scala.inline
  implicit class GetApplicationRevisionInputOps[Self <: GetApplicationRevisionInput] (val x: Self) extends AnyVal {
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
    def withRevision(value: RevisionLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

