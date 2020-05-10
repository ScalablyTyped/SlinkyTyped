package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a contextual status message. The message can indicate an error
  * or informational status, and refer to specific parts of the containing
  * object. For example, the `Breakpoint.status` field can indicate an error
  * referring to the `BREAKPOINT_SOURCE_LOCATION` with the message `Location
  * not found`.
  */
@js.native
trait SchemaStatusMessage extends js.Object {
  /**
    * Status message text.
    */
  var description: js.UndefOr[SchemaFormatMessage] = js.native
  /**
    * Distinguishes errors from informational messages.
    */
  var isError: js.UndefOr[Boolean] = js.native
  /**
    * Reference to which the message applies.
    */
  var refersTo: js.UndefOr[String] = js.native
}

object SchemaStatusMessage {
  @scala.inline
  def apply(): SchemaStatusMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatusMessage]
  }
  @scala.inline
  implicit class SchemaStatusMessageOps[Self <: SchemaStatusMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: SchemaFormatMessage): Self = {
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

