package typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectCreationStatus extends js.Object {
  /** Creation time of the project creation workflow. */
  var createTime: js.UndefOr[String] = js.native
  /**
    * True if the project can be retrieved using GetProject. No other operations
    * on the project are guaranteed to work until the project creation is
    * complete.
    */
  var gettable: js.UndefOr[Boolean] = js.native
  /** True if the project creation process is complete. */
  var ready: js.UndefOr[Boolean] = js.native
}

object ProjectCreationStatus {
  @scala.inline
  def apply(): ProjectCreationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectCreationStatus]
  }
  @scala.inline
  implicit class ProjectCreationStatusOps[Self <: ProjectCreationStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withGettable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gettable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGettable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gettable")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
  }
  
}

