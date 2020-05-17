package typingsSlinky.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configure extends js.Object {
  var configure: HitsPerPage = js.native
}

object Configure {
  @scala.inline
  def apply(configure: HitsPerPage): Configure = {
    val __obj = js.Dynamic.literal(configure = configure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configure]
  }
  @scala.inline
  implicit class ConfigureOps[Self <: Configure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigure(value: HitsPerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

