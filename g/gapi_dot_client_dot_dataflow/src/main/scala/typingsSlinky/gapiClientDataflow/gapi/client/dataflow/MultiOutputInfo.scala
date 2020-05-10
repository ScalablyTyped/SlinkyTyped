package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiOutputInfo extends js.Object {
  /**
    * The id of the tag the user code will emit to this output by; this
    * should correspond to the tag of some SideInputInfo.
    */
  var tag: js.UndefOr[String] = js.native
}

object MultiOutputInfo {
  @scala.inline
  def apply(): MultiOutputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiOutputInfo]
  }
  @scala.inline
  implicit class MultiOutputInfoOps[Self <: MultiOutputInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

