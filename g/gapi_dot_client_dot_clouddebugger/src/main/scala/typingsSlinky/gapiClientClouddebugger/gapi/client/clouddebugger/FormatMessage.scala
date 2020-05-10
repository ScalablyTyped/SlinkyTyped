package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatMessage extends js.Object {
  /**
    * Format template for the message. The `format` uses placeholders `$0`,
    * `$1`, etc. to reference parameters. `$$` can be used to denote the `$`
    * character.
    *
    * Examples:
    *
    * &#42;   `Failed to load '$0' which helps debug $1 the first time it
    * is loaded.  Again, $0 is very important.`
    * &#42;   `Please pay $$10 to use $0 instead of $1.`
    */
  var format: js.UndefOr[String] = js.native
  /** Optional parameters to be embedded into the message. */
  var parameters: js.UndefOr[js.Array[String]] = js.native
}

object FormatMessage {
  @scala.inline
  def apply(): FormatMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatMessage]
  }
  @scala.inline
  implicit class FormatMessageOps[Self <: FormatMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

