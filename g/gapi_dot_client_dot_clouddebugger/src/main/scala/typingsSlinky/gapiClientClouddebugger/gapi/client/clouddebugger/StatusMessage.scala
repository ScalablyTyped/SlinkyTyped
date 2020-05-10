package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusMessage extends js.Object {
  /** Status message text. */
  var description: js.UndefOr[FormatMessage] = js.native
  /** Distinguishes errors from informational messages. */
  var isError: js.UndefOr[Boolean] = js.native
  /** Reference to which the message applies. */
  var refersTo: js.UndefOr[String] = js.native
}

object StatusMessage {
  @scala.inline
  def apply(): StatusMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusMessage]
  }
  @scala.inline
  implicit class StatusMessageOps[Self <: StatusMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: FormatMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withIsError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isError")(js.undefined)
        ret
    }
    @scala.inline
    def withRefersTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refersTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefersTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refersTo")(js.undefined)
        ret
    }
  }
  
}

