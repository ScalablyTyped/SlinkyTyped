package typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxGetLinuxAccountViewsResponse extends js.Object {
  /** [Output Only] A list of authorized user accounts and groups. */
  var resource: js.UndefOr[LinuxAccountViews] = js.native
}

object LinuxGetLinuxAccountViewsResponse {
  @scala.inline
  def apply(): LinuxGetLinuxAccountViewsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxGetLinuxAccountViewsResponse]
  }
  @scala.inline
  implicit class LinuxGetLinuxAccountViewsResponseOps[Self <: LinuxGetLinuxAccountViewsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: LinuxAccountViews): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
  }
  
}

