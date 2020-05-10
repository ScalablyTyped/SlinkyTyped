package typingsSlinky.ionic.cordovaResMod

import typingsSlinky.ionic.definitionsMod.IConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckCordovaResDeps extends js.Object {
  val config: IConfig = js.native
}

object CheckCordovaResDeps {
  @scala.inline
  def apply(config: IConfig): CheckCordovaResDeps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckCordovaResDeps]
  }
  @scala.inline
  implicit class CheckCordovaResDepsOps[Self <: CheckCordovaResDeps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: IConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

