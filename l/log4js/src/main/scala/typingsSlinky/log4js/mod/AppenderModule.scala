package typingsSlinky.log4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppenderModule extends js.Object {
  var configure: js.Function = js.native
}

object AppenderModule {
  @scala.inline
  def apply(configure: js.Function): AppenderModule = {
    val __obj = js.Dynamic.literal(configure = configure.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppenderModule]
  }
  @scala.inline
  implicit class AppenderModuleOps[Self <: AppenderModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigure(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

