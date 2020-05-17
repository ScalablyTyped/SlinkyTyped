package typingsSlinky.googleGax.apiCallerMod

import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiCallerSettings extends js.Object {
  var promise: PromiseConstructor = js.native
}

object ApiCallerSettings {
  @scala.inline
  def apply(promise: PromiseConstructor): ApiCallerSettings = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiCallerSettings]
  }
  @scala.inline
  implicit class ApiCallerSettingsOps[Self <: ApiCallerSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromise(value: PromiseConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

