package typingsSlinky.adalAngular.mod.global

import typingsSlinky.adalAngular.mod.LoggingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var Logging: LoggingConfig = js.native
}

object Window {
  @scala.inline
  def apply(Logging: LoggingConfig): Window = {
    val __obj = js.Dynamic.literal(Logging = Logging.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogging(value: LoggingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logging")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

