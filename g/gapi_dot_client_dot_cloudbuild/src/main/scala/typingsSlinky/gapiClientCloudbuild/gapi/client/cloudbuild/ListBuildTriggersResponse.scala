package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBuildTriggersResponse extends js.Object {
  /** BuildTriggers for the project, sorted by create_time descending. */
  var triggers: js.UndefOr[js.Array[BuildTrigger]] = js.native
}

object ListBuildTriggersResponse {
  @scala.inline
  def apply(): ListBuildTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildTriggersResponse]
  }
  @scala.inline
  implicit class ListBuildTriggersResponseOps[Self <: ListBuildTriggersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTriggers(value: js.Array[BuildTrigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(js.undefined)
        ret
    }
  }
  
}

