package typingsSlinky.ionicAngular.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonicGlobal extends js.Object {
  var asyncQueue: js.UndefOr[Boolean] = js.native
  var config: js.UndefOr[js.Any] = js.native
}

object IonicGlobal {
  @scala.inline
  def apply(): IonicGlobal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonicGlobal]
  }
  @scala.inline
  implicit class IonicGlobalOps[Self <: IonicGlobal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncQueue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncQueue")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
  }
  
}

