package typingsSlinky.eggView.mod

import typingsSlinky.eggView.anon.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EggAppConfig extends js.Object {
  var view: Cache = js.native
}

object EggAppConfig {
  @scala.inline
  def apply(view: Cache): EggAppConfig = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggAppConfig]
  }
  @scala.inline
  implicit class EggAppConfigOps[Self <: EggAppConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withView(value: Cache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

