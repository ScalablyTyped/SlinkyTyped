package typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxAccountViews extends js.Object {
  /** [Output Only] A list of all groups within a project. */
  var groupViews: js.UndefOr[js.Array[LinuxGroupView]] = js.native
  /** [Output Only] Type of the resource. Always clouduseraccounts#linuxAccountViews for Linux resources. */
  var kind: js.UndefOr[String] = js.native
  /** [Output Only] A list of all users within a project. */
  var userViews: js.UndefOr[js.Array[LinuxUserView]] = js.native
}

object LinuxAccountViews {
  @scala.inline
  def apply(): LinuxAccountViews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxAccountViews]
  }
  @scala.inline
  implicit class LinuxAccountViewsOps[Self <: LinuxAccountViews] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupViews(value: js.Array[LinuxGroupView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupViews")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withUserViews(value: js.Array[LinuxUserView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userViews")(js.undefined)
        ret
    }
  }
  
}

