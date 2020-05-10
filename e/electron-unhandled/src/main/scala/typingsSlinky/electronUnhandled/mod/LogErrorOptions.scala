package typingsSlinky.electronUnhandled.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogErrorOptions extends js.Object {
  /**
  		Title of the error dialog.
  		@default `${appName} encountered an error`
  		*/
  val title: js.UndefOr[String] = js.native
}

object LogErrorOptions {
  @scala.inline
  def apply(): LogErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogErrorOptions]
  }
  @scala.inline
  implicit class LogErrorOptionsOps[Self <: LogErrorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

