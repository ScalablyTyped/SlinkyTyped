package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.NavigationModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrentModule extends js.Object {
  val CurrentModule: NavigationModule = js.native
}

object AnonCurrentModule {
  @scala.inline
  def apply(CurrentModule: NavigationModule): AnonCurrentModule = {
    val __obj = js.Dynamic.literal(CurrentModule = CurrentModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentModule]
  }
  @scala.inline
  implicit class AnonCurrentModuleOps[Self <: AnonCurrentModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentModule(value: NavigationModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentModule")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

