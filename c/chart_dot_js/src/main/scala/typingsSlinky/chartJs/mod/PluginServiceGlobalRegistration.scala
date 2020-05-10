package typingsSlinky.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginServiceGlobalRegistration extends js.Object {
  var id: js.UndefOr[String] = js.native
}

object PluginServiceGlobalRegistration {
  @scala.inline
  def apply(): PluginServiceGlobalRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginServiceGlobalRegistration]
  }
  @scala.inline
  implicit class PluginServiceGlobalRegistrationOps[Self <: PluginServiceGlobalRegistration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

